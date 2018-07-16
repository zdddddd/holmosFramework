package demo.holmos;

import com.holmos.webtest.EngineType;
import com.holmos.webtest.utils.HolmosWindow;
import demo.page.BaiduPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BaiduPageTest {

    BaiduPage baiduPage = new BaiduPage();

    @Before
    public void openChrome(){
        HolmosWindow.openNewWindow(EngineType.WebDriverChrome,"http://www.baidu.com");
    }

    @Test
    public void queryTest(){
        //对某个页面的某个元素进行操作
        baiduPage.queryTextField.click();
    }


    @After
    public void close(){
        HolmosWindow.closeAllWindows();
    }
}
