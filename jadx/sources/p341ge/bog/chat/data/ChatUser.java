package p341ge.bog.chat.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.chat.data.ChatUser */
public final class ChatUser implements Parcelable {
    public static final Parcelable.Creator<ChatUser> CREATOR = new C12990a();

    /* renamed from: d */
    private final long f38309d;

    /* renamed from: e */
    private final String f38310e;

    /* renamed from: f */
    private final String f38311f;

    /* renamed from: g */
    private final String f38312g;

    /* renamed from: h */
    private final String f38313h;

    /* renamed from: i */
    private final String f38314i;

    /* renamed from: j */
    private final String f38315j;

    /* renamed from: k */
    private final String f38316k;

    /* renamed from: l */
    private final String f38317l;

    /* renamed from: m */
    private final String f38318m;

    /* renamed from: n */
    private final String f38319n;

    /* renamed from: o */
    private final String f38320o;

    /* renamed from: ge.bog.chat.data.ChatUser$a */
    public static final class C12990a implements Parcelable.Creator {
        /* renamed from: a */
        public final ChatUser createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ChatUser(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ChatUser[] newArray(int i) {
            return new ChatUser[i];
        }
    }

    public ChatUser(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        C41536l.m120489i(str, "nickname");
        C41536l.m120489i(str2, "phoneNumber");
        C41536l.m120489i(str3, "userFirstName");
        C41536l.m120489i(str4, "userLastName");
        C41536l.m120489i(str5, "chatSubject");
        C41536l.m120489i(str6, "phoneOs");
        C41536l.m120489i(str7, "phoneOsVersion");
        C41536l.m120489i(str8, "appVersion");
        C41536l.m120489i(str9, "language");
        C41536l.m120489i(str10, "channel");
        this.f38309d = j;
        this.f38310e = str;
        this.f38311f = str2;
        this.f38312g = str3;
        this.f38313h = str4;
        this.f38314i = str5;
        this.f38315j = str6;
        this.f38316k = str7;
        this.f38317l = str8;
        this.f38318m = str9;
        this.f38319n = str10;
        this.f38320o = str11;
    }

    /* renamed from: a */
    public final String mo33793a() {
        return this.f38317l;
    }

    /* renamed from: b */
    public final String mo33794b() {
        return this.f38319n;
    }

    /* renamed from: d */
    public final String mo33795d() {
        return this.f38314i;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo33797e() {
        return this.f38318m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatUser)) {
            return false;
        }
        ChatUser chatUser = (ChatUser) obj;
        return this.f38309d == chatUser.f38309d && C41536l.m120484d(this.f38310e, chatUser.f38310e) && C41536l.m120484d(this.f38311f, chatUser.f38311f) && C41536l.m120484d(this.f38312g, chatUser.f38312g) && C41536l.m120484d(this.f38313h, chatUser.f38313h) && C41536l.m120484d(this.f38314i, chatUser.f38314i) && C41536l.m120484d(this.f38315j, chatUser.f38315j) && C41536l.m120484d(this.f38316k, chatUser.f38316k) && C41536l.m120484d(this.f38317l, chatUser.f38317l) && C41536l.m120484d(this.f38318m, chatUser.f38318m) && C41536l.m120484d(this.f38319n, chatUser.f38319n) && C41536l.m120484d(this.f38320o, chatUser.f38320o);
    }

    /* renamed from: f */
    public final String mo33799f() {
        return this.f38310e;
    }

    /* renamed from: g */
    public final String mo33800g() {
        return this.f38311f;
    }

    /* renamed from: h */
    public final String mo33801h() {
        return this.f38315j;
    }

    public int hashCode() {
        int a = ((((((((((((((((((((C7397t.m28148a(this.f38309d) * 31) + this.f38310e.hashCode()) * 31) + this.f38311f.hashCode()) * 31) + this.f38312g.hashCode()) * 31) + this.f38313h.hashCode()) * 31) + this.f38314i.hashCode()) * 31) + this.f38315j.hashCode()) * 31) + this.f38316k.hashCode()) * 31) + this.f38317l.hashCode()) * 31) + this.f38318m.hashCode()) * 31) + this.f38319n.hashCode()) * 31;
        String str = this.f38320o;
        return a + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: i */
    public final String mo33803i() {
        return this.f38316k;
    }

    /* renamed from: j */
    public final String mo33804j() {
        return this.f38320o;
    }

    /* renamed from: k */
    public final String mo33805k() {
        return this.f38312g;
    }

    /* renamed from: l */
    public final long mo33806l() {
        return this.f38309d;
    }

    /* renamed from: m */
    public final String mo33807m() {
        return this.f38313h;
    }

    /* renamed from: p */
    public final boolean mo33808p(ChatUser chatUser) {
        C41536l.m120489i(chatUser, "user");
        if (chatUser.f38309d != this.f38309d || !C41536l.m120484d(chatUser.f38310e, this.f38310e) || !C41536l.m120484d(chatUser.f38311f, this.f38311f) || !C41536l.m120484d(chatUser.f38314i, this.f38314i) || !C41536l.m120484d(chatUser.f38319n, this.f38319n)) {
            return false;
        }
        return true;
    }

    public String toString() {
        long j = this.f38309d;
        String str = this.f38310e;
        String str2 = this.f38311f;
        String str3 = this.f38312g;
        String str4 = this.f38313h;
        String str5 = this.f38314i;
        String str6 = this.f38315j;
        String str7 = this.f38316k;
        String str8 = this.f38317l;
        String str9 = this.f38318m;
        String str10 = this.f38319n;
        String str11 = this.f38320o;
        return "ChatUser(userId=" + j + ", nickname=" + str + ", phoneNumber=" + str2 + ", userFirstName=" + str3 + ", userLastName=" + str4 + ", chatSubject=" + str5 + ", phoneOs=" + str6 + ", phoneOsVersion=" + str7 + ", appVersion=" + str8 + ", language=" + str9 + ", channel=" + str10 + ", previousPage=" + str11 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f38309d);
        parcel.writeString(this.f38310e);
        parcel.writeString(this.f38311f);
        parcel.writeString(this.f38312g);
        parcel.writeString(this.f38313h);
        parcel.writeString(this.f38314i);
        parcel.writeString(this.f38315j);
        parcel.writeString(this.f38316k);
        parcel.writeString(this.f38317l);
        parcel.writeString(this.f38318m);
        parcel.writeString(this.f38319n);
        parcel.writeString(this.f38320o);
    }
}
