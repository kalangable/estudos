package com.gable.estudo.config;

public final class Version {

    private static final String VERSION = "${project.version}";
    private static final String GROUPID = "${project.groupId}";
    private static final String ARTIFACTID = "${project.artifactId}";
    private static final String DESCRIPTION = "${project.description}";
    private static final String NAME = "${project.name}";

    public static String getVersion() {
        return VERSION;
    }

    public static String getArtifactId() {
        return ARTIFACTID;
    }

    public static String getGroupId() {
        return GROUPID;
    }

    public static String getRootPackage() {
        return GROUPID+"."+ARTIFACTID;
    }

    public static String getDescription(){
        return DESCRIPTION;
    }

    public static String getName(){
        return NAME;
    }

}