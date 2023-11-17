package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30614gb;
import a81.C30628hb;
import a81.C30642ib;
import a81.C30656jb;
import a81.C30669kb;
import a81.C30682lb;
import a81.C30695mb;
import a81.C30708nb;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import de1.C40640a;
import g81.C32136d;
import g91.C32303f;
import g91.C32319m;
import g91.C32335t0;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41205b;
import java.util.ArrayList;
import java.util.HashMap;
import jg1.C41438c;
import jg1.C41452l;
import ky0.C37019f;
import l50.C25825e;
import m50.C26143a;
import md0.C26186e;
import ny0.C37499a;
import ny0.C37500b;
import ny0.C37508i;
import o81.C37697c;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusWrapperUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.items.CalendarChooser;
import p341ge.bog.mobilebank.eventbus.events.AccountStatementEvent;
import p341ge.bog.mobilebank.eventbus.events.LoansEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.credit.CreditCardAccount;
import p341ge.bog.mobilebank.model.loans.Loan;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10328q;
import p843nw.C26625h;
import p863pw.C27623a;
import p863pw.C27631i;
import p895sy.C28290a;
import p90.C27266c2;
import p906ty.C28530h;
import p961yy.C30123a;

/* renamed from: ge.bog.mobilebank.ui.activities.StatementActivity */
public class StatementActivity extends C35453o0 implements CalendarChooser.C21518a, C37697c {

    /* renamed from: G */
    private C27266c2 f85509G;

    /* renamed from: H */
    protected C30123a f85510H;

    /* renamed from: I */
    protected C28290a f85511I;

    /* renamed from: J */
    protected C37019f f85512J;

    /* renamed from: K */
    protected C26143a f85513K;

    /* renamed from: L */
    C26625h f85514L;

    /* renamed from: M */
    protected Client f85515M;

    /* renamed from: N */
    protected C41438c f85516N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public int f85517O;

    /* renamed from: P */
    private int f85518P;

    /* renamed from: Q */
    private long f85519Q;

    /* renamed from: R */
    private long f85520R;

    /* renamed from: S */
    private long f85521S;

    /* renamed from: T */
    private LoansEvent f85522T;

    /* renamed from: U */
    private C25825e f85523U;

    /* renamed from: V */
    private Loan f85524V;

    /* renamed from: W */
    private C37500b f85525W;

    /* renamed from: X */
    private C37499a f85526X;

    /* renamed from: Y */
    private CreditCardAccount f85527Y;

    /* renamed from: Z */
    private BonusCasServiceUiModel f85528Z;

    /* renamed from: a0 */
    private BonusScoolUiModel f85529a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public Long f85530b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public Long f85531c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public long f85532d0;

    /* renamed from: e0 */
    private C32136d f85533e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public AccountStatementEvent f85534f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public boolean f85535g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public boolean f85536h0;

    /* renamed from: i0 */
    private View.OnClickListener f85537i0 = new C35331a();

    /* renamed from: j0 */
    private View.OnClickListener f85538j0 = new C35332b();
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public boolean f85539k0;

    /* renamed from: l0 */
    private Runnable f85540l0 = new C35333c();

    /* renamed from: m0 */
    private BonusWrapperUiModel f85541m0;

    /* renamed from: ge.bog.mobilebank.ui.activities.StatementActivity$a */
    class C35331a implements View.OnClickListener {
        C35331a() {
        }

