package org.parceler;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.parceler.C42035e;
import th1.C43021a;
import th1.C43022b;
import th1.C43023c;
import th1.C43024d;
import th1.C43025e;
import th1.C43026f;
import th1.C43027g;
import th1.C43028h;
import th1.C43029i;
import th1.C43031k;
import th1.C43032l;
import th1.C43033m;
import th1.C43034n;

final class NonParcelRepository implements C42040f {

    /* renamed from: b */
    private static final NonParcelRepository f98751b = new NonParcelRepository();

    /* renamed from: a */
    private final Map f98752a;

    public static final class BooleanArrayParcelable extends ConverterParcelable<boolean[]> {
        public static final C41956a CREATOR = new C41956a();

        /* renamed from: f */
        private static final C43022b f98753f = new C43022b();

        /* renamed from: org.parceler.NonParcelRepository$BooleanArrayParcelable$a */
        private static final class C41956a implements Parcelable.Creator {
            private C41956a() {
            }

            /* renamed from: a */
            public BooleanArrayParcelable createFromParcel(Parcel parcel) {
                return new BooleanArrayParcelable(parcel);
            }

            /* renamed from: b */
            public BooleanArrayParcelable[] newArray(int i) {
                return new BooleanArrayParcelable[i];
            }
        }

        public BooleanArrayParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98753f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public BooleanArrayParcelable(boolean[] zArr) {
            super((Object) zArr, (C42041g) f98753f);
        }
    }

    public static final class BooleanParcelable extends ConverterParcelable<Boolean> {
        public static final C41958b CREATOR = new C41958b();

        /* renamed from: f */
        private static final C43031k f98754f = new C41957a();

        /* renamed from: org.parceler.NonParcelRepository$BooleanParcelable$a */
        static class C41957a extends C43031k {
            C41957a() {
            }

            /* renamed from: e */
            public Boolean mo97342c(Parcel parcel) {
                return Boolean.valueOf(parcel.createBooleanArray()[0]);
            }

            /* renamed from: f */
            public void mo97343d(Boolean bool, Parcel parcel) {
                parcel.writeBooleanArray(new boolean[]{bool.booleanValue()});
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$BooleanParcelable$b */
        private static final class C41958b implements Parcelable.Creator {
            private C41958b() {
            }

            /* renamed from: a */
            public BooleanParcelable createFromParcel(Parcel parcel) {
                return new BooleanParcelable(parcel);
            }

            /* renamed from: b */
            public BooleanParcelable[] newArray(int i) {
                return new BooleanParcelable[i];
            }
        }

        public BooleanParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98754f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public BooleanParcelable(boolean z) {
            super((Object) Boolean.valueOf(z), (C42041g) f98754f);
        }
    }

    public static final class ByteArrayParcelable extends ConverterParcelable<byte[]> {
        public static final C41960b CREATOR = new C41960b();

        /* renamed from: f */
        private static final C43031k f98755f = new C41959a();

        /* renamed from: org.parceler.NonParcelRepository$ByteArrayParcelable$a */
        static class C41959a extends C43031k {
            C41959a() {
            }

            /* renamed from: e */
            public byte[] mo97342c(Parcel parcel) {
                return parcel.createByteArray();
            }

            /* renamed from: f */
            public void mo97343d(byte[] bArr, Parcel parcel) {
                parcel.writeByteArray(bArr);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$ByteArrayParcelable$b */
        private static final class C41960b implements Parcelable.Creator {
            private C41960b() {
            }

            /* renamed from: a */
            public ByteArrayParcelable createFromParcel(Parcel parcel) {
                return new ByteArrayParcelable(parcel);
            }

            /* renamed from: b */
            public ByteArrayParcelable[] newArray(int i) {
                return new ByteArrayParcelable[i];
            }
        }

        public ByteArrayParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98755f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public ByteArrayParcelable(byte[] bArr) {
            super((Object) bArr, (C42041g) f98755f);
        }
    }

    public static final class ByteParcelable extends ConverterParcelable<Byte> {
        public static final C41962b CREATOR = new C41962b();

        /* renamed from: f */
        private static final C43031k f98756f = new C41961a();

        /* renamed from: org.parceler.NonParcelRepository$ByteParcelable$a */
        static class C41961a extends C43031k {
            C41961a() {
            }

            /* renamed from: e */
            public Byte mo97342c(Parcel parcel) {
                return Byte.valueOf(parcel.readByte());
            }

