package org.teknasyonAutomation.ReportUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReporterNG {

    static ExtentReports extent;

    public static ExtentReports getReporterObject()
    {

        //	ExtentReports , ExtentSparkReporter
        String path =System.getProperty("user.dir")+"//reports//index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("teknasyon Automation Results");
        reporter.config().setDocumentTitle("Test Results");

        extent =new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "dori dorukhan");
        return extent;

    }

}
