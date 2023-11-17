package a91;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32289b0;
import i91.C36368b;
import i91.C36373d;
import java.util.ArrayList;
import java.util.List;
import l81.C37107d;
import p341ge.bog.mobilebank.p975ui.views.lettertile.LetterTileView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: a91.d */
public class C30879d extends RecyclerView.C1736h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List f76921d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C30880a f76922e;

    /* renamed from: a91.d$a */
    public interface C30880a {
        /* renamed from: a */
        void mo71074a(C36368b bVar);
    }

    /* renamed from: a91.d$b */
    class C30881b extends C37107d {

        /* renamed from: f */
        BogTextView f76923f = ((BogTextView) mo90036h(C10322k.item_contact_name));

        /* renamed from: g */
        BogTextView f76924g = ((BogTextView) mo90036h(C10322k.item_contact_phone));

        /* renamed from: h */
        ImageView f76925h = ((ImageView) mo90036h(C10322k.item_contact_avatar));

        /* renamed from: i */
        LetterTileView f76926i = ((LetterTileView) mo90036h(C10322k.item_contact_letter_tile));

        /* renamed from: j */
        View f76927j = mo90036h(C10322k.item_contact_divider);

        /* renamed from: k */
        View.OnClickListener f76928k = new C30882a();

        /* renamed from: a91.d$b$a */
        class C30882a implements View.OnClickListener {
            C30882a() {
            }

            public void onClick(View view) {
                if (C30879d.this.f76922e != null && C30881b.this.getAdapterPosition() != -1) {
                    C30879d.this.f76922e.mo71074a((C36368b) C30879d.this.f76921d.get(C30881b.this.getAdapterPosition()));
                }
            }
        }

        C30881b(View view) {
            super(view);
            view.setOnClickListener(this.f76928k);
        }
    }

    public C30879d(List list) {
        ArrayList arrayList = new ArrayList();
        this.f76921d = arrayList;
        arrayList.addAll(list);
    }

    public int getItemCount() {
        return this.f76921d.size();
    }

    /* renamed from: h */
    public void onBindViewHolder(C30881b bVar, int i) {
        C36368b bVar2 = (C36368b) this.f76921d.get(i);
        bVar.f76926i.setUpWithString(bVar2.mo89097a());
        if (bVar2.mo89104i() != null) {
            ImageView imageView = bVar.f76925h;
            imageView.setVisibility(0);
            C32289b0.m95094f(imageView, Uri.parse(bVar2.mo89104i()));
        } else {
            bVar.f76925h.setVisibility(4);
        }
        if (i == this.f76921d.size() - 1) {
            bVar.f76927j.setVisibility(8);
        } else {
            bVar.f76927j.setVisibility(0);
        }
        int j = bVar2.mo89105j();
        if (j == 0) {
            C36373d.m107948f(bVar.f76923f, bVar2.mo89097a());
            C36373d.m107948f(bVar.f76924g, bVar2.mo89098b());
        } else if (j == 1) {
            C36373d.m107946d(bVar.f76923f, bVar2.mo89097a(), bVar2.mo89102g().toString());
            C36373d.m107948f(bVar.f76924g, bVar2.mo89098b());
        } else if (j == 2) {
            C36373d.m107948f(bVar.f76923f, bVar2.mo89097a());
            C36373d.m107946d(bVar.f76924g, bVar2.mo89098b(), bVar2.mo89102g().toString());
        } else if (j == 3) {
            C36373d.m107947e(bVar.f76923f, bVar2.mo89097a(), bVar2.mo89102g().toString(), true);
            C36373d.m107948f(bVar.f76924g, bVar2.mo89098b());
        } else if (j == 4) {
            C36373d.m107948f(bVar.f76923f, bVar2.mo89097a());
            C36373d.m107946d(bVar.f76924g, bVar2.mo89098b(), bVar2.mo89102g().toString());
        }
    }

    /* renamed from: i */
    public C30881b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C30881b(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.contact_recycler_item, viewGroup, false));
    }

    /* renamed from: j */
    public void mo71072j(C30880a aVar) {
        this.f76922e = aVar;
    }

    /* renamed from: k */
    public void mo71073k(List list) {
        this.f76921d.clear();
        this.f76921d.addAll(list);
        notifyDataSetChanged();
    }
}
