package com.example.belajarsqlite;

import android.os.Parcel;
import android.os.Parcelable;

public class MhsModel implements Parcelable {

    int id;
    String nama;
    String nim;
    String noHp;

    public MhsModel(int id, String nama, String nim, String noHp) {
        this.id = id;
        this.nama = nama;
        this.nim = nim;
        this.noHp = noHp;
    }
    // Zalfa Destian Ramadhani
    // G.211.20.0076
    // Kelas A2
    public int getId() {
        return id;
    }
    // Zalfa Destian Ramadhani
    // G.211.20.0076
    // Kelas A2
    public void setId(int id) {
        this.id = id;
    }
    // Zalfa Destian Ramadhani
    // G.211.20.0076
    // Kelas A2
    public String getNama() {
        return nama;
    }
    // Zalfa Destian Ramadhani
    // G.211.20.0076
    // Kelas A2
    public void setNama(String nama) {
        this.nama = nama;
    }
    // Zalfa Destian Ramadhani
    // G.211.20.0076
    // Kelas A2
    public String getNim() {
        return nim;
    }
    // Zalfa Destian Ramadhani
    // G.211.20.0076
    // Kelas A2
    public void setNim(String nim) {
        this.nim = nim;
    }
    // Zalfa Destian Ramadhani
    // G.211.20.0076
    // Kelas A2
    public String getNoHp() {
        return noHp;
    }
    // Zalfa Destian Ramadhani
    // G.211.20.0076
    // Kelas A2
    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
// Zalfa Destian Ramadhani
// G.211.20.0076
// Kelas A2

    @Override
    public int describeContents() {
        return 0;
    }
    // Zalfa Destian Ramadhani
    // G.211.20.0076
    // Kelas A2
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.nama);
        dest.writeString(this.nim);
        dest.writeString(this.noHp);
    }
    // Zalfa Destian Ramadhani
    // G.211.20.0076
    // Kelas A2
    public void readFromParcel(Parcel source) {
        this.id = source.readInt();
        this.nama = source.readString();
        this.nim = source.readString();
        this.noHp = source.readString();
    }

    public MhsModel() {
    }

    protected MhsModel(Parcel in) {
        this.id = in.readInt();
        this.nama = in.readString();
        this.nim = in.readString();
        this.noHp = in.readString();
    }
    // Zalfa Destian Ramadhani
    // G.211.20.0076
    // Kelas A2
    public static final Creator<MhsModel> CREATOR = new Creator<MhsModel>() {
        @Override
        public MhsModel createFromParcel(Parcel source) {
            return new MhsModel(source);
        }

        @Override
        public MhsModel[] newArray(int size) {
            return new MhsModel[size];
        }
    };
}

// Zalfa Destian Ramadhani
// G.211.20.0076
// Kelas A2
