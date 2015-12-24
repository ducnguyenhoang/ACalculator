package com.gdgvietnam.calculator;

import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by ducnguyen on 12/22/15.
 */
public class Operation {
    private TextView mTvResult;
    private double mDResult;

    public  Operation(){
        mDResult = 0;
    }

    public void setmDResult(double dResult){
        this.mDResult = dResult;
    }

    public double getmDResult(){
        return mDResult;
    }
    public void setmTvResult(TextView tvResult){
        mTvResult = tvResult;
    }
    public TextView getmTvResult(){
        return mTvResult;
    }

    public boolean checkStringResult(String strResult){
        return true;
    }

    /**
     * Addtional Operation
     * @param strResult
     * Return: non
     * Set variable to mDResult
     */
    public void plusOperation(String strResult){
        String[] parts = strResult.split("\\+");
        for(int i = 0; i < parts.length; i++){
            mDResult += Double.parseDouble(parts[i]);
        }
    }

    /**
     * Minus Operation
     * @param strResult
     * Return: non
     * Set variable to mDResult
     */
    public void minusOperation(String strResult){
        if (strResult.charAt(0) != '-'){
            String[] parts = strResult.split("\\-");
            mDResult = Double.parseDouble(parts[0]);
            for(int i = 1; i < parts.length; i++){
                mDResult -= Double.parseDouble(parts[i]);
            }
        }
    }

    /**
     * Subtraction operation
     * @param strResult
     * Return: non
     * Set variable to mDResult
     */
    public void subOperation(String strResult){
        if(strResult.charAt(0) != '/') {
            String[] parts = strResult.split("\\/");
            mDResult = Double.parseDouble(parts[0]);
            for (int i = 1; i < parts.length; i++) {
                mDResult /= Double.parseDouble(parts[i]);
            }
        }
    }

    /**
     * Multiple Operation
     * @param strResult
     * Return: non
     * Set variable to mDResult
     */
    public void mulOperation(String strResult){
        if(strResult.charAt(0) != '*') {
            String[] parts = strResult.split("\\*");
            mDResult = Double.parseDouble(parts[0]);
            for (int i = 1; i < parts.length; i++) {
                mDResult *= Double.parseDouble(parts[i]);
            }
        }
    }

    public void operationWithoutBracket(String strResult) {

    }
}
