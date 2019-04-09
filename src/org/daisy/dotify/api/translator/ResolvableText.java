package org.daisy.dotify.api.translator;

/**
 * Provides an interface for texts that may change during 
 * the translation process. This may for example happen when
 * the resolvable text is a page number reference.
 *
 * @author Joel Håkansson
 *
 */
public interface ResolvableText extends FollowingText, PrecedingText {
	
	/**
	 * Peeks the value of this item. The returned string may
	 * be different from call to call.
	 * 
	 * Note that after a call to {@link #resolve()}, this method
	 * should consistently return the same result.
	 * 
	 * @return the value, never null
	 */
	public String peek();

	/**
	 * Resolves the item. Once the value has been resolved,
	 * it cannot change between calls in the same context.
	 * This applies to both {@link #peek()} and {@link #resolve()}.
	 * 
	 * @return the value, never null
	 */
	public String resolve();

}
