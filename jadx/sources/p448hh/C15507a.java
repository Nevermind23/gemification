package p448hh;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.widget.EditText;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p533ni.C16941b;
import p547oi.C17199a;

/* renamed from: hh.a */
public abstract class C15507a {

    /* renamed from: b */
    public static final C15511b f44014b = new C15511b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private boolean f44015a;

    /* renamed from: hh.a$a */
    public static final class C15508a extends C15507a {

        /* renamed from: f */
        public static final C15509a f44016f = new C15509a((DefaultConstructorMarker) null);

        /* renamed from: c */
        private boolean f44017c = true;

        /* renamed from: d */
        private final C17199a f44018d = new C17199a("");

        /* renamed from: e */
        private String f44019e = "";

        /* renamed from: hh.a$a$a */
        public static final class C15509a {
            private C15509a() {
            }

            public /* synthetic */ C15509a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: hh.a$a$b */
        public static final class C15510b implements TextWatcher {

            /* renamed from: d */
            final /* synthetic */ C15508a f44020d;

            public C15510b(C15508a aVar) {
                this.f44020d = aVar;
            }

            public void afterTextChanged(Editable editable) {
                if (editable != null && this.f44020d.mo42617a()) {
                    this.f44020d.m56081f(editable);
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        public C15508a() {
            super((DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final void m56081f(Editable editable) {
            int i;
            boolean z;
            m56082g(editable);
            int i2 = 1;
            if (C40440x.m117139M(editable, ".", false, 2, (Object) null)) {
                i = C40440x.m117156X(editable, ".", 0, false, 6, (Object) null);
            } else {
                if (this.f44019e.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || !C40440x.m117139M(editable, this.f44019e, false, 2, (Object) null)) {
                    i = editable.length();
                } else {
                    i = C40440x.m117156X(editable, this.f44019e, 0, false, 6, (Object) null);
                }
            }
            int length = editable.length();
            if (1 <= length) {
                while (true) {
                    if (i2 % 3 == 0 && i2 < i) {
                        int i3 = i - i2;
                        editable.setSpan(new C16941b(","), i3 - 1, i3, 33);
                    }
                    if (i2 != length) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: g */
        private final void m56082g(Editable editable) {
            C16941b[] bVarArr = (C16941b[]) editable.getSpans(0, editable.length(), C16941b.class);
            C41536l.m120488h(bVarArr, "toRemoveSpans");
            for (C16941b removeSpan : bVarArr) {
                editable.removeSpan(removeSpan);
            }
        }

        /* renamed from: a */
        public boolean mo42617a() {
            return this.f44017c;
        }

        /* renamed from: b */
        public void mo42618b(String str) {
            C41536l.m120489i(str, "suffix");
            this.f44019e = str;
            this.f44018d.mo44613a(str);
        }

        /* renamed from: c */
        public void mo42619c(boolean z) {
            this.f44017c = z;
        }

        /* renamed from: d */
        public void mo42620d(EditText editText) {
            C41536l.m120489i(editText, "input");
            editText.setFilters(new InputFilter[]{this.f44018d.mo44614b()});
            editText.setInputType(8194);
            editText.setKeyListener(DigitsKeyListener.getInstance("0123456789,."));
            editText.addTextChangedListener(new C15510b(this));
        }
    }

    /* renamed from: hh.a$b */
    public static final class C15511b {
        private C15511b() {
        }

        public /* synthetic */ C15511b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C15507a mo42624a(int i) {
            if (i == 0) {
                return new C15508a();
            }
            return new C15512c();
        }
    }

    /* renamed from: hh.a$c */
    public static final class C15512c extends C15507a {
        public C15512c() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public void mo42620d(EditText editText) {
            C41536l.m120489i(editText, "input");
            editText.setInputType(1);
        }
    }

    private C15507a() {
    }

    public /* synthetic */ C15507a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public boolean mo42617a() {
        return this.f44015a;
    }

    /* renamed from: b */
    public void mo42618b(String str) {
        C41536l.m120489i(str, "suffix");
    }

    /* renamed from: c */
    public void mo42619c(boolean z) {
        this.f44015a = z;
    }

    /* renamed from: d */
    public abstract void mo42620d(EditText editText);
}