            /* renamed from: f */
            public void mo97343d(Byte b, Parcel parcel) {
                parcel.writeByte(b.byteValue());
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$ByteParcelable$b */
        private static final class C41962b implements Parcelable.Creator {
            private C41962b() {
            }

            /* renamed from: a */
            public ByteParcelable createFromParcel(Parcel parcel) {
                return new ByteParcelable(parcel);
            }

            /* renamed from: b */
            public ByteParcelable[] newArray(int i) {
                return new ByteParcelable[i];
            }
        }

        public ByteParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98756f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public ByteParcelable(Byte b) {
            super((Object) b, (C42041g) f98756f);
        }
    }

    public static final class CharArrayParcelable extends ConverterParcelable<char[]> {
        public static final C41963a CREATOR = new C41963a();

        /* renamed from: f */
        private static final C43023c f98757f = new C43023c();

        /* renamed from: org.parceler.NonParcelRepository$CharArrayParcelable$a */
        private static final class C41963a implements Parcelable.Creator {
            private C41963a() {
            }

            /* renamed from: a */
            public CharArrayParcelable createFromParcel(Parcel parcel) {
                return new CharArrayParcelable(parcel);
            }

            /* renamed from: b */
            public CharArrayParcelable[] newArray(int i) {
                return new CharArrayParcelable[i];
            }
        }

        public CharArrayParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98757f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public CharArrayParcelable(char[] cArr) {
            super((Object) cArr, (C42041g) f98757f);
        }
    }

    public static final class CharacterParcelable extends ConverterParcelable<Character> {
        public static final C41965b CREATOR = new C41965b();

        /* renamed from: f */
        private static final C43031k f98758f = new C41964a();

        /* renamed from: org.parceler.NonParcelRepository$CharacterParcelable$a */
        static class C41964a extends C43031k {
            C41964a() {
            }

            /* renamed from: e */
            public Character mo97342c(Parcel parcel) {
                return Character.valueOf(parcel.createCharArray()[0]);
            }

            /* renamed from: f */
            public void mo97343d(Character ch, Parcel parcel) {
                parcel.writeCharArray(new char[]{ch.charValue()});
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$CharacterParcelable$b */
        private static final class C41965b implements Parcelable.Creator {
            private C41965b() {
            }

            /* renamed from: a */
            public CharacterParcelable createFromParcel(Parcel parcel) {
                return new CharacterParcelable(parcel);
            }

            /* renamed from: b */
            public CharacterParcelable[] newArray(int i) {
                return new CharacterParcelable[i];
            }
        }

        public CharacterParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98758f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public CharacterParcelable(Character ch) {
            super((Object) ch, (C42041g) f98758f);
        }
    }

    public static final class CollectionParcelable extends ConverterParcelable<Collection> {
        public static final C41967b CREATOR = new C41967b();

        /* renamed from: f */
        private static final C43024d f98759f = new C41966a();

        /* renamed from: org.parceler.NonParcelRepository$CollectionParcelable$a */
        static class C41966a extends C43021a {
            C41966a() {
            }

            /* renamed from: e */
            public Object mo97372e(Parcel parcel) {
                return C42035e.m122119a(parcel.readParcelable(CollectionParcelable.class.getClassLoader()));
            }

            /* renamed from: f */
            public void mo97373f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C42035e.m122121c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$CollectionParcelable$b */
        private static final class C41967b implements Parcelable.Creator {
            private C41967b() {
            }

            /* renamed from: a */
            public CollectionParcelable createFromParcel(Parcel parcel) {
                return new CollectionParcelable(parcel);
            }

            /* renamed from: b */
            public CollectionParcelable[] newArray(int i) {
                return new CollectionParcelable[i];
            }
        }

        public CollectionParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98759f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public CollectionParcelable(Collection collection) {
            super((Object) collection, (C42041g) f98759f);
        }
    }

    public static final class DoubleParcelable extends ConverterParcelable<Double> {
        public static final C41969b CREATOR = new C41969b();

        /* renamed from: f */
        private static final C43031k f98762f = new C41968a();

        /* renamed from: org.parceler.NonParcelRepository$DoubleParcelable$a */
        static class C41968a extends C43031k {
            C41968a() {
            }

            /* renamed from: e */
            public Double mo97342c(Parcel parcel) {
                return Double.valueOf(parcel.readDouble());
            }

