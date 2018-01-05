package com.bridgelabz.swip4;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by client1 on 1/4/2018.
 */

public class CustModel implements Parcelable {
    public String button1;
    public String button2;
    public String button3;

    public CustModel() {

    }

    protected CustModel(Parcel in) {
        button1 = in.readString();
        button2 = in.readString();
        button3 = in.readString();
    }

    public static final Creator<CustModel> CREATOR = new Creator<CustModel>() {
        @Override
        public CustModel createFromParcel(Parcel in) {
            return new CustModel(in);
        }

        @Override
        public CustModel[] newArray(int size) {
            return new CustModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(button1);
        dest.writeString(button2);
        dest.writeString(button3);
    }
}
