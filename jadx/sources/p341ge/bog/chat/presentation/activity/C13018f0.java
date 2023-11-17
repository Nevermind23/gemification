package p341ge.bog.chat.presentation.activity;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.chat.presentation.activity.f0 */
public abstract class C13018f0 {

    /* renamed from: ge.bog.chat.presentation.activity.f0$a */
    public static final class C13019a extends C13018f0 {

        /* renamed from: a */
        private final C13034j0 f38379a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13019a(C13034j0 j0Var) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(j0Var, "message");
            this.f38379a = j0Var;
        }

        /* renamed from: a */
        public final C13034j0 mo34261a() {
            return this.f38379a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13019a) && C41536l.m120484d(this.f38379a, ((C13019a) obj).f38379a);
        }

        public int hashCode() {
            return this.f38379a.hashCode();
        }

        public String toString() {
            C13034j0 j0Var = this.f38379a;
            return "DeleteMessage(message=" + j0Var + ")";
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.f0$b */
    public static final class C13020b extends C13018f0 {

        /* renamed from: a */
        private final String f38380a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13020b(String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "messageId");
            this.f38380a = str;
        }

        /* renamed from: a */
        public final String mo34265a() {
            return this.f38380a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13020b) && C41536l.m120484d(this.f38380a, ((C13020b) obj).f38380a);
        }

        public int hashCode() {
            return this.f38380a.hashCode();
        }

        public String toString() {
            String str = this.f38380a;
            return "DeleteMessageById(messageId=" + str + ")";
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.f0$c */
    public static final class C13021c extends C13018f0 {

        /* renamed from: a */
        private final C13034j0 f38381a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13021c(C13034j0 j0Var) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(j0Var, "message");
            this.f38381a = j0Var;
        }

        /* renamed from: a */
        public final C13034j0 mo34269a() {
            return this.f38381a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13021c) && C41536l.m120484d(this.f38381a, ((C13021c) obj).f38381a);
        }

        public int hashCode() {
            return this.f38381a.hashCode();
        }

        public String toString() {
            C13034j0 j0Var = this.f38381a;
            return "NewMessage(message=" + j0Var + ")";
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.f0$d */
    public static final class C13022d extends C13018f0 {

        /* renamed from: a */
        private final C13034j0 f38382a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13022d(C13034j0 j0Var) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(j0Var, "message");
            this.f38382a = j0Var;
        }

        /* renamed from: a */
        public final C13034j0 mo34273a() {
            return this.f38382a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13022d) && C41536l.m120484d(this.f38382a, ((C13022d) obj).f38382a);
        }

        public int hashCode() {
            return this.f38382a.hashCode();
        }

        public String toString() {
            C13034j0 j0Var = this.f38382a;
            return "UpdateMessage(message=" + j0Var + ")";
        }
    }

    private C13018f0() {
    }

    public /* synthetic */ C13018f0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
