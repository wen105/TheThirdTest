

import com.shuyun.logback.LogUtils;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by shuyun on 2016/8/11.
 * TestLog
 */
public class TestLog {
    private final static Logger logger = LoggerFactory.getLogger(TestLog.class);

    @Test
    public void test1() {
        LogUtils.logInfo("INFO~");
        LogUtils.logDebug("Debug~");
        LogUtils.logError("ERROR");
        LogUtils.logWarn("WARN");
        logger.info("logback 成功了");
        logger.error("logback 成功了");
    }
}
