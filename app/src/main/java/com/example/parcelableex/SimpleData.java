package com.example.parcelableex;


import android.os.Parcel;
import android.os.Parcelable;

public class SimpleData implements Parcelable {
    int number;
    String message;
    String git_Test;
    public SimpleData(int num, String msg, String git){
        number = num;
        message = msg;
        git_Test = git;
    }
    public SimpleData(Parcel src){
        number = src.readInt();
        message = src.readString();
    }
    public static final Creator CREATOR = new Creator() {
        public SimpleData createFromParcel(Parcel in){
            return new SimpleData(in);
        }
        public SimpleData[] newArray(int size){
            return new SimpleData[size];
        }
    };
    public void writeToParcel(Parcel dest, int flags){
        dest.writeInt(number);
        dest.writeString(message);
    }
    public int describeContents(){
        return 0;
    }
}
