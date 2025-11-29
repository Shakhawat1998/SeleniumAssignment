package listeners;

import com.aventstack.extentreports.Status;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.BaseTest;

public class TestListener extends BaseTest implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, "Test failed: " + result.getName());
        test.log(Status.FAIL, result.getThrowable());
        // later: attach screenshot here
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.log(Status.SKIP, "Test skipped: " + result.getName());
    }
}
