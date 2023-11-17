package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.ArrayMap;

/* renamed from: androidx.versionedparcelable.a */
class C1891a extends VersionedParcel {

    /* renamed from: d */
    private final SparseIntArray f5735d;

    /* renamed from: e */
    private final Parcel f5736e;

    /* renamed from: f */
    private final int f5737f;

    /* renamed from: g */
    private final int f5738g;

    /* renamed from: h */
    private final String f5739h;

    /* renamed from: i */
    private int f5740i;

    /* renamed from: j */
    private int f5741j;

    /* renamed from: k */
    private int f5742k;

    C1891a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    /* renamed from: A */
    public void mo6429A(byte[] bArr) {
        if (bArr != null) {
            this.f5736e.writeInt(bArr.length);
            this.f5736e.writeByteArray(bArr);
            return;
        }
        this.f5736e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo6431C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f5736e, 0);
    }

    /* renamed from: E */
    public void mo6433E(int i) {
        this.f5736e.writeInt(i);
    }

    /* renamed from: G */
    public void mo6435G(Parcelable parcelable) {
        this.f5736e.writeParcelable(parcelable, 0);
    }

    /* renamed from: I */
    public void mo6437I(String str) {
        this.f5736e.writeString(str);
    }

    /* renamed from: a */
    public void mo6442a() {
        int i = this.f5740i;
        if (i >= 0) {
            int i2 = this.f5735d.get(i);
            int dataPosition = this.f5736e.dataPosition();
            this.f5736e.setDataPosition(i2);
            this.f5736e.writeInt(dataPosition - i2);
            this.f5736e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public VersionedParcel mo6443b() {
        Parcel parcel = this.f5736e;
        int dataPosition = parcel.dataPosition();
        int i = this.f5741j;
        if (i == this.f5737f) {
            i = this.f5738g;
        }
        int i2 = i;
        return new C1891a(parcel, dataPosition, i2, this.f5739h + "  ", this.f5732a, this.f5733b, this.f5734c);
    }

    /* renamed from: g */
    public boolean mo6445g() {
        return this.f5736e.readInt() != 0;
    }

    /* renamed from: i */
    public byte[] mo6447i() {
        int readInt = this.f5736e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f5736e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public CharSequence mo6449k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f5736e);
    }

    /* renamed from: m */
    public boolean mo6451m(int i) {
        while (this.f5741j < this.f5738g) {
            int i2 = this.f5742k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f5736e.setDataPosition(this.f5741j);
            int readInt = this.f5736e.readInt();
            this.f5742k = this.f5736e.readInt();
            this.f5741j += readInt;
        }
        if (this.f5742k == i) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public int mo6453o() {
        return this.f5736e.readInt();
    }

    /* renamed from: q */
    public Parcelable mo6455q() {
        return this.f5736e.readParcelable(getClass().getClassLoader());
    }

    /* renamed from: s */
    public String mo6457s() {
        return this.f5736e.readString();
    }

    /* renamed from: w */
    public void mo6461w(int i) {
        mo6442a();
        this.f5740i = i;
        this.f5735d.put(i, this.f5736e.dataPosition());
        mo6433E(0);
        mo6433E(i);
    }

    /* renamed from: y */
    public void mo6463y(boolean z) {
        this.f5736e.writeInt(z ? 1 : 0);
    }

    private C1891a(Parcel parcel, int i, int i2, String str, ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.f5735d = new SparseIntArray();
        this.f5740i = -1;
        this.f5742k = -1;
        this.f5736e = parcel;
        this.f5737f = i;
        this.f5738g = i2;
        this.f5741j = i;
        this.f5739h = str;
    }
}
