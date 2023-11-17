package p341ge.bog.designsystem.components.common;

import android.graphics.drawable.ShapeDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.designsystem.components.common.Image */
public abstract class Image implements Parcelable {

    /* renamed from: d */
    private final Object f39162d;

    /* renamed from: e */
    private final Boolean f39163e;

    /* renamed from: ge.bog.designsystem.components.common.Image$Animation */
    public static abstract class Animation extends Image {

        /* renamed from: ge.bog.designsystem.components.common.Image$Animation$AnimationConfig */
        public static final class AnimationConfig implements Parcelable {
            public static final Parcelable.Creator<AnimationConfig> CREATOR = new C13256a();

            /* renamed from: d */
            private final int f39164d;

            /* renamed from: e */
            private final Integer f39165e;

            /* renamed from: f */
            private final Integer f39166f;

            /* renamed from: g */
            private final float f39167g;

            /* renamed from: ge.bog.designsystem.components.common.Image$Animation$AnimationConfig$a */
            public static final class C13256a implements Parcelable.Creator {
                /* renamed from: a */
                public final AnimationConfig createFromParcel(Parcel parcel) {
                    C41536l.m120489i(parcel, "parcel");
                    int readInt = parcel.readInt();
                    Integer num = null;
                    Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    if (parcel.readInt() != 0) {
                        num = Integer.valueOf(parcel.readInt());
                    }
                    return new AnimationConfig(readInt, valueOf, num, parcel.readFloat());
                }

                /* renamed from: b */
                public final AnimationConfig[] newArray(int i) {
                    return new AnimationConfig[i];
                }
            }

            public AnimationConfig() {
                this(0, (Integer) null, (Integer) null, Utils.FLOAT_EPSILON, 15, (DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public final Integer mo35315a() {
                return this.f39165e;
            }

            /* renamed from: b */
            public final int mo35316b() {
                return this.f39164d;
            }

            /* renamed from: d */
            public final Integer mo35317d() {
                return this.f39166f;
            }

            public int describeContents() {
                return 0;
            }

            /* renamed from: e */
            public final float mo35319e() {
                return this.f39167g;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnimationConfig)) {
                    return false;
                }
                AnimationConfig animationConfig = (AnimationConfig) obj;
                return this.f39164d == animationConfig.f39164d && C41536l.m120484d(this.f39165e, animationConfig.f39165e) && C41536l.m120484d(this.f39166f, animationConfig.f39166f) && Float.compare(this.f39167g, animationConfig.f39167g) == 0;
            }

            public int hashCode() {
                int i = this.f39164d * 31;
                Integer num = this.f39165e;
                int i2 = 0;
                int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.f39166f;
                if (num2 != null) {
                    i2 = num2.hashCode();
                }
                return ((hashCode + i2) * 31) + Float.floatToIntBits(this.f39167g);
            }

            public String toString() {
                int i = this.f39164d;
                Integer num = this.f39165e;
                Integer num2 = this.f39166f;
                float f = this.f39167g;
                return "AnimationConfig(repeatCount=" + i + ", repeatAfterFrame=" + num + ", repeatUntilFrame=" + num2 + ", speed=" + f + ")";
            }

            public void writeToParcel(Parcel parcel, int i) {
                C41536l.m120489i(parcel, "out");
                parcel.writeInt(this.f39164d);
                Integer num = this.f39165e;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(num.intValue());
                }
                Integer num2 = this.f39166f;
                if (num2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(num2.intValue());
                }
                parcel.writeFloat(this.f39167g);
            }

            public AnimationConfig(int i, Integer num, Integer num2, float f) {
                this.f39164d = i;
                this.f39165e = num;
                this.f39166f = num2;
                this.f39167g = f;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AnimationConfig(int i, Integer num, Integer num2, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? 1.0f : f);
            }
        }

        /* renamed from: ge.bog.designsystem.components.common.Image$Animation$Asset */
        public static final class Asset extends Animation {
            public static final Parcelable.Creator<Asset> CREATOR = new C13257a();

            /* renamed from: f */
            private final String f39168f;

            /* renamed from: g */
            private final AnimationConfig f39169g;

