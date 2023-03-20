package pom;

import element.Element;

import java.util.HashMap;

public class TopBannerPage extends Element {

    // This element is something nice to have: Pass a parent element (optional) to an element to make the search more efficient when we don't have a fixed id
    public Element topBanner = new Element("site-header", "id");
    // The following elements have id's, but we can't use them since they change every time we run the test
    // We could use a variable to store the base URL, concatenate the menu option and use it in the href section
    public Element talentIntelligenceMenu = new Element("//li/a[@href=\"/talent-intelligence/\"]", "xpath");
    public Element talentIntelligenceMenuOverview = new Element("//li/a[@href=\"https://www.randallreilly.com/talent-intelligence/\"]", "xpath");
    public Element talentIntelligenceMenuTechnologies = new Element("//li/a[@href=\"https://www.randallreilly.com/talent-intelligence/stratas/\"]", "xpath");
    public Element talentIntelligenceMenuTalentPartners = new Element("//li/a[@href=\"https://www.randallreilly.com/talent-intelligence/recruiting-services/\"]", "xpath");
    public Element talentIntelligenceMenuStrategicResults = new Element("//li/a[@href=\"https://www.randallreilly.com/talent-intelligence/recruiting-campaigns/\"]", "xpath");
    public Element talentIntelligenceMenuQualityApplicants = new Element("//li/a[@href=\"https://www.randallreilly.com/talent-intelligence/driver-media/\"]", "xpath");

    // This could be a property file, but we'll use a HashMap for now
    public HashMap<String, String> talentIntelligenceMenuOptions = new HashMap<String, String>() {{
        put("overview", "https://www.randallreilly.com/talent-intelligence/");
        put("technologies", "https://www.randallreilly.com/talent-intelligence/stratas/");
        put("talentPartners", "https://www.randallreilly.com/talent-intelligence/recruiting-services/");
        put("strategicResults", "https://www.randallreilly.com/talent-intelligence/recruiting-campaigns/");
        put("qualityApplicants", "https://www.randallreilly.com/talent-intelligence/driver-media/");
    }};
}
