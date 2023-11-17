package p575qi;

import android.text.Editable;
import android.text.TextWatcher;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.designsystem.components.input.BogEditText;
import ue1.C43079p;

/* renamed from: qi.b */
public final class C17510b {

    /* renamed from: a */
    private String f49037a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f49038b;

    /* renamed from: qi.b$a */
    static final class C17511a extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C17510b f49039d;

        /* renamed from: e */
        final /* synthetic */ BogEditText f49040e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17511a(C17510b bVar, BogEditText bogEditText) {
            super(2);
            this.f49039d = bVar;
            this.f49040e = bogEditText;
        }

        /* renamed from: a */
        public final void mo45031a(int i, int i2) {
            boolean z;
            if (this.f49039d.mo45029c().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (i != i2) {
                    this.f49040e.setSelection(i, Math.min(i2, this.f49039d.f49038b));
                } else if (i2 > this.f49039d.f49038b) {
                    this.f49040e.setSelection(this.f49039d.f49038b);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo45031a(((Number) obj).intValue(), ((Number) obj2).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: qi.b$b */
    public static final class C17512b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C17510b f49041d;

        /* renamed from: e */
        final /* synthetic */ BogEditText f49042e;

        C17512b(C17510b bVar, BogEditText bogEditText) {
            this.f49041d = bVar;
            this.f49042e = bogEditText;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            boolean z;
            boolean z2;
            C41536l.m120489i(charSequence, "s");
            if (this.f49041d.mo45029c().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (charSequence.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 || this.f49042e.hasFocus()) {
                    if (C40440x.m117143O(charSequence, this.f49041d.mo45029c(), false, 2, (Object) null)) {
                        C17510b bVar = this.f49041d;
                        bVar.f49038b = C40440x.m117161c0(charSequence, bVar.mo45029c(), 0, false, 6, (Object) null);
                    }
                    this.f49042e.removeTextChangedListener(this);
                    if ((charSequence.length() == 1 && i2 == 0) || (!C40440x.m117143O(charSequence, this.f49041d.mo45029c(), false, 2, (Object) null) && i2 == 0)) {
                        this.f49042e.setText(charSequence + this.f49041d.mo45029c());
                        this.f49041d.f49038b = charSequence.length();
                        this.f49042e.setSelection(this.f49041d.f49038b);
                    }
                    this.f49042e.addTextChangedListener(this);
                }
            }
        }
    }

    public C17510b(String str, BogEditText bogEditText) {
        C41536l.m120489i(str, "suffix");
        C41536l.m120489i(bogEditText, "editText");
        this.f49037a = str;
        bogEditText.setOnSelectionChangedListener(new C17511a(this, bogEditText));
        bogEditText.addTextChangedListener(new C17512b(this, bogEditText));
    }

    /* renamed from: c */
    public final String mo45029c() {
        return this.f49037a;
    }

    /* renamed from: d */
    public final void mo45030d(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f49037a = str;
    }
}
