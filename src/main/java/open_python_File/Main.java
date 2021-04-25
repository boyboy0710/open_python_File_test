package open_python_File;

import org.python.util.PythonInterpreter;

public class Main {

    private static PythonInterpreter interpreter;

    public static void main(String[] args) {
        interpreter = new PythonInterpreter();
        interpreter.execfile("src/main/java/open_python_File/python_file/test.py");//파이썬 파일 불러오기 및 실행
        interpreter.exec("print('test')"); //괄호안에 있는 파이썬 구문 실행
        /*
        파이썬 구문중 ""는 ''로 대체한다
        이 구문들은 자이썬 api가 있어야 한다
         */
    }

}