            /* renamed from: f */
            public void mo97343d(Double d, Parcel parcel) {
                parcel.writeDouble(d.doubleValue());
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$DoubleParcelable$b */
        private static final class C41969b implements Parcelable.Creator {
            private C41969b() {
            }

            /* renamed from: a */
            public DoubleParcelable createFromParcel(Parcel parcel) {
                return new DoubleParcelable(parcel);
            }

            /* renamed from: b */
            public DoubleParcelable[] newArray(int i) {
                return new DoubleParcelable[i];
            }
        }

        public DoubleParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98762f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public DoubleParcelable(Double d) {
            super((Object) d, (C42041g) f98762f);
        }
    }

    public static final class FloatParcelable extends ConverterParcelable<Float> {
        public static final C41971b CREATOR = new C41971b();

        /* renamed from: f */
        private static final C43031k f98763f = new C41970a();

        /* renamed from: org.parceler.NonParcelRepository$FloatParcelable$a */
        static class C41970a extends C43031k {
            C41970a() {
            }

            /* renamed from: e */
            public Float mo97342c(Parcel parcel) {
                return Float.valueOf(parcel.readFloat());
            }

            /* renamed from: f */
            public void mo97343d(Float f, Parcel parcel) {
                parcel.writeFloat(f.floatValue());
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$FloatParcelable$b */
        private static final class C41971b implements Parcelable.Creator {
            private C41971b() {
            }

            /* renamed from: a */
            public FloatParcelable createFromParcel(Parcel parcel) {
                return new FloatParcelable(parcel);
            }

            /* renamed from: b */
            public FloatParcelable[] newArray(int i) {
                return new FloatParcelable[i];
            }
        }

        public FloatParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98763f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public FloatParcelable(Float f) {
            super((Object) f, (C42041g) f98763f);
        }
    }

    public static final class IBinderParcelable extends ConverterParcelable<IBinder> {
        public static final C41973b CREATOR = new C41973b();

        /* renamed from: f */
        private static final C43031k f98764f = new C41972a();

        /* renamed from: org.parceler.NonParcelRepository$IBinderParcelable$a */
        static class C41972a extends C43031k {
            C41972a() {
            }

            /* renamed from: e */
            public IBinder mo97342c(Parcel parcel) {
                return parcel.readStrongBinder();
            }

            /* renamed from: f */
            public void mo97343d(IBinder iBinder, Parcel parcel) {
                parcel.writeStrongBinder(iBinder);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$IBinderParcelable$b */
        private static final class C41973b implements Parcelable.Creator {
            private C41973b() {
            }

            /* renamed from: a */
            public IBinderParcelable createFromParcel(Parcel parcel) {
                return new IBinderParcelable(parcel);
            }

            /* renamed from: b */
            public IBinderParcelable[] newArray(int i) {
                return new IBinderParcelable[i];
            }
        }

        public IBinderParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98764f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public IBinderParcelable(IBinder iBinder) {
            super((Object) iBinder, (C42041g) f98764f);
        }
    }

    public static final class IntegerParcelable extends ConverterParcelable<Integer> {
        public static final C41975b CREATOR = new C41975b();

        /* renamed from: f */
        private static final C43031k f98765f = new C41974a();

        /* renamed from: org.parceler.NonParcelRepository$IntegerParcelable$a */
        static class C41974a extends C43031k {
            C41974a() {
            }

            /* renamed from: e */
            public Integer mo97342c(Parcel parcel) {
                return Integer.valueOf(parcel.readInt());
            }

            /* renamed from: f */
            public void mo97343d(Integer num, Parcel parcel) {
                parcel.writeInt(num.intValue());
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$IntegerParcelable$b */
        private static final class C41975b implements Parcelable.Creator {
            private C41975b() {
            }

            /* renamed from: a */
            public IntegerParcelable createFromParcel(Parcel parcel) {
                return new IntegerParcelable(parcel);
            }

            /* renamed from: b */
            public IntegerParcelable[] newArray(int i) {
                return new IntegerParcelable[i];
            }
        }

        public IntegerParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98765f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public IntegerParcelable(Integer num) {
            super((Object) num, (C42041g) f98765f);
        }
    }

    public static final class LinkedHashMapParcelable extends ConverterParcelable<LinkedHashMap> {
        public static final C41977b CREATOR = new C41977b();

        /* renamed from: f */
        private static final C43027g f98766f = new C41976a();