        public void onClick(View view) {
            StatementActivity.this.f85536h0 = true;
            StatementActivity.this.m104845V2();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.StatementActivity$b */
    class C35332b implements View.OnClickListener {
        C35332b() {
        }

        public void onClick(View view) {
            StatementActivity.this.f85536h0 = false;
            StatementActivity.this.m104845V2();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.StatementActivity$c */
    class C35333c implements Runnable {
        C35333c() {
        }

        public void run() {
            if (StatementActivity.this.f85539k0) {
                int i = 0;
                if (StatementActivity.this.f85517O == 9) {
                    if (!(StatementActivity.this.f85534f0 == null || StatementActivity.this.f85534f0.getCasStatementWrapper() == null || StatementActivity.this.f85534f0.getCasStatementWrapper().getList() == null)) {
                        i = StatementActivity.this.f85534f0.getCasStatementWrapper().getList().size();
                    }
                } else if (StatementActivity.this.f85517O == 15) {
                    if (!(StatementActivity.this.f85534f0 == null || StatementActivity.this.f85534f0.getScoolStatementWrapper() == null || StatementActivity.this.f85534f0.getScoolStatementWrapper().getList() == null)) {
                        i = StatementActivity.this.f85534f0.getScoolStatementWrapper().getList().size();
                    }
                } else if (StatementActivity.this.f85517O == 8 || StatementActivity.this.f85517O == 16) {
                    if (!(StatementActivity.this.f85534f0 == null || StatementActivity.this.f85534f0.getBonusStatementDetailsWrapper() == null || StatementActivity.this.f85534f0.getBonusStatementDetailsWrapper().getList() == null)) {
                        i = StatementActivity.this.f85534f0.getBonusStatementDetailsWrapper().getList().size();
                    }
                } else if (StatementActivity.this.f85517O == 10) {
                    if (!(StatementActivity.this.f85534f0 == null || StatementActivity.this.f85534f0.getCashBackStatementWrapper() == null || StatementActivity.this.f85534f0.getCashBackStatementWrapper().getList() == null)) {
                        i = StatementActivity.this.f85534f0.getCashBackStatementWrapper().getList().size();
                    }
                } else if (!(StatementActivity.this.f85534f0 == null || StatementActivity.this.f85534f0.getAccountStatementWrapper() == null || StatementActivity.this.f85534f0.getAccountStatementWrapper().getStatement() == null)) {
                    i = StatementActivity.this.f85534f0.getAccountStatementWrapper().getStatement().size();
                }
                int i2 = i;
                StatementActivity statementActivity = StatementActivity.this;
                statementActivity.f85515M.requestAccountStatement(false, statementActivity.f85517O, StatementActivity.this.f85532d0, StatementActivity.this.f85530b0, StatementActivity.this.f85531c0, i2, StatementActivity.this.f85535g0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public void m104845V2() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        HashMap hashMap = new HashMap();
        hashMap.put("from", BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
        hashMap.put("count", "1000000");
        hashMap.put("extras", "1");
        hashMap.put("startDate", String.valueOf(this.f85534f0.getStartDate()));
        hashMap.put("endDate", String.valueOf(this.f85534f0.getEndDate()));
        StringBuilder sb = new StringBuilder();
        sb.append(getString(C10328q.f28968x1));
        if (this.f85536h0) {
            str = ".pdf";
        } else {
            str = ".xls";
        }
        sb.append(str);
        String sb2 = sb.toString();
        boolean z = this.f85536h0;
        if (z) {
            str2 = "application/pdf";
        } else {
            str2 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
        }
        int i = this.f85517O;
        if (i == 15) {
            hashMap.put("childClientKey", this.f85532d0 + "");
            if (this.f85536h0) {
                str8 = BankApi.SCOOL_GET_STATEMENT_PDF;
            } else {
                str8 = BankApi.SCOOL_GET_STATEMENT_XLS;
            }
            C32303f.m95195f(RetrofitClient.getUrlWithExtras(str8, hashMap), this, sb2, str2);
        } else if (i == 9) {
            hashMap.put("clientServiceId", this.f85532d0 + "");
            if (this.f85536h0) {
                str7 = BankApi.CAS_GET_STATEMENT_PDF;
            } else {
                str7 = BankApi.CAS_GET_STATEMENT_XLS;
            }
            C32303f.m95195f(RetrofitClient.getUrlWithExtras(str7, hashMap), this, sb2, str2);
        } else if (i == 8 || i == 16) {
            if (i == 8) {
                str3 = "AMEX";
            } else {
                str3 = "PLUS";
            }
            hashMap.put("bonusType", str3);
            if (this.f85536h0) {
                str4 = BankApi.BONUSES_GET_BONUS_STATEMENT_PDF;
            } else {
                str4 = BankApi.BONUSES_GET_BONUS_STATEMENT_XLS;
            }
            C32303f.m95195f(RetrofitClient.getUrlWithExtras(str4, hashMap), this, sb2, str2);
        } else if (i == 10) {
            if (z) {
                str6 = BankApi.BONUSES_GET_CASHBACK_STATEMENT_PDF;
            } else {
                str6 = BankApi.BONUSES_GET_CASHBACK_STATEMENT_XLS;
            }
            C32303f.m95195f(RetrofitClient.getUrlWithExtras(str6, hashMap), this, sb2, str2);
        } else {
            AccountStatementEvent accountStatementEvent = this.f85534f0;
            if (accountStatementEvent != null && accountStatementEvent.getReportID() != null) {
                hashMap.put("searchWord", "");
                hashMap.put("acctKey", this.f85534f0.getReportID().getAcctKey() + "");
                hashMap.put("reportId", this.f85534f0.getReportID().getReportId() + "");
                if (this.f85536h0) {
                    str5 = BankApi.ACCOUNTS_GET_STATEMENT_PDF;
                } else {
                    str5 = BankApi.ACCOUNTS_GET_STATEMENT_EXCEL;
                }
                C32303f.m95195f(RetrofitClient.getUrlWithExtras(str5, hashMap), this, sb2, str2);
            }
        }
    }

    /* renamed from: W2 */
    private void m104846W2() {
        if (this.f85541m0.mo52794e() != null) {
            this.f85528Z = this.f85541m0.mo52791b(this.f85519Q);
            this.f85509G.f68462e.setVisibility(0);
            if (this.f85530b0 != null && this.f85531c0 != null && this.f85534f0 == null) {
                this.f85532d0 = this.f85528Z.mo52714e().longValue();
                this.f85533e0.mo90876A();
                mo53731k(C32319m.m95314u(this.f85530b0.longValue()), C32319m.m95314u(this.f85531c0.longValue()));
                return;
            }
            return;
        }
        this.f85528Z = null;
    }

    /* renamed from: X2 */
    private void m104847X2(boolean z) {
        if (z) {
            this.f85509G.f68462e.setVisibility(0);
            if (this.f85530b0 != null && this.f85531c0 != null && this.f85534f0 == null) {
                this.f85533e0.mo90876A();
                mo53731k(C32319m.m95314u(this.f85530b0.longValue()), C32319m.m95314u(this.f85531c0.longValue()));
            }
        }
    }

    /* renamed from: Y2 */
    private void m104848Y2() {
        if (this.f85541m0.mo52797h() != null) {
            this.f85529a0 = this.f85541m0.mo52798i(this.f85520R);
            this.f85509G.f68462e.setVisibility(0);
            if (this.f85530b0 != null && this.f85531c0 != null && this.f85534f0 == null) {
                this.f85532d0 = this.f85529a0.mo52778b().longValue();
                this.f85533e0.mo90876A();
                mo53731k(C32319m.m95314u(this.f85530b0.longValue()), C32319m.m95314u(this.f85531c0.longValue()));
                return;
            }
            return;
        }
        this.f85529a0 = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public /* synthetic */ void m104849Z2(C27631i iVar) {
        if (this.f85518P < iVar.mo67075a().mo67081a().size()) {
            this.f85523U = this.f85513K.mo65057f((C27623a) iVar.mo67075a().mo67081a().get(this.f85518P));
        }
        this.f85509G.f68462e.setVisibility(0);
        if (this.f85530b0 != null && this.f85531c0 != null && this.f85534f0 == null) {
            this.f85532d0 = this.f85523U.mo64473c();
            this.f85533e0.mo90876A();
            mo53731k(C32319m.m95314u(this.f85530b0.longValue()), C32319m.m95314u(this.f85531c0.longValue()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public /* synthetic */ void m104850a3(Throwable th) {
        this.f85523U = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public void m104851b3(C28530h hVar) {
        int i = this.f85517O;
        if (i == 9 || i == 16 || i == 8 || i == 10 || i == 15) {
            BonusWrapperUiModel h = this.f85510H.mo70417h(hVar);
            this.f85541m0 = h;
            int i2 = this.f85517O;
            if (i2 == 9) {
                m104846W2();
                return;
            }
            boolean z = true;
            if (i2 == 16) {
                if (h.mo52796g() == null) {
                    z = false;
                }
                m104847X2(z);
            } else if (i2 == 8) {
                if (h.mo52790a() == null) {
                    z = false;
                }
                m104847X2(z);
            } else if (i2 == 10) {
                if (h.mo52795f() == null) {
                    z = false;
                }
                m104847X2(z);
            } else if (i2 == 15) {
                m104848Y2();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public void m104852c3(Throwable th) {
        mo86425J1();
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public void m104853d3(C41205b bVar) {
        mo86441o2();
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public void m104854e3(C37508i iVar) {
        iVar.mo90723d();
        C37500b b = iVar.mo90721b(this.f85521S);
        C37499a a = iVar.mo90720a(this.f85521S);
        long j = -1;
        if (b != null) {
            if (!this.f85535g0) {
                this.f85525W = b;
                this.f85526X = null;
            }
            this.f85509G.f68462e.setVisibility(0);
            if (this.f85530b0 != null && this.f85531c0 != null && this.f85534f0 == null) {
                C37500b bVar = this.f85525W;
                if (bVar != null) {
                    j = bVar.mo90668d();
                }
                this.f85532d0 = j;
                this.f85533e0.mo90876A();
                mo53731k(C32319m.m95314u(this.f85530b0.longValue()), C32319m.m95314u(this.f85531c0.longValue()));
            }
        } else if (a != null) {
            this.f85526X = a;
            this.f85535g0 = true;
            this.f85525W = null;
            this.f85509G.f68462e.setVisibility(0);
            if (this.f85530b0 != null && this.f85531c0 != null && this.f85534f0 == null) {
                if (a.mo90639c() != null) {
                    j = a.mo90639c().longValue();
                }
                this.f85532d0 = j;
                this.f85533e0.mo90876A();
                mo53731k(C32319m.m95314u(this.f85530b0.longValue()), C32319m.m95314u(this.f85531c0.longValue()));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public void m104855f3(Throwable th) {
        mo86425J1();
        this.f85525W = null;
        this.f85526X = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public void m104856g3(C41205b bVar) {
        mo86441o2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27266c2 d = C27266c2.m84364d(getLayoutInflater());
        this.f85509G = d;
        super.mo70996D2(bundle, d);
        this.f85517O = getIntent().getIntExtra("PRODUCT_TYPE_KEY", -1);
        this.f85518P = getIntent().getIntExtra("PRODUCT_INDEX", -1);
        this.f85521S = getIntent().getLongExtra("PRODUCT_KEY", -1);
        this.f85519Q = getIntent().getLongExtra("CAS_SERVICE_ID", -1);
        this.f85520R = getIntent().getLongExtra("SCOOL_CHILD_CLIENT_KEY", -1);
        this.f85509G.f68462e.mo53728d(0, getString(C10328q.excel), C10318g.bog_flat_button_green, C10320i.ic_excel, this.f85538j0);
        this.f85509G.f68462e.mo53728d(1, getString(C10328q.pdf), C32335t0.m95367l(this, true), C10320i.ic_pdf_orange, this.f85537i0);
        this.f85509G.f68462e.setDateSelectedListener(this);
        C32136d F = C32136d.m94665F(this, this.f85517O);
        this.f85533e0 = F;
        F.mo90878C(this);
        this.f85533e0.mo90881m();
        this.f85509G.f68464g.setLayoutManager(new LinearLayoutManager(this));
        this.f85509G.f68464g.setAdapter(this.f85533e0);
        this.f85515M.deleteAccountStatement();
        this.f85530b0 = Long.valueOf(C32319m.m95306m(2));
        this.f85531c0 = Long.valueOf(C32319m.m95305l());
        CalendarChooser calendarChooser = this.f85509G.f68462e;
        calendarChooser.setStartDate(C32319m.m95314u(this.f85530b0.longValue()) + " - " + C32319m.m95314u(this.f85531c0.longValue()));
        if (this.f85517O == 1) {
            mo86438k1(this.f85514L.mo65878b().mo95027o0(C40992a.m118827a()).mo94983G0(new C30695mb(this), new C30708nb(this)));
        }
    }

    @C41452l
    public void OnAccountStatementEvent(AccountStatementEvent accountStatementEvent) {
        int i;
        if ((this.f85534f0 != accountStatementEvent || this.f85533e0.getItemCount() == 0) && accountStatementEvent.getType() == this.f85517O && accountStatementEvent.getItemKey() == this.f85532d0) {
            int i2 = 0;
            this.f85509G.f68464g.setVisibility(0);
            this.f85509G.f68463f.setVisibility(8);
            this.f85534f0 = accountStatementEvent;
            int state = accountStatementEvent.getState();
            if (state == 10) {
                this.f85533e0.mo90879D(true);
            } else if (state == 20) {
                ArrayList arrayList = new ArrayList();
                int i3 = this.f85517O;
                if (i3 != 15) {
                    if (i3 != 16) {
                        switch (i3) {
                            case 8:
                                break;
                            case 9:
                                arrayList.addAll(this.f85534f0.getCasStatementWrapper().getList());
                                break;
                            case 10:
                                arrayList.addAll(this.f85534f0.getCashBackStatementWrapper().getList());
                                break;
                            default:
                                arrayList.addAll(this.f85534f0.getAccountStatementWrapper().getStatement());
                                break;
                        }
                    }
                    arrayList.addAll(this.f85534f0.getBonusStatementDetailsWrapper().getList());
                } else {
                    arrayList.addAll(this.f85534f0.getScoolStatementWrapper().getList());
                }
                this.f85533e0.mo90877B(arrayList);
                if (!this.f85534f0.canDownloadMore()) {
                    this.f85533e0.mo90881m();
                }
                LinearLayout linearLayout = this.f85509G.f68463f;
                if (this.f85533e0.mo90884p() == null || this.f85533e0.mo90884p().size() == 0) {
                    i = 0;
                } else {
                    i = 8;
                }
                linearLayout.setVisibility(i);
                RecyclerView recyclerView = this.f85509G.f68464g;
                if (this.f85533e0.mo90884p() == null || this.f85533e0.mo90884p().size() == 0) {
                    i2 = 8;
                }
                recyclerView.setVisibility(i2);
                this.f85533e0.mo90876A();
            } else if (state == 30 || state == 40) {
                this.f85533e0.mo90879D(false);
                this.f85533e0.mo90876A();
            }
        }
    }

    /* renamed from: k */
    public void mo53731k(String str, String str2) {
        long j;
        BonusScoolUiModel bonusScoolUiModel;
        if (str != null && str2 != null) {
            this.f85530b0 = C32319m.m95286F(str);
            this.f85531c0 = C32319m.m95286F(str2);
            int i = this.f85517O;
            if (i == 1) {
                C25825e eVar = this.f85523U;
                if (eVar != null) {
                    this.f85532d0 = eVar.mo64473c();
                }
            } else if (i == 2) {
                CreditCardAccount creditCardAccount = this.f85527Y;
                if (creditCardAccount != null) {
                    this.f85532d0 = creditCardAccount.getAcctKey();
                }
            } else if (i == 3) {
                Loan loan = this.f85524V;
                if (loan != null) {
                    this.f85532d0 = loan.getLoanKey();
                }
            } else if (i == 4) {
                C37500b bVar = this.f85525W;
                if (bVar != null) {
                    this.f85532d0 = bVar.mo90668d();
                } else {
                    C37499a aVar = this.f85526X;
                    if (aVar != null) {
                        if (aVar.mo90639c() == null) {
                            j = 0;
                        } else {
                            j = this.f85526X.mo90639c().longValue();
                        }
                        this.f85532d0 = j;
                    }
                }
            } else if (i == 9) {
                BonusCasServiceUiModel bonusCasServiceUiModel = this.f85528Z;
                if (bonusCasServiceUiModel != null) {
                    this.f85532d0 = bonusCasServiceUiModel.mo52714e().longValue();
                }
            } else if (i == 15 && (bonusScoolUiModel = this.f85529a0) != null) {
                this.f85532d0 = bonusScoolUiModel.mo52778b().longValue();
            }
            this.f85509G.f68463f.setVisibility(8);
            this.f85509G.f68464g.setVisibility(0);
            this.f85515M.deleteAccountStatement();
            this.f85534f0 = null;
            this.f85533e0.mo90877B(new ArrayList());
            this.f85509G.f68464g.setAdapter(this.f85533e0);
            this.f85533e0.mo90882n();
            this.f85533e0.mo90879D(true);
            this.f85533e0.mo90876A();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C32343x.m95489t1(this.f85516N, this);
    }

    @C41452l
    public void onLoans(LoansEvent loansEvent) {
        if (this.f85517O == 3) {
            this.f85522T = loansEvent;
            if (loansEvent.getState() != 20 || this.f85522T.getLoansWrapper().getLoans() == null || this.f85522T.getLoansWrapper().getLoans().size() <= this.f85518P) {
                this.f85524V = null;
                return;
            }
            this.f85524V = loansEvent.getLoansWrapper().getLoans().get(this.f85518P);
            this.f85509G.f68462e.setVisibility(0);
            if (this.f85530b0 != null && this.f85531c0 != null && this.f85534f0 == null) {
                this.f85532d0 = this.f85524V.getLoanKey();
                this.f85533e0.mo90876A();
                mo53731k(C32319m.m95314u(this.f85530b0.longValue()), C32319m.m95314u(this.f85531c0.longValue()));
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10016 && C32303f.m95190a(iArr)) {
            m104845V2();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C32343x.m95423W0(this.f85516N, this);
        this.f85539k0 = true;
        int i = this.f85517O;
        if (i == 2) {
            this.f85515M.requestCreditCards(false);
        } else if (i == 3) {
            this.f85515M.requestLoans(false);
        } else if (i != 4) {
            if (!(i == 15 || i == 16)) {
                switch (i) {
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        return;
                }
            }
            mo86438k1(this.f85511I.mo67918a(false).mo94987J0(C40640a.m117458b()).mo95027o0(C40992a.m118827a()).mo94980F(new C30656jb(this)).mo94983G0(new C30669kb(this), new C30682lb(this)));
        } else {
            mo86438k1(C26186e.m81987e(this.f85512J.mo89942a(false)).mo94987J0(C40640a.m117458b()).mo95027o0(C40992a.m118827a()).mo94980F(new C30614gb(this)).mo94983G0(new C30628hb(this), new C30642ib(this)));
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C32343x.m95423W0(this.f85516N, this);
        this.f85539k0 = false;
    }

    /* renamed from: z */
    public void mo86390z() {
        this.f85540l0.run();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(C10328q.header_text_statement);
    }
}
