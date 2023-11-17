package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.core.util.C1008h;
import java.util.Objects;

/* renamed from: androidx.core.view.d */
public final class C1127d {

    /* renamed from: a */
    private final C1133f f3783a;

    /* renamed from: androidx.core.view.d$a */
    public static final class C1128a {

        /* renamed from: a */
        private final C1130c f3784a;

        public C1128a(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f3784a = new C1129b(clipData, i);
            } else {
                this.f3784a = new C1131d(clipData, i);
            }
        }

        /* renamed from: a */
        public C1127d mo3680a() {
            return this.f3784a.mo3684a();
        }

        /* renamed from: b */
        public C1128a mo3681b(Bundle bundle) {
            this.f3784a.setExtras(bundle);
            return this;
        }

        /* renamed from: c */
        public C1128a mo3682c(int i) {
            this.f3784a.mo3686c(i);
            return this;
        }

        /* renamed from: d */
        public C1128a mo3683d(Uri uri) {
            this.f3784a.mo3685b(uri);
            return this;
        }
    }

    /* renamed from: androidx.core.view.d$b */
    private static final class C1129b implements C1130c {

        /* renamed from: a */
        private final ContentInfo.Builder f3785a;

        C1129b(ClipData clipData, int i) {
            C1164h.m4232a();
            this.f3785a = C1157g.m4223a(clipData, i);
        }

        /* renamed from: a */
        public C1127d mo3684a() {
            return new C1127d(new C1132e(this.f3785a.build()));
        }

        /* renamed from: b */
        public void mo3685b(Uri uri) {
            ContentInfo.Builder unused = this.f3785a.setLinkUri(uri);
        }

        /* renamed from: c */
        public void mo3686c(int i) {
            ContentInfo.Builder unused = this.f3785a.setFlags(i);
        }

        public void setExtras(Bundle bundle) {
            ContentInfo.Builder unused = this.f3785a.setExtras(bundle);
        }
    }

    /* renamed from: androidx.core.view.d$c */
    private interface C1130c {
        /* renamed from: a */
        C1127d mo3684a();

        /* renamed from: b */
        void mo3685b(Uri uri);

        /* renamed from: c */
        void mo3686c(int i);

        void setExtras(Bundle bundle);
    }

    /* renamed from: androidx.core.view.d$d */
    private static final class C1131d implements C1130c {

        /* renamed from: a */
        ClipData f3786a;

        /* renamed from: b */
        int f3787b;

        /* renamed from: c */
        int f3788c;

        /* renamed from: d */
        Uri f3789d;

        /* renamed from: e */
        Bundle f3790e;

        C1131d(ClipData clipData, int i) {
            this.f3786a = clipData;
            this.f3787b = i;
        }

        /* renamed from: a */
        public C1127d mo3684a() {
            return new C1127d(new C1134g(this));
        }

        /* renamed from: b */
        public void mo3685b(Uri uri) {
            this.f3789d = uri;
        }

        /* renamed from: c */
        public void mo3686c(int i) {
            this.f3788c = i;
        }

        public void setExtras(Bundle bundle) {
            this.f3790e = bundle;
        }
    }

    /* renamed from: androidx.core.view.d$e */
    private static final class C1132e implements C1133f {

        /* renamed from: a */
        private final ContentInfo f3791a;

        C1132e(ContentInfo contentInfo) {
            this.f3791a = C1121c.m4146a(C1008h.m3530g(contentInfo));
        }

        /* renamed from: b */
        public int mo3688b() {
            return this.f3791a.getSource();
        }

        /* renamed from: c */
        public ContentInfo mo3689c() {
            return this.f3791a;
        }

        /* renamed from: d */
        public ClipData mo3690d() {
            return this.f3791a.getClip();
        }

        /* renamed from: e */
        public int mo3691e() {
            return this.f3791a.getFlags();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f3791a + "}";
        }
    }

    /* renamed from: androidx.core.view.d$f */
    private interface C1133f {
        /* renamed from: b */
        int mo3688b();

        /* renamed from: c */
        ContentInfo mo3689c();

        /* renamed from: d */
        ClipData mo3690d();

        /* renamed from: e */
        int mo3691e();
    }

    /* renamed from: androidx.core.view.d$g */
    private static final class C1134g implements C1133f {

        /* renamed from: a */
        private final ClipData f3792a;

        /* renamed from: b */
        private final int f3793b;

        /* renamed from: c */
        private final int f3794c;

        /* renamed from: d */
        private final Uri f3795d;

        /* renamed from: e */
        private final Bundle f3796e;

        C1134g(C1131d dVar) {
            this.f3792a = (ClipData) C1008h.m3530g(dVar.f3786a);
            this.f3793b = C1008h.m3526c(dVar.f3787b, 0, 5, "source");
            this.f3794c = C1008h.m3529f(dVar.f3788c, 1);
            this.f3795d = dVar.f3789d;
            this.f3796e = dVar.f3790e;
        }

        /* renamed from: b */
        public int mo3688b() {
            return this.f3793b;
        }

        /* renamed from: c */
        public ContentInfo mo3689c() {
            return null;
        }

        /* renamed from: d */
        public ClipData mo3690d() {
            return this.f3792a;
        }

        /* renamed from: e */
        public int mo3691e() {
            return this.f3794c;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f3792a.getDescription());
            sb.append(", source=");
            sb.append(C1127d.m4152e(this.f3793b));
            sb.append(", flags=");
            sb.append(C1127d.m4151a(this.f3794c));
            String str2 = "";
            if (this.f3795d == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + this.f3795d.toString().length() + ")";
            }
            sb.append(str);
            if (this.f3796e != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    C1127d(C1133f fVar) {
        this.f3783a = fVar;
    }

    /* renamed from: a */
    static String m4151a(int i) {
        if ((i & 1) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(i);
    }

    /* renamed from: e */
    static String m4152e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    /* renamed from: g */
    public static C1127d m4153g(ContentInfo contentInfo) {
        return new C1127d(new C1132e(contentInfo));
    }

    /* renamed from: b */
    public ClipData mo3675b() {
        return this.f3783a.mo3690d();
    }

    /* renamed from: c */
    public int mo3676c() {
        return this.f3783a.mo3691e();
    }

    /* renamed from: d */
    public int mo3677d() {
        return this.f3783a.mo3688b();
    }

    /* renamed from: f */
    public ContentInfo mo3678f() {
        ContentInfo c = this.f3783a.mo3689c();
        Objects.requireNonNull(c);
        return C1121c.m4146a(c);
    }

    public String toString() {
        return this.f3783a.toString();
    }
}