            /* renamed from: ge.bog.designsystem.components.common.Image$Animation$Asset$a */
            public static final class C13257a implements Parcelable.Creator {
                /* renamed from: a */
                public final Asset createFromParcel(Parcel parcel) {
                    C41536l.m120489i(parcel, "parcel");
                    return new Asset(parcel.readString(), AnimationConfig.CREATOR.createFromParcel(parcel));
                }

                /* renamed from: b */
                public final Asset[] newArray(int i) {
                    return new Asset[i];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Asset(String str, AnimationConfig animationConfig) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "assetName");
                C41536l.m120489i(animationConfig, "animationConfig");
                this.f39168f = str;
                this.f39169g = animationConfig;
            }

            /* renamed from: b */
            public AnimationConfig mo35314b() {
                return this.f39169g;
            }

            /* renamed from: d */
            public final String mo35328d() {
                return this.f39168f;
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Asset)) {
                    return false;
                }
                Asset asset = (Asset) obj;
                return C41536l.m120484d(this.f39168f, asset.f39168f) && C41536l.m120484d(mo35314b(), asset.mo35314b());
            }

            public int hashCode() {
                return (this.f39168f.hashCode() * 31) + mo35314b().hashCode();
            }

            public String toString() {
                String str = this.f39168f;
                AnimationConfig b = mo35314b();
                return "Asset(assetName=" + str + ", animationConfig=" + b + ")";
            }

            public void writeToParcel(Parcel parcel, int i) {
                C41536l.m120489i(parcel, "out");
                parcel.writeString(this.f39168f);
                this.f39169g.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ Animation(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public abstract AnimationConfig mo35314b();

        /* renamed from: ge.bog.designsystem.components.common.Image$Animation$Json */
        public static final class Json extends Animation {
            public static final Parcelable.Creator<Json> CREATOR = new C13258a();

            /* renamed from: f */
            private final String f39170f;

            /* renamed from: g */
            private final String f39171g;

            /* renamed from: h */
            private final AnimationConfig f39172h;

            /* renamed from: ge.bog.designsystem.components.common.Image$Animation$Json$a */
            public static final class C13258a implements Parcelable.Creator {
                /* renamed from: a */
                public final Json createFromParcel(Parcel parcel) {
                    C41536l.m120489i(parcel, "parcel");
                    return new Json(parcel.readString(), parcel.readString(), AnimationConfig.CREATOR.createFromParcel(parcel));
                }

                /* renamed from: b */
                public final Json[] newArray(int i) {
                    return new Json[i];
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Json(String str, String str2, AnimationConfig animationConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new AnimationConfig(0, (Integer) null, (Integer) null, Utils.FLOAT_EPSILON, 15, (DefaultConstructorMarker) null) : animationConfig);
            }

            /* renamed from: b */
            public AnimationConfig mo35314b() {
                return this.f39172h;
            }

            /* renamed from: d */
            public final String mo35338d() {
                return this.f39171g;
            }

            public int describeContents() {
                return 0;
            }

            /* renamed from: e */
            public final String mo35340e() {
                return this.f39170f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Json)) {
                    return false;
                }
                Json json = (Json) obj;
                return C41536l.m120484d(this.f39170f, json.f39170f) && C41536l.m120484d(this.f39171g, json.f39171g) && C41536l.m120484d(mo35314b(), json.mo35314b());
            }

            public int hashCode() {
                int hashCode = this.f39170f.hashCode() * 31;
                String str = this.f39171g;
                return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + mo35314b().hashCode();
            }

            public String toString() {
                String str = this.f39170f;
                String str2 = this.f39171g;
                AnimationConfig b = mo35314b();
                return "Json(jsonString=" + str + ", cacheKey=" + str2 + ", animationConfig=" + b + ")";
            }

            public void writeToParcel(Parcel parcel, int i) {
                C41536l.m120489i(parcel, "out");
                parcel.writeString(this.f39170f);
                parcel.writeString(this.f39171g);
                this.f39172h.writeToParcel(parcel, i);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Json(String str, String str2, AnimationConfig animationConfig) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "jsonString");
                C41536l.m120489i(animationConfig, "animationConfig");
                this.f39170f = str;
                this.f39171g = str2;
                this.f39172h = animationConfig;
            }
        }

