package org.openqa.selenium;

import java.util.List;

public interface SerachContext {
	/**
	   * Find all elements within the current context using the given mechanism.
	   *
	   * @param by The locating mechanism to use
	   * @return A list of all {@link WebElement}s, or an empty list if nothing matches
	   * @see org.openqa.selenium.By
	   */
	  List<WebElement> findElements(By by);


	  /**
	   * Find the first {@link WebElement} using the given method.
	   *
	   * @param by The locating mechanism
	   * @return The first matching element on the current context
	   * @throws NoSuchElementException If no matching elements are found
	   */
	  WebElement findElement(By by);
}
