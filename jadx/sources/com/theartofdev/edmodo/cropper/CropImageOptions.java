package com.theartofdev.edmodo.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.github.mikephil.charting.utils.Utils;
import com.theartofdev.edmodo.cropper.CropImageView;

public class CropImageOptions implements Parcelable {
    public static final Parcelable.Creator<CropImageOptions> CREATOR = new C11846a();

    /* renamed from: A */
    public int f34451A;

    /* renamed from: B */
    public int f34452B;

    /* renamed from: C */
    public int f34453C;

    /* renamed from: D */
    public int f34454D;

    /* renamed from: E */
    public int f34455E;

    /* renamed from: F */
    public int f34456F;

    /* renamed from: G */
    public CharSequence f34457G;

    /* renamed from: H */
    public int f34458H;

    /* renamed from: I */
    public Uri f34459I;

    /* renamed from: J */
    public Bitmap.CompressFormat f34460J;

    /* renamed from: K */
    public int f34461K;

    /* renamed from: L */
    public int f34462L;

    /* renamed from: M */
    public int f34463M;

    /* renamed from: N */
    public CropImageView.C11856j f34464N;

    /* renamed from: O */
    public boolean f34465O;

    /* renamed from: P */
    public Rect f34466P;

    /* renamed from: Q */
    public int f34467Q;

    /* renamed from: R */
    public boolean f34468R;

    /* renamed from: S */
    public boolean f34469S;

    /* renamed from: T */
    public boolean f34470T;

    /* renamed from: U */
    public int f34471U;

    /* renamed from: V */
    public boolean f34472V;

    /* renamed from: W */
    public boolean f34473W;

    /* renamed from: X */
    public CharSequence f34474X;

    /* renamed from: Y */
    public int f34475Y;

    /* renamed from: d */
    public CropImageView.C11849c f34476d;

    /* renamed from: e */
    public float f34477e;

    /* renamed from: f */
    public float f34478f;

    /* renamed from: g */
    public CropImageView.C11850d f34479g;

    /* renamed from: h */
    public CropImageView.C11857k f34480h;

    /* renamed from: i */
    public boolean f34481i;

    /* renamed from: j */
    public boolean f34482j;

    /* renamed from: k */
    public boolean f34483k;

    /* renamed from: l */
    public boolean f34484l;

    /* renamed from: m */
    public int f34485m;

    /* renamed from: n */
    public float f34486n;

    /* renamed from: o */
    public boolean f34487o;

    /* renamed from: p */
    public int f34488p;

    /* renamed from: q */
    public int f34489q;

    /* renamed from: r */
    public float f34490r;

    /* renamed from: s */
    public int f34491s;

    /* renamed from: t */
    public float f34492t;

    /* renamed from: u */
    public float f34493u;

    /* renamed from: v */
    public float f34494v;

    /* renamed from: w */
    public int f34495w;

    /* renamed from: x */
    public float f34496x;

    /* renamed from: y */
    public int f34497y;

    /* renamed from: z */
    public int f34498z;

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageOptions$a */
    static class C11846a implements Parcelable.Creator {
        C11846a() {
        }

        /* renamed from: a */
        public CropImageOptions createFromParcel(Parcel parcel) {
            return new CropImageOptions(parcel);
        }

        /* renamed from: b */
        public CropImageOptions[] newArray(int i) {
            return new CropImageOptions[i];
        }
    }