        /* renamed from: ge.bog.designsystem.components.common.Image$Animation$Raw */
        public static final class Raw extends Animation {
            public static final Parcelable.Creator<Raw> CREATOR = new C13259a();

            /* renamed from: f */
            private final int f39173f;

            /* renamed from: g */
            private final AnimationConfig f39174g;

            /* renamed from: ge.bog.designsystem.components.common.Image$Animation$Raw$a */
            public static final class C13259a implements Parcelable.Creator {
                /* renamed from: a */
                public final Raw createFromParcel(Parcel parcel) {
                    C41536l.m120489i(parcel, "parcel");
                    return new Raw(parcel.readInt(), AnimationConfig.CREATOR.createFromParcel(parcel));
                }

                /* renamed from: b */
                public final Raw[] newArray(int i) {
                    return new Raw[i];
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Raw(int i, AnimationConfig animationConfig, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, (i2 & 2) != 0 ? new AnimationConfig(0, (Integer) null, (Integer) null, Utils.FLOAT_EPSILON, 15, (DefaultConstructorMarker) null) : animationConfig);
            }

            /* renamed from: b */
            public AnimationConfig mo35314b() {
                return this.f39174g;
            }

            /* renamed from: d */
            public final int mo35349d() {
                return this.f39173f;
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Raw)) {
                    return false;
                }
                Raw raw = (Raw) obj;
                return this.f39173f == raw.f39173f && C41536l.m120484d(mo35314b(), raw.mo35314b());
            }

            public int hashCode() {
                return (this.f39173f * 31) + mo35314b().hashCode();
            }

            public String toString() {
                int i = this.f39173f;
                AnimationConfig b = mo35314b();
                return "Raw(resId=" + i + ", animationConfig=" + b + ")";
            }

