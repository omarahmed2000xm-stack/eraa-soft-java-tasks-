import MyrezService.MyrezApplicationService;
import MyrezService.MyrezApplicationServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyrezApplicationService myrezApplicationService = new MyrezApplicationServiceImpl();
        myrezApplicationService.start();
    }
}