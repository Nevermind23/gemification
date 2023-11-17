package p487ke;

import android.opengl.GLES20;
import he1.C41234t;
import he1.C41236u;
import he1.C41238w;
import java.nio.Buffer;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p403ee.C12433d;
import p403ee.C12434e;
import p403ee.C12435f;
import p445he.C15491f;
import ue1.C43064a;

/* renamed from: ke.a */
public final class C16416a implements C12434e {

    /* renamed from: a */
    private final int f46389a;

    /* renamed from: b */
    private final int f46390b;

    /* renamed from: c */
    private final Integer f46391c;

    /* renamed from: d */
    private final Integer f46392d;

    /* renamed from: e */
    private final Integer f46393e;

    /* renamed from: f */
    private final Integer f46394f;

    /* renamed from: g */
    private final int f46395g;

    /* renamed from: ke.a$a */
    static final class C16417a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C16416a f46396d;

        /* renamed from: e */
        final /* synthetic */ Integer f46397e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16417a(C16416a aVar, Integer num) {
            super(0);
            this.f46396d = aVar;
            this.f46397e = num;
        }

        public final void invoke() {
            if (!(this.f46396d.mo43541h() == null || this.f46396d.mo43537d() == null || this.f46396d.mo43536c() == null || this.f46397e == null || this.f46396d.mo43540g() == null)) {
                GLES20.glTexImage2D(C41234t.m119493a(this.f46396d.mo43539f()), 0, this.f46397e.intValue(), this.f46396d.mo43541h().intValue(), this.f46396d.mo43537d().intValue(), 0, C41234t.m119493a(this.f46396d.mo43536c().intValue()), C41234t.m119493a(this.f46396d.mo43540g().intValue()), (Buffer) null);
            }
            GLES20.glTexParameterf(C41234t.m119493a(this.f46396d.mo43539f()), C15491f.m56037l(), C15491f.m56032g());
            GLES20.glTexParameterf(C41234t.m119493a(this.f46396d.mo43539f()), C15491f.m56036k(), C15491f.m56030e());
            GLES20.glTexParameteri(C41234t.m119493a(this.f46396d.mo43539f()), C15491f.m56038m(), C15491f.m56026a());
            GLES20.glTexParameteri(C41234t.m119493a(this.f46396d.mo43539f()), C15491f.m56039n(), C15491f.m56026a());
            C12433d.m47459b("glTexParameter");
        }
    }

    public C16416a(int i, int i2) {
        this(i, i2, (Integer) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public void mo33047a() {
        GLES20.glBindTexture(C41234t.m119493a(this.f46390b), C41234t.m119493a(0));
        GLES20.glActiveTexture(C15491f.m56034i());
        C12433d.m47459b("unbind");
    }

    /* renamed from: b */
    public void mo33048b() {
        GLES20.glActiveTexture(C41234t.m119493a(this.f46389a));
        GLES20.glBindTexture(C41234t.m119493a(this.f46390b), C41234t.m119493a(this.f46395g));
        C12433d.m47459b("bind");
    }

    /* renamed from: c */
    public final Integer mo43536c() {
        return this.f46393e;
    }

    /* renamed from: d */
    public final Integer mo43537d() {
        return this.f46392d;
    }

    /* renamed from: e */
    public final int mo43538e() {
        return this.f46395g;
    }

    /* renamed from: f */
    public final int mo43539f() {
        return this.f46390b;
    }

    /* renamed from: g */
    public final Integer mo43540g() {
        return this.f46394f;
    }

    /* renamed from: h */
    public final Integer mo43541h() {
        return this.f46391c;
    }

    /* renamed from: i */
    public final void mo43542i() {
        int[] iArr = {C41234t.m119493a(this.f46395g)};
        int j = C41236u.m119497j(iArr);
        int[] iArr2 = new int[j];
        for (int i = 0; i < j; i++) {
            iArr2[i] = C41236u.m119496i(iArr, i);
        }
        GLES20.glDeleteTextures(1, iArr2, 0);
        C41238w wVar = C41238w.f97225a;
        C41236u.m119498l(iArr, 0, C41234t.m119493a(iArr2[0]));
    }

    private C16416a(int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        int i3;
        this.f46389a = i;
        this.f46390b = i2;
        this.f46391c = num2;
        this.f46392d = num3;
        this.f46393e = num4;
        this.f46394f = num6;
        if (num == null) {
            int[] b = C41236u.m119494b(1);
            int j = C41236u.m119497j(b);
            int[] iArr = new int[j];
            for (int i4 = 0; i4 < j; i4++) {
                iArr[i4] = C41236u.m119496i(b, i4);
            }
            GLES20.glGenTextures(1, iArr, 0);
            C41238w wVar = C41238w.f97225a;
            C41236u.m119498l(b, 0, C41234t.m119493a(iArr[0]));
            C12433d.m47459b("glGenTextures");
            i3 = C41236u.m119496i(b, 0);
        } else {
            i3 = num.intValue();
        }
        this.f46395g = i3;
        if (num == null) {
            C12435f.m47463a(this, new C16417a(this, num5));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16416a(int i, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? C15491f.m56034i() : i, (i3 & 2) != 0 ? C15491f.m56035j() : i2, (i3 & 4) != 0 ? null : num);
    }

    public C16416a(int i, int i2, Integer num) {
        this(i, i2, num, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null);
    }
}
