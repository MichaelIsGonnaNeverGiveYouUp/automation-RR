package pom;

import singleton.SingletonBaseClass;

public class HomePage extends SingletonBaseClass {
    public String getTitle() {
        return getDriver().getTitle();
    }
}
