package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class GameRequestContent implements ShareModel {
    public static final Parcelable.Creator<GameRequestContent> CREATOR = new C2707a();

    /* renamed from: d */
    private final String f8471d;

    /* renamed from: e */
    private final List f8472e;

    /* renamed from: f */
    private final String f8473f;

    /* renamed from: g */
    private final String f8474g;

    /* renamed from: h */
    private final C2708b f8475h;

    /* renamed from: i */
    private final String f8476i;

    /* renamed from: j */
    private final C2709c f8477j;

    /* renamed from: k */
    private final List f8478k;

    /* renamed from: com.facebook.share.model.GameRequestContent$a */
    static class C2707a implements Parcelable.Creator {
        C2707a() {
        }

        /* renamed from: a */
        public GameRequestContent createFromParcel(Parcel parcel) {
            return new GameRequestContent(parcel);
        }

        /* renamed from: b */
        public GameRequestContent[] newArray(int i) {
            return new GameRequestContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.GameRequestContent$b */
    public enum C2708b {
        SEND,
        ASKFOR,
        TURN
    }

    /* renamed from: com.facebook.share.model.GameRequestContent$c */
    public enum C2709c {
        APP_USERS,
        APP_NON_USERS
    }

    GameRequestContent(Parcel parcel) {
        this.f8471d = parcel.readString();
        this.f8472e = parcel.createStringArrayList();
        this.f8473f = parcel.readString();
        this.f8474g = parcel.readString();
        this.f8475h = (C2708b) parcel.readSerializable();
        this.f8476i = parcel.readString();
        this.f8477j = (C2709c) parcel.readSerializable();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.f8478k = createStringArrayList;
        parcel.readStringList(createStringArrayList);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8471d);
        parcel.writeStringList(this.f8472e);
        parcel.writeString(this.f8473f);
        parcel.writeString(this.f8474g);
        parcel.writeSerializable(this.f8475h);
        parcel.writeString(this.f8476i);
        parcel.writeSerializable(this.f8477j);
        parcel.writeStringList(this.f8478k);
    }
}
