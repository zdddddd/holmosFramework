package demo.page;

import com.holmos.webtest.element.TextField;
import com.holmos.webtest.struct.Page;

//继承page
public class BaiduPage extends Page {

    //写构造函数
    public BaiduPage() {
        super();
        this.comment="baidu首页";
        this.init();
    }

    //定义页面元素,根据homlos自定义的元素类型来定义
    public TextField queryTextField = new TextField("百度搜索框");

    {
        //该元素的定位方式,同一个元素可以写多个
        queryTextField.addIDLocator("kw");
        queryTextField.addXpathLocator("//*");
    }


}