        /* renamed from: org.parceler.NonParcelRepository$LinkedHashMapParcelable$a */
        static class C41976a extends C43027g {
            C41976a() {
            }

            /* renamed from: e */
            public Object mo97402e(Parcel parcel) {
                return C42035e.m122119a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            /* renamed from: f */
            public void mo97403f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C42035e.m122121c(obj), 0);
            }

            /* renamed from: g */
            public Object mo97404g(Parcel parcel) {
                return C42035e.m122119a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            /* renamed from: h */
            public void mo97405h(Object obj, Parcel parcel) {
                parcel.writeParcelable(C42035e.m122121c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$LinkedHashMapParcelable$b */
        private static final class C41977b implements Parcelable.Creator {
            private C41977b() {
            }

            /* renamed from: a */
            public LinkedHashMapParcelable createFromParcel(Parcel parcel) {
                return new LinkedHashMapParcelable(parcel);
            }

            /* renamed from: b */
            public LinkedHashMapParcelable[] newArray(int i) {
                return new LinkedHashMapParcelable[i];
            }
        }

        public LinkedHashMapParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98766f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public LinkedHashMapParcelable(LinkedHashMap linkedHashMap) {
            super((Object) linkedHashMap, (C42041g) f98766f);
        }
    }

    public static final class LinkedHashSetParcelable extends ConverterParcelable<LinkedHashSet> {
        public static final C41979b CREATOR = new C41979b();

        /* renamed from: f */
        private static final C43028h f98767f = new C41978a();

        /* renamed from: org.parceler.NonParcelRepository$LinkedHashSetParcelable$a */
        static class C41978a extends C43028h {
            C41978a() {
            }

            /* renamed from: e */
            public Object mo97372e(Parcel parcel) {
                return C42035e.m122119a(parcel.readParcelable(LinkedHashSetParcelable.class.getClassLoader()));
            }

            /* renamed from: f */
            public void mo97373f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C42035e.m122121c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$LinkedHashSetParcelable$b */
        private static final class C41979b implements Parcelable.Creator {
            private C41979b() {
            }

            /* renamed from: a */
            public LinkedHashSetParcelable createFromParcel(Parcel parcel) {
                return new LinkedHashSetParcelable(parcel);
            }

            /* renamed from: b */
            public LinkedHashSetParcelable[] newArray(int i) {
                return new LinkedHashSetParcelable[i];
            }
        }

        public LinkedHashSetParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98767f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public LinkedHashSetParcelable(LinkedHashSet linkedHashSet) {
            super((Object) linkedHashSet, (C42041g) f98767f);
        }
    }

    public static final class LinkedListParcelable extends ConverterParcelable<LinkedList> {
        public static final C41981b CREATOR = new C41981b();

        /* renamed from: f */
        private static final C43029i f98768f = new C41980a();

        /* renamed from: org.parceler.NonParcelRepository$LinkedListParcelable$a */
        static class C41980a extends C43029i {
            C41980a() {
            }

            /* renamed from: e */
            public Object mo97372e(Parcel parcel) {
                return C42035e.m122119a(parcel.readParcelable(LinkedListParcelable.class.getClassLoader()));
            }

            /* renamed from: f */
            public void mo97373f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C42035e.m122121c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$LinkedListParcelable$b */
        private static final class C41981b implements Parcelable.Creator {
            private C41981b() {
            }

            /* renamed from: a */
            public LinkedListParcelable createFromParcel(Parcel parcel) {
                return new LinkedListParcelable(parcel);
            }

            /* renamed from: b */
            public LinkedListParcelable[] newArray(int i) {
                return new LinkedListParcelable[i];
            }
        }

        public LinkedListParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98768f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public LinkedListParcelable(LinkedList linkedList) {
            super((Object) linkedList, (C42041g) f98768f);
        }
    }

    public static final class ListParcelable extends ConverterParcelable<List> {
        public static final C41983b CREATOR = new C41983b();

        /* renamed from: f */
        private static final C43021a f98769f = new C41982a();

        /* renamed from: org.parceler.NonParcelRepository$ListParcelable$a */
        static class C41982a extends C43021a {
            C41982a() {
            }

            /* renamed from: e */
            public Object mo97372e(Parcel parcel) {
                return C42035e.m122119a(parcel.readParcelable(ListParcelable.class.getClassLoader()));
            }

            /* renamed from: f */
            public void mo97373f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C42035e.m122121c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$ListParcelable$b */
        private static final class C41983b implements Parcelable.Creator {
            private C41983b() {
            }

            /* renamed from: a */
            public ListParcelable createFromParcel(Parcel parcel) {
                return new ListParcelable(parcel);
            }

            /* renamed from: b */
            public ListParcelable[] newArray(int i) {
                return new ListParcelable[i];
            }
        }

        public ListParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98769f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public ListParcelable(List list) {
            super((Object) list, (C42041g) f98769f);
        }
    }

    public static final class LongParcelable extends ConverterParcelable<Long> {
        public static final C41985b CREATOR = new C41985b();

        /* renamed from: f */
        private static final C43031k f98770f = new C41984a();

        /* renamed from: org.parceler.NonParcelRepository$LongParcelable$a */
        static class C41984a extends C43031k {
            C41984a() {
            }

            /* renamed from: e */
            public Long mo97342c(Parcel parcel) {
                return Long.valueOf(parcel.readLong());
            }

            /* renamed from: f */
            public void mo97343d(Long l, Parcel parcel) {
                parcel.writeLong(l.longValue());
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$LongParcelable$b */
        private static final class C41985b implements Parcelable.Creator {
            private C41985b() {
            }

            /* renamed from: a */
            public LongParcelable createFromParcel(Parcel parcel) {
                return new LongParcelable(parcel);
            }

            /* renamed from: b */
            public LongParcelable[] newArray(int i) {
                return new LongParcelable[i];
            }
        }

        public LongParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98770f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public LongParcelable(Long l) {
            super((Object) l, (C42041g) f98770f);
        }
    }

    public static final class MapParcelable extends ConverterParcelable<Map> {
        public static final C41987b CREATOR = new C41987b();

        /* renamed from: f */
        private static final C43025e f98771f = new C41986a();

        /* renamed from: org.parceler.NonParcelRepository$MapParcelable$a */
        static class C41986a extends C43025e {
            C41986a() {
            }

            /* renamed from: e */
            public Object mo97402e(Parcel parcel) {
                return C42035e.m122119a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            /* renamed from: f */
            public void mo97403f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C42035e.m122121c(obj), 0);
            }

            /* renamed from: g */
            public Object mo97404g(Parcel parcel) {
                return C42035e.m122119a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            /* renamed from: h */
            public void mo97405h(Object obj, Parcel parcel) {
                parcel.writeParcelable(C42035e.m122121c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$MapParcelable$b */
        private static final class C41987b implements Parcelable.Creator {
            private C41987b() {
            }

            /* renamed from: a */
            public MapParcelable createFromParcel(Parcel parcel) {
                return new MapParcelable(parcel);
            }

            /* renamed from: b */
            public MapParcelable[] newArray(int i) {
                return new MapParcelable[i];
            }
        }

        public MapParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98771f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public MapParcelable(Map map) {
            super((Object) map, (C42041g) f98771f);
        }
    }

    public static final class SetParcelable extends ConverterParcelable<Set> {
        public static final C41990b CREATOR = new C41990b();

        /* renamed from: f */
        private static final C43026f f98773f = new C41989a();

        /* renamed from: org.parceler.NonParcelRepository$SetParcelable$a */
        static class C41989a extends C43026f {
            C41989a() {
            }

            /* renamed from: e */
            public Object mo97372e(Parcel parcel) {
                return C42035e.m122119a(parcel.readParcelable(SetParcelable.class.getClassLoader()));
            }

            /* renamed from: f */
            public void mo97373f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C42035e.m122121c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$SetParcelable$b */
        private static final class C41990b implements Parcelable.Creator {
            private C41990b() {
            }

            /* renamed from: a */
            public SetParcelable createFromParcel(Parcel parcel) {
                return new SetParcelable(parcel);
            }

            /* renamed from: b */
            public SetParcelable[] newArray(int i) {
                return new SetParcelable[i];
            }
        }

        public SetParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98773f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public SetParcelable(Set set) {
            super((Object) set, (C42041g) f98773f);
        }
    }

    public static final class SparseArrayParcelable extends ConverterParcelable<SparseArray> {
        public static final C41992b CREATOR = new C41992b();

        /* renamed from: f */
        private static final C43032l f98774f = new C41991a();

        /* renamed from: org.parceler.NonParcelRepository$SparseArrayParcelable$a */
        static class C41991a extends C43032l {
            C41991a() {
            }

            /* renamed from: d */
            public Object mo97443d(Parcel parcel) {
                return C42035e.m122119a(parcel.readParcelable(SparseArrayParcelable.class.getClassLoader()));
            }

            /* renamed from: e */
            public void mo97444e(Object obj, Parcel parcel) {
                parcel.writeParcelable(C42035e.m122121c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$SparseArrayParcelable$b */
        private static final class C41992b implements Parcelable.Creator {
            private C41992b() {
            }

            /* renamed from: a */
            public SparseArrayParcelable createFromParcel(Parcel parcel) {
                return new SparseArrayParcelable(parcel);
            }

            /* renamed from: b */
            public SparseArrayParcelable[] newArray(int i) {
                return new SparseArrayParcelable[i];
            }
        }

        public SparseArrayParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98774f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public SparseArrayParcelable(SparseArray sparseArray) {
            super((Object) sparseArray, (C42041g) f98774f);
        }
    }

    public static final class SparseBooleanArrayParcelable extends ConverterParcelable<SparseBooleanArray> {
        public static final C41994b CREATOR = new C41994b();

        /* renamed from: f */
        private static final C43031k f98775f = new C41993a();

        /* renamed from: org.parceler.NonParcelRepository$SparseBooleanArrayParcelable$a */
        static class C41993a extends C43031k {
            C41993a() {
            }

            /* renamed from: e */
            public SparseBooleanArray mo97342c(Parcel parcel) {
                return parcel.readSparseBooleanArray();
            }

            /* renamed from: f */
            public void mo97343d(SparseBooleanArray sparseBooleanArray, Parcel parcel) {
                parcel.writeSparseBooleanArray(sparseBooleanArray);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$SparseBooleanArrayParcelable$b */
        private static final class C41994b implements Parcelable.Creator {
            private C41994b() {
            }

            /* renamed from: a */
            public SparseBooleanArrayParcelable createFromParcel(Parcel parcel) {
                return new SparseBooleanArrayParcelable(parcel);
            }

            /* renamed from: b */
            public SparseBooleanArrayParcelable[] newArray(int i) {
                return new SparseBooleanArrayParcelable[i];
            }
        }

        public SparseBooleanArrayParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98775f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public SparseBooleanArrayParcelable(SparseBooleanArray sparseBooleanArray) {
            super((Object) sparseBooleanArray, (C42041g) f98775f);
        }
    }

    public static final class TreeMapParcelable extends ConverterParcelable<Map> {
        public static final C41997b CREATOR = new C41997b();

        /* renamed from: f */
        private static final C43033m f98777f = new C41996a();

        /* renamed from: org.parceler.NonParcelRepository$TreeMapParcelable$a */
        static class C41996a extends C43033m {
            C41996a() {
            }

            /* renamed from: e */
            public Object mo97402e(Parcel parcel) {
                return C42035e.m122119a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            /* renamed from: f */
            public void mo97403f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C42035e.m122121c(obj), 0);
            }

            /* renamed from: g */
            public Object mo97404g(Parcel parcel) {
                return C42035e.m122119a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            /* renamed from: h */
            public void mo97405h(Object obj, Parcel parcel) {
                parcel.writeParcelable(C42035e.m122121c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$TreeMapParcelable$b */
        private static final class C41997b implements Parcelable.Creator {
            private C41997b() {
            }

            /* renamed from: a */
            public TreeMapParcelable createFromParcel(Parcel parcel) {
                return new TreeMapParcelable(parcel);
            }

            /* renamed from: b */
            public TreeMapParcelable[] newArray(int i) {
                return new TreeMapParcelable[i];
            }
        }

        public TreeMapParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98777f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public TreeMapParcelable(Map map) {
            super((Object) map, (C42041g) f98777f);
        }
    }

    public static final class TreeSetParcelable extends ConverterParcelable<Set> {
        public static final C41999b CREATOR = new C41999b();

        /* renamed from: f */
        private static final C43034n f98778f = new C41998a();

        /* renamed from: org.parceler.NonParcelRepository$TreeSetParcelable$a */
        static class C41998a extends C43034n {
            C41998a() {
            }

            /* renamed from: e */
            public Object mo97372e(Parcel parcel) {
                return C42035e.m122119a(parcel.readParcelable(TreeSetParcelable.class.getClassLoader()));
            }

            /* renamed from: f */
            public void mo97373f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C42035e.m122121c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$TreeSetParcelable$b */
        private static final class C41999b implements Parcelable.Creator {
            private C41999b() {
            }

            /* renamed from: a */
            public TreeSetParcelable createFromParcel(Parcel parcel) {
                return new TreeSetParcelable(parcel);
            }

            /* renamed from: b */
            public TreeSetParcelable[] newArray(int i) {
                return new TreeSetParcelable[i];
            }
        }

        public TreeSetParcelable(Parcel parcel) {
            super(parcel, (C42041g) f98778f);
        }

        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
        }

        public TreeSetParcelable(Set set) {
            super((Object) set, (C42041g) f98778f);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$b */
    private static class C42001b implements C42035e.C42038c {
        private C42001b() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(boolean[] zArr) {
            return new BooleanArrayParcelable(zArr);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$c */
    private static class C42002c implements C42035e.C42038c {
        private C42002c() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(Boolean bool) {
            return new BooleanParcelable(bool.booleanValue());
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$d */
    private static class C42003d implements C42035e.C42038c {
        private C42003d() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(Bundle bundle) {
            return bundle;
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$e */
    private static class C42004e implements C42035e.C42038c {
        private C42004e() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(byte[] bArr) {
            return new ByteArrayParcelable(bArr);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$f */
    private static class C42005f implements C42035e.C42038c {
        private C42005f() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(Byte b) {
            return new ByteParcelable(b);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$g */
    private static class C42006g implements C42035e.C42038c {
        private C42006g() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(char[] cArr) {
            return new CharArrayParcelable(cArr);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$h */
    private static class C42007h implements C42035e.C42038c {
        private C42007h() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(Character ch) {
            return new CharacterParcelable(ch);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$i */
    private static class C42008i implements C42035e.C42038c {
        private C42008i() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(Collection collection) {
            return new CollectionParcelable(collection);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$j */
    private static class C42009j implements C42035e.C42038c {
        private C42009j() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(Double d) {
            return new DoubleParcelable(d);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$k */
    private static class C42010k implements C42035e.C42038c {
        private C42010k() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(Float f) {
            return new FloatParcelable(f);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$l */
    private static class C42011l implements C42035e.C42038c {
        private C42011l() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(IBinder iBinder) {
            return new IBinderParcelable(iBinder);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$m */
    private static class C42012m implements C42035e.C42038c {
        private C42012m() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(Integer num) {
            return new IntegerParcelable(num);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$n */
    private static class C42013n implements C42035e.C42038c {
        private C42013n() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(LinkedHashMap linkedHashMap) {
            return new LinkedHashMapParcelable(linkedHashMap);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$o */
    private static class C42014o implements C42035e.C42038c {
        private C42014o() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(LinkedHashSet linkedHashSet) {
            return new LinkedHashSetParcelable(linkedHashSet);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$p */
    private static class C42015p implements C42035e.C42038c {
        private C42015p() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(LinkedList linkedList) {
            return new LinkedListParcelable(linkedList);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$q */
    private static class C42016q implements C42035e.C42038c {
        private C42016q() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(List list) {
            return new ListParcelable(list);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$r */
    private static class C42017r implements C42035e.C42038c {
        private C42017r() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(Long l) {
            return new LongParcelable(l);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$s */
    private static class C42018s implements C42035e.C42038c {
        private C42018s() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(Map map) {
            return new MapParcelable(map);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$t */
    static class C42019t implements C42035e.C42038c {
        C42019t() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(Parcelable parcelable) {
            return new ParcelableParcelable(parcelable);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$u */
    private static class C42020u implements C42035e.C42038c {
        private C42020u() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(Set set) {
            return new SetParcelable(set);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$v */
    private static class C42021v implements C42035e.C42038c {
        private C42021v() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(SparseArray sparseArray) {
            return new SparseArrayParcelable(sparseArray);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$w */
    private static class C42022w implements C42035e.C42038c {
        private C42022w() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(SparseBooleanArray sparseBooleanArray) {
            return new SparseBooleanArrayParcelable(sparseBooleanArray);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$x */
    private static class C42023x implements C42035e.C42038c {
        private C42023x() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(String str) {
            return new StringParcelable(str);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$y */
    private static class C42024y implements C42035e.C42038c {
        private C42024y() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(Map map) {
            return new TreeMapParcelable(map);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$z */
    private static class C42025z implements C42035e.C42038c {
        private C42025z() {
        }

        /* renamed from: b */
        public Parcelable mo97470a(Set set) {
            return new TreeSetParcelable(set);
        }
    }

    private NonParcelRepository() {
        HashMap hashMap = new HashMap();
        this.f98752a = hashMap;
        hashMap.put(Collection.class, new C42008i());
        hashMap.put(List.class, new C42016q());
        hashMap.put(ArrayList.class, new C42016q());
        hashMap.put(Set.class, new C42020u());
        hashMap.put(HashSet.class, new C42020u());
        hashMap.put(TreeSet.class, new C42025z());
        hashMap.put(SparseArray.class, new C42021v());
        hashMap.put(Map.class, new C42018s());
        hashMap.put(HashMap.class, new C42018s());
        hashMap.put(TreeMap.class, new C42024y());
        hashMap.put(Integer.class, new C42012m());
        hashMap.put(Long.class, new C42017r());
        hashMap.put(Double.class, new C42009j());
        hashMap.put(Float.class, new C42010k());
        hashMap.put(Byte.class, new C42005f());
        hashMap.put(String.class, new C42023x());
        hashMap.put(Character.class, new C42007h());
        hashMap.put(Boolean.class, new C42002c());
        hashMap.put(byte[].class, new C42004e());
        hashMap.put(char[].class, new C42006g());
        hashMap.put(boolean[].class, new C42001b());
        hashMap.put(IBinder.class, new C42011l());
        hashMap.put(Bundle.class, new C42003d());
        hashMap.put(SparseBooleanArray.class, new C42022w());
        hashMap.put(LinkedList.class, new C42015p());
        hashMap.put(LinkedHashMap.class, new C42013n());
        hashMap.put(SortedMap.class, new C42024y());
        hashMap.put(SortedSet.class, new C42025z());
        hashMap.put(LinkedHashSet.class, new C42014o());
    }

    /* renamed from: a */
    public static NonParcelRepository m121938a() {
        return f98751b;
    }

    public Map get() {
        return this.f98752a;
    }

    private static class ConverterParcelable<T> implements Parcelable, C42034d {

        /* renamed from: d */
        private final Object f98760d;

        /* renamed from: e */
        private final C42041g f98761e;

        public int describeContents() {
            return 0;
        }

        public Object getParcel() {
            return this.f98760d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f98761e.mo88108b(this.f98760d, parcel);
        }

        private ConverterParcelable(Parcel parcel, C42041g gVar) {
            this(gVar.mo88107a(parcel), gVar);
        }

        private ConverterParcelable(Object obj, C42041g gVar) {
            this.f98761e = gVar;
            this.f98760d = obj;
        }
    }

    public static final class ParcelableParcelable implements Parcelable, C42034d {
        public static final C41988a CREATOR = new C41988a();

        /* renamed from: d */
        private Parcelable f98772d;

        /* renamed from: org.parceler.NonParcelRepository$ParcelableParcelable$a */
        private static final class C41988a implements Parcelable.Creator {
            private C41988a() {
            }

            /* renamed from: a */
            public ParcelableParcelable createFromParcel(Parcel parcel) {
                return new ParcelableParcelable(parcel);
            }

            /* renamed from: b */
            public ParcelableParcelable[] newArray(int i) {
                return new ParcelableParcelable[i];
            }
        }

        /* renamed from: a */
        public Parcelable getParcel() {
            return this.f98772d;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f98772d, i);
        }

        private ParcelableParcelable(Parcel parcel) {
            this.f98772d = parcel.readParcelable(ParcelableParcelable.class.getClassLoader());
        }

        private ParcelableParcelable(Parcelable parcelable) {
            this.f98772d = parcelable;
        }
    }

    public static final class StringParcelable implements Parcelable, C42034d {
        public static final C41995a CREATOR = new C41995a();

        /* renamed from: d */
        private String f98776d;

        /* renamed from: org.parceler.NonParcelRepository$StringParcelable$a */
        private static final class C41995a implements Parcelable.Creator {
            private C41995a() {
            }

            /* renamed from: a */
            public StringParcelable createFromParcel(Parcel parcel) {
                return new StringParcelable(parcel);
            }

            /* renamed from: b */
            public StringParcelable[] newArray(int i) {
                return new StringParcelable[i];
            }
        }

        /* renamed from: a */
        public String getParcel() {
            return this.f98776d;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f98776d);
        }

        private StringParcelable(Parcel parcel) {
            this.f98776d = parcel.readString();
        }

        private StringParcelable(String str) {
            this.f98776d = str;
        }
    }
}
