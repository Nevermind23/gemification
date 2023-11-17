package p459ie;

import android.opengl.GLES20;
import he1.C41234t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p403ee.C12433d;

/* renamed from: ie.b */
public final class C15610b {

    /* renamed from: d */
    public static final C15611a f44401d = new C15611a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f44402a;

    /* renamed from: b */
    private final int f44403b;

    /* renamed from: c */
    private final int f44404c;

    /* renamed from: ie.b$a */
    public static final class C15611a {
        private C15611a() {
        }

        public /* synthetic */ C15611a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C15610b mo42908a(int i, String str) {
            C41536l.m120489i(str, "name");
            return new C15610b(i, C15612b.ATTRIB, str, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public final C15610b mo42909b(int i, String str) {
            C41536l.m120489i(str, "name");
            return new C15610b(i, C15612b.UNIFORM, str, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ie.b$b */
    private enum C15612b {
        ATTRIB,
        UNIFORM
    }

    /* renamed from: ie.b$c */
    public /* synthetic */ class C15613c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44408a;

        static {
            int[] iArr = new int[C15612b.values().length];
            iArr[C15612b.ATTRIB.ordinal()] = 1;
            iArr[C15612b.UNIFORM.ordinal()] = 2;
            f44408a = iArr;
        }
    }

    public /* synthetic */ C15610b(int i, C15612b bVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bVar, str);
    }

    /* renamed from: a */
    public final int mo42906a() {
        return this.f44404c;
    }

    /* renamed from: b */
    public final int mo42907b() {
        return this.f44403b;
    }

    private C15610b(int i, C15612b bVar, String str) {
        int i2;
        this.f44402a = str;
        int i3 = C15613c.f44408a[bVar.ordinal()];
        if (i3 == 1) {
            i2 = GLES20.glGetAttribLocation(C41234t.m119493a(i), str);
        } else if (i3 == 2) {
            i2 = GLES20.glGetUniformLocation(C41234t.m119493a(i), str);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f44403b = i2;
        C12433d.m47460c(i2, str);
        this.f44404c = C41234t.m119493a(i2);
    }
}
