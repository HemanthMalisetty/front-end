package com.wikia.webdriver.pageobjectsfactory.componentobject.activity.creators;

import com.wikia.webdriver.pageobjectsfactory.componentobject.activity.Activity;
import com.wikia.webdriver.pageobjectsfactory.componentobject.activity.EditActivity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class EditActivityPageCreator extends ActivityPageCreator {

  private static final String EDIT_ACTIVITY_CSS_SELECTOR = "activity-type-edit";

  public EditActivityPageCreator() {
    super();
  }

  @Override
  public Activity createPage(WebDriver driver, WebElement parentElement) {
    return new EditActivity(driver, parentElement);
  }

  @Override
  public boolean match(String activityCssSelector) {
    return activityCssSelector.contains(EDIT_ACTIVITY_CSS_SELECTOR);
  }
}
