package pk0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import z21.C40141a;

/* renamed from: pk0.d */
public abstract class C27588d {

    /* renamed from: pk0.d$a */
    public static final class C27589a extends C27588d {

        /* renamed from: a */
        public static final C27589a f70513a = new C27589a();

        private C27589a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: pk0.d$b */
    public static final class C27590b extends C27588d {

        /* renamed from: a */
        private final StringSource f70514a;

        public C27590b(StringSource stringSource) {
            super((DefaultConstructorMarker) null);
            this.f70514a = stringSource;
        }

        /* renamed from: a */
        public final StringSource mo66948a() {
            return this.f70514a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27590b) && C41536l.m120484d(this.f70514a, ((C27590b) obj).f70514a);
        }

        public int hashCode() {
            StringSource stringSource = this.f70514a;
            if (stringSource == null) {
                return 0;
            }
            return stringSource.hashCode();
        }

        public String toString() {
            StringSource stringSource = this.f70514a;
            return "HeaderItem(titleResource=" + stringSource + ")";
        }
    }

    /* renamed from: pk0.d$c */
    public static abstract class C27591c extends C27588d {

        /* renamed from: pk0.d$c$a */
        public static final class C27592a extends C27591c {

            /* renamed from: a */
            private final StringSource f70515a;

            /* renamed from: b */
            private final int f70516b;

            /* renamed from: c */
            private final Color f70517c;

            /* renamed from: d */
            private final Color f70518d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27592a(StringSource stringSource, int i, Color color, Color color2) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(stringSource, "titleId");
                this.f70515a = stringSource;
                this.f70516b = i;
                this.f70517c = color;
                this.f70518d = color2;
            }

            /* renamed from: a */
            public Color mo66952a() {
                return this.f70518d;
            }

            /* renamed from: b */
            public int mo66953b() {
                return this.f70516b;
            }

            /* renamed from: c */
            public Color mo66954c() {
                return this.f70517c;
            }

            /* renamed from: d */
            public StringSource mo66955d() {
                return this.f70515a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27592a)) {
                    return false;
                }
                C27592a aVar = (C27592a) obj;
                return C41536l.m120484d(this.f70515a, aVar.f70515a) && this.f70516b == aVar.f70516b && C41536l.m120484d(this.f70517c, aVar.f70517c) && C41536l.m120484d(this.f70518d, aVar.f70518d);
            }

            public int hashCode() {
                int hashCode = ((this.f70515a.hashCode() * 31) + this.f70516b) * 31;
                Color color = this.f70517c;
                int i = 0;
                int hashCode2 = (hashCode + (color == null ? 0 : color.hashCode())) * 31;
                Color color2 = this.f70518d;
                if (color2 != null) {
                    i = color2.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringSource stringSource = this.f70515a;
                int i = this.f70516b;
                Color color = this.f70517c;
                Color color2 = this.f70518d;
                return "LogOutWrapper(titleId=" + stringSource + ", iconId=" + i + ", iconTint=" + color + ", backgroundTint=" + color2 + ")";
            }
        }

        /* renamed from: pk0.d$c$b */
        public static final class C27593b extends C27591c {

            /* renamed from: a */
            private final StringSource f70519a;

            /* renamed from: b */
            private final int f70520b;

            /* renamed from: c */
            private final Color f70521c;

            /* renamed from: d */
            private final C40141a f70522d;

            /* renamed from: e */
            private final Color f70523e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27593b(StringSource stringSource, int i, Color color, C40141a aVar, Color color2) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(stringSource, "titleId");
                C41536l.m120489i(aVar, "hubSettingsSearchItem");
                this.f70519a = stringSource;
                this.f70520b = i;
                this.f70521c = color;
                this.f70522d = aVar;
                this.f70523e = color2;
            }

            /* renamed from: a */
            public Color mo66959a() {
                return this.f70523e;
            }

            /* renamed from: b */
            public final C40141a mo66960b() {
                return this.f70522d;
            }

            /* renamed from: c */
            public int mo66961c() {
                return this.f70520b;
            }

            /* renamed from: d */
            public Color mo66962d() {
                return this.f70521c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27593b)) {
                    return false;
                }
                C27593b bVar = (C27593b) obj;
                return C41536l.m120484d(this.f70519a, bVar.f70519a) && this.f70520b == bVar.f70520b && C41536l.m120484d(this.f70521c, bVar.f70521c) && C41536l.m120484d(this.f70522d, bVar.f70522d) && C41536l.m120484d(this.f70523e, bVar.f70523e);
            }

            public int hashCode() {
                int hashCode = ((this.f70519a.hashCode() * 31) + this.f70520b) * 31;
                Color color = this.f70521c;
                int i = 0;
                int hashCode2 = (((hashCode + (color == null ? 0 : color.hashCode())) * 31) + this.f70522d.hashCode()) * 31;
                Color color2 = this.f70523e;
                if (color2 != null) {
                    i = color2.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringSource stringSource = this.f70519a;
                int i = this.f70520b;
                Color color = this.f70521c;
                C40141a aVar = this.f70522d;
                Color color2 = this.f70523e;
                return "SearchHubSettingsWrapperItem(titleId=" + stringSource + ", iconId=" + i + ", iconTint=" + color + ", hubSettingsSearchItem=" + aVar + ", backgroundTint=" + color2 + ")";
            }
        }

        public /* synthetic */ C27591c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C27591c() {
            super((DefaultConstructorMarker) null);
        }
    }

    private C27588d() {
    }

    public /* synthetic */ C27588d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
