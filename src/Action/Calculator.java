package Action;

import VO.Calculator1;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2017/9/18.
 */
public class Calculator extends ActionSupport {

    private Calculator1 cal;

    public Calculator1 getCal() {
        return cal;
    }

    public void setCal(Calculator1 cal) {
        this.cal = cal;
    }



    //业务处理方法
    public String calculate()  {
        float result = 0;

         switch (cal.getOp().charAt(0)) {


            case '+':result=cal.getNum1()+cal.getNum2();break;
            case '-':result=cal.getNum1()-cal.getNum2();break;
            case '*':result=cal.getNum1()*cal.getNum2();break;
            case '/':result=cal.getNum1()/cal.getNum2();break;

        }

        ActionContext.getContext().put("result",result);
        return "calRight";
    }


}