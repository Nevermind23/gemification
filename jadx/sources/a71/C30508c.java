package a71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p341ge.bog.mobilebank.transfers.foreign.FileAttachment;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: a71.c */
public class C30508c extends RecyclerView.C1736h {

    /* renamed from: d */
    private List f76513d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C30511c f76514e;

    /* renamed from: a71.c$a */
    class C30509a implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ C30510b f76515d;

        C30509a(C30510b bVar) {
            this.f76515d = bVar;
        }

        public void onClick(View view) {
            if (C30508c.this.f76514e != null) {
                C30508c.this.f76514e.mo70862o0(this.f76515d.getAdapterPosition());
            }
        }
    }

    /* renamed from: a71.c$b */
    static class C30510b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        TextView f76517d;

        /* renamed from: e */
        ImageButton f76518e;

        C30510b(View view) {
            super(view);
            this.f76517d = (TextView) view.findViewById(C10322k.file_name);
            this.f76518e = (ImageButton) view.findViewById(C10322k.remove_button);
        }
    }

    /* renamed from: a71.c$c */
    public interface C30511c {
        /* renamed from: o0 */
        void mo70862o0(int i);
    }

    /* renamed from: g */
    public void mo70855g(FileAttachment fileAttachment) {
        this.f76513d.add(fileAttachment);
        notifyItemInserted(getItemCount() - 1);
    }

    public int getItemCount() {
        return this.f76513d.size();
    }

    /* renamed from: h */
    public void onBindViewHolder(C30510b bVar, int i) {
        bVar.f76517d.setText(((FileAttachment) this.f76513d.get(i)).getFileName());
        bVar.f76518e.setOnClickListener(new C30509a(bVar));
    }

    /* renamed from: i */
    public C30510b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C30510b(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.layout_file_item, viewGroup, false));
    }

    /* renamed from: j */
    public void mo70858j(int i) {
        this.f76513d.remove(i);
        notifyItemRemoved(i);
    }

    /* renamed from: k */
    public void mo70859k(C30511c cVar) {
        this.f76514e = cVar;
    }

    /* renamed from: l */
    public void mo70860l(List list) {
        if (list != null) {
            this.f76513d.clear();
            this.f76513d.addAll(list);
        }
    }
}
