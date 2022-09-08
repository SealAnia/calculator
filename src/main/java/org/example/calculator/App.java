package org.example.calculator;

import org.example.calculator.app.Calculator;

import org.mariuszgromada.math.mxparser.*;

public class App 
{
    public static void main( String[] args )
    {
        
        Expression expressionFirst = new Expression();
        expressionFirst.setExpressionString(Calculator.generateExercise("resources/file.txt"));
        mXparser.consolePrintln(expressionFirst.getExpressionString() + "=" + (int) expressionFirst.calculate());
        
        Expression expressionSecond = new Expression();
        expressionSecond.setExpressionString(Calculator.generateExercise("resources/file_one.txt"));
        mXparser.consolePrintln(expressionSecond.getExpressionString() + "=" + (int) expressionSecond.calculate());
        
    }
}
