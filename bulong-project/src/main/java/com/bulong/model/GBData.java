package main.java.com.bulong.model;

public class GBData {

    private String warpFeed;
    private String yarnConsumption;
    private String headPattern;
    private String threading;
    private String rawMaterialSpec;
    private String patternHeight;

    public void setWarpFeed(String warpFeed) {
        this.warpFeed = warpFeed;
    }
    public void setYarnConsumption(String yarnConsumption) {
        this.yarnConsumption = yarnConsumption;
    }
    public void setHeadPattern(String headPattern) {
        this.headPattern = headPattern;
    }
    public void setThreading(String threading) {
        this.threading = threading;
    }
    public void setRawMaterialSpec(String rawMaterialSpec) {
        this.rawMaterialSpec = rawMaterialSpec;
    }
    public void setPatternHeight(String patternHeight) {
        this.patternHeight = patternHeight;
    }

    public String getWarpFeed() {
        return warpFeed;
    }
    public String getYarnConsumption() {
        return yarnConsumption;
    }
    public String getHeadPattern() {
        return headPattern;
    }
    public String getThreading() {
        return threading;
    }
    public String getRawMaterialSpec() {
        return rawMaterialSpec;
    }
    public String getPatternHeight() {
        return patternHeight;
    }
}
