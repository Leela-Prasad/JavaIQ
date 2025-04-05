package test;

/*import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;*/

//@RestController
public class Exercise2 {

    /*@JsonView(View.Employee.class)
    @GetMapping(value = "/e1", produces = "application/xml")
    public MyModelResponse E1() {
        MyModel model = new MyModel();
        model.setField1("E1 Field1");
        model.setField2("E1 Field2");
        model.setField3("E1 Field3");
        model.setField4("E1 Field4");
        model.setField5("E1 Field5");
        model.setField6("E1 Field6");
        model.setField7("E1 Field7");
        model.setField8("E1 Field8");
        model.setField9("E1 Field9");
        model.setField10("E1 Field10");

        MyModelResponse response = new MyModelResponse();
        response.setMyModel(model);
        return response;
    }

    @JsonView(View.Manager.class)
    @GetMapping(value = "/e2", produces = "application/xml")
    public MyModelResponse E2() {
        MyModel model = new MyModel();
        model.setField1("E2 Field1");
        model.setField2("E2 Field2");
        model.setField3("E2 Field3");
        model.setField4("E2 Field4");
        model.setField5("E2 Field5");
        model.setField6("E2 Field6");
        model.setField7("E2 Field7");
        model.setField8("E2 Field8");
        model.setField9("E2 Field9");
        model.setField10("E2 Field10");

        MyModelResponse response = new MyModelResponse();
        response.setMyModel(model);
        return response;
    }*/

}

/*class View {
    public static class Manager {}
    public static class Employee {}
}

class MyModelResponse {
    @JsonView({View.Manager.class, View.Employee.class})
    private MyModel myModel;

    public MyModel getMyModel() {
        return myModel;
    }

    public void setMyModel(MyModel myModel) {
        this.myModel = myModel;
    }
}

class MyModel {

    @JsonView({View.Manager.class, View.Employee.class})
    private String field1;

    @JsonView(View.Employee.class)
    private String field2;

    @JsonView(View.Manager.class)
    private String field3;

    @JsonView(View.Employee.class)
    private String field4;

    @JsonView(View.Manager.class)
    private String field5;

    @JsonView(View.Employee.class)
    private String field6;

    @JsonView(View.Manager.class)
    private String field7;

    @JsonView(View.Employee.class)
    private String field8;

    @JsonView(View.Manager.class)
    private String field9;

    @JsonView(View.Employee.class)
    private String field10;

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }

    public String getField6() {
        return field6;
    }

    public void setField6(String field6) {
        this.field6 = field6;
    }

    public String getField7() {
        return field7;
    }

    public void setField7(String field7) {
        this.field7 = field7;
    }

    public String getField8() {
        return field8;
    }

    public void setField8(String field8) {
        this.field8 = field8;
    }

    public String getField9() {
        return field9;
    }

    public void setField9(String field9) {
        this.field9 = field9;
    }

    public String getField10() {
        return field10;
    }

    public void setField10(String field10) {
        this.field10 = field10;
    }
}*/
