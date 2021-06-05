package com.example.pasgenap_robertlyonistanto_10rpl2_27;

import android.os.Parcel;
import android.os.Parcelable;

public class Club implements Parcelable {
    private String name;
    private String detail;
    private int foto;

    public Club (){

    }

    protected Club(Parcel in) {
        name = in.readString();
        detail = in.readString();
        foto = in.readInt();
    }

    public static final Creator<Club> CREATOR = new Creator<Club>() {
        @Override
        public Club createFromParcel(Parcel in) {
            return new Club(in);
        }

        @Override
        public Club[] newArray(int size) {
            return new Club[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(detail);
        dest.writeInt(foto);
    }
}
