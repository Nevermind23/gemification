package g81;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.location.Location;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32355x0;
import j81.C36765g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import p341ge.bog.mobilebank.model.map.MapObject;
import p366bk.C10316e;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p642vh.C18368l;

/* renamed from: g81.p */
public class C32265p extends RecyclerView.C1736h {

    /* renamed from: d */
    private Context f79590d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C36765g f79591e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Location f79592f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ArrayList f79593g;

    /* renamed from: h */
    private int f79594h;

    /* renamed from: i */
    private Location f79595i = new Location("");

    /* renamed from: j */
    private C32266a f79596j;

    /* renamed from: g81.p$a */
    private class C32266a implements Comparator {

        /* renamed from: d */
        Location f79597d;

        /* renamed from: e */
        Location f79598e;

        /* renamed from: a */
        public int compare(MapObject mapObject, MapObject mapObject2) {
            this.f79597d.setLongitude(mapObject.getLongitude());
            this.f79597d.setLatitude(mapObject.getLatitude());
            this.f79598e.setLongitude(mapObject2.getLongitude());
            this.f79598e.setLatitude(mapObject2.getLatitude());
            if (this.f79597d.distanceTo(C32265p.this.f79592f) > this.f79598e.distanceTo(C32265p.this.f79592f)) {
                return 1;
            }
            return -1;
        }

        private C32266a() {
            this.f79597d = new Location("");
            this.f79598e = new Location("");
        }
    }

    /* renamed from: g81.p$b */
    private class C32267b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        View f79600d;

        /* renamed from: e */
        ViewGroup f79601e;

        /* renamed from: f */
        AppCompatImageView f79602f;

        /* renamed from: g */
        TextView f79603g;

        /* renamed from: h */
        TextView f79604h;

        /* renamed from: g81.p$b$a */
        class C32268a implements View.OnClickListener {

            /* renamed from: d */
            final /* synthetic */ C32265p f79606d;

            C32268a(C32265p pVar) {
                this.f79606d = pVar;
            }

            public void onClick(View view) {
                int adapterPosition = C32267b.this.getAdapterPosition();
                if (C32265p.this.f79593g != null && C32265p.this.f79591e != null && adapterPosition < C32265p.this.f79593g.size() && adapterPosition >= 0) {
                    C32265p.this.f79591e.mo86258b((MapObject) C32265p.this.f79593g.get(adapterPosition));
                }
            }
        }

        public C32267b(View view) {
            super(view);
            this.f79600d = view.findViewById(C10322k.f28751Ik);
            this.f79601e = (ViewGroup) view.findViewById(C10322k.rounded_container);
            this.f79602f = (AppCompatImageView) view.findViewById(C10322k.rounded_image);
            this.f79603g = (TextView) view.findViewById(C10322k.f28846ii);
            this.f79604h = (TextView) view.findViewById(C10322k.distance);
            this.f79600d.setOnClickListener(new C32268a(C32265p.this));
        }
    }

    public C32265p(Context context, C36765g gVar, Location location) {
        this.f79590d = context;
        this.f79591e = gVar;
        this.f79592f = location;
        this.f79594h = C32355x0.m95514e(C10318g.solo_background_color, context);
        this.f79596j = new C32266a();
    }

    public int getItemCount() {
        ArrayList arrayList = this.f79593g;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: i */
    public boolean mo72778i() {
        return this.f79593g != null;
    }

    /* renamed from: j */
    public void mo72779j(Location location) {
        this.f79592f = location;
        ArrayList arrayList = this.f79593g;
        if (arrayList != null) {
            Collections.sort(arrayList, this.f79596j);
            notifyDataSetChanged();
        }
    }

    /* renamed from: k */
    public void mo72780k(ArrayList arrayList) {
        this.f79593g = arrayList;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        MapObject mapObject = (MapObject) this.f79593g.get(i);
        C32267b bVar = (C32267b) f0Var;
        bVar.f79603g.setText(mapObject.getAddress());
        boolean z = false;
        bVar.f79603g.setBackgroundColor(0);
        if (this.f79592f != null) {
            this.f79595i.setLatitude(mapObject.getLatitude());
            this.f79595i.setLongitude(mapObject.getLongitude());
            int distanceTo = (int) (((double) this.f79592f.distanceTo(this.f79595i)) * 1.7d);
            if (distanceTo >= 1000) {
                bVar.f79604h.setText((String.format("%.2f", new Object[]{Double.valueOf(((double) distanceTo) / 1000.0d)}) + " " + this.f79590d.getResources().getString(C10328q.map_object_distance_km_short)).replace(",", "."));
            } else {
                bVar.f79604h.setText(distanceTo + " " + this.f79590d.getResources().getString(C10328q.map_object_distance_meter_short));
            }
        }
        bVar.f79604h.setBackgroundColor(0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(C32355x0.m95516g(C10319h.loan_stroke_width), C32355x0.m95514e(C10318g.bog_circular_image_container_grey_color, this.f79590d));
        gradientDrawable.setColor(0);
        int i2 = C10320i.ic_sc;
        if (mapObject.getObject() != null) {
            if (mapObject.getObject().startsWith("ATM")) {
                i2 = C10320i.ic_atm;
            } else if (mapObject.getObject().equals("PBX")) {
                i2 = C10320i.ic_paybox;
            } else if (mapObject.getObject().equals("SC") && mapObject.getType() != null) {
                if (mapObject.getType().equals("SOL")) {
                    i2 = C10320i.ic_solo;
                    gradientDrawable.setColor(this.f79594h);
                } else if (mapObject.getType().equals("EXP")) {
                    i2 = C10320i.ic_express;
                } else {
                    boolean equals = mapObject.getType().equals("BOG");
                }
            }
            z = true;
        }
        bVar.f79601e.setBackground(gradientDrawable);
        bVar.f79602f.setImageResource(i2);
        if (z) {
            bVar.f79602f.setImageTintList(ColorStateList.valueOf(C18368l.m62755d(f0Var.itemView.getContext(), C10316e.f28605g)));
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C32267b(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.map_object_list_item, viewGroup, false));
    }
}