            public void writeToParcel(Parcel parcel, int i) {
                C41536l.m120489i(parcel, "out");
                parcel.writeInt(this.f39173f);
                this.f39174g.writeToParcel(parcel, i);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Raw(int i, AnimationConfig animationConfig) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(animationConfig, "animationConfig");
                this.f39173f = i;
                this.f39174g = animationConfig;
            }
        }

        /* renamed from: ge.bog.designsystem.components.common.Image$Animation$Url */
        public static final class Url extends Animation {
            public static final Parcelable.Creator<Url> CREATOR = new C13260a();

            /* renamed from: f */
            private final String f39175f;

            /* renamed from: g */
            private final String f39176g;

            /* renamed from: h */
            private final AnimationConfig f39177h;

            /* renamed from: ge.bog.designsystem.components.common.Image$Animation$Url$a */
            public static final class C13260a implements Parcelable.Creator {
                /* renamed from: a */
                public final Url createFromParcel(Parcel parcel) {
                    C41536l.m120489i(parcel, "parcel");
                    return new Url(parcel.readString(), parcel.readString(), AnimationConfig.CREATOR.createFromParcel(parcel));
                }

                /* renamed from: b */
                public final Url[] newArray(int i) {
                    return new Url[i];
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Url(String str, String str2, AnimationConfig animationConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new AnimationConfig(0, (Integer) null, (Integer) null, Utils.FLOAT_EPSILON, 15, (DefaultConstructorMarker) null) : animationConfig);
            }

            /* renamed from: b */
            public AnimationConfig mo35314b() {
                return this.f39177h;
            }

            /* renamed from: d */
            public final String mo35359d() {
                return this.f39176g;
            }

            public int describeContents() {
                return 0;
            }

            /* renamed from: e */
            public final String mo35361e() {
                return this.f39175f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Url)) {
                    return false;
                }
                Url url = (Url) obj;
                return C41536l.m120484d(this.f39175f, url.f39175f) && C41536l.m120484d(this.f39176g, url.f39176g) && C41536l.m120484d(mo35314b(), url.mo35314b());
            }

            public int hashCode() {
                int hashCode = this.f39175f.hashCode() * 31;
                String str = this.f39176g;
                return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + mo35314b().hashCode();
            }

            public String toString() {
                String str = this.f39175f;
                String str2 = this.f39176g;
                AnimationConfig b = mo35314b();
                return "Url(url=" + str + ", cacheKey=" + str2 + ", animationConfig=" + b + ")";
            }

            public void writeToParcel(Parcel parcel, int i) {
                C41536l.m120489i(parcel, "out");
                parcel.writeString(this.f39175f);
                parcel.writeString(this.f39176g);
                this.f39177h.writeToParcel(parcel, i);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Url(String str, String str2, AnimationConfig animationConfig) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, C11769i.C11770a.f34149l);
                C41536l.m120489i(animationConfig, "animationConfig");
                this.f39175f = str;
                this.f39176g = str2;
                this.f39177h = animationConfig;
            }
        }

        private Animation() {
            super(new Object(), (Boolean) null, 2, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.designsystem.components.common.Image$Attribute */
    public static final class Attribute extends Placeholder {
        public static final Parcelable.Creator<Attribute> CREATOR = new C13261a();

        /* renamed from: g */
        private final int f39178g;

        /* renamed from: h */
        private final Boolean f39179h;

        /* renamed from: ge.bog.designsystem.components.common.Image$Attribute$a */
        public static final class C13261a implements Parcelable.Creator {
            /* renamed from: a */
            public final Attribute createFromParcel(Parcel parcel) {
                Boolean bool;
                C41536l.m120489i(parcel, "parcel");
                int readInt = parcel.readInt();
                if (parcel.readInt() == 0) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Attribute(readInt, bool);
            }

            /* renamed from: b */
            public final Attribute[] newArray(int i) {
                return new Attribute[i];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Attribute(int i, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : bool);
        }

        /* renamed from: b */
        public Boolean mo35370b() {
            return this.f39179h;
        }

        /* renamed from: d */
        public final int mo35371d() {
            return this.f39178g;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Attribute)) {
                return false;
            }
            Attribute attribute = (Attribute) obj;
            return this.f39178g == attribute.f39178g && C41536l.m120484d(mo35370b(), attribute.mo35370b());
        }

        public int hashCode() {
            return (this.f39178g * 31) + (mo35370b() == null ? 0 : mo35370b().hashCode());
        }

        public String toString() {
            int i = this.f39178g;
            Boolean b = mo35370b();
            return "Attribute(attrId=" + i + ", hasDarkControls=" + b + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            boolean booleanValue;
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f39178g);
            Boolean bool = this.f39179h;
            if (bool == null) {
                booleanValue = false;
            } else {
                parcel.writeInt(1);
                booleanValue = bool.booleanValue();
            }
            parcel.writeInt(booleanValue ? 1 : 0);
        }

        public Attribute(int i, Boolean bool) {
            super(Integer.valueOf(i), bool, (DefaultConstructorMarker) null);
            this.f39178g = i;
            this.f39179h = bool;
        }
    }

    /* renamed from: ge.bog.designsystem.components.common.Image$Drawable */
    public static final class Drawable extends Placeholder {
        public static final Parcelable.Creator<Drawable> CREATOR = new C13262a();

        /* renamed from: g */
        private final android.graphics.drawable.Drawable f39180g;

        /* renamed from: h */
        private final Boolean f39181h;

        /* renamed from: ge.bog.designsystem.components.common.Image$Drawable$a */
        public static final class C13262a implements Parcelable.Creator {
            /* renamed from: a */
            public final Drawable createFromParcel(Parcel parcel) {
                Boolean bool;
                C41536l.m120489i(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Drawable((android.graphics.drawable.Drawable) null, bool, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: b */
            public final Drawable[] newArray(int i) {
                return new Drawable[i];
            }
        }

        public Drawable() {
            this((android.graphics.drawable.Drawable) null, (Boolean) null, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public Boolean mo35370b() {
            return this.f39181h;
        }

        /* renamed from: d */
        public final android.graphics.drawable.Drawable mo35381d() {
            return this.f39180g;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Drawable)) {
                return false;
            }
            Drawable drawable = (Drawable) obj;
            return C41536l.m120484d(this.f39180g, drawable.f39180g) && C41536l.m120484d(mo35370b(), drawable.mo35370b());
        }

        public int hashCode() {
            return (this.f39180g.hashCode() * 31) + (mo35370b() == null ? 0 : mo35370b().hashCode());
        }

        public String toString() {
            android.graphics.drawable.Drawable drawable = this.f39180g;
            Boolean b = mo35370b();
            return "Drawable(drawable=" + drawable + ", hasDarkControls=" + b + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            boolean booleanValue;
            C41536l.m120489i(parcel, "out");
            Boolean bool = this.f39181h;
            if (bool == null) {
                booleanValue = false;
            } else {
                parcel.writeInt(1);
                booleanValue = bool.booleanValue();
            }
            parcel.writeInt(booleanValue ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Drawable(android.graphics.drawable.Drawable drawable, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ShapeDrawable() : drawable, (i & 2) != 0 ? null : bool);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Drawable(android.graphics.drawable.Drawable drawable, Boolean bool) {
            super(drawable, bool, (DefaultConstructorMarker) null);
            C41536l.m120489i(drawable, "drawable");
            this.f39180g = drawable;
            this.f39181h = bool;
        }
    }

    /* renamed from: ge.bog.designsystem.components.common.Image$Placeholder */
    public static abstract class Placeholder extends Image {

        /* renamed from: f */
        private final Boolean f39182f;

        public /* synthetic */ Placeholder(Object obj, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, bool);
        }

        /* renamed from: b */
        public Boolean mo35370b() {
            return this.f39182f;
        }

        private Placeholder(Object obj, Boolean bool) {
            super(obj, bool, (DefaultConstructorMarker) null);
            this.f39182f = bool;
        }
    }

    /* renamed from: ge.bog.designsystem.components.common.Image$Resource */
    public static final class Resource extends Placeholder {
        public static final Parcelable.Creator<Resource> CREATOR = new C13263a();

        /* renamed from: g */
        private final int f39183g;

        /* renamed from: h */
        private final Boolean f39184h;

        /* renamed from: ge.bog.designsystem.components.common.Image$Resource$a */
        public static final class C13263a implements Parcelable.Creator {
            /* renamed from: a */
            public final Resource createFromParcel(Parcel parcel) {
                Boolean bool;
                C41536l.m120489i(parcel, "parcel");
                int readInt = parcel.readInt();
                if (parcel.readInt() == 0) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Resource(readInt, bool);
            }

            /* renamed from: b */
            public final Resource[] newArray(int i) {
                return new Resource[i];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Resource(int i, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : bool);
        }

        /* renamed from: b */
        public Boolean mo35370b() {
            return this.f39184h;
        }

        /* renamed from: d */
        public final int mo35391d() {
            return this.f39183g;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Resource)) {
                return false;
            }
            Resource resource = (Resource) obj;
            return this.f39183g == resource.f39183g && C41536l.m120484d(mo35370b(), resource.mo35370b());
        }

        public int hashCode() {
            return (this.f39183g * 31) + (mo35370b() == null ? 0 : mo35370b().hashCode());
        }

        public String toString() {
            int i = this.f39183g;
            Boolean b = mo35370b();
            return "Resource(resId=" + i + ", hasDarkControls=" + b + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            boolean booleanValue;
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f39183g);
            Boolean bool = this.f39184h;
            if (bool == null) {
                booleanValue = false;
            } else {
                parcel.writeInt(1);
                booleanValue = bool.booleanValue();
            }
            parcel.writeInt(booleanValue ? 1 : 0);
        }

        public Resource(int i, Boolean bool) {
            super(Integer.valueOf(i), bool, (DefaultConstructorMarker) null);
            this.f39183g = i;
            this.f39184h = bool;
        }
    }

    public /* synthetic */ Image(Object obj, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, bool);
    }

    /* renamed from: a */
    public final Object mo35313a() {
        return this.f39162d;
    }

    /* renamed from: ge.bog.designsystem.components.common.Image$Url */
    public static final class Url extends Image {
        public static final Parcelable.Creator<Url> CREATOR = new C13264a();

        /* renamed from: f */
        private final String f39185f;

        /* renamed from: g */
        private final Placeholder f39186g;

        /* renamed from: h */
        private final Placeholder f39187h;

        /* renamed from: i */
        private final Map f39188i;

        /* renamed from: j */
        private final android.graphics.drawable.Drawable f39189j;

        /* renamed from: k */
        private final android.graphics.drawable.Drawable f39190k;

        /* renamed from: l */
        private final Boolean f39191l;

        /* renamed from: ge.bog.designsystem.components.common.Image$Url$a */
        public static final class C13264a implements Parcelable.Creator {
            /* renamed from: a */
            public final Url createFromParcel(Parcel parcel) {
                Boolean valueOf;
                C41536l.m120489i(parcel, "parcel");
                String readString = parcel.readString();
                Class<Url> cls = Url.class;
                Placeholder placeholder = (Placeholder) parcel.readParcelable(cls.getClassLoader());
                Placeholder placeholder2 = (Placeholder) parcel.readParcelable(cls.getClassLoader());
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                boolean z = false;
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    valueOf = Boolean.valueOf(z);
                }
                return new Url(readString, placeholder, placeholder2, linkedHashMap, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, valueOf, 48, (DefaultConstructorMarker) null);
            }

            /* renamed from: b */
            public final Url[] newArray(int i) {
                return new Url[i];
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Url(java.lang.String r8, p341ge.bog.designsystem.components.common.Image.Placeholder r9, p341ge.bog.designsystem.components.common.Image.Placeholder r10, java.util.Map r11, android.graphics.drawable.Drawable r12, android.graphics.drawable.Drawable r13, java.lang.Boolean r14, int r15, kotlin.jvm.internal.DefaultConstructorMarker r16) {
            /*
                r7 = this;
                r0 = r15 & 2
                r1 = 0
                if (r0 == 0) goto L_0x0007
                r0 = r1
                goto L_0x0008
            L_0x0007:
                r0 = r9
            L_0x0008:
                r2 = r15 & 4
                if (r2 == 0) goto L_0x000e
                r2 = r0
                goto L_0x000f
            L_0x000e:
                r2 = r10
            L_0x000f:
                r3 = r15 & 8
                if (r3 == 0) goto L_0x0018
                java.util.Map r3 = ie1.C41344r0.m119928j()
                goto L_0x0019
            L_0x0018:
                r3 = r11
            L_0x0019:
                r4 = r15 & 16
                if (r4 == 0) goto L_0x001f
                r4 = r1
                goto L_0x0020
            L_0x001f:
                r4 = r12
            L_0x0020:
                r5 = r15 & 32
                if (r5 == 0) goto L_0x0026
                r5 = r4
                goto L_0x0027
            L_0x0026:
                r5 = r13
            L_0x0027:
                r6 = r15 & 64
                if (r6 == 0) goto L_0x002c
                goto L_0x002d
            L_0x002c:
                r1 = r14
            L_0x002d:
                r9 = r7
                r10 = r8
                r11 = r0
                r12 = r2
                r13 = r3
                r14 = r4
                r15 = r5
                r16 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.common.Image.Url.<init>(java.lang.String, ge.bog.designsystem.components.common.Image$Placeholder, ge.bog.designsystem.components.common.Image$Placeholder, java.util.Map, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* renamed from: d */
        public static /* synthetic */ Url m49924d(Url url, String str, Placeholder placeholder, Placeholder placeholder2, Map map, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = url.f39185f;
            }
            if ((i & 2) != 0) {
                placeholder = url.f39186g;
            }
            Placeholder placeholder3 = placeholder;
            if ((i & 4) != 0) {
                placeholder2 = url.f39187h;
            }
            Placeholder placeholder4 = placeholder2;
            if ((i & 8) != 0) {
                map = url.f39188i;
            }
            Map map2 = map;
            if ((i & 16) != 0) {
                drawable = url.f39189j;
            }
            android.graphics.drawable.Drawable drawable3 = drawable;
            if ((i & 32) != 0) {
                drawable2 = url.f39190k;
            }
            android.graphics.drawable.Drawable drawable4 = drawable2;
            if ((i & 64) != 0) {
                bool = url.mo35406g();
            }
            return url.mo35401b(str, placeholder3, placeholder4, map2, drawable3, drawable4, bool);
        }

        /* renamed from: b */
        public final Url mo35401b(String str, Placeholder placeholder, Placeholder placeholder2, Map map, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, Boolean bool) {
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            C41536l.m120489i(map, "headers");
            return new Url(str, placeholder, placeholder2, map, drawable, drawable2, bool);
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final Placeholder mo35403e() {
            return this.f39187h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Url)) {
                return false;
            }
            Url url = (Url) obj;
            return C41536l.m120484d(this.f39185f, url.f39185f) && C41536l.m120484d(this.f39186g, url.f39186g) && C41536l.m120484d(this.f39187h, url.f39187h) && C41536l.m120484d(this.f39188i, url.f39188i) && C41536l.m120484d(this.f39189j, url.f39189j) && C41536l.m120484d(this.f39190k, url.f39190k) && C41536l.m120484d(mo35406g(), url.mo35406g());
        }

        /* renamed from: f */
        public final android.graphics.drawable.Drawable mo35405f() {
            return this.f39190k;
        }

        /* renamed from: g */
        public Boolean mo35406g() {
            return this.f39191l;
        }

        /* renamed from: h */
        public final Map mo35407h() {
            return this.f39188i;
        }

        public int hashCode() {
            int hashCode = this.f39185f.hashCode() * 31;
            Placeholder placeholder = this.f39186g;
            int i = 0;
            int hashCode2 = (hashCode + (placeholder == null ? 0 : placeholder.hashCode())) * 31;
            Placeholder placeholder2 = this.f39187h;
            int hashCode3 = (((hashCode2 + (placeholder2 == null ? 0 : placeholder2.hashCode())) * 31) + this.f39188i.hashCode()) * 31;
            android.graphics.drawable.Drawable drawable = this.f39189j;
            int hashCode4 = (hashCode3 + (drawable == null ? 0 : drawable.hashCode())) * 31;
            android.graphics.drawable.Drawable drawable2 = this.f39190k;
            int hashCode5 = (hashCode4 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
            if (mo35406g() != null) {
                i = mo35406g().hashCode();
            }
            return hashCode5 + i;
        }

        /* renamed from: i */
        public final Placeholder mo35409i() {
            return this.f39186g;
        }

        /* renamed from: j */
        public final android.graphics.drawable.Drawable mo35410j() {
            return this.f39189j;
        }

        /* renamed from: k */
        public final String mo35411k() {
            return this.f39185f;
        }

        public String toString() {
            String str = this.f39185f;
            Placeholder placeholder = this.f39186g;
            Placeholder placeholder2 = this.f39187h;
            Map map = this.f39188i;
            android.graphics.drawable.Drawable drawable = this.f39189j;
            android.graphics.drawable.Drawable drawable2 = this.f39190k;
            Boolean g = mo35406g();
            return "Url(url=" + str + ", placeHolder=" + placeholder + ", error=" + placeholder2 + ", headers=" + map + ", placeHolderDrawable=" + drawable + ", errorDrawable=" + drawable2 + ", hasDarkControls=" + g + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            boolean booleanValue;
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f39185f);
            parcel.writeParcelable(this.f39186g, i);
            parcel.writeParcelable(this.f39187h, i);
            Map map = this.f39188i;
            parcel.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
            Boolean bool = this.f39191l;
            if (bool == null) {
                booleanValue = false;
            } else {
                parcel.writeInt(1);
                booleanValue = bool.booleanValue();
            }
            parcel.writeInt(booleanValue ? 1 : 0);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Url(String str, Placeholder placeholder, Placeholder placeholder2, Map map, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, Boolean bool) {
            super(str, (Boolean) null, 2, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            C41536l.m120489i(map, "headers");
            this.f39185f = str;
            this.f39186g = placeholder;
            this.f39187h = placeholder2;
            this.f39188i = map;
            this.f39189j = drawable;
            this.f39190k = drawable2;
            this.f39191l = bool;
        }
    }

    private Image(Object obj, Boolean bool) {
        this.f39162d = obj;
        this.f39163e = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Image(Object obj, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : bool, (DefaultConstructorMarker) null);
    }
}