    public CropImageOptions() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.f34476d = CropImageView.C11849c.RECTANGLE;
        this.f34477e = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f34478f = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.f34479g = CropImageView.C11850d.ON_TOUCH;
        this.f34480h = CropImageView.C11857k.FIT_CENTER;
        this.f34481i = true;
        this.f34482j = true;
        this.f34483k = true;
        this.f34484l = false;
        this.f34485m = 4;
        this.f34486n = 0.1f;
        this.f34487o = false;
        this.f34488p = 1;
        this.f34489q = 1;
        this.f34490r = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f34491s = Color.argb(170, C11051p3.f31759c, C11051p3.f31759c, C11051p3.f31759c);
        this.f34492t = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.f34493u = TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.f34494v = TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.f34495w = -1;
        this.f34496x = TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.f34497y = Color.argb(170, C11051p3.f31759c, C11051p3.f31759c, C11051p3.f31759c);
        this.f34498z = Color.argb(119, 0, 0, 0);
        this.f34451A = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f34452B = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f34453C = 40;
        this.f34454D = 40;
        this.f34455E = 99999;
        this.f34456F = 99999;
        this.f34457G = "";
        this.f34458H = 0;
        this.f34459I = Uri.EMPTY;
        this.f34460J = Bitmap.CompressFormat.JPEG;
        this.f34461K = 90;
        this.f34462L = 0;
        this.f34463M = 0;
        this.f34464N = CropImageView.C11856j.NONE;
        this.f34465O = false;
        this.f34466P = null;
        this.f34467Q = -1;
        this.f34468R = true;
        this.f34469S = true;
        this.f34470T = false;
        this.f34471U = 90;
        this.f34472V = false;
        this.f34473W = false;
        this.f34474X = null;
        this.f34475Y = 0;
    }

    /* renamed from: a */
    public void mo31760a() {
        if (this.f34485m < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        } else if (this.f34478f >= Utils.FLOAT_EPSILON) {
            float f = this.f34486n;
            if (f < Utils.FLOAT_EPSILON || ((double) f) >= 0.5d) {
                throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
            } else if (this.f34488p <= 0) {
                throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
            } else if (this.f34489q <= 0) {
                throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
            } else if (this.f34490r < Utils.FLOAT_EPSILON) {
                throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
            } else if (this.f34492t < Utils.FLOAT_EPSILON) {
                throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
            } else if (this.f34496x < Utils.FLOAT_EPSILON) {
                throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
            } else if (this.f34452B >= 0) {
                int i = this.f34453C;
                if (i >= 0) {
                    int i2 = this.f34454D;
                    if (i2 < 0) {
                        throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
                    } else if (this.f34455E < i) {
                        throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
                    } else if (this.f34456F < i2) {
                        throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
                    } else if (this.f34462L < 0) {
                        throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
                    } else if (this.f34463M >= 0) {
                        int i3 = this.f34471U;
                        if (i3 < 0 || i3 > 360) {
                            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
                    }
                } else {
                    throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
                }
            } else {
                throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
            }
        } else {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f34476d.ordinal());
        parcel.writeFloat(this.f34477e);
        parcel.writeFloat(this.f34478f);
        parcel.writeInt(this.f34479g.ordinal());
        parcel.writeInt(this.f34480h.ordinal());
        parcel.writeByte(this.f34481i ? (byte) 1 : 0);
        parcel.writeByte(this.f34482j ? (byte) 1 : 0);
        parcel.writeByte(this.f34483k ? (byte) 1 : 0);
        parcel.writeByte(this.f34484l ? (byte) 1 : 0);
        parcel.writeInt(this.f34485m);
        parcel.writeFloat(this.f34486n);
        parcel.writeByte(this.f34487o ? (byte) 1 : 0);
        parcel.writeInt(this.f34488p);
        parcel.writeInt(this.f34489q);
        parcel.writeFloat(this.f34490r);
        parcel.writeInt(this.f34491s);
        parcel.writeFloat(this.f34492t);
        parcel.writeFloat(this.f34493u);
        parcel.writeFloat(this.f34494v);
        parcel.writeInt(this.f34495w);
        parcel.writeFloat(this.f34496x);
        parcel.writeInt(this.f34497y);
        parcel.writeInt(this.f34498z);
        parcel.writeInt(this.f34451A);
        parcel.writeInt(this.f34452B);
        parcel.writeInt(this.f34453C);
        parcel.writeInt(this.f34454D);
        parcel.writeInt(this.f34455E);
        parcel.writeInt(this.f34456F);
        TextUtils.writeToParcel(this.f34457G, parcel, i);
        parcel.writeInt(this.f34458H);
        parcel.writeParcelable(this.f34459I, i);
        parcel.writeString(this.f34460J.name());
        parcel.writeInt(this.f34461K);
        parcel.writeInt(this.f34462L);
        parcel.writeInt(this.f34463M);
        parcel.writeInt(this.f34464N.ordinal());
        parcel.writeInt(this.f34465O ? 1 : 0);
        parcel.writeParcelable(this.f34466P, i);
        parcel.writeInt(this.f34467Q);
        parcel.writeByte(this.f34468R ? (byte) 1 : 0);
        parcel.writeByte(this.f34469S ? (byte) 1 : 0);
        parcel.writeByte(this.f34470T ? (byte) 1 : 0);
        parcel.writeInt(this.f34471U);
        parcel.writeByte(this.f34472V ? (byte) 1 : 0);
        parcel.writeByte(this.f34473W ? (byte) 1 : 0);
        TextUtils.writeToParcel(this.f34474X, parcel, i);
        parcel.writeInt(this.f34475Y);
    }

    protected CropImageOptions(Parcel parcel) {
        this.f34476d = CropImageView.C11849c.values()[parcel.readInt()];
        this.f34477e = parcel.readFloat();
        this.f34478f = parcel.readFloat();
        this.f34479g = CropImageView.C11850d.values()[parcel.readInt()];
        this.f34480h = CropImageView.C11857k.values()[parcel.readInt()];
        boolean z = true;
        this.f34481i = parcel.readByte() != 0;
        this.f34482j = parcel.readByte() != 0;
        this.f34483k = parcel.readByte() != 0;
        this.f34484l = parcel.readByte() != 0;
        this.f34485m = parcel.readInt();
        this.f34486n = parcel.readFloat();
        this.f34487o = parcel.readByte() != 0;
        this.f34488p = parcel.readInt();
        this.f34489q = parcel.readInt();
        this.f34490r = parcel.readFloat();
        this.f34491s = parcel.readInt();
        this.f34492t = parcel.readFloat();
        this.f34493u = parcel.readFloat();
        this.f34494v = parcel.readFloat();
        this.f34495w = parcel.readInt();
        this.f34496x = parcel.readFloat();
        this.f34497y = parcel.readInt();
        this.f34498z = parcel.readInt();
        this.f34451A = parcel.readInt();
        this.f34452B = parcel.readInt();
        this.f34453C = parcel.readInt();
        this.f34454D = parcel.readInt();
        this.f34455E = parcel.readInt();
        this.f34456F = parcel.readInt();
        this.f34457G = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f34458H = parcel.readInt();
        this.f34459I = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f34460J = Bitmap.CompressFormat.valueOf(parcel.readString());
        this.f34461K = parcel.readInt();
        this.f34462L = parcel.readInt();
        this.f34463M = parcel.readInt();
        this.f34464N = CropImageView.C11856j.values()[parcel.readInt()];
        this.f34465O = parcel.readByte() != 0;
        this.f34466P = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f34467Q = parcel.readInt();
        this.f34468R = parcel.readByte() != 0;
        this.f34469S = parcel.readByte() != 0;
        this.f34470T = parcel.readByte() != 0;
        this.f34471U = parcel.readInt();
        this.f34472V = parcel.readByte() != 0;
        this.f34473W = parcel.readByte() == 0 ? false : z;
        this.f34474X = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f34475Y = parcel.readInt();
    }
}
