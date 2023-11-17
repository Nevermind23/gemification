package p395dk;

import a00.C19147a;
import a01.C30461v0;
import a11.C30469c;
import a11.C30478l;
import a20.C19150a;
import a31.C30481a;
import a51.C30494b;
import a60.C19188l;
import a61.C30497c;
import a70.C19191c;
import a80.C19195d;
import a81.C30709o;
import a81.C30746qa;
import a81.C30793u5;
import ac0.C19220a;
import ac0.C19221b;
import ac0.C19222c;
import ac0.C19223d;
import ac0.C19224e;
import ac0.C19225f;
import ac0.C19226g;
import ae0.C19231d;
import af0.C19234a;
import af0.C19235b;
import ag0.C19244i;
import ai0.C19248a;
import ai0.C19256i;
import ak0.C19259a;
import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1580f0;
import androidx.work.WorkerParameters;
import aq0.C31018c;
import aq0.C31019d;
import aq0.C31022e;
import aq0.C31028k;
import ar0.C31041c;
import av0.C31074a;
import av0.C31080g;
import aw0.C31086a;
import aw0.C31087b;
import aw0.C31088c;
import aw0.C31089d;
import aw0.C31090e;
import aw0.C31091f;
import aw0.C31092g;
import aw0.C31093h;
import aw0.C31094i;
import ax0.C31097c;
import b00.C19292b;
import b00.C19300h;
import b00.C19305k;
import b01.C31104a;
import b20.C19328t;
import b40.C19331a;
import b51.C31133a;
import b60.C19337a;
import b61.C31134a;
import b70.C19339b;
import b71.C31136b;
import b71.C31138d;
import b80.C19342a;
import bd0.C19370a;
import bg0.C19384g;
import bh0.C19385a;
import bk0.C19392a;
import bk0.C19393b;
import bk0.C19394c;
import bn0.C10340a;
import bn0.C10341b;
import bn0.C10342c;
import bo0.C10344a;
import bp0.C10378b;
import bt0.C31185a;
import bt0.C31186b;
import bu0.C31195i;
import bx0.C31214a;
import bx0.C31216b;
import bz0.C31226f;
import bz0.C31250h;
import c00.C19417a;
import c00.C19441l;
import c11.C31259h;
import c31.C31262b;
import c31.C31264d;
import c31.C31265e;
import c60.C19509h;
import c70.C19520a;
import c80.C19532l;
import c81.C31294g;
import c90.C19546a0;
import c90.C19567d;
import c90.C19584d0;
import c90.C19587f;
import c90.C19590g0;
import c90.C19607i0;
import c90.C19611k0;
import c90.C19627m0;
import c90.C19631o0;
import c90.C19650u;
import c90.C19665w;
import ca0.C19684p;
import cd0.C19724a;
import cd0.C19725b;
import cd0.C19727c;
import cd0.C19728d;
import cd0.C19730e;
import cf0.C19736a;
import ch0.C19756a;
import cl0.C19780o;
import cn0.C10519a;
import com.google.gson.Gson;
import com.salesforce.marketingcloud.C11398b;
import cp0.C12022a;
import cp0.C12023b;
import cp0.C12024c;
import cp0.C12025d;
import cp0.C12026e;
import cp0.C12027f;
import cp0.C12028g;
import cq0.C31382l;
import cq0.C31383m;
import cq0.C31386o;
import cr0.C31395b;
import cs0.C31397b;
import cs0.C31408e;
import ct0.C31414f;
import ct0.C31430i;
import cv0.C31441h;
import cv0.C31450i;
import cw0.C31452b;
import cz0.C31509i;
import d30.C19896d;
import d31.C31522b;
import d60.C19923n;
import d60.C19925p;
import d61.C31543b;
import d70.C19926a;
import d71.C31544a;
import d71.C31545b;
import d71.C31546c;
import d71.C31547d;
import d71.C31548e;
import d90.C19931d;
import d90.C19933f;
import d90.C19939l;
import dagger.hilt.android.internal.managers.C12062c;
import db0.C19959d;
import db0.C19969n;
import de0.C19982a;
import de0.C19990c;
import df0.C19991a;
import df0.C19992b;
import df0.C19993c;
import df0.C19994d;
import df0.C19995e;
import df0.C19996f;
import df0.C19997g;
import df0.C19999i;
import df0.C20000j;
import dg0.C20006f;
import dh0.C20007a;
import dn0.C12346k;
import do0.C12401l;
import dq0.C31566b;
import dr0.C31578a;
import dr0.C31579b;
import dr0.C31581d;
import dr0.C31583e;
import dt0.C31588d;
import dt0.C31597m;
import du0.C31607b;
import dv0.C31608a;
import dv0.C31609b;
import dv0.C31610c;
import dv0.C31611d;
import dx0.C31613a;
import dx0.C31614b;
import dx0.C31615c;
import dx0.C31616d;
import dx0.C31617e;
import e11.C31644b;
import e11.C31648f;
import e31.C31656e;
import e40.C20146f;
import e40.C20159s;
import e41.C31658b;
import e50.C20179t;
import e51.C31663a;
import e51.C31666c;
import e51.C31667d;
import e61.C31671d;
import e61.C31677g;
import e61.C31679i;
import e71.C31683a;
import e80.C20183a;
import eb0.C20205l;
import ed0.C20217b;
import eg0.C20239g;
import eh0.C20241b;
import ej0.C20253h;
import ej0.C20259m;
import ej0.C20260n;
import eo0.C12807w;
import ep0.C12832a;
import eq0.C31742c;
import eq0.C31747h;
import eq0.C31752k;
import eq0.C31767m;
import es0.C31772c;
import es0.C31786e;
import es0.C31789h;
import et0.C31809l;
import eu0.C31814b;
import ew0.C31846a;
import ew0.C31860c;
import ew0.C31865h;
import ex0.C31871b;
import ex0.C31874d;
import ex0.C31876e;
import ez0.C31895a;
import f01.C31904c;
import f11.C31920n;
import f41.C31923a;
import f70.C20446a;
import f71.C31946g;
import f80.C20450d;
import f81.C31970m;
import f90.C20455b;
import fa0.C20456a;
import ff0.C20472a;
import fg0.C20478f;
import fg0.C20484l;
import fj0.C20497c;
import fk0.C20517g;
import fk0.C20524h;
import fk0.C20526j;
import fk0.C20530m;
import fk0.C20534p;
import fl0.C20539d;
import fm0.C20543a;
import fn0.C12935b;
import fp0.C12959f;
import fq0.C31977d;
import fq0.C31992f;
import fq0.C31995i;
import fq0.C31998l;
import fr0.C31999a;
import ft0.C32008d;
import fu0.C32014c;
import fv0.C32015a;
import fv0.C32016b;
import fv0.C32017c;
import fv0.C32018d;
import fz0.C32038a;
import g01.C32039a;
import g21.C32053a;
import g30.C20657n;
import g30.C20667x;
import g31.C32080b;
import g51.C32090i;
import g70.C20770d;
import g70.C20777k;
import g80.C20778a;
import ga0.C20787a;
import gd0.C20800a;
import ge1.C41084a;
import gg0.C24722k;
import gh0.C24725b;
import gi0.C24726a;
import gi0.C24727b;
import gj0.C24731c;
import gj0.C24748e;
import gj0.C24759j;
import gl0.C24762a;
import gm0.C24766d;
import gm0.C24768f;
import gm0.C24772j;
import gn0.C15363a;
import gn0.C15364b;
import gn0.C15365c;
import gn0.C15366d;
import gn0.C15367e;
import gn0.C15368f;
import gn0.C15369g;
import gn0.C15371i;
import go0.C15410o;
import gp0.C15452g;
import gq0.C36029g;
import gq0.C36044i;
import gq0.C36045j;
import gq0.C36048m;
import gu0.C36079a;
import gv0.C36084a;
import gw0.C36085a;
import gx0.C36086a;
import gx0.C36087b;
import gz0.C36091a;
import gz0.C36095b0;
import gz0.C36102i;
import gz0.C36113m;
import gz0.C36124w;
import h00.C24846c;
import h01.C36139a;
import h01.C36141b;
import h11.C36142a;
import h30.C24862j;
import h30.C24878z;
import h31.C36149a;
import h51.C36153a;
import h60.C24888f;
import h70.C24889a;
import h71.C36157b;
import h90.C24920a;
import h90.C24922c;
import hb0.C24955f;
import hb0.C24972h;
import hc0.C24973a;
import hc0.C24974b;
import hf0.C24982a;
import hg0.C24991g;
import hh0.C25006a;
import hh0.C25007b;
import hh0.C25009d;
import hh0.C25011e;
import hh0.C25012f;
import hh0.C25013g;
import hh0.C25015i;
import hh0.C25020m;
import hh0.C25024p;
import hh0.C25027r;
import hj0.C25034b;
import hl0.C25036a;
import hl0.C25037b;
import hm0.C25042e;
import hs0.C36194g;
import hu0.C36226g;
import hv0.C36227a;
import hv0.C36228b;
import hv0.C36231e;
import hv0.C36233f;
import hv0.C36235h;
import hv0.C36237i;
import hv0.C36239k;
import hv0.C36241l;
import hv0.C36242m;
import hw0.C36261s;
import hx0.C36262a;
import hx0.C36263b;
import hx0.C36264c;
import hx0.C36265d;
import hx0.C36266e;
import hz0.C36282f;
import hz0.C36300h;
import hz0.C36313r;
import i00.C25097q;
import i11.C36340b;
import i41.C36355c;
import i51.C36356a;
import i61.C36357a;
import i70.C25132g;
import i71.C36358a;
import i71.C36360b;
import i71.C36361c;
import i71.C36362d;
import i71.C36363e;
import i71.C36364f;
import i80.C25133a;
import i80.C25134b;
import ia0.C25137a;
import ia0.C25138b;
import ib0.C25143e;
import ib0.C25160g;
import ic0.C25163c;
import ic0.C25167e;
import ic0.C25170h;
import ic0.C25175m;
import id0.C25179a;
import id0.C25180b;
import ig0.C25207o;
import ii0.C25214a;
import ii0.C25215b;
import ii0.C25217c;
import im0.C25233b;
import in0.C15707a;
import io0.C15718h;
import io0.C15724n;
import io0.C15731u;
import ip0.C15733a;
import ir0.C36491a;
import is0.C36497d;
import is0.C36511f;
import is0.C36515j;
import iu0.C36546y;
import iu0.C36548z;
import iw0.C36560a;
import ix0.C36569i;
import iz0.C36657c;
import iz0.C36672e;
import iz0.C36679l;
import j00.C25286d;
import j01.C36692b;
import j10.C25306t;
import j20.C25307a;
import j20.C25309b;
import j20.C25310c;
import j20.C25317d;
import j21.C36699b;
import j21.C36717c;
import j21.C36721f;
import j21.C36723h;
import j40.C25326a;
import j41.C36728a;
import j50.C25333a;
import j51.C36729a;
import j51.C36730b;
import j51.C36731c;
import j51.C36732d;
import j51.C36733e;
import j51.C36734f;
import j51.C36735g;
import j51.C36736h;
import j51.C36737i;
import j51.C36738j;
import j51.C36739k;
import j51.C36740l;
import j51.C36741m;
import j51.C36742n;
import j51.C36743o;
import j51.C36744p;
import j51.C36745q;
import j51.C36746r;
import j60.C25336c;
import j70.C25339b;
import j70.C25341c;
import j70.C25343d;
import j70.C25345e;
import j70.C25346f;
import j70.C25347g;
import j70.C25348h;
import j70.C25349i;
import j70.C25351j;
import j70.C25352k;
import j80.C25353a;
import j80.C25354b;
import ja0.C25364a;
import ja0.C25365b;
import ja0.C25366c;
import ja0.C25367d;
import ja0.C25369e;
import ja0.C25370f;
import ja0.C25372h;
import ja0.C25374i;
import ja0.C25375j;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jb0.C25376a;
import je0.C25429w0;
import jf0.C25433a;
import jf0.C25434b;
import jf0.C25435c;
import jf0.C25436d;
import jf0.C25437e;
import jg0.C25446i;
import jg1.C41438c;
import jj0.C25459a;
import jj0.C25461b;
import jj0.C25462c;
import jk0.C25465c;
import jl0.C25476b;
import jn0.C16254a;
import jn0.C16255a0;
import jn0.C16275b0;
import jn0.C16276c;
import jn0.C16277c0;
import jn0.C16278d;
import jn0.C16280f;
import jn0.C16281g;
import jn0.C16283i;
import jv0.C36803l;
import jy0.C36845a;
import k00.C25541a;
import k00.C25542b;
import k00.C25544d;
import k01.C36860a;
import k11.C36863b;
import k20.C25574a1;
import k31.C36867a;
import k31.C36868b;
import k40.C25633e;
import k40.C25638j;
import k40.C25643o;
import k40.C25654z;
import k41.C36869a;
import k41.C36871b;
import k41.C36872c;
import k50.C25667m;
import k61.C36876a;
import k61.C36877b;
import k61.C36878c;
import k61.C36880d;
import k61.C36884g;
import k70.C25677a;
import k70.C25678b;
import k70.C25679c;
import k70.C25680d;
import k70.C25681e;
import k70.C25682f;
import k70.C25683g;
import k70.C25684h;
import k71.C36888a;
import kd0.C25711a;
import ke0.C25712a;
import ke0.C25713b;
import ke0.C25714c;
import ke0.C25716d;
import ke0.C25717e;
import ke0.C25718f;
import ke0.C25719g;
import ke0.C25722j;
import kf0.C25723a;
import kg0.C25725b;
import kg0.C25735k;
import kh0.C25737a;
import kl0.C25742a;
import kn0.C16491d0;
import ko0.C16521c;
import kp0.C16541l;
import kr0.C36934b;
import kr0.C36946m;
import kt0.C36990a;
import kv0.C37001g;
import kx0.C37013a;
import ky0.C37014a;
import ky0.C37015b;
import ky0.C37016c;
import ky0.C37017d;
import ky0.C37018e;
import ky0.C37019f;
import ky0.C37020g;
import ky0.C37021h;
import kz0.C37025c;
import kz0.C37037e;
import kz0.C37040h;
import l00.C25798b;
import l01.C37044b;
import l01.C37046c;
import l01.C37048e;
import l01.C37054h;
import l01.C37056i;
import l01.C37057j;
import l01.C37058k;
import l11.C37059a;
import l11.C37060b;
import l11.C37062d;
import l11.C37063e;
import l30.C25803a;
import l41.C37071a;
import l51.C37075d;
import l60.C25843b;
import l71.C37091a;
import l71.C37092b;
import l71.C37094d;
import l71.C37095e;
import l71.C37096f;
import l71.C37097g;
import l71.C37099i;
import l71.C37101k;
import l80.C25847a;
import la0.C25865a;
import lb0.C25878a;
import lb0.C25884g;
import lb0.C25895m;
import lb0.C25906p;
import lb0.C25911u;
import lc0.C25925j;
import lc0.C25929n;
import lc0.C25940x;
import lf0.C25957d;
import lf0.C25968n;
import lf0.C25974t;
import lg0.C25986f0;
import lg0.C26006w;
import lh0.C26011b;
import lh0.C26016e;
import lh0.C26023i;
import li0.C26030c;
import lk0.C26050a;
import lk0.C26052b;
import ll0.C26053a;
import ll0.C26054b;
import lm0.C26055a;
import ln0.C16603b;
import ln0.C16628v;
import ln0.C16629w;
import lp0.C16661i;
import lq0.C37124a;
import ls0.C37137d;
import lt0.C37154c;
import lu0.C37155a;
import lv0.C37172o;
import ly0.C37184b;
import ly0.C37185c;
import lz0.C37186a;
import m00.C26116a;
import m20.C26123a;
import m30.C26140q;
import m50.C26143a;
import m50.C26144b;
import m50.C26145c;
import m50.C26146d;
import m60.C26147a;
import m71.C37233a;
import m80.C26158a;
import m80.C26159b;
import m91.C37248a;
import me0.C26196b;
import mg0.C26215m;
import mg0.C26219q;
import mg0.C26228z;
import mh0.C26232d;
import mm0.C26255a;
import mn0.C16813l;
import mo0.C16846h;
import mo0.C16862o;
import mo0.C16877v;
import mp0.C16889a;
import mp0.C16906r;
import mp0.C16907s;
import mr0.C37252a;
import mt0.C37264h;
import mu0.C37265a;
import mv0.C37267a;
import mx0.C37287a;
import mx0.C37288b;
import mx0.C37289c;
import mx0.C37290d;
import mx0.C37291e;
import mx0.C37292f;
import mx0.C37293g;
import mx0.C37295i;
import my0.C37298b;
import my0.C37300c;
import my0.C37301d;
import my0.C37302e;
import my0.C37303f;
import n01.C37342a;
import n11.C37343a;
import n31.C37349a;
import n40.C26369a;
import n41.C37350a;
import n41.C37351b;
import n60.C26373a;
import n61.C37359a;
import n61.C37360b;
import n91.C37386a;
import nc0.C26404a;
import nc0.C26412g;
import nc0.C26423k;
import nc0.C26434v;
import ne0.C26456a;
import nf0.C26457a;
import nf0.C26476g;
import nh0.C26494a;
import nh0.C26498e;
import nj0.C26520e;
import nk0.C26524d;
import nk0.C26525e;
import nk0.C26532l;
import nl0.C26547d;
import nl0.C26548e;
import nm0.C26558e;
import nn0.C17130r;
import no0.C17133a;
import nr0.C37452a;
import nr0.C37453b;
import nr0.C37454c;
import nr0.C37455d;
import nr0.C37456e;
import ns0.C37457a;
import ns0.C37458b;
import nu0.C37464c;
import nv0.C37485q;
import nx0.C37492b;
import nx0.C37495d;
import nx0.C37497e;
import o10.C26665d0;
import o11.C37585a;
import o20.C26703p;
import o41.C37627a;
import o41.C37630b;
import o41.C37631c;
import o41.C37632d;
import o41.C37633e;
import o41.C37634f;
import o41.C37635g;
import o41.C37637h;
import o41.C37640j;
import o41.C37641k;
import o41.C37642l;
import o41.C37643m;
import o50.C26727c0;
import o50.C26753t;
import o50.C26754u;
import o71.C37664c;
import o71.C37673l;
import o80.C26767a;
import o90.C26771a2;
import o90.C26801g;
import o90.C26809g1;
import o90.C26827j2;
import o90.C26832l0;
import o90.C26836m1;
import o90.C26861t1;
import o90.C26868u;
import o90.C26887v0;
import o91.C37701b;
import oc0.C26926f;
import oe0.C26945c;
import of0.C26953c0;
import of0.C26964i;
import of0.C26967l;
import of0.C26985s;
import of1.C41866b;
import of1.C41935w;
import of1.C41944z;
import og0.C27005m;
import oj0.C27020a;
import ol0.C27043g;
import op0.C37705a;
import or0.C37717f;
import ot0.C37728a;
import ot0.C37732b;
import ot0.C37737d0;
import ot0.C37747i0;
import ot0.C37748j;
import ot0.C37770o;
import ot0.C37776q0;
import ot0.C37783u;
import ot0.C37796v0;
import ot0.C37802y0;
import ou0.C37804a;
import ov0.C37817i;
import oz0.C37846d;
import oz0.C37858f;
import oz0.C37862j;
import p00.C27113k;
import p00.C27126m;
import p01.C37868a;
import p01.C37881d;
import p01.C37882e;
import p01.C37885h;
import p11.C37892a;
import p111i0.C6502a;
import p111i0.C6503b;
import p111i0.C6505d;
import p21.C37894a;
import p30.C27165f;
import p313x7.C8973b;
import p341ge.bog.mobilebank.app.MbankApp;
import p341ge.bog.mobilebank.app.p431db.BogDatabase;
import p341ge.bog.mobilebank.autoliabilityinsurance.domain.model.PolicyDetailsModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.AutoLiabilityInsuranceActivity;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.C13591a;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.C13592b;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput.CarNumberInputFragment;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput.CarNumberInputViewModel$ViewModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputFragment;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputViewModel$ViewModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.ActivationDateInputViewModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.InsuranceActivationDateInputFragment;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.insuranceconditions.InsuranceConditionsFragment;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.PolicyDetailFragment;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.PolicyDetailViewModel$ViewModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetails.PolicyDetailsFragment;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetails.PolicyDetailsViewModel$ViewModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.PolicyDownloadFragment;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.PolicyDownloadViewModel$ViewModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListFragment;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyFragment;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyViewModel$ViewModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.selectinsurancecard.SelectInsuranceCardActionSheet;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.selectinsurancecard.SelectInsuranceCardViewModel$ViewModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.selectpackage.SelectInsurancePackageActionSheet;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.selectpackage.SelectInsurancePackageViewModel$ViewModel;
import p341ge.bog.mobilebank.bnpl.presentation.application.BnplApplicationResultActivity;
import p341ge.bog.mobilebank.bnpl.presentation.application.C13767a;
import p341ge.bog.mobilebank.bnpl.presentation.application.C13768b;
import p341ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesActivity;
import p341ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesViewModel$ViewModel;
import p341ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity;
import p341ge.bog.mobilebank.bnpl.presentation.details.C13821b;
import p341ge.bog.mobilebank.bnpl.presentation.details.C13849e;
import p341ge.bog.mobilebank.bnpl.presentation.details.C13851f;
import p341ge.bog.mobilebank.bnpl.presentation.details.C13870i;
import p341ge.bog.mobilebank.bnpl.presentation.offers.details.BnplOfferDetailsActivity;
import p341ge.bog.mobilebank.bnpl.presentation.offers.details.C13890a;
import p341ge.bog.mobilebank.bnpl.presentation.offers.details.C13891b;
import p341ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersActivity;
import p341ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersViewModel$ViewModel;
import p341ge.bog.mobilebank.bnpl.presentation.welcome.BnplWelcomeActivity;
import p341ge.bog.mobilebank.bnpl.presentation.welcome.BnplWelcomeViewModel$ViewModel;
import p341ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet;
import p341ge.bog.mobilebank.cardapplications.presentation.actionsheet.C13954c;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.OrderDebitCardActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantCardStatusActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantDeliveryApplicationActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderCardResult;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData;
import p341ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel;
import p341ge.bog.mobilebank.cardapplications.presentation.viewmodel.OrderInstantCardViewModel$ViewModel;
import p341ge.bog.mobilebank.cardproducts.presentation.carddetail.C14337b;
import p341ge.bog.mobilebank.cardproducts.presentation.carddetail.C14377l;
import p341ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity;
import p341ge.bog.mobilebank.cardproducts.presentation.carddetail.actionsheet.CardBenefitsViewModel$ViewModel;
import p341ge.bog.mobilebank.cardproducts.presentation.closecard.viewmodel.CloseCardViewModel$ViewModel;
import p341ge.bog.mobilebank.cardproducts.presentation.pinreset.viewmodel.PinResetViewModel$ViewModel;
import p341ge.bog.mobilebank.categorypackages.presentation.CategoryPackagesActivity;
import p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.C14423a;
import p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.C14439e;
import p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageFragment;
import p341ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment;
import p341ge.bog.mobilebank.categorypackages.presentation.application.navigator.C14474a;
import p341ge.bog.mobilebank.categorypackages.presentation.application.navigator.C14475b;
import p341ge.bog.mobilebank.categorypackages.presentation.application.result.ApplicationResultFragment;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.C14537b;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.C14548g;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageFragment;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoLookupUiModel;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SelectedLoungeData;
import p341ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData;
import p341ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelFragment;
import p341ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelViewModel$ViewModel;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.C14695d;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.C14696e;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.C14716h;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.EditPackageConfirmationActionSheet;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.EditPackageViewModel$ViewModel;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.C14643c;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.SetConciergeResultFragment;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.VisaConciergeViewModel$ViewModel;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.C14686b;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.C14687c;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.PackageBenefitsDetailsFragment;
import p341ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackFragment;
import p341ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackViewModel$ViewModel;
import p341ge.bog.mobilebank.categorypackages.presentation.packagelist.C14786b;
import p341ge.bog.mobilebank.categorypackages.presentation.packagelist.C14787c;
import p341ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment;
import p341ge.bog.mobilebank.cleanarch.application.presentation.viewmodel.ApplicationDetailsViewModel;
import p341ge.bog.mobilebank.cleanarch.banner.presentation.viewmodel.BannerDetailsViewModel;
import p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel;
import p341ge.bog.mobilebank.cleanarch.cardactivation.presentation.CardActivationViewModel;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanActivationResultActivity;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel;
import p341ge.bog.mobilebank.cleanarch.data.contact.ContactsRepositoryImpl;
import p341ge.bog.mobilebank.cleanarch.data.creditapplication.CreditOfferRepositoryImpl;
import p341ge.bog.mobilebank.cleanarch.data.creditinfo.CreditInfoRepositoryImpl;
import p341ge.bog.mobilebank.cleanarch.identityverification.data.repository.IdentityVerificationRepositoryImpl;
import p341ge.bog.mobilebank.cleanarch.identityverification.presentation.viewmodel.IdentityVerificationViewModel;
import p341ge.bog.mobilebank.cleanarch.installment.presentation.C21092b;
import p341ge.bog.mobilebank.cleanarch.installment.presentation.viewmodel.InstallmentReversalViewModel;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.cleanarch.leadapplication.presentation.viewmodel.LeadApplicationActionSheetViewModel;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.LoyaltyListActivity;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.viewmodel.LoyaltyListViewModel;
import p341ge.bog.mobilebank.cleanarch.mainactivity.model.ExpiringCardPopUpData;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.data.repository.MoneyTransferRepositoryImpl;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.domain.model.RemittanceCreditInfoContract;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferDetailsViewModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.ratesactionsheet.RatesActionSheetViewModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.RemittanceCreditInfoContractActivity;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferListViewModel$ViewModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreFragment;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreFragment_MembersInjector;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreViewModel;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreViewModel_ViewModel_HiltModules_KeyModule_ProvideFactory;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType;
import p341ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity.MyCreditInfoDescriptionActivity;
import p341ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.viewmodel.MyCreditInfoDescriptionViewModel;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.actionsheet.newproduct.NewProductViewModel$ViewModel;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.C21405m;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel.OffersAndApplicationsViewModel;
import p341ge.bog.mobilebank.cleanarch.openbanking.OpenBankingAuthActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.carddetails.viewmodel.CardDetailsViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsSummariesViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.manager.popupmanager.C21546a;
import p341ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditOfferApplicationActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo.LiabilityOverdueInfoUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectBillSplitMoneyRequestActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone.AddByPhoneViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.billsplitcashoperation.CashOperationViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.viewmodel.MoneyRequestDetailsViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.BillSplitSelectOperationsViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.MoneyRequestSelectContactViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.p766zk.ZkUmtsCardsListViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.p766zk.iframe.ZkIFrameViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.MoneyRequestBottomSheetViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisTransactionViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.AddBudgetViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.BudgetHistoryViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.BudgetingViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.EditBudgetViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.viewmodel.CashFlowViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.faq.viewmodel.FAQViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.CalendarDayTransactionsViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.FinancialCalendarViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.referals.viewmodel.ReferalsViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.savinggoal.viewmodel.SavingGoalViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.securitycontacts.viewmodel.ContactsActivityViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesProvidersViewModel;
import p341ge.bog.mobilebank.cleanarch.productdescription.presentation.viewmodel.ProductDescriptionViewModel;
import p341ge.bog.mobilebank.cleanarch.productdetails.presentation.viewmodel.BogProductsFragmentViewModel;
import p341ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.viewmodel.ManageMccViewModel;
import p341ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity;
import p341ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerViewModel;
import p341ge.bog.mobilebank.cleanarch.settings.presentation.EditProfileViewModel$ViewModel;
import p341ge.bog.mobilebank.consumerloanapplication.domain.lookup.model.Country;
import p341ge.bog.mobilebank.consumerloanapplication.domain.prepareapplication.model.ApplicationDetails;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.activity.AddIncomeActivity;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClientIncomesActivity;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.C22632a;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.C22633b;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.ClientIncomesInitialData;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.OrganizationUiModel;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.result.C22698b;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.result.C22700d;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.IncomeTypeViewModel$ViewModel;
import p341ge.bog.mobilebank.ddsto.presentation.ddform.C22737a;
import p341ge.bog.mobilebank.ddsto.presentation.ddform.C22738b;
import p341ge.bog.mobilebank.ddsto.presentation.ddform.DDFormActivity;
import p341ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroFragment;
import p341ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroViewModel$ViewModel;
import p341ge.bog.mobilebank.depositapplication.data.DepositRepositoryImpl;
import p341ge.bog.mobilebank.depositapplication.presentation.application.viewmodel.DepositApplicationViewModel$ViewModel;
import p341ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultActivity;
import p341ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultViewModel$ViewModel;
import p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferModel;
import p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferViewModel$ViewModel;
import p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepFragment;
import p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment;
import p341ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorRecommendationViewModel$ViewModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorViewModel$ViewModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.AccumulateOnPaymentModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.AccumulateOnSpecificDateModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.DepositSubmissionNavData;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.viewmodel.DepositTypesViewModel$ViewModel;
import p341ge.bog.mobilebank.deposits.presentation.actionsheet.C23023l;
import p341ge.bog.mobilebank.deposits.presentation.actionsheet.SavingGoalChooserActionSheet;
import p341ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity;
import p341ge.bog.mobilebank.deposits.presentation.activity.C23163j;
import p341ge.bog.mobilebank.deposits.presentation.activity.C23175v;
import p341ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.DepositProlongationActivity;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragment;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragmentArgs;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.fragment.result.DepositProlongationResultFragment;
import p341ge.bog.mobilebank.eventbus.EventBusWrapper;
import p341ge.bog.mobilebank.galtandtaggart.data.GTRepositoryImpl;
import p341ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeResultViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTTransferAccountsViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.landing.C23494d;
import p341ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.landing.GTBalanceViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput.GTOnboardingMailInputViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailvalidate.GTOnboardingMailValidateViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.result.IdentomatResultActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.result.IdentomatResultViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.C23583b;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.IdentomatTypeSelectorViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.intro.GTOnboardingIntroActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.intro.GTOnboardingIntroViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.kyc.KycRequiredViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.reviewdata.GTOnboardingReviewDataViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.termsandconditions.TermsAndConditionsActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.termsandconditions.TermsAndConditionsViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.shared.GTPortfolioViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.C23824d;
import p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeResultViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeReviewActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.C23939a;
import p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.TransactionHistoryViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.GTTransactionDetailActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.GTTransactionDetailViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.C23966b;
import p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.TransactionHistoryDownloadViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.changename.GTChangeWatchListNameViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.create.GTCreateWatchListViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchListDetailsViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchlistDetailsActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.edit.GTEditWatchListViewModel$ViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.C24019b;
import p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.GTWatchListViewModel$ViewModel;
import p341ge.bog.mobilebank.gamification.presentation.activity.GamificationActivity;
import p341ge.bog.mobilebank.giftcards.presentation.C24054a;
import p341ge.bog.mobilebank.giftcards.presentation.DiscoveryFragmentContainerViewModel$ViewModel;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow;
import p341ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountFragment;
import p341ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel;
import p341ge.bog.mobilebank.giftcards.presentation.chooseanimation.C24141b;
import p341ge.bog.mobilebank.giftcards.presentation.chooseanimation.C24142c;
import p341ge.bog.mobilebank.giftcards.presentation.chooseanimation.GiftCardsChooseAnimationFragment;
import p341ge.bog.mobilebank.giftcards.presentation.details.C24192b;
import p341ge.bog.mobilebank.giftcards.presentation.details.C24193c;
import p341ge.bog.mobilebank.giftcards.presentation.details.GiftCardDetailsFragment;
import p341ge.bog.mobilebank.giftcards.presentation.filter.C24225a;
import p341ge.bog.mobilebank.giftcards.presentation.filter.C24227c;
import p341ge.bog.mobilebank.giftcards.presentation.filter.GiftCardsFilterFragment;
import p341ge.bog.mobilebank.giftcards.presentation.filtered.C24253c;
import p341ge.bog.mobilebank.giftcards.presentation.filtered.C24262e;
import p341ge.bog.mobilebank.giftcards.presentation.filtered.C24263f;
import p341ge.bog.mobilebank.giftcards.presentation.filtered.GiftCardsFilteredOffersFragment;
import p341ge.bog.mobilebank.giftcards.presentation.home.GiftCardsViewModel$ViewModel;
import p341ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationFragment;
import p341ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationViewModel$ViewModel;
import p341ge.bog.mobilebank.giftcards.presentation.offersandapplications.C24314b;
import p341ge.bog.mobilebank.giftcards.presentation.offersandapplications.C24315c;
import p341ge.bog.mobilebank.giftcards.presentation.offersandapplications.OffersAndApplicationsDetailsFragment;
import p341ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseFragment;
import p341ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseViewModel$ViewModel;
import p341ge.bog.mobilebank.giftcards.presentation.success.GiftCardsSuccessFragment;
import p341ge.bog.mobilebank.giftcards.presentation.success.GiftCardsSuccessViewModel$ViewModel;
import p341ge.bog.mobilebank.giftcards.presentation.tersmsDescription.C24398d;
import p341ge.bog.mobilebank.giftcards.presentation.tersmsDescription.C24399e;
import p341ge.bog.mobilebank.giftcards.presentation.tersmsDescription.TermsAndConditionsFragment;
import p341ge.bog.mobilebank.googlepay.presentation.actionsheet.C24430c;
import p341ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet;
import p341ge.bog.mobilebank.googlepay.presentation.activity.GooglePayActivity;
import p341ge.bog.mobilebank.googlepay.presentation.viewmodel.GooglePayDialogViewModel$ViewModel;
import p341ge.bog.mobilebank.hubmenu.presentation.actionsheet.TransfersActionSheetViewModel$ViewModel;
import p341ge.bog.mobilebank.hubmenu.presentation.viewmodel.HubViewModel$ViewModel;
import p341ge.bog.mobilebank.injection.module.AppModule;
import p341ge.bog.mobilebank.injection.module.AppModule_ProvideAppFactory;
import p341ge.bog.mobilebank.injection.module.AppModule_ProvideGsonFactory;
import p341ge.bog.mobilebank.injection.module.BankApiManagerModule;
import p341ge.bog.mobilebank.injection.module.BankApiManagerModule_ProvideBankApiManagerFactory;
import p341ge.bog.mobilebank.injection.module.EventBusModule;
import p341ge.bog.mobilebank.injection.module.EventBusModule_ProvideEventBusFactory;
import p341ge.bog.mobilebank.injection.module.EventBusModule_ProvideEventBusWrapperFactory;
import p341ge.bog.mobilebank.injection.module.PreferencesApiManagerModule;
import p341ge.bog.mobilebank.injection.module.PreferencesApiManagerModule_ProvidePreferencesApiManagerFactory;
import p341ge.bog.mobilebank.injection.module.RetrofitApiModule;
import p341ge.bog.mobilebank.injection.module.RetrofitApiModule_ProvideRetrofitApiFactory;
import p341ge.bog.mobilebank.injection.module.RetrofitApiModule_ProvideRetrofitServiceFactory;
import p341ge.bog.mobilebank.injection.module.RetrofitGoogleApiModule;
import p341ge.bog.mobilebank.injection.module.RetrofitGoogleApiModule_ProvideRetrofitGoogleApiFactory;
import p341ge.bog.mobilebank.injection.module.RetrofitGoogleApiModule_ProvideRetrofitGoogleClientFactory;
import p341ge.bog.mobilebank.injection.module.SharedPreferencesModule;
import p341ge.bog.mobilebank.injection.module.SharedPreferencesModule_ProvideSharedPreferencesFactory;
import p341ge.bog.mobilebank.insurance.presentation.C24488f;
import p341ge.bog.mobilebank.insurance.presentation.C24508h;
import p341ge.bog.mobilebank.insurance.presentation.InsurancePolicesActivity;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.details.C24524b;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.details.C24529d;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.details.TravelInsuranceDetailsFragment;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.details.model.PolicyDetailsUiModel;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoViewModel$ViewModel;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.TravelInsuranceFilledInfo;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.C24577a;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.C24580b;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.C24595c;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.C24596d;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.InsuranceProvidersFragment;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.success.TravelInsuranceSuccessFragment;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.C24644b;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.C24646d;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.InsuranceSummaryFragment;
import p341ge.bog.mobilebank.junior.presentation.activity.JuniorActivity;
import p341ge.bog.mobilebank.kyc.presentation.identity.IdentityDataInputFragment;
import p341ge.bog.mobilebank.kyc.presentation.identity.IdentityInputViewModel$ViewModel;
import p341ge.bog.mobilebank.kyc.presentation.incomeproperty.C14855c;
import p341ge.bog.mobilebank.kyc.presentation.incomeproperty.IncomeSourceSelectorFragment;
import p341ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorActionSheet;
import p341ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorViewModel$ViewModel;
import p341ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputFragment;
import p341ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputViewModel$ViewModel;
import p341ge.bog.mobilebank.kyc.presentation.selectcity.CitySelectorActionSheet;
import p341ge.bog.mobilebank.kyc.presentation.selectcountry.CountrySelectorActionSheet;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesViewModel$ViewModel;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserActivity;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOfferDetailedActivity;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersByCategoryActivity;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersFilterActivity;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.C15087d;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.C15099h;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.C15100i;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.C15101j;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.C15108l;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.LifestyleOffersProgressActivity;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.OffersProgressDetailActivity;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.shared.model.LifestyleOffersFilterResultData;
import p341ge.bog.mobilebank.linksharing.presentation.P2PLinkActivity;
import p341ge.bog.mobilebank.linksharing.presentation.P2PLinkViewModel$ViewModel;
import p341ge.bog.mobilebank.linksharing.presentation.chooseaccount.ChooseAccountDialogFragment;
import p341ge.bog.mobilebank.linksharing.presentation.chooseaccount.ChooseAccountViewModel$ViewModel;
import p341ge.bog.mobilebank.linksharing.presentation.help.P2PHelpFragment;
import p341ge.bog.mobilebank.linksharing.presentation.link.CardRegistrationProcessor;
import p341ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingFragment;
import p341ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingViewModel$ViewModel;
import p341ge.bog.mobilebank.linksharing.presentation.link.router.P2PLinkRouterFragment;
import p341ge.bog.mobilebank.linksharing.presentation.link.router.P2PLinkRouterViewModel$ViewModel;
import p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.C15252c;
import p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.C15257d;
import p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.C15262f;
import p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationFragment;
import p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.LoanActivationActivity;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.details.ActivationDetailsFragment;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.C32445c;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.accountselector.model.LoanAccountSelectorData;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.recommender.model.RecommenderData;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.details.ActivationDetailsData;
import p341ge.bog.mobilebank.loanactivation.presentation.subtypes.LoanSubtypesActivity;
import p341ge.bog.mobilebank.loanactivation.presentation.subtypes.model.LoanSubtypeData;
import p341ge.bog.mobilebank.loanoffers.presentation.activity.C32567n;
import p341ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity;
import p341ge.bog.mobilebank.loans.presentation.LoansFlow;
import p341ge.bog.mobilebank.loans.presentation.details.C32596d;
import p341ge.bog.mobilebank.loans.presentation.details.C32605f;
import p341ge.bog.mobilebank.loans.presentation.details.C32618h;
import p341ge.bog.mobilebank.loans.presentation.details.LoanDetailsFragment;
import p341ge.bog.mobilebank.loans.presentation.historygraphics.C32643b;
import p341ge.bog.mobilebank.loans.presentation.historygraphics.C32645c;
import p341ge.bog.mobilebank.loans.presentation.historygraphics.C32647e;
import p341ge.bog.mobilebank.loans.presentation.historygraphics.C32658g;
import p341ge.bog.mobilebank.loans.presentation.historygraphics.C32673h;
import p341ge.bog.mobilebank.loans.presentation.historygraphics.LoansHistoryGraphicsFragment;
import p341ge.bog.mobilebank.loans.presentation.historygraphics.model.HistoryScheduleDataModel;
import p341ge.bog.mobilebank.loans.presentation.installmentStatus.LoanInstallmentStatusViewModel$ViewModel;
import p341ge.bog.mobilebank.loans.presentation.loancancelation.actionsheet.InstallmentReversalCancelData;
import p341ge.bog.mobilebank.loans.presentation.pawnshop.C32703b;
import p341ge.bog.mobilebank.loans.presentation.pawnshop.C32708c;
import p341ge.bog.mobilebank.loans.presentation.pawnshop.PawnLoanFragment;
import p341ge.bog.mobilebank.loans.presentation.renameloan.model.RenameLoanData;
import p341ge.bog.mobilebank.loans.presentation.repayment.C32744b;
import p341ge.bog.mobilebank.loans.presentation.repayment.C32745c;
import p341ge.bog.mobilebank.loans.presentation.repayment.RepaymentFragment;
import p341ge.bog.mobilebank.loans.presentation.repaymentsuccess.RepaymentSuccessFragment;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ClosePiggyBankActionSheet;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferActivity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferWizardActivity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusActivity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusViewModel$ViewModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.C33023a;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.C33072h;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.C33084i;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.C33092j;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.CasDetailsFragment;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.C33055d;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankFragment;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PiggyBankSuccessViewModel$ViewModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferViewModel$ViewModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferWizardViewModel$ViewModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PointsExchangeSuccessViewModel$ViewModel;
import p341ge.bog.mobilebank.loyaltyprogress.presentation.activity.LoyaltyProgressActivity;
import p341ge.bog.mobilebank.loyaltyprogress.presentation.viewmodels.LoyaltyProgressViewModel$ViewModel;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.Client_Factory;
import p341ge.bog.mobilebank.model.Client_MembersInjector;
import p341ge.bog.mobilebank.nbo.presentation.activity.C33305c;
import p341ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity;
import p341ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.OpenBankAccountsViewModel$ViewModel;
import p341ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization.AuthorizationViewModel$ViewModel;
import p341ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.C33353a;
import p341ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.C33362b;
import p341ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.C33374e;
import p341ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.SelectBankViewModel$ViewModel;
import p341ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsViewModel$ViewModel;
import p341ge.bog.mobilebank.openbanking.presentation.details.list.ProductListViewModel$ViewModel;
import p341ge.bog.mobilebank.openbanking.presentation.products.C33465b;
import p341ge.bog.mobilebank.openbanking.presentation.products.OpenBanksProductsViewModel$ViewModel;
import p341ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment;
import p341ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel;
import p341ge.bog.mobilebank.p2p.presentation.topup.C33561b;
import p341ge.bog.mobilebank.p2p.presentation.topup.C33568e;
import p341ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpFragment;
import p341ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpViewModel$TopUpState;
import p341ge.bog.mobilebank.p2p.presentation.topup_webview.C33593c;
import p341ge.bog.mobilebank.p2p.presentation.topup_webview.C33599d;
import p341ge.bog.mobilebank.p2p.presentation.topup_webview.P2PTopUpWebViewFragment;
import p341ge.bog.mobilebank.p975ui.activities.AddTemplateActivity;
import p341ge.bog.mobilebank.p975ui.activities.AllTemplateListActivity;
import p341ge.bog.mobilebank.p975ui.activities.C35342a;
import p341ge.bog.mobilebank.p975ui.activities.C35346a2;
import p341ge.bog.mobilebank.p975ui.activities.C35347b;
import p341ge.bog.mobilebank.p975ui.activities.C35351b2;
import p341ge.bog.mobilebank.p975ui.activities.C35373c2;
import p341ge.bog.mobilebank.p975ui.activities.C35378d2;
import p341ge.bog.mobilebank.p975ui.activities.C35383e2;
import p341ge.bog.mobilebank.p975ui.activities.C35384f;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.activities.C35412g2;
import p341ge.bog.mobilebank.p975ui.activities.C35413h;
import p341ge.bog.mobilebank.p975ui.activities.C35417h2;
import p341ge.bog.mobilebank.p975ui.activities.C35422i2;
import p341ge.bog.mobilebank.p975ui.activities.C35423j;
import p341ge.bog.mobilebank.p975ui.activities.C35428k;
import p341ge.bog.mobilebank.p975ui.activities.C35432k2;
import p341ge.bog.mobilebank.p975ui.activities.C35438l2;
import p341ge.bog.mobilebank.p975ui.activities.C35444m2;
import p341ge.bog.mobilebank.p975ui.activities.C35450n2;
import p341ge.bog.mobilebank.p975ui.activities.C35455o1;
import p341ge.bog.mobilebank.p975ui.activities.C35456o2;
import p341ge.bog.mobilebank.p975ui.activities.C35473p1;
import p341ge.bog.mobilebank.p975ui.activities.C35474p2;
import p341ge.bog.mobilebank.p975ui.activities.C35479q1;
import p341ge.bog.mobilebank.p975ui.activities.C35480q2;
import p341ge.bog.mobilebank.p975ui.activities.C35503r1;
import p341ge.bog.mobilebank.p975ui.activities.C35513t1;
import p341ge.bog.mobilebank.p975ui.activities.C35517u1;
import p341ge.bog.mobilebank.p975ui.activities.C35535w0;
import p341ge.bog.mobilebank.p975ui.activities.C35536w1;
import p341ge.bog.mobilebank.p975ui.activities.C35539x0;
import p341ge.bog.mobilebank.p975ui.activities.C35540x1;
import p341ge.bog.mobilebank.p975ui.activities.C35544y1;
import p341ge.bog.mobilebank.p975ui.activities.C35548z1;
import p341ge.bog.mobilebank.p975ui.activities.CarTemplateGroupActivity;
import p341ge.bog.mobilebank.p975ui.activities.CashCoverLoanActivity;
import p341ge.bog.mobilebank.p975ui.activities.ContactUsActivity;
import p341ge.bog.mobilebank.p975ui.activities.DebugSettingsActivity;
import p341ge.bog.mobilebank.p975ui.activities.ExchangeActivity;
import p341ge.bog.mobilebank.p975ui.activities.HouseTemplateGroupActivity;
import p341ge.bog.mobilebank.p975ui.activities.LauncherActivity;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p341ge.bog.mobilebank.p975ui.activities.MainActivityViewModel$ViewModel;
import p341ge.bog.mobilebank.p975ui.activities.ManageAccountsAndCardsActivity;
import p341ge.bog.mobilebank.p975ui.activities.ManagePensionFundsActivity;
import p341ge.bog.mobilebank.p975ui.activities.MapActivity;
import p341ge.bog.mobilebank.p975ui.activities.NotificationDetailsActivity;
import p341ge.bog.mobilebank.p975ui.activities.NotificationListActivity;
import p341ge.bog.mobilebank.p975ui.activities.OperationDetailsActivity;
import p341ge.bog.mobilebank.p975ui.activities.ParametersActivity;
import p341ge.bog.mobilebank.p975ui.activities.PaymentResultListActivity;
import p341ge.bog.mobilebank.p975ui.activities.PaymentsTemplateListActivity;
import p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity;
import p341ge.bog.mobilebank.p975ui.activities.ProviderListActivity;
import p341ge.bog.mobilebank.p975ui.activities.RateChartLandscapeActivity;
import p341ge.bog.mobilebank.p975ui.activities.RenameAccountActivity;
import p341ge.bog.mobilebank.p975ui.activities.STOTypeListActivity;
import p341ge.bog.mobilebank.p975ui.activities.SearchActivity;
import p341ge.bog.mobilebank.p975ui.activities.SearchResultActivity;
import p341ge.bog.mobilebank.p975ui.activities.SmsNotifManagerActivity;
import p341ge.bog.mobilebank.p975ui.activities.StatementActivity;
import p341ge.bog.mobilebank.p975ui.activities.ThreeDSecurityActivity;
import p341ge.bog.mobilebank.p975ui.activities.TransferResultActivity;
import p341ge.bog.mobilebank.p975ui.activities.TransferTemplatesListActivity;
import p341ge.bog.mobilebank.p975ui.activities.TransportPointExchangeActivity;
import p341ge.bog.mobilebank.p975ui.activities.TransportPointExchangeSuccessActivity;
import p341ge.bog.mobilebank.p975ui.activities.bonuses.plus.C35355b;
import p341ge.bog.mobilebank.p975ui.activities.bonuses.plus.PlusActivationActivity;
import p341ge.bog.mobilebank.p975ui.activities.bonuses.plus.invitation.C35362d;
import p341ge.bog.mobilebank.p975ui.activities.bonuses.plus.invitation.C35366h;
import p341ge.bog.mobilebank.p975ui.activities.bonuses.plus.invitation.PlusInvitationResultActivity;
import p341ge.bog.mobilebank.p975ui.activities.bonuses.plus.invitation.PlusProgramInvitationActivity;
import p341ge.bog.mobilebank.p975ui.activities.offers.C35468c;
import p341ge.bog.mobilebank.p975ui.activities.offers.ExpressLoanDetailsActivity;
import p341ge.bog.mobilebank.p975ui.activities.offers.OfferNotAvailableActivity;
import p341ge.bog.mobilebank.p975ui.activities.qrpay.C35495e;
import p341ge.bog.mobilebank.p975ui.activities.qrpay.C35496f;
import p341ge.bog.mobilebank.p975ui.activities.qrpay.C35497g;
import p341ge.bog.mobilebank.p975ui.activities.qrpay.C35498h;
import p341ge.bog.mobilebank.p975ui.activities.qrpay.QrPayActivity;
import p341ge.bog.mobilebank.p975ui.activities.qrpay.QrPayCardSelectActivity;
import p341ge.bog.mobilebank.p975ui.activities.qrpay.QrPayResultActivity;
import p341ge.bog.mobilebank.p975ui.activities.qrpay.QrPayReversalActivity;
import p341ge.bog.mobilebank.p975ui.activities.viewmodel.RootActivityViewModel$ViewModel;
import p341ge.bog.mobilebank.p975ui.fragments.C35606h0;
import p341ge.bog.mobilebank.p975ui.fragments.C35612i1;
import p341ge.bog.mobilebank.p975ui.fragments.C35627j0;
import p341ge.bog.mobilebank.p975ui.fragments.C35637k1;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.p975ui.fragments.C35657p1;
import p341ge.bog.mobilebank.p975ui.fragments.C35669t;
import p341ge.bog.mobilebank.p975ui.fragments.C35674v;
import p341ge.bog.mobilebank.p975ui.views.controllers.C35700a;
import p341ge.bog.mobilebank.p975ui.views.controllers.C35702c;
import p341ge.bog.mobilebank.p975ui.views.widgets.AccountItemView;
import p341ge.bog.mobilebank.p975ui.views.widgets.AccountItemView_MembersInjector;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;
import p341ge.bog.mobilebank.p975ui.widgets.rates.C35831b;
import p341ge.bog.mobilebank.p975ui.widgets.rates.CurrencyRatesWidgetProvider;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.activities.C35860a;
import p341ge.bog.mobilebank.p975ui.wizard.activities.C35861b;
import p341ge.bog.mobilebank.p975ui.wizard.activities.C35867d;
import p341ge.bog.mobilebank.p975ui.wizard.activities.C35878j;
import p341ge.bog.mobilebank.p975ui.wizard.activities.C35879k;
import p341ge.bog.mobilebank.p975ui.wizard.activities.DomesticTransferWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.activities.OldPaymentWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity;
import p341ge.bog.mobilebank.payment.activities.C33606a;
import p341ge.bog.mobilebank.payment.activities.C33607b;
import p341ge.bog.mobilebank.payment.activities.C33614f;
import p341ge.bog.mobilebank.payment.activities.DDTransparentLoaderActivity;
import p341ge.bog.mobilebank.payment.activities.PaymentFormActivity;
import p341ge.bog.mobilebank.payments.presentation.categories.C33635a;
import p341ge.bog.mobilebank.payments.presentation.categories.p974dd.CategoriesDdViewModel;
import p341ge.bog.mobilebank.payments.presentation.categories.payments.CategoriesPaymentsViewModel;
import p341ge.bog.mobilebank.payments.presentation.form.FormActivity;
import p341ge.bog.mobilebank.payments.presentation.formpage.C33724b;
import p341ge.bog.mobilebank.payments.presentation.formpage.C33725c;
import p341ge.bog.mobilebank.payments.presentation.resultpage.C33774b;
import p341ge.bog.mobilebank.payments.presentation.resultpage.C33775c;
import p341ge.bog.mobilebank.payments.presentation.resultpage.PaymentResultActivity;
import p341ge.bog.mobilebank.payments.presentation.resultpage.model.PaymentResultObjectUiModel;
import p341ge.bog.mobilebank.products.data.ProductsPreferenceManagerImpl;
import p341ge.bog.mobilebank.products.data.ProductsRepositoryImpl;
import p341ge.bog.mobilebank.products.data.ProductsService;
import p341ge.bog.mobilebank.products.data.mapper.AccountsApiModelMapper;
import p341ge.bog.mobilebank.products.data.mapper.BondsWrapperApiModelMapper;
import p341ge.bog.mobilebank.products.data.mapper.CardsAndDetailsApiModelMapper;
import p341ge.bog.mobilebank.products.data.mapper.ChildMBankMapper;
import p341ge.bog.mobilebank.products.data.mapper.ContractApiModelMapper;
import p341ge.bog.mobilebank.products.data.mapper.CreditCardsLegacyWrapperMapper;
import p341ge.bog.mobilebank.products.data.mapper.GTMapper;
import p341ge.bog.mobilebank.products.data.mapper.LiabilityInfoMapper;
import p341ge.bog.mobilebank.products.data.mapper.LoansWrapperLegacyModelMapper;
import p341ge.bog.mobilebank.products.data.mapper.PensionApiModelMapper;
import p341ge.bog.mobilebank.products.data.mapper.ProductTypeApiModelMapper;
import p341ge.bog.mobilebank.products.data.mapper.StatementsMapper;
import p341ge.bog.mobilebank.products.domain.model.BillInfo;
import p341ge.bog.mobilebank.products.domain.model.CheckChildMBankActiveModel;
import p341ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductViewModel$ViewModel;
import p341ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity;
import p341ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceStatusesActivity;
import p341ge.bog.mobilebank.products.presentation.cardinsurance.viwmodel.CardInsuranceStatusesViewModel$ViewModel;
import p341ge.bog.mobilebank.products.presentation.details.creditcard.C33934b;
import p341ge.bog.mobilebank.products.presentation.details.creditcard.C33969f;
import p341ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity;
import p341ge.bog.mobilebank.products.presentation.details.debitcard.C34066b;
import p341ge.bog.mobilebank.products.presentation.details.debitcard.C34119g;
import p341ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity;
import p341ge.bog.mobilebank.products.presentation.details.list.C34217d;
import p341ge.bog.mobilebank.products.presentation.details.list.LoanListActivity;
import p341ge.bog.mobilebank.products.presentation.details.list.ProductListActivity;
import p341ge.bog.mobilebank.products.presentation.details.pension.PensionDetailsActivity;
import p341ge.bog.mobilebank.products.presentation.details.pension.PensionDetailsViewModel$ViewModel;
import p341ge.bog.mobilebank.products.presentation.managecardsandaccounts.viewmodel.ManageCardsViewModel$ViewModel;
import p341ge.bog.mobilebank.products.presentation.products.C34332b;
import p341ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.C34399b;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.C34402d;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.cardchooser.model.CardChooserData;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.resultpage.QrResultPageActivity;
import p341ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesViewModel$ViewModel;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.GoogleApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.rest.model.RetrofitGoogleClient;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.serverstatus.OutOfServiceActivity;
import p341ge.bog.mobilebank.serverstatus.OutOfServiceViewModel;
import p341ge.bog.mobilebank.services.C34566c;
import p341ge.bog.mobilebank.services.C34567d;
import p341ge.bog.mobilebank.services.datagathering.C34569a;
import p341ge.bog.mobilebank.services.datagathering.InstalledAppsDataReportWorker;
import p341ge.bog.mobilebank.services.datagathering.LocationWifiDataReportWorker;
import p341ge.bog.mobilebank.settings.SettingsViewModel$ViewModel;
import p341ge.bog.mobilebank.settings.presentation.activity.ChangeLanguageActivity;
import p341ge.bog.mobilebank.settings.presentation.activity.SettingsActivity;
import p341ge.bog.mobilebank.settings.presentation.viewmodel.ChangeLanguageViewModel$ViewModel;
import p341ge.bog.mobilebank.settings.presentation.viewmodel.DarkModeSwitchViewModel$ViewModel;
import p341ge.bog.mobilebank.shared.OtherTransferTypeState;
import p341ge.bog.mobilebank.shared.accountselector.presentation.DomesticAccountSelectorActionSheetViewModel$ViewModel;
import p341ge.bog.mobilebank.shared.dictionary.presentation.viewmodel.ForcedDictionaryUpdateViewModel$ViewModel;
import p341ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow;
import p341ge.bog.mobilebank.shared.presentation.helper.KeyboardVisibility;
import p341ge.bog.mobilebank.shared2.environment.C34672a;
import p341ge.bog.mobilebank.shared2.environment.C34674c;
import p341ge.bog.mobilebank.shared2.environment.C34675d;
import p341ge.bog.mobilebank.shared2.environment.C34676e;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import p341ge.bog.mobilebank.shared2.session.C34698i;
import p341ge.bog.mobilebank.shared2.session.SessionManager;
import p341ge.bog.mobilebank.sso.presentation.C34709c;
import p341ge.bog.mobilebank.sso.presentation.LoginViewModel;
import p341ge.bog.mobilebank.sso.presentation.SsoWindowActivity;
import p341ge.bog.mobilebank.statements.presentation.landing.StatementsViewModel$ViewModel;
import p341ge.bog.mobilebank.statements.presentation.statementsfilter.C34750a;
import p341ge.bog.mobilebank.statements.presentation.statementsfilter.C34761c;
import p341ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterActivity;
import p341ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterViewModel$ViewModel;
import p341ge.bog.mobilebank.stories.presentation.activity.C34806h;
import p341ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity;
import p341ge.bog.mobilebank.stories.presentation.fragment.C34834d;
import p341ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment;
import p341ge.bog.mobilebank.stories.presentation.model.StoryGroupUiModel;
import p341ge.bog.mobilebank.sync.C34843d;
import p341ge.bog.mobilebank.sync.CommonDataSyncService;
import p341ge.bog.mobilebank.transfers.SelectContactAccountViewModel;
import p341ge.bog.mobilebank.transfers.activities.C34881a0;
import p341ge.bog.mobilebank.transfers.activities.C34884b0;
import p341ge.bog.mobilebank.transfers.activities.C34903d0;
import p341ge.bog.mobilebank.transfers.activities.C34906e0;
import p341ge.bog.mobilebank.transfers.activities.C34914j;
import p341ge.bog.mobilebank.transfers.activities.C34917m;
import p341ge.bog.mobilebank.transfers.activities.C34926v;
import p341ge.bog.mobilebank.transfers.activities.C34928x;
import p341ge.bog.mobilebank.transfers.activities.OtherSTODetailsActivity;
import p341ge.bog.mobilebank.transfers.activities.OtherTemplateDetailsActivity;
import p341ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity;
import p341ge.bog.mobilebank.transfers.activities.OwnSTODetailsActivity;
import p341ge.bog.mobilebank.transfers.activities.OwnTemplateDetailsActivity;
import p341ge.bog.mobilebank.transfers.activities.OwnTransferDetailsActivity;
import p341ge.bog.mobilebank.transfers.activities.TransferLoaderActivity;
import p341ge.bog.mobilebank.transfers.other_transfer_type.C34948a;
import p341ge.bog.mobilebank.transfers.other_transfer_type.C34968f;
import p341ge.bog.mobilebank.transfers.other_transfer_type.OtherTransferTypeListActivity;
import p341ge.bog.mobilebank.transportcard.domain.interactor.PurchasePassUseCase;
import p341ge.bog.mobilebank.transportcard.presentation.choosecard.C34993a;
import p341ge.bog.mobilebank.transportcard.presentation.choosecard.C34994b;
import p341ge.bog.mobilebank.transportcard.presentation.choosecard.ChooseCardDialogFragment;
import p341ge.bog.mobilebank.transportcard.presentation.passmigrate.C35025d;
import p341ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateActionSheet;
import p341ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateViewModel$ViewModel;
import p341ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.C35073c;
import p341ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment;
import p341ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsViewModel$ViewModel;
import p341ge.bog.mobilebank.transportcard.presentation.selecttransportcardpassdevices.SelectTransportCardPassDevicesDialogFragment;
import p341ge.bog.mobilebank.transportcard.presentation.selecttransportcardpassdevices.SelectTransportCardPassDevicesViewModel$ViewModel;
import p341ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.C35104b;
import p341ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.C35105c;
import p341ge.bog.mobilebank.transportcard.presentation.selecttransportcardpasstype.SelectTransportCardPassTypeDialogFragment;
import p341ge.bog.mobilebank.transportcard.presentation.transportcardinfo.C35134c;
import p341ge.bog.mobilebank.transportcard.presentation.transportcardinfo.C35135d;
import p341ge.bog.mobilebank.transportcard.presentation.transportcardinfo.TransportCardInfoFragment;
import p341ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardFragment;
import p341ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardViewModel$ViewModel;
import p341ge.bog.mobilebank.wishcampaign.presentation.viewmodel.WishCampaignViewModel$ViewModel;
import p354am.C10082i;
import p355an.C10083a;
import p355an.C10084b;
import p355an.C10085c;
import p355an.C10086d;
import p355an.C10087e;
import p355an.C10088f;
import p355an.C10089g;
import p355an.C10090h;
import p355an.C10091i;
import p355an.C10092j;
import p355an.C10093k;
import p355an.C10094l;
import p355an.C10095m;
import p355an.C10096n;
import p355an.C10097o;
import p355an.C10098p;
import p355an.C10099q;
import p355an.C10101r;
import p355an.C10102s;
import p355an.C10103t;
import p355an.C10104u;
import p367bl.C10332a;
import p370bo.C10343a;
import p371bp.C10349c;
import p371bp.C10362e;
import p371bp.C10371l;
import p380ck.C10463g;
import p381cl.C10494k;
import p381cl.C10504t;
import p382cm.C10507c;
import p382cm.C10511g;
import p384co.C10520a;
import p386cp.C12019a;
import p396dl.C12322h;
import p399do.C12372p;
import p40.C27234e;
import p400dp.C12418m;
import p409ek.C12479b;
import p409ek.C12480c;
import p412en.C12496a4;
import p412en.C12515e2;
import p412en.C12531g0;
import p412en.C12544i2;
import p412en.C12550j3;
import p412en.C12577k;
import p412en.C12582l;
import p412en.C12597o;
import p412en.C12602p;
import p412en.C12605p2;
import p412en.C12612q1;
import p412en.C12613q2;
import p412en.C12616r0;
import p412en.C12676w1;
import p412en.C12684x1;
import p412en.C12687y;
import p423fk.C12922a;
import p423fk.C12923b;
import p424fl.C12924a;
import p425fm.C12925a;
import p427fo.C12937b;
import p428fp.C12953h;
import p437gk.C15289b;
import p438gl.C15301k;
import p439gm.C15309d0;
import p440gn.C15362a;
import p441go.C15373a;
import p441go.C15374b;
import p441go.C15375c;
import p441go.C15376d;
import p441go.C15379e;
import p441go.C15381f;
import p441go.C15382g;
import p441go.C15383h;
import p441go.C15384i;
import p441go.C15385j;
import p441go.C15386k;
import p441go.C15389l;
import p441go.C15390m;
import p441go.C15391n;
import p441go.C15392o;
import p441go.C15393p;
import p441go.C15394q;
import p442gp.C15418d;
import p442gp.C15434f;
import p442gp.C15439k;
import p454hn.C15535a;
import p465ik.C15674l;
import p465ik.C15687m;
import p465ik.C15690o;
import p466il.C15699a;
import p467im.C15700a;
import p468in.C15704c;
import p470ip.C15732a;
import p479jk.C16205a;
import p479jk.C16206b;
import p479jk.C16207c;
import p479jk.C16209d;
import p483jo.C16301a;
import p484jp.C16322n;
import p494kl.C16473f;
import p495km.C16480a;
import p495km.C16481b;
import p496kn.C16483b;
import p507lk.C16584b;
import p508ll.C16585a;
import p509lm.C16586a;
import p51.C37900b;
import p51.C37902c;
import p51.C37903d;
import p51.C37906g;
import p51.C37909h;
import p510ln.C16587a;
import p510ln.C16588b;
import p510ln.C16589c;
import p510ln.C16595i;
import p510ln.C16600j;
import p510ln.C16601k;
import p521mk.C16718a;
import p521mk.C16719b;
import p522ml.C16720a;
import p522ml.C16721b;
import p522ml.C16722c;
import p523mm.C16723a;
import p523mm.C16724a0;
import p523mm.C16726b;
import p523mm.C16728b1;
import p523mm.C16730c;
import p523mm.C16731c0;
import p523mm.C16734c1;
import p523mm.C16735d;
import p523mm.C16736d0;
import p523mm.C16737d1;
import p523mm.C16738e;
import p523mm.C16739e0;
import p523mm.C16740f;
import p523mm.C16742g;
import p523mm.C16744h;
import p523mm.C16747i0;
import p523mm.C16752j0;
import p523mm.C16753k;
import p523mm.C16755k0;
import p523mm.C16758m;
import p523mm.C16761n;
import p523mm.C16765p;
import p523mm.C16767q;
import p523mm.C16769r;
import p523mm.C16771s;
import p523mm.C16775u;
import p523mm.C16777u0;
import p523mm.C16789v;
import p523mm.C16790v0;
import p523mm.C16791w;
import p523mm.C16792w0;
import p523mm.C16793x;
import p523mm.C16795y;
import p523mm.C16796y0;
import p523mm.C16798z;
import p523mm.C16799z0;
import p525mo.C16815b;
import p525mo.C16829d;
import p525mo.C16836i;
import p530nf.C16918a;
import p530nf.C16920c;
import p535nk.C17018a;
import p535nk.C17019b;
import p535nk.C17020c;
import p535nk.C17022e;
import p535nk.C17024f;
import p535nk.C17025g;
import p535nk.C17028j;
import p535nk.C17031k;
import p535nk.C17032l;
import p535nk.C17035o;
import p535nk.C17038p;
import p535nk.C17039q;
import p535nk.C17040r;
import p535nk.C17041s;
import p535nk.C17042t;
import p535nk.C17043u;
import p535nk.C17044v;
import p535nk.C17045w;
import p535nk.C17046x;
import p535nk.C17047y;
import p538nn.C17110a;
import p540np.C17146k;
import p550ol.C17264b;
import p552on.C17271d;
import p554op.C17329t;
import p564pl.C17385a;
import p578ql.C17527b;
import p578ql.C17529c;
import p578ql.C17531e;
import p578ql.C17533f;
import p578ql.C17534g;
import p578ql.C17535h;
import p578ql.C17536i;
import p580qn.C17554f;
import p581qo.C17572a;
import p582qp.C17575a;
import p586rf.C17605a;
import p586rf.C17606b;
import p586rf.C17607c;
import p586rf.C17608d;
import p586rf.C17609e;
import p586rf.C17610f;
import p586rf.C17611g;
import p591rk.C17635o;
import p592rl.C17640e;
import p593rm.C17654e0;
import p593rm.C17656g;
import p593rm.C17664o;
import p593rm.C17670u;
import p60.C27238a;
import p600sf.C17766a;
import p600sf.C17770b;
import p605sk.C17831k;
import p607sm.C17884y;
import p61.C37910a;
import p61.C37915f;
import p61.C37918g;
import p61.C37922k;
import p614tf.C17956a;
import p614tf.C17957b;
import p614tf.C17958c;
import p619tk.C17981c;
import p634um.C18188b0;
import p634um.C18220m;
import p634um.C18240p;
import p635un.C18262a;
import p640vf.C18327b;
import p640vf.C18328c;
import p640vf.C18329d;
import p640vf.C18330e;
import p640vf.C18331f;
import p645vk.C18406g;
import p645vk.C18410k;
import p646vl.C18418h;
import p647vm.C18421c;
import p647vm.C18438e;
import p648vn.C18443d;
import p649vo.C18465f;
import p649vo.C18480h;
import p649vo.C18484l;
import p653wf.C18569a;
import p658wk.C18610i;
import p661wn.C18643f;
import p662wo.C18648c;
import p672xk.C18777a;
import p674xm.C18781a;
import p686yk.C18932e;
import p686yk.C18940m;
import p689yn.C18961d;
import p690yo.C18979a;
import p700zk.C19061w;
import p703zn.C19085e;
import p704zo.C19108c;
import p704zo.C19127e;
import p704zo.C19138n;
import p705aq.C19268e;
import p706ar.C19269a;
import p706ar.C19270b;
import p708at.C19276a;
import p711aw.C19279a;
import p712ax.C19280a;
import p713ay.C19284d;
import p715bq.C19399a;
import p718bt.C19404c;
import p718bt.C19410e;
import p719bu.C19411a;
import p720bv.C19412a;
import p721bw.C19413a;
import p722bx.C19414a;
import p723bz.C19415a;
import p723bz.C19416b;
import p724cq.C19786a;
import p724cq.C19787b;
import p725cr.C19788a;
import p725cr.C19790c;
import p726cs.C19792a;
import p727ct.C19793a;
import p728cu.C19795a;
import p728cu.C19796b;
import p729cv.C19797a;
import p729cv.C19799c;
import p729cv.C19801d;
import p729cv.C19803e;
import p729cv.C19804f;
import p731cx.C19806a;
import p731cx.C19807b;
import p732cy.C19810b;
import p733cz.C19811a;
import p734dq.C20048a;
import p735dr.C20049a;
import p735dr.C20050b;
import p736ds.C20051a;
import p736ds.C20052b;
import p737dt.C20072b;
import p737dt.C20087p;
import p737dt.C20100q;
import p740dw.C20106a;
import p741dx.C20107a;
import p742dy.C20108a;
import p742dy.C20109b;
import p744eq.C20286a;
import p744eq.C20287b;
import p746es.C20289a;
import p747et.C20290a;
import p748eu.C20291a;
import p748eu.C20292b;
import p748eu.C20293c;
import p748eu.C20294d;
import p748eu.C20295e;
import p749ev.C20296a;
import p749ev.C20297b;
import p750ew.C20298a;
import p750ew.C20299b;
import p750ew.C20300c;
import p750ew.C20301d;
import p750ew.C20302e;
import p751ex.C20303a;
import p752ey.C20304a;
import p753ez.C20307b;
import p755fr.C20546a;
import p757ft.C20550a;
import p757ft.C20553c;
import p761fx.C20576a;
import p762fy.C20577a;
import p763fz.C20579a;
import p763fz.C20580b;
import p763fz.C20581c;
import p763fz.C20582d;
import p763fz.C20583e;
import p763fz.C20584f;
import p763fz.C20585g;
import p763fz.C20586h;
import p763fz.C20587i;
import p768gq.C24774a;
import p770gs.C24777a;
import p772gu.C24779a;
import p773gv.C24784c;
import p773gv.C24788d;
import p773gv.C24789d0;
import p773gv.C24794e;
import p773gv.C24800g;
import p773gv.C24803h;
import p773gv.C24807j;
import p773gv.C24809j0;
import p773gv.C24815k;
import p773gv.C24817l;
import p773gv.C24818l0;
import p773gv.C24819m;
import p773gv.C24820m0;
import p773gv.C24821n;
import p773gv.C24822o;
import p773gv.C24823p;
import p773gv.C24824q;
import p773gv.C24825r;
import p773gv.C24826s;
import p773gv.C24827t;
import p773gv.C24828u;
import p773gv.C24829v;
import p773gv.C24830w;
import p773gv.C24831x;
import p773gv.C24833z;
import p774gw.C24835a;
import p775gx.C24836a;
import p776gy.C24837a;
import p778hq.C25050b;
import p780hs.C25054b;
import p781ht.C25057a;
import p781ht.C25059b;
import p781ht.C25062c;
import p781ht.C25063d;
import p781ht.C25064e;
import p784hw.C25072a;
import p784hw.C25074c;
import p785hx.C25077a;
import p785hx.C25078b;
import p786hy.C25079a;
import p787hz.C25080a;
import p788iq.C25247b;
import p789ir.C25252d;
import p791iu.C25258b;
import p792iv.C25260a;
import p796iz.C25274h;
import p796iz.C25282p;
import p80.C27242a;
import p800jt.C25484a;
import p801ju.C25485a;
import p801ju.C25486b;
import p801ju.C25487c;
import p801ju.C25488d;
import p801ju.C25489e;
import p801ju.C25490f;
import p801ju.C25491g;
import p801ju.C25492h;
import p802jv.C25493a;
import p802jv.C25494b;
import p802jv.C25496d;
import p802jv.C25498e;
import p802jv.C25500g;
import p802jv.C25503h;
import p802jv.C25505j;
import p802jv.C25507k;
import p802jv.C25508l;
import p803jw.C25509a;
import p803jw.C25510b;
import p805jy.C25515c;
import p807kq.C25748b;
import p807kq.C25750c;
import p807kq.C25751d;
import p808kr.C25752a;
import p808kr.C25756e;
import p808kr.C25760f;
import p808kr.C25761g;
import p808kr.C25762h;
import p809ks.C25763a;
import p810kt.C25764a;
import p810kt.C25766b;
import p810kt.C25767c;
import p810kt.C25768d;
import p811ku.C25771c;
import p811ku.C25774d;
import p811ku.C25775e;
import p811ku.C25776f;
import p811ku.C25777g;
import p814kx.C25784a;
import p815ky.C25793h;
import p816kz.C25794a;
import p816kz.C25795b;
import p818lr.C26059a;
import p819ls.C26061a;
import p819ls.C26063b;
import p819ls.C26064c;
import p819ls.C26065d;
import p820lt.C26071f;
import p820lt.C26082n;
import p821lu.C26089b;
import p821lu.C26091c;
import p821lu.C26092d;
import p822lv.C26093a;
import p823lw.C26094a;
import p824lx.C26095a;
import p825ly.C26096a;
import p826lz.C26098b;
import p826lz.C26114h;
import p827mq.C26256a;
import p829ms.C26270d;
import p829ms.C26277g;
import p829ms.C26282i;
import p830mt.C26291g;
import p833mw.C26309a;
import p835my.C26312b;
import p836mz.C26325k;
import p836mz.C26326l;
import p836mz.C26332r;
import p838nr.C26573a;
import p839ns.C26584k;
import p839ns.C26591q;
import p840nt.C26606a;
import p841nu.C26607a;
import p842nv.C26608a;
import p842nv.C26609b;
import p842nv.C26611d;
import p842nv.C26613e;
import p842nv.C26615g;
import p842nv.C26617h;
import p843nw.C26618a;
import p843nw.C26619b;
import p843nw.C26620c;
import p843nw.C26621d;
import p843nw.C26622e;
import p843nw.C26623f;
import p843nw.C26625h;
import p843nw.C26628j;
import p843nw.C26629k;
import p843nw.C26630l;
import p843nw.C26631m;
import p843nw.C26633o;
import p843nw.C26635p;
import p843nw.C26636q;
import p844nx.C26637a;
import p844nx.C26638b;
import p846nz.C26650i;
import p846nz.C26655n;
import p848or.C27061c;
import p849os.C27074a;
import p849os.C27077d;
import p850ot.C27079b;
import p851ou.C27082a;
import p851ou.C27084b;
import p853ow.C27092a;
import p855oy.C27094a;
import p857pq.C27603a;
import p857pq.C27604b;
import p858pr.C27612f;
import p859ps.C27618a;
import p860pt.C27620a;
import p861pu.C27621a;
import p862pv.C27622a;
import p864px.C27639a;
import p865py.C27640a;
import p867qq.C27854c;
import p869qs.C27861a;
import p870qt.C27863a;
import p872qv.C27866a;
import p873qw.C27867a;
import p873qw.C27868b;
import p874qx.C27869a;
import p875qy.C27872c;
import p878rr.C28063a;
import p878rr.C28064b;
import p879rs.C28074i;
import p880rt.C28087d;
import p881ru.C28092a;
import p881ru.C28093b;
import p881ru.C28094c;
import p881ru.C28095d;
import p881ru.C28096e;
import p881ru.C28097f;
import p881ru.C28098g;
import p881ru.C28099h;
import p881ru.C28100i;
import p881ru.C28101j;
import p881ru.C28103l;
import p881ru.C28105m;
import p881ru.C28106n;
import p881ru.C28107o;
import p882rv.C28108a;
import p883rw.C28109a;
import p883rw.C28110b;
import p883rw.C28111c;
import p885ry.C28113a;
import p886rz.C28114a;
import p887sq.C28253a;
import p889ss.C28259a;
import p890st.C28260a;
import p892sv.C28277b;
import p894sx.C28289j;
import p895sy.C28290a;
import p895sy.C28291b;
import p896sz.C28292a;
import p897tp.C28474a;
import p897tp.C28477d;
import p897tp.C28482f;
import p898tq.C28484a;
import p898tq.C28485b;
import p899tr.C28500o;
import p900ts.C28502b;
import p901tt.C28506b;
import p902tu.C28510a;
import p902tu.C28512c;
import p902tu.C28514d;
import p902tu.C28515e;
import p902tu.C28516f;
import p904tw.C28520a;
import p905tx.C28521a;
import p907tz.C28532a;
import p909uq.C28925a;
import p910ur.C28928c;
import p911us.C28932a;
import p912ut.C28934a;
import p914uv.C28945a;
import p915uw.C28946a;
import p915uw.C28947b;
import p915uw.C28948c;
import p915uw.C28949d;
import p916ux.C28950a;
import p918uz.C28955b;
import p919vp.C29130a;
import p920vq.C29133c;
import p920vq.C29154f;
import p921vr.C29155a;
import p922vs.C29157b;
import p923vt.C29161b;
import p924vu.C29164a;
import p925vv.C29167c;
import p925vv.C29171e;
import p925vv.C29174f;
import p925vv.C29176h;
import p925vv.C29179j;
import p925vv.C29180k;
import p927vx.C29182a;
import p928vy.C29186d;
import p929vz.C29188b;
import p930wp.C29557b;
import p930wp.C29560c;
import p931wq.C29561a;
import p931wq.C29563c;
import p932wr.C29567b;
import p932wr.C29568c;
import p933ws.C29569a;
import p934wt.C29571b;
import p935wu.C29574a;
import p937ww.C29583a;
import p940wz.C29599d;
import p942xq.C29823a;
import p942xq.C29824b;
import p943xr.C29825a;
import p943xr.C29835h;
import p944xs.C29851g;
import p945xt.C29858a;
import p947xv.C29860a;
import p948xw.C29861a;
import p949xx.C29869h;
import p951xz.C29877a;
import p951xz.C29878b;
import p951xz.C29879c;
import p951xz.C29881d;
import p951xz.C29882e;
import p952yp.C30105a;
import p952yp.C30106b;
import p953yq.C30107a;
import p953yq.C30108b;
import p954yr.C30111a;
import p955ys.C30112a;
import p956yt.C30113a;
import p957yu.C30114a;
import p958yv.C30116b;
import p959yw.C30120b;
import p960yx.C30122a;
import p961yy.C30123a;
import p964zq.C30393a;
import p965zr.C30396c;
import p966zs.C30401b;
import p967zt.C30405b;
import p968zu.C30408a;
import p968zu.C30409b;
import p968zu.C30410c;
import p971zx.C30413a;
import p972zy.C30415b;
import p973zz.C30416a;
import p973zz.C30417b;
import pb0.C27493a;
import pc0.C27494a;
import pc0.C27495b;
import pe0.C27519a;
import pf0.C27527g;
import ph0.C27532a;
import ph0.C27533b;
import pl0.C27599a;
import pm0.C27602b;
import pn0.C17431c;
import pn0.C17432d;
import pn0.C17444p;
import pp0.C37939a;
import pt0.C37978a;
import pt0.C37981d;
import pt0.C37983f;
import pt0.C37996r;
import pv0.C38024a;
import px0.C38029d;
import pz0.C38053c;
import pz0.C38057g;
import pz0.C38066p;
import pz0.C38072v;
import q11.C38100a;
import q11.C38102b;
import q11.C38103c;
import q11.C38104d;
import q11.C38105e;
import q11.C38106f;
import q11.C38107g;
import q11.C38108h;
import q11.C38111k;
import q11.C38113l;
import q21.C38115a;
import q30.C27677a;
import q30.C27678b;
import q31.C38117b;
import q31.C38119c;
import q31.C38121e;
import q31.C38126i;
import q31.C38127j;
import q41.C38128a;
import q70.C27685a;
import q71.C38159y;
import q80.C27687a;
import q80.C27689c;
import q80.C27691d;
import q81.C38174g;
import q81.C38181i;
import q91.C38228b;
import qa0.C27695a;
import qa0.C27696b;
import qa0.C27697c;
import qb0.C27772g;
import qd0.C27774a;
import qd0.C27775b;
import qe0.C27782g;
import qg0.C27803j;
import qh0.C27809c;
import qk0.C27843a;
import ql0.C27845a;
import ql0.C27846b;
import ql0.C27849c;
import ql0.C27850d;
import qm0.C27851a;
import qn0.C17556b;
import qn0.C17557c;
import qn0.C17565k;
import qo0.C17573a;
import qo0.C17574b;
import qp0.C38233a;
import qr0.C38240b;
import qu0.C38250b;
import qv0.C38251a;
import qx0.C38266c;
import qy0.C38267a;
import qz0.C38269a;
import r00.C27879b;
import r11.C38277b;
import r20.C27888d;
import r21.C38279a;
import r30.C27908h;
import r41.C38284a;
import r60.C27945a;
import r61.C38288a;
import r61.C38290c;
import r61.C38293d;
import r71.C38305k;
import r81.C38311f;
import r81.C38313h;
import r91.C38318a;
import ra0.C27961g;
import rc0.C27990a;
import re0.C28003a;
import rg0.C28033k;
import rh0.C28034a;
import rh0.C28035b;
import rh0.C28036c;
import rh0.C28037d;
import rh0.C28038e;
import rh0.C28039f;
import rh0.C28040g;
import rh0.C28041h;
import rh0.C28042i;
import rh0.C28043j;
import rk0.C28047a;
import rk0.C28049b;
import rl0.C28052b;
import rm0.C28053a;
import rm0.C28054b;
import rm0.C28055c;
import rm0.C28057e;
import rm0.C28058f;
import rm0.C28059g;
import rm0.C28060h;
import rm0.C28061i;
import rp0.C38324e;
import rq0.C38329a;
import rq0.C38331b;
import rr0.C38333a;
import ru0.C38344a;
import ru0.C38345b;
import ru0.C38347c;
import ru0.C38348d;
import ru0.C38349e;
import rv0.C38364o;
import rx0.C38388c;
import ry0.C38389a;
import ry0.C38390b;
import ry0.C38392d;
import ry0.C38393e;
import ry0.C38394f;
import rz0.C38395a;
import rz0.C38399b;
import s01.C38402a;
import s10.C28122a;
import s11.C38406d;
import s20.C28125c;
import s20.C28138f;
import s21.C38419b;
import s40.C28143b;
import s41.C38426a;
import s50.C28151h;
import s51.C38427a;
import s51.C38439c;
import s51.C38444h;
import s60.C28157f;
import s61.C38454b;
import s70.C28160c;
import s80.C28162a;
import sa0.C28171f;
import sb0.C28187a;
import sc0.C28188a;
import sd0.C28190a;
import se0.C28191a;
import sh0.C28212i;
import sh0.C28226l;
import si0.C28233f;
import sl0.C28248a;
import sr0.C38515a;
import sr0.C38516b;
import sr0.C38518d;
import sr0.C38520e;
import sr0.C38521f;
import sr0.C38522g;
import sr0.C38523h;
import sr0.C38525i;
import ss0.C38526a;
import st0.C38531e;
import sv0.C38562a;
import sy0.C38605a;
import sy0.C38606b;
import t00.C28293a;
import t00.C28294b;
import t00.C28295c;
import t11.C38626g;
import t11.C38633n;
import t20.C28302d;
import t21.C38636b;
import t41.C38639a;
import t51.C38660f;
import t51.C38666g0;
import t51.C38686x;
import t60.C28322b;
import t61.C38703a;
import t80.C28324a;
import t80.C28325b;
import t80.C28326c;
import t80.C28327d;
import t80.C28328e;
import t80.C28329f;
import t90.C28331b;
import t90.C28334c;
import t90.C28336d;
import t91.C38737a;
import ta0.C28342f;
import tc0.C28356b;
import td0.C28357a;
import te0.C28365g;
import tf0.C28378g;
import tk0.C28446a;
import tk0.C28447b;
import tk0.C28448c;
import tk0.C28449d;
import tk0.C28450e;
import tk0.C28451f;
import tk0.C28453g;
import tk0.C28454h;
import tk0.C28455i;
import tk0.C28456j;
import tk0.C28458k;
import tk0.C28459l;
import tk0.C28460m;
import tl0.C28461a;
import tl0.C28462b;
import tl0.C28463c;
import tl0.C28464d;
import tl0.C28465e;
import tm0.C28467b;
import tm0.C28469c;
import tm0.C28471e;
import tm0.C28473g;
import tn0.C18046k;
import to0.C18071a;
import tp0.C38777b;
import ts0.C38793a;
import ts0.C38794b;
import tt0.C38795a;
import tw0.C38820i;
import ty0.C38849a;
import ty0.C38850a0;
import ty0.C38851b;
import ty0.C38852b0;
import ty0.C38853c;
import ty0.C38854c0;
import ty0.C38855d;
import ty0.C38856d0;
import ty0.C38857e;
import ty0.C38858e0;
import ty0.C38859f;
import ty0.C38862g0;
import ty0.C38864h;
import ty0.C38868i0;
import ty0.C38870j;
import ty0.C38872j0;
import ty0.C38873k;
import ty0.C38874k0;
import ty0.C38875l;
import ty0.C38876l0;
import ty0.C38877m;
import ty0.C38878m0;
import ty0.C38879n;
import ty0.C38880n0;
import ty0.C38881o;
import ty0.C38882o0;
import ty0.C38883p;
import ty0.C38884p0;
import ty0.C38885q;
import ty0.C38886q0;
import ty0.C38887r;
import ty0.C38888r0;
import ty0.C38890s0;
import ty0.C38891t;
import ty0.C38893t0;
import ty0.C38894u;
import ty0.C38895u0;
import ty0.C38897v0;
import ty0.C38898w;
import ty0.C38900x;
import ty0.C38901y;
import ty0.C38902z;
import tz0.C38903a;
import tz0.C38920c;
import tz0.C38923d0;
import tz0.C38960k;
import tz0.C38977m0;
import u21.C39007a;
import u21.C39008b;
import u50.C28600n;
import u51.C39032a;
import u60.C28602b;
import u90.C28611a;
import u90.C28614c;
import u90.C28617d;
import ub0.C28697a;
import ub0.C28698b;
import uc0.C28700a;
import uc0.C28701b;
import ud0.C28706b;
import uf0.C28774i;
import uh0.C28795a;
import uh0.C28796b;
import uh0.C28797c;
import uj0.C28800a;
import uk0.C28808h;
import uk0.C28873j;
import um0.C28886f;
import um0.C28905h;
import un0.C18263a;
import up0.C39054a;
import up0.C39055b;
import up0.C39056c;
import up0.C39057d;
import up0.C39058e;
import up0.C39059f;
import uq0.C39062c;
import uq0.C39063d;
import uq0.C39066g;
import us0.C39070a;
import us0.C39085o;
import ut0.C39099a;
import ut0.C39100b;
import ut0.C39101c;
import ut0.C39102d;
import uu0.C39103a;
import uw0.C39110b;
import ux0.C39112a;
import ux0.C39114b;
import ux0.C39119d0;
import ux0.C39148f0;
import ux0.C39150g0;
import ux0.C39152h0;
import ux0.C39154i0;
import ux0.C39157j0;
import ux0.C39159l;
import ux0.C39160m;
import ux0.C39166q;
import uy0.C39177a;
import uy0.C39178b;
import uz0.C39191m;
import v00.C28957b;
import v00.C28959d;
import v01.C39192a;
import v10.C28982w;
import v20.C28983a;
import v21.C39197a;
import v41.C39200a;
import v51.C39216h0;
import v60.C28998a;
import v60.C28999b;
import v61.C39235a;
import v61.C39237c;
import v61.C39239d;
import v61.C39241f;
import v70.C29000a;
import v80.C29002a;
import va0.C29016k;
import va0.C29018m;
import va0.C29025t;
import vb0.C29033a;
import vc0.C29035a;
import ve0.C29040b;
import vf0.C29054n;
import vg0.C29056b;
import vg0.C29073h;
import vh0.C29077c;
import vh0.C29079e;
import vj0.C29096g;
import vj0.C29104k;
import vk0.C29108a;
import vk0.C29124e;
import vm0.C29129c;
import vn0.C18459a;
import vo0.C18489a;
import vo0.C18490b;
import vu0.C39474a;
import vv0.C39475a;
import vv0.C39476b;
import vv0.C39477c;
import vv0.C39478d;
import vv0.C39479e;
import vw0.C39483d;
import vw0.C39489h;
import vy0.C39495b;
import vy0.C39497c;
import w11.C39504d;
import w11.C39508h;
import w30.C29204e;
import w30.C29218s;
import w31.C39513a;
import w31.C39514b;
import w51.C39532c0;
import w51.C39565o;
import w51.C39586q;
import w61.C39606h;
import w70.C29239b;
import w71.C39613a;
import w80.C29242a;
import w80.C29243b;
import w80.C29244c;
import w90.C29245a;
import w90.C29246b;
import w90.C29248d;
import wa0.C29255g;
import wa0.C29258i;
import wa0.C29259j;
import wa0.C29263n;
import wb0.C29283o;
import wc0.C29300a;
import wd0.C29320b;
import we0.C29321a;
import we0.C29322a0;
import we0.C29323b;
import we0.C29324b0;
import we0.C29325c;
import we0.C29326c0;
import we0.C29327d;
import we0.C29328d0;
import we0.C29329e;
import we0.C29330e0;
import we0.C29331f;
import we0.C29332f0;
import we0.C29333g;
import we0.C29334g0;
import we0.C29336h0;
import we0.C29337i;
import we0.C29338i0;
import we0.C29340j;
import we0.C29341j0;
import we0.C29343k0;
import we0.C29344l;
import we0.C29346l0;
import we0.C29349n;
import we0.C29351n0;
import we0.C29353o;
import we0.C29355p;
import we0.C29356p0;
import we0.C29358q;
import we0.C29359r;
import we0.C29360s;
import we0.C29362u;
import we0.C29364v;
import we0.C29365w;
import we0.C29366x;
import we0.C29367y;
import we0.C29368z;
import wf0.C29370a;
import wg0.C29372b;
import wg0.C29389i;
import wh0.C29393c;
import wh0.C29396d;
import wh0.C29397e;
import wh0.C29398f;
import wh0.C29399g;
import wh0.C29400h;
import wh0.C29402i;
import wh0.C29403j;
import wh0.C29404k;
import wh0.C29405l;
import wh0.C29406m;
import wh0.C29407n;
import wh0.C29408o;
import wh0.C29409p;
import wh0.C29410q;
import wh0.C29411r;
import wh0.C29412s;
import wh0.C29413t;
import wh0.C29414u;
import wh0.C29415v;
import wh0.C29416w;
import wh0.C29417x;
import wh0.C29418y;
import wh0.C29419z;
import wi0.C29420a;
import wi0.C29439g;
import wi0.C29448k;
import wj0.C29449a;
import wm0.C29507n;
import wn0.C18644a;
import wn0.C18645b;
import ws0.C39674b;
import wt0.C39675a;
import wt0.C39676b;
import wv0.C39678a;
import wv0.C39691m;
import ww0.C39706c;
import wy0.C39744a;
import wy0.C39745b;
import wy0.C39746c;
import wy0.C39747d;
import wy0.C39748e;
import wy0.C39749f;
import x01.C39765a;
import x01.C39766b;
import x01.C39767c;
import x21.C39777b;
import x30.C29644a;
import x31.C39778a;
import x41.C39780a;
import x41.C39784e;
import x60.C29655a;
import x71.C39829f;
import x91.C39831a;
import xa0.C29675k;
import xd0.C29742a;
import xg0.C29773g;
import xj0.C29814b;
import xl0.C29818b;
import xo0.C18869a;
import xo0.C18870b;
import xp0.C39834a;
import xs0.C39844b;
import xs0.C39845b0;
import xs0.C39848c0;
import xs0.C39849d;
import xs0.C39851e;
import xs0.C39852e0;
import xs0.C39857g;
import xs0.C39858g0;
import xs0.C39860h;
import xs0.C39861h0;
import xs0.C39862i;
import xs0.C39863i0;
import xs0.C39865j0;
import xs0.C39868l;
import xs0.C39871l0;
import xs0.C39873m0;
import xs0.C39874n;
import xs0.C39876o;
import xs0.C39877p;
import xs0.C39878q;
import xs0.C39879r;
import xs0.C39880s;
import xs0.C39881t;
import xs0.C39885x;
import xs0.C39889y;
import xs0.C39890z;
import xt0.C39892b;
import xt0.C39896d;
import xt0.C39901f;
import xt0.C39905g;
import xu0.C39906a;
import xu0.C39908c;
import xu0.C39911d;
import xu0.C39913f;
import xu0.C39915g;
import xv0.C39916a;
import xz0.C39968f;
import xz0.C39982h;
import xz0.C39985k;
import y01.C39988a;
import y11.C39992d;
import y11.C40010k;
import y20.C29902n;
import y41.C40021b;
import y51.C40023a;
import y60.C29932d;
import y70.C29952b;
import y80.C29954a;
import y90.C29955a;
import y90.C29956b;
import ya0.C29967k;
import yb0.C29989b;
import yc0.C29990a;
import ye0.C30005a;
import ye0.C30006b;
import ye0.C30007c;
import yf0.C30010c;
import yf0.C30026d;
import yf0.C30028f;
import yf0.C30031h;
import yg0.C30036e;
import yg0.C30054k;
import yh0.C30063h;
import yi0.C30072f;
import yi0.C30078l;
import yk0.C30083a;
import yl0.C30095l;
import yn0.C18977a;
import yn0.C18978b;
import yo0.C18986g;
import yq0.C40046a;
import yy0.C40120i;
import z01.C40136a;
import z01.C40137b;
import z01.C40138c;
import z20.C30140a;
import z20.C30141b;
import z20.C30142c;
import z40.C30207l;
import z40.C30217v;
import z41.C40147a;
import z51.C40148a;
import z70.C30235a;
import z70.C30236b;
import z80.C30242c0;
import z80.C30250k;
import z80.C30259t;
import z90.C30266a;
import z90.C30267b;
import z90.C30268c;
import z91.C40217f;
import za0.C30269a;
import zb0.C30279b;
import zb0.C30284f;
import zc0.C30288a;
import zd0.C30289a;
import zf0.C30297g;
import zg0.C30307j;
import zh1.C43511w;
import zi0.C30312c;
import zj0.C30317b;
import zj0.C30318c;
import zm0.C30351a;
import zm0.C30357g;
import zm0.C30362i;
import zm0.C30372r;
import zn0.C19086a;
import zn0.C19087b;
import zn0.C19088c;
import zn0.C19091f;
import zn0.C19095i;
import zn0.C19098j;
import zn0.C19099k;
import zn0.C19100l;
import zn0.C19101m;
import zn0.C19102n;
import zn0.C19103o;
import zn0.C19104p;
import zn0.C19105q;
import zo0.C19146a;
import zq0.C40243a;
import zt0.C40256a;
import zu0.C40257a;
import zv0.C40260b;
import zw0.C40262b;
import zw0.C40264c;
import zz0.C40280e;

/* renamed from: dk.b */
public abstract class C12142b {

    /* renamed from: dk.b$a */
    private static final class C12143a implements C17605a {

        /* renamed from: a */
        private final C12272j f35668a;

        /* renamed from: b */
        private final C12192d f35669b;

        /* renamed from: c */
        private Activity f35670c;

        /* renamed from: c */
        public C12143a mo32371b(Activity activity) {
            this.f35670c = (Activity) C18329d.m62675b(activity);
            return this;
        }

        /* renamed from: d */
        public C12308t mo32370a() {
            C18329d.m62674a(this.f35670c, Activity.class);
            return new C12144b(this.f35668a, this.f35669b, new C38389a(), new C32017c(), this.f35670c);
        }

        private C12143a(C12272j jVar, C12192d dVar) {
            this.f35668a = jVar;
            this.f35669b = dVar;
        }
    }

    /* renamed from: dk.b$b */
    private static final class C12144b extends C12308t {
        /* access modifiers changed from: private */

        /* renamed from: A */
        public C41084a f35671A;

        /* renamed from: A0 */
        private C41084a f35672A0;
        /* access modifiers changed from: private */

        /* renamed from: A1 */
        public C41084a f35673A1;
        /* access modifiers changed from: private */

        /* renamed from: B */
        public C41084a f35674B;

        /* renamed from: B0 */
        private C41084a f35675B0;
        /* access modifiers changed from: private */

        /* renamed from: B1 */
        public C41084a f35676B1;
        /* access modifiers changed from: private */

        /* renamed from: C */
        public C41084a f35677C;

        /* renamed from: C0 */
        private C41084a f35678C0;

        /* renamed from: C1 */
        private C41084a f35679C1;
        /* access modifiers changed from: private */

        /* renamed from: D */
        public C41084a f35680D;
        /* access modifiers changed from: private */

        /* renamed from: D0 */
        public C41084a f35681D0;

        /* renamed from: D1 */
        private C41084a f35682D1;
        /* access modifiers changed from: private */

        /* renamed from: E */
        public C41084a f35683E;

        /* renamed from: E0 */
        private C41084a f35684E0;
        /* access modifiers changed from: private */

        /* renamed from: E1 */
        public C41084a f35685E1;
        /* access modifiers changed from: private */

        /* renamed from: F */
        public C41084a f35686F;

        /* renamed from: F0 */
        private C41084a f35687F0;
        /* access modifiers changed from: private */

        /* renamed from: F1 */
        public C41084a f35688F1;
        /* access modifiers changed from: private */

        /* renamed from: G */
        public C41084a f35689G;
        /* access modifiers changed from: private */

        /* renamed from: G0 */
        public C41084a f35690G0;
        /* access modifiers changed from: private */

        /* renamed from: G1 */
        public C41084a f35691G1;
        /* access modifiers changed from: private */

        /* renamed from: H */
        public C41084a f35692H;

        /* renamed from: H0 */
        private C41084a f35693H0;

        /* renamed from: H1 */
        private C41084a f35694H1;
        /* access modifiers changed from: private */

        /* renamed from: I */
        public C41084a f35695I;
        /* access modifiers changed from: private */

        /* renamed from: I0 */
        public C41084a f35696I0;
        /* access modifiers changed from: private */

        /* renamed from: I1 */
        public C41084a f35697I1;
        /* access modifiers changed from: private */

        /* renamed from: J */
        public C41084a f35698J;

        /* renamed from: J0 */
        private C41084a f35699J0;
        /* access modifiers changed from: private */

        /* renamed from: J1 */
        public C41084a f35700J1;
        /* access modifiers changed from: private */

        /* renamed from: K */
        public C41084a f35701K;

        /* renamed from: K0 */
        private C41084a f35702K0;

        /* renamed from: K1 */
        private C41084a f35703K1;
        /* access modifiers changed from: private */

        /* renamed from: L */
        public C41084a f35704L;

        /* renamed from: L0 */
        private C41084a f35705L0;
        /* access modifiers changed from: private */

        /* renamed from: L1 */
        public C41084a f35706L1;

        /* renamed from: M */
        private C41084a f35707M;

        /* renamed from: M0 */
        private C41084a f35708M0;

        /* renamed from: M1 */
        private C41084a f35709M1;

        /* renamed from: N */
        private C41084a f35710N;

        /* renamed from: N0 */
        private C41084a f35711N0;

        /* renamed from: N1 */
        private C41084a f35712N1;
        /* access modifiers changed from: private */

        /* renamed from: O */
        public C41084a f35713O;

        /* renamed from: O0 */
        private C41084a f35714O0;
        /* access modifiers changed from: private */

        /* renamed from: O1 */
        public C41084a f35715O1;

        /* renamed from: P */
        private C41084a f35716P;
        /* access modifiers changed from: private */

        /* renamed from: P0 */
        public C41084a f35717P0;

        /* renamed from: P1 */
        private C41084a f35718P1;
        /* access modifiers changed from: private */

        /* renamed from: Q */
        public C41084a f35719Q;
        /* access modifiers changed from: private */

        /* renamed from: Q0 */
        public C41084a f35720Q0;
        /* access modifiers changed from: private */

        /* renamed from: Q1 */
        public C41084a f35721Q1;

        /* renamed from: R */
        private C41084a f35722R;
        /* access modifiers changed from: private */

        /* renamed from: R0 */
        public C41084a f35723R0;
        /* access modifiers changed from: private */

        /* renamed from: R1 */
        public C41084a f35724R1;
        /* access modifiers changed from: private */

        /* renamed from: S */
        public C41084a f35725S;
        /* access modifiers changed from: private */

        /* renamed from: S0 */
        public C41084a f35726S0;
        /* access modifiers changed from: private */

        /* renamed from: S1 */
        public C41084a f35727S1;

        /* renamed from: T */
        private C41084a f35728T;
        /* access modifiers changed from: private */

        /* renamed from: T0 */
        public C41084a f35729T0;
        /* access modifiers changed from: private */

        /* renamed from: T1 */
        public C41084a f35730T1;

        /* renamed from: U */
        private C41084a f35731U;
        /* access modifiers changed from: private */

        /* renamed from: U0 */
        public C41084a f35732U0;
        /* access modifiers changed from: private */

        /* renamed from: U1 */
        public C41084a f35733U1;

        /* renamed from: V */
        private C41084a f35734V;
        /* access modifiers changed from: private */

        /* renamed from: V0 */
        public C41084a f35735V0;
        /* access modifiers changed from: private */

        /* renamed from: V1 */
        public C41084a f35736V1;
        /* access modifiers changed from: private */

        /* renamed from: W */
        public C41084a f35737W;

        /* renamed from: W0 */
        private C41084a f35738W0;
        /* access modifiers changed from: private */

        /* renamed from: W1 */
        public C41084a f35739W1;
        /* access modifiers changed from: private */

        /* renamed from: X */
        public C41084a f35740X;
        /* access modifiers changed from: private */

        /* renamed from: X0 */
        public C41084a f35741X0;
        /* access modifiers changed from: private */

        /* renamed from: X1 */
        public C41084a f35742X1;

        /* renamed from: Y */
        private C41084a f35743Y;
        /* access modifiers changed from: private */

        /* renamed from: Y0 */
        public C41084a f35744Y0;

        /* renamed from: Y1 */
        private C41084a f35745Y1;
        /* access modifiers changed from: private */

        /* renamed from: Z */
        public C41084a f35746Z;
        /* access modifiers changed from: private */

        /* renamed from: Z0 */
        public C41084a f35747Z0;

        /* renamed from: Z1 */
        private C41084a f35748Z1;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Activity f35749a;
        /* access modifiers changed from: private */

        /* renamed from: a0 */
        public C41084a f35750a0;
        /* access modifiers changed from: private */

        /* renamed from: a1 */
        public C41084a f35751a1;
        /* access modifiers changed from: private */

        /* renamed from: a2 */
        public C41084a f35752a2;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C32017c f35753b;

        /* renamed from: b0 */
        private C41084a f35754b0;
        /* access modifiers changed from: private */

        /* renamed from: b1 */
        public C41084a f35755b1;

        /* renamed from: b2 */
        private C41084a f35756b2;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C38389a f35757c;
        /* access modifiers changed from: private */

        /* renamed from: c0 */
        public C41084a f35758c0;
        /* access modifiers changed from: private */

        /* renamed from: c1 */
        public C41084a f35759c1;

        /* renamed from: c2 */
        private C41084a f35760c2;

        /* renamed from: d */
        private final C12272j f35761d;
        /* access modifiers changed from: private */

        /* renamed from: d0 */
        public C41084a f35762d0;
        /* access modifiers changed from: private */

        /* renamed from: d1 */
        public C41084a f35763d1;

        /* renamed from: d2 */
        private C41084a f35764d2;

        /* renamed from: e */
        private final C12192d f35765e;
        /* access modifiers changed from: private */

        /* renamed from: e0 */
        public C41084a f35766e0;
        /* access modifiers changed from: private */

        /* renamed from: e1 */
        public C41084a f35767e1;

        /* renamed from: e2 */
        private C41084a f35768e2;

        /* renamed from: f */
        private final C12144b f35769f;
        /* access modifiers changed from: private */

        /* renamed from: f0 */
        public C41084a f35770f0;
        /* access modifiers changed from: private */

        /* renamed from: f1 */
        public C41084a f35771f1;

        /* renamed from: f2 */
        private C41084a f35772f2;

        /* renamed from: g */
        private C41084a f35773g;
        /* access modifiers changed from: private */

        /* renamed from: g0 */
        public C41084a f35774g0;
        /* access modifiers changed from: private */

        /* renamed from: g1 */
        public C41084a f35775g1;

        /* renamed from: g2 */
        private C41084a f35776g2;

        /* renamed from: h */
        private C41084a f35777h;
        /* access modifiers changed from: private */

        /* renamed from: h0 */
        public C41084a f35778h0;
        /* access modifiers changed from: private */

        /* renamed from: h1 */
        public C41084a f35779h1;

        /* renamed from: h2 */
        private C41084a f35780h2;

        /* renamed from: i */
        private C41084a f35781i;
        /* access modifiers changed from: private */

        /* renamed from: i0 */
        public C41084a f35782i0;
        /* access modifiers changed from: private */

        /* renamed from: i1 */
        public C41084a f35783i1;
        /* access modifiers changed from: private */

        /* renamed from: i2 */
        public C41084a f35784i2;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C41084a f35785j;
        /* access modifiers changed from: private */

        /* renamed from: j0 */
        public C41084a f35786j0;
        /* access modifiers changed from: private */

        /* renamed from: j1 */
        public C41084a f35787j1;

        /* renamed from: j2 */
        private C41084a f35788j2;

        /* renamed from: k */
        private C41084a f35789k;

        /* renamed from: k0 */
        private C41084a f35790k0;
        /* access modifiers changed from: private */

        /* renamed from: k1 */
        public C41084a f35791k1;

        /* renamed from: k2 */
        private C41084a f35792k2;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C41084a f35793l;
        /* access modifiers changed from: private */

        /* renamed from: l0 */
        public C41084a f35794l0;
        /* access modifiers changed from: private */

        /* renamed from: l1 */
        public C41084a f35795l1;
        /* access modifiers changed from: private */

        /* renamed from: l2 */
        public C41084a f35796l2;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public C41084a f35797m;
        /* access modifiers changed from: private */

        /* renamed from: m0 */
        public C41084a f35798m0;
        /* access modifiers changed from: private */

        /* renamed from: m1 */
        public C41084a f35799m1;
        /* access modifiers changed from: private */

        /* renamed from: m2 */
        public C41084a f35800m2;

        /* renamed from: n */
        private C41084a f35801n;
        /* access modifiers changed from: private */

        /* renamed from: n0 */
        public C41084a f35802n0;
        /* access modifiers changed from: private */

        /* renamed from: n1 */
        public C41084a f35803n1;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public C41084a f35804o;
        /* access modifiers changed from: private */

        /* renamed from: o0 */
        public C41084a f35805o0;

        /* renamed from: o1 */
        private C41084a f35806o1;

        /* renamed from: p */
        private C41084a f35807p;
        /* access modifiers changed from: private */

        /* renamed from: p0 */
        public C41084a f35808p0;
        /* access modifiers changed from: private */

        /* renamed from: p1 */
        public C41084a f35809p1;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public C41084a f35810q;

        /* renamed from: q0 */
        private C41084a f35811q0;
        /* access modifiers changed from: private */

        /* renamed from: q1 */
        public C41084a f35812q1;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public C41084a f35813r;
        /* access modifiers changed from: private */

        /* renamed from: r0 */
        public C41084a f35814r0;
        /* access modifiers changed from: private */

        /* renamed from: r1 */
        public C41084a f35815r1;

        /* renamed from: s */
        private C41084a f35816s;

        /* renamed from: s0 */
        private C41084a f35817s0;
        /* access modifiers changed from: private */

        /* renamed from: s1 */
        public C41084a f35818s1;

        /* renamed from: t */
        private C41084a f35819t;
        /* access modifiers changed from: private */

        /* renamed from: t0 */
        public C41084a f35820t0;
        /* access modifiers changed from: private */

        /* renamed from: t1 */
        public C41084a f35821t1;

        /* renamed from: u */
        private C41084a f35822u;

        /* renamed from: u0 */
        private C41084a f35823u0;

        /* renamed from: u1 */
        private C41084a f35824u1;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public C41084a f35825v;

        /* renamed from: v0 */
        private C41084a f35826v0;
        /* access modifiers changed from: private */

        /* renamed from: v1 */
        public C41084a f35827v1;

        /* renamed from: w */
        private C41084a f35828w;

        /* renamed from: w0 */
        private C41084a f35829w0;

        /* renamed from: w1 */
        private C41084a f35830w1;
        /* access modifiers changed from: private */

        /* renamed from: x */
        public C41084a f35831x;
        /* access modifiers changed from: private */

        /* renamed from: x0 */
        public C41084a f35832x0;

        /* renamed from: x1 */
        private C41084a f35833x1;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public C41084a f35834y;

        /* renamed from: y0 */
        private C41084a f35835y0;
        /* access modifiers changed from: private */

        /* renamed from: y1 */
        public C41084a f35836y1;
        /* access modifiers changed from: private */

        /* renamed from: z */
        public C41084a f35837z;
        /* access modifiers changed from: private */

        /* renamed from: z0 */
        public C41084a f35838z0;
        /* access modifiers changed from: private */

        /* renamed from: z1 */
        public C41084a f35839z1;

        /* renamed from: dk.b$b$a */
        private static final class C12145a implements C41084a {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public final C12272j f35840a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public final C12192d f35841b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public final C12144b f35842c;

            /* renamed from: d */
            private final int f35843d;

            /* renamed from: dk.b$b$a$a */
            class C12146a implements C14337b.C14342d {
                C12146a() {
                }

                /* renamed from: a */
                public C14337b mo32530a(long j) {
                    C38884p0 p0Var = (C38884p0) C12145a.this.f35840a.f36260M3.get();
                    C25352k kVar = (C25352k) C12145a.this.f35840a.f36464m3.get();
                    C16595i F4 = C12145a.this.f35842c.m44608J6();
                    C38879n C4 = C12145a.this.f35842c.m44573F6();
                    C26145c cVar = (C26145c) C12145a.this.f35842c.f35713O.get();
                    C38880n0 t5 = C12145a.this.f35842c.m44565E7();
                    C31658b L5 = C12145a.this.f35842c.m44783cb();
                    C19392a aVar = (C19392a) C12145a.this.f35842c.f35725S.get();
                    C20524h p4 = C12145a.this.f35842c.m44905p6();
                    C20526j Y4 = C12145a.this.f35842c.m44809f7();
                    C36735g u6 = C12145a.this.f35840a.m46195b8();
                    C20292b o6 = C12145a.this.f35840a.m46115T7();
                    C26050a aVar2 = r15;
                    C26050a aVar3 = new C26050a();
                    return new C14337b(p0Var, kVar, F4, C4, cVar, t5, L5, aVar, p4, Y4, u6, o6, aVar2, C12145a.this.f35840a.m46328o9(), (PreferencesApiManager) C12145a.this.f35840a.f36224I.get(), C12145a.this.f35842c.m44547C7(), C12145a.this.f35842c.m44617K6(), C12145a.this.f35842c.m44528A6(), (Client) C12145a.this.f35840a.f36389d0.get(), (C10092j) C12145a.this.f35840a.f36520t3.get(), (C18262a) C12145a.this.f35840a.f36308S3.get(), (C27494a) C12145a.this.f35840a.f36414g1.get(), j);
                }
            }

            /* renamed from: dk.b$b$a$a0 */
            class C12147a0 implements C37770o {
                C12147a0() {
                }

                /* renamed from: a */
                public C37783u mo32531a(long j) {
                    return new C37783u((C39885x) C12145a.this.f35842c.f35815r1.get(), (C39871l0) C12145a.this.f35842c.f35818s1.get(), (C28291b) C12145a.this.f35842c.f35779h1.get(), C12145a.this.f35840a.refreshProductTypeListUseCase(), (C39877p) C12145a.this.f35842c.f35821t1.get(), C12145a.this.f35840a.m46195b8(), (C39863i0) C12145a.this.f35842c.f35775g1.get(), (C29742a) C12145a.this.f35842c.f35825v.get(), (C25351j) C12145a.this.f35840a.f36464m3.get(), (C37154c) C12145a.this.f35842c.f35799m1.get(), j);
                }
            }

            /* renamed from: dk.b$b$a$b */
            class C12148b implements C26326l {
                C12148b() {
                }

                /* renamed from: a */
                public C26332r mo32532a(MoneyTransferTypeUiModel moneyTransferTypeUiModel, MoneyTransferWizardData moneyTransferWizardData, RemittanceCreditInfoContract remittanceCreditInfoContract) {
                    return new C26332r(C12145a.this.f35842c.m44693Sa(), (C27494a) C12145a.this.f35840a.f36414g1.get(), moneyTransferTypeUiModel, moneyTransferWizardData, remittanceCreditInfoContract);
                }
            }

            /* renamed from: dk.b$b$a$b0 */
            class C12149b0 implements C37983f {
                C12149b0() {
                }

                /* renamed from: a */
                public C37996r mo32533a(long j) {
                    return new C37996r((C39845b0) C12145a.this.f35842c.f35751a1.get(), (C39874n) C12145a.this.f35842c.f35771f1.get(), C12145a.this.f35842c.m44657Oa(), C12145a.this.f35842c.m44738Xa(), C12145a.this.f35840a.m46195b8(), (C39857g) C12145a.this.f35842c.f35787j1.get(), (C39849d) C12145a.this.f35842c.f35827v1.get(), C12145a.this.f35840a.getAccountsAndDetailsUseCase(), (C36990a) C12145a.this.f35842c.f35791k1.get(), (C37264h) C12145a.this.f35842c.f35803n1.get(), j);
                }
            }

            /* renamed from: dk.b$b$a$c */
            class C12150c implements C26754u {
                C12150c() {
                }

                public C26727c0 create() {
                    return new C26727c0(C12145a.this.f35840a.getDepositsAndBondsUseCase(), C12145a.this.f35842c.m44869l7(), (C25343d) C12145a.this.f35840a.f36502r1.get(), (C25346f) C12145a.this.f35840a.f36486p1.get(), (C25351j) C12145a.this.f35840a.f36464m3.get(), new C30122a(), C12145a.this.f35840a.m46266i9());
                }
            }

            /* renamed from: dk.b$b$a$c0 */
            class C12151c0 implements C31074a {
                C12151c0() {
                }

                /* renamed from: a */
                public C31080g mo32535a(long j) {
                    return new C31080g(C12145a.this.f35840a.m46205c8(), C12145a.this.f35840a.m46026K8(), j);
                }
            }

            /* renamed from: dk.b$b$a$d */
            class C12152d implements C26801g.C26807c {
                C12152d() {
                }

                /* renamed from: a */
                public C26801g mo32536a(FormData formData, String str) {
                    return new C26801g(formData, str, (C28325b) C12145a.this.f35842c.f35750a0.get(), new C27094a(), (PreferencesApiManager) C12145a.this.f35840a.f36224I.get());
                }
            }

            /* renamed from: dk.b$b$a$d0 */
            class C12153d0 implements C33725c.C33726a {
                C12153d0() {
                }

                /* renamed from: a */
                public C33725c mo32537a(String str, String str2) {
                    return new C33725c((Gson) C12145a.this.f35840a.f36288Q.get(), (C37289c) C12145a.this.f35842c.f35836y1.get(), (C37293g) C12145a.this.f35842c.f35839z1.get(), (C37287a) C12145a.this.f35842c.f35673A1.get(), (C37497e) C12145a.this.f35841b.f35927u.get(), C12145a.this.f35842c.m44783cb(), (C37292f) C12145a.this.f35842c.f35676B1.get(), (Client) C12145a.this.f35840a.f36389d0.get(), (C39114b) C12145a.this.f35841b.f35923q.get(), (C39112a) C12145a.this.f35841b.f35923q.get(), (C39150g0) C12145a.this.f35841b.f35923q.get(), (C39157j0) C12145a.this.f35841b.f35923q.get(), (C39152h0) C12145a.this.f35841b.f35923q.get(), (C39154i0) C12145a.this.f35841b.f35923q.get(), (C39148f0) C12145a.this.f35841b.f35923q.get(), (C39166q) C12145a.this.f35841b.f35923q.get(), (C39160m) C12145a.this.f35841b.f35923q.get(), str, str2);
                }
            }

            /* renamed from: dk.b$b$a$e */
            class C12154e implements C26887v0.C26897d {
                C12154e() {
                }

                /* renamed from: a */
                public C26887v0 mo32538a(ClientIncomesInitialData clientIncomesInitialData, boolean z) {
                    return new C26887v0(clientIncomesInitialData, z, (C27689c) C12145a.this.f35842c.f35766e0.get(), C12145a.this.f35842c.m44950u6(), (C28326c) C12145a.this.f35842c.f35778h0.get(), (C28327d) C12145a.this.f35842c.f35782i0.get(), (C29244c) C12145a.this.f35842c.f35786j0.get(), C12145a.this.f35842c.m44711Ua(), new C27094a(), (C24922c) C12145a.this.f35840a.f36347X3.get(), (C28474a) C12145a.this.f35840a.f36252L3.get());
                }
            }

            /* renamed from: dk.b$b$a$e0 */
            class C12155e0 implements C33775c.C33776a {
                C12155e0() {
                }

                /* renamed from: a */
                public C33775c mo32539a(PaymentResultObjectUiModel paymentResultObjectUiModel) {
                    return new C33775c(C12145a.this.f35842c.m44689S6(), C12145a.this.f35842c.m44808f6(), (Gson) C12145a.this.f35840a.f36288Q.get(), (Client) C12145a.this.f35840a.f36389d0.get(), C17958c.m61876a(C12145a.this.f35840a.f36388d), paymentResultObjectUiModel);
                }
            }

            /* renamed from: dk.b$b$a$f */
            class C12156f implements C22633b.C22638d {
                C12156f() {
                }

                /* renamed from: a */
                public C22633b mo32540a(ApplicationDetails applicationDetails, boolean z) {
                    return new C22633b(applicationDetails, z, C17957b.m61875a(C12145a.this.f35840a.f36388d), (C26158a) C12145a.this.f35842c.f35805o0.get(), (C26159b) C12145a.this.f35842c.f35808p0.get(), (C28474a) C12145a.this.f35840a.f36252L3.get());
                }
            }

            /* renamed from: dk.b$b$a$f0 */
            class C12157f0 implements C36091a {
                C12157f0() {
                }

                /* renamed from: a */
                public C36102i mo32541a(long j) {
                    return new C36102i((C39495b) C12145a.this.f35842c.f35685E1.get(), (C36149a) C12145a.this.f35842c.f35689G.get(), (C32038a) C12145a.this.f35842c.f35688F1.get(), (C38895u0) C12145a.this.f35842c.f35691G1.get(), C12145a.this.f35840a.m46195b8(), (C38884p0) C12145a.this.f35840a.f36260M3.get(), (C27494a) C12145a.this.f35840a.f36414g1.get(), j);
                }
            }

            /* renamed from: dk.b$b$a$g */
            class C12158g implements C19933f {
                C12158g() {
                }

                /* renamed from: a */
                public C19939l mo32542a(String str, String str2, String str3, String str4, String str5) {
                    return new C19939l((C29242a) C12145a.this.f35842c.f35814r0.get(), C12145a.this.f35842c.m44711Ua(), C12145a.this.f35842c.m44942t7(), (C28474a) C12145a.this.f35840a.f36252L3.get(), str, str2, str3, str4, str5);
                }
            }

            /* renamed from: dk.b$b$a$g0 */
            class C12159g0 implements C13851f.C13853b {
                C12159g0() {
                }

                /* renamed from: a */
                public C13851f mo32543a(long j) {
                    return new C13851f((C25352k) C12145a.this.f35840a.f36464m3.get(), (C17535h) C12145a.this.f35840a.f36440j3.get(), C12145a.this.f35842c.m44729Wa(), C12145a.this.f35842c.m44986y6(), (C13849e) C12145a.this.f35842c.f35785j.get(), (TargetEnvironment) C12145a.this.f35840a.f36216H.get(), j);
                }
            }

            /* renamed from: dk.b$b$a$h */
            class C12160h implements C22700d.C22706d {
                C12160h() {
                }

                /* renamed from: a */
                public C22700d mo32544a(ResultData resultData) {
                    return new C22700d(resultData, C12145a.this.f35842c.m44969w7(), (C29560c) C12145a.this.f35842c.f35820t0.get(), C12145a.this.f35842c.m44950u6(), new C24920a());
                }
            }

            /* renamed from: dk.b$b$a$h0 */
            class C12161h0 implements C33969f.C33979g {
                C12161h0() {
                }

                /* renamed from: a */
                public C33969f mo32545a(long j) {
                    return new C33969f((C25352k) C12145a.this.f35840a.f36464m3.get(), (C38884p0) C12145a.this.f35840a.f36260M3.get(), C12145a.this.f35842c.m44932s6(), C12145a.this.f35842c.m44573F6(), C12145a.this.f35842c.m44924r7(), C12145a.this.f35842c.m44803eb(), C12145a.this.f35842c.m44783cb(), (C26145c) C12145a.this.f35842c.f35713O.get(), (C38395a) C12145a.this.f35842c.f35700J1.get(), (PreferencesApiManager) C12145a.this.f35840a.f36224I.get(), C12145a.this.f35840a.m46115T7(), (C19393b) C12145a.this.f35842c.f35706L1.get(), C12145a.this.f35842c.m44653O6(), C12145a.this.f35842c.m44574F7(), C12145a.this.f35842c.m44914q6(), (C27494a) C12145a.this.f35840a.f36414g1.get(), (TargetEnvironment) C12145a.this.f35840a.f36216H.get(), j);
                }
            }

            /* renamed from: dk.b$b$a$i */
            class C12162i implements C22738b.C22739a {
                C12162i() {
                }

                /* renamed from: a */
                public C22738b mo32546a(String str, String str2) {
                    return new C22738b((C39114b) C12145a.this.f35841b.f35923q.get(), (C39150g0) C12145a.this.f35841b.f35923q.get(), (C39157j0) C12145a.this.f35841b.f35923q.get(), (C39152h0) C12145a.this.f35841b.f35923q.get(), (C39154i0) C12145a.this.f35841b.f35923q.get(), (C39148f0) C12145a.this.f35841b.f35923q.get(), (C39166q) C12145a.this.f35841b.f35923q.get(), (C39160m) C12145a.this.f35841b.f35923q.get(), str, str2);
                }
            }

            /* renamed from: dk.b$b$a$i0 */
            class C12163i0 implements C34119g.C34133g {
                C12163i0() {
                }

                /* renamed from: a */
                public C34119g mo32547a(long j, boolean z) {
                    return new C34119g((C25352k) C12145a.this.f35840a.f36464m3.get(), (C38884p0) C12145a.this.f35840a.f36260M3.get(), C12145a.this.f35842c.m44923r6(), C12145a.this.f35842c.m44924r7(), C12145a.this.f35842c.m44915q7(), (C39879r) C12145a.this.f35842c.f35838z0.get(), C12145a.this.f35842c.m44573F6(), C12145a.this.f35842c.m44788d6(), C12145a.this.f35842c.m44770b7(), C12145a.this.f35842c.m44783cb(), (C38399b) C12145a.this.f35842c.f35697I1.get(), (C26145c) C12145a.this.f35842c.f35713O.get(), C12145a.this.f35842c.m44803eb(), C12145a.this.f35840a.m46115T7(), (PreferencesApiManager) C12145a.this.f35840a.f36224I.get(), (C19393b) C12145a.this.f35842c.f35706L1.get(), C12145a.this.f35842c.m44684Ra(), C12145a.this.f35842c.m44653O6(), C12145a.this.f35842c.m44574F7(), C12145a.this.f35842c.m44914q6(), (C27494a) C12145a.this.f35840a.f36414g1.get(), (TargetEnvironment) C12145a.this.f35840a.f36216H.get(), j, z);
                }
            }

            /* renamed from: dk.b$b$a$j */
            class C12164j implements C25906p {
                C12164j() {
                }

                /* renamed from: a */
                public C25911u mo32548a(DepositSubmissionNavData depositSubmissionNavData) {
                    return new C25911u(C12145a.this.f35842c.m44942t7(), C12145a.this.f35840a.m46045M7(), depositSubmissionNavData);
                }
            }

            /* renamed from: dk.b$b$a$j0 */
            class C12165j0 implements C38066p {
                C12165j0() {
                }

                /* renamed from: a */
                public C38072v mo32549a(C27685a aVar) {
                    return new C38072v(C12145a.this.f35842c.m44923r6(), C12145a.this.f35842c.m44671Q6(), C12145a.this.f35840a.getDepositsAndBondsUseCase(), C12145a.this.f35842c.m44933s7(), C12145a.this.f35842c.m44789d7(), (C25352k) C12145a.this.f35840a.f36464m3.get(), (C29879c) C12145a.this.f35842c.f35740X.get(), (C39879r) C12145a.this.f35842c.f35838z0.get(), C12145a.this.f35842c.m44995z6(), C12145a.this.f35842c.m44626L6(), C12145a.this.f35842c.m44600I7(), (Client) C12145a.this.f35840a.f36389d0.get(), (C38269a) C12145a.this.f35842c.f35715O1.get(), aVar);
                }
            }

            /* renamed from: dk.b$b$a$k */
            class C12166k implements C13592b.C13594b {
                C12166k() {
                }

                /* renamed from: a */
                public C13592b mo32550a(PolicyDetailsModel policyDetailsModel) {
                    return new C13592b(policyDetailsModel, C12145a.this.f35842c.m44648Na(), (C17047y) C12145a.this.f35840a.f36408f3.get());
                }
            }

            /* renamed from: dk.b$b$a$k0 */
            class C12167k0 implements C34402d.C34421i {
                C12167k0() {
                }

                /* renamed from: a */
                public C34402d mo32551a(String str, String str2) {
                    return new C34402d(str, str2, (C37056i) C12145a.this.f35842c.f35721Q1.get(), (C37046c) C12145a.this.f35842c.f35724R1.get(), (C37048e) C12145a.this.f35842c.f35736V1.get(), new C38402a(), (C37058k) C12145a.this.f35842c.f35739W1.get(), C12145a.this.f35842c.m44537B6(), (C25352k) C12145a.this.f35840a.f36464m3.get(), (C27494a) C12145a.this.f35840a.f36414g1.get(), C12145a.this.f35842c.m44783cb(), (C37057j) C12145a.this.f35842c.f35742X1.get(), (C10463g) C12145a.this.f35840a.f36497q4.get());
                }
            }

            /* renamed from: dk.b$b$a$l */
            class C12168l implements C26404a {
                C12168l() {
                }

                /* renamed from: a */
                public C26412g mo32552a(long j) {
                    return new C26412g(C12145a.this.f35842c.m44716V6(), C12145a.this.f35842c.m44853jb(), C12145a.this.f35842c.m44675Qa(), (C37020g) C12145a.this.f35842c.f35832x0.get(), (C25677a) C12145a.this.f35840a.f36251L2.get(), new C24973a(), (C32053a) C12145a.this.f35840a.f36236J3.get(), C12145a.this.f35842c.m44783cb(), (C27494a) C12145a.this.f35840a.f36414g1.get(), j);
                }
            }

            /* renamed from: dk.b$b$a$l0 */
            class C12169l0 implements C37910a {
                C12169l0() {
                }

                /* renamed from: a */
                public C37915f mo32553a(Long l, boolean z) {
                    return new C37915f(C12145a.this.f35842c.m44556D7(), C12145a.this.f35842c.m44793db(), C12145a.this.f35842c.m44720Va(), l, z);
                }
            }

            /* renamed from: dk.b$b$a$m */
            class C12170m implements C26423k {
                C12170m() {
                }

                /* renamed from: a */
                public C26434v mo32554a(long j) {
                    return new C26434v(C12145a.this.f35842c.m44752Z6(), C12145a.this.f35842c.m44765ab(), C12145a.this.f35842c.m44743Y6(), C12145a.this.f35842c.m44868l6(), C12145a.this.f35842c.m44858k6(), C12145a.this.f35842c.m44707U6(), C12145a.this.f35842c.m44803eb(), C12145a.this.f35842c.m44878m6(), C12145a.this.f35842c.m44747Ya(), C12145a.this.f35842c.m44769b6(), (C10463g) C12145a.this.f35840a.f36497q4.get(), j);
                }
            }

            /* renamed from: dk.b$b$a$m0 */
            class C12171m0 implements C31138d {
                C12171m0() {
                }

                /* renamed from: a */
                public C34968f mo32555a(OtherTransferTypeState otherTransferTypeState) {
                    return new C34968f((PreferencesApiManager) C12145a.this.f35840a.f36224I.get(), C12145a.this.f35842c.m44612Ja(), (C34948a) C12145a.this.f35842c.f35752a2.get(), C12145a.this.f35840a.m46115T7(), C12145a.this.f35842c.m44603Ia(), otherTransferTypeState);
                }
            }

            /* renamed from: dk.b$b$a$n */
            class C12172n implements C25170h {
                C12172n() {
                }

                /* renamed from: a */
                public C25175m mo32556a(long j) {
                    return new C25175m(j, C12145a.this.f35842c.m44734X6(), C12145a.this.f35842c.m44529A7());
                }
            }

            /* renamed from: dk.b$b$a$n0 */
            class C12173n0 implements C13891b.C13893b {
                C12173n0() {
                }

                /* renamed from: a */
                public C13891b mo32557a(long j, String str) {
                    return new C13891b((C17527b) C12145a.this.f35842c.f35793l.get(), C12145a.this.f35842c.m44977x6(), (C17529c) C12145a.this.f35842c.f35797m.get(), j, str);
                }
            }

            /* renamed from: dk.b$b$a$o */
            class C12174o implements C26494a {
                C12174o() {
                }

                /* renamed from: a */
                public C26498e mo32558a(String str) {
                    return new C26498e(C12145a.this.f35842c.m44799e7(), str);
                }
            }

            /* renamed from: dk.b$b$a$o0 */
            class C12175o0 implements C12531g0 {
                C12175o0() {
                }

                /* renamed from: a */
                public C12616r0 mo32559a(Long l, String str, String str2) {
                    return new C12616r0(C12145a.this.f35842c.m44599I6(), C12145a.this.f35840a.m46195b8(), (C16795y) C12145a.this.f35842c.f35810q.get(), (C16738e) C12145a.this.f35842c.f35813r.get(), C12145a.this.f35842c.m44635M6(), C12145a.this.f35842c.m44833hb(), C12145a.this.f35842c.m44538B7(), (Client) C12145a.this.f35840a.f36389d0.get(), (C10083a) C12145a.this.f35840a.f36528u3.get(), (C10092j) C12145a.this.f35840a.f36520t3.get(), l, str, str2);
                }
            }

            /* renamed from: dk.b$b$a$p */
            class C12176p implements C26548e {
                C12176p() {
                }

                /* renamed from: a */
                public C24488f mo32560a(String str) {
                    return new C24488f(C12145a.this.f35842c.m44996z7(), C12145a.this.f35842c.m44859k7(), (C24508h) C12145a.this.f35842c.f35681D0.get(), str);
                }
            }

            /* renamed from: dk.b$b$a$p0 */
            class C12177p0 implements C12602p {
                C12177p0() {
                }

                /* renamed from: a */
                public C12687y mo32561a(CardApplicationTypeData cardApplicationTypeData, List list, boolean z, boolean z2) {
                    return new C12687y((C16795y) C12145a.this.f35842c.f35810q.get(), (C10092j) C12145a.this.f35840a.f36520t3.get(), C12145a.this.f35842c.m44590H6(), C12145a.this.f35842c.m44783cb(), C12145a.this.f35842c.m44798e6(), cardApplicationTypeData, list, z, z2);
                }
            }

            /* renamed from: dk.b$b$a$q */
            class C12178q implements C30362i {
                C12178q() {
                }

                /* renamed from: a */
                public C30372r mo32562a(JuniorRequestDataUiModel juniorRequestDataUiModel, NavigatorConstants$JuniorFlow navigatorConstants$JuniorFlow, boolean z) {
                    return new C30372r((C28058f) C12145a.this.f35842c.f35690G0.get(), C12145a.this.f35842c.m44833hb(), C12145a.this.f35840a.m46195b8(), C12145a.this.f35842c.m44778c6(), C12145a.this.f35842c.m44843ib(), C12145a.this.f35842c.m44644N6(), C12145a.this.f35842c.m44706U5(), C12145a.this.f35842c.m44873lb(), C12145a.this.f35842c.m44818g6(), (C10092j) C12145a.this.f35840a.f36520t3.get(), (C27494a) C12145a.this.f35840a.f36414g1.get(), juniorRequestDataUiModel, navigatorConstants$JuniorFlow, z);
                }
            }

            /* renamed from: dk.b$b$a$q0 */
            class C12179q0 implements C12544i2 {
                C12179q0() {
                }

                /* renamed from: a */
                public C12605p2 mo32563a(OrderCardResult orderCardResult) {
                    return new C12605p2(C12145a.this.f35842c.m44666Pa(), (C29742a) C12145a.this.f35842c.f35825v.get(), orderCardResult);
                }
            }

            /* renamed from: dk.b$b$a$r */
            class C12180r implements C16846h.C16852d {
                C12180r() {
                }

                /* renamed from: a */
                public C16846h mo32564a(long j) {
                    return new C16846h(j, C12145a.this.f35842c.m44897o7(), C12145a.this.f35842c.m44969w7(), (C18490b) C12145a.this.f35842c.f35696I0.get());
                }
            }

            /* renamed from: dk.b$b$a$r0 */
            class C12181r0 implements C12613q2 {
                C12181r0() {
                }

                /* renamed from: a */
                public C12550j3 mo32565a(OrderDebitCardData orderDebitCardData) {
                    return new C12550j3((C16777u0) C12145a.this.f35842c.f35692H.get(), (C10085c) C12145a.this.f35840a.f36244K3.get(), C12145a.this.f35842c.m44590H6(), (C10099q) C12145a.this.f35842c.f35695I.get(), (C10089g) C12145a.this.f35842c.f35698J.get(), (C10092j) C12145a.this.f35840a.f36520t3.get(), C12145a.this.f35842c.m44644N6(), C12145a.this.f35842c.m44564E6(), C12145a.this.f35842c.m44761a7(), (C16724a0) C12145a.this.f35842c.f35701K.get(), (PreferencesApiManager) C12145a.this.f35840a.f36224I.get(), C12145a.this.f35840a.m46115T7(), (C16799z0) C12145a.this.f35842c.f35704L.get(), (C28474a) C12145a.this.f35840a.f36252L3.get(), C12145a.this.f35840a.refreshProductTypeListUseCase(), C12145a.this.f35840a.refreshAssetLiabilityUseCase(), (C25681e) C12145a.this.f35840a.f36291Q2.get(), (C25679c) C12145a.this.f35840a.f36456l3.get(), C12145a.this.f35842c.m44547C7(), (C27494a) C12145a.this.f35840a.f36414g1.get(), (Client) C12145a.this.f35840a.f36389d0.get(), orderDebitCardData);
                }
            }

            /* renamed from: dk.b$b$a$s */
            class C12182s implements C16862o.C16870d {
                C12182s() {
                }

                /* renamed from: a */
                public C16862o mo32566a(long j, boolean z) {
                    return new C16862o(j, z, C12145a.this.f35842c.m44906p7(), C12145a.this.f35842c.m44888n7(), (C18490b) C12145a.this.f35842c.f35696I0.get());
                }
            }

            /* renamed from: dk.b$b$a$s0 */
            class C12183s0 implements C12684x1 {
                C12183s0() {
                }

                /* renamed from: a */
                public C12515e2 mo32567a(OrderDebitCardData orderDebitCardData) {
                    return new C12515e2(C12145a.this.f35842c.m44839i7(), C12145a.this.f35842c.m44644N6(), C12145a.this.f35842c.m44829h7(), C12145a.this.f35842c.m44828h6(), (C16724a0) C12145a.this.f35842c.f35701K.get(), new C10104u(), (C10092j) C12145a.this.f35840a.f36520t3.get(), (Client) C12145a.this.f35840a.f36389d0.get(), (C27494a) C12145a.this.f35840a.f36414g1.get(), orderDebitCardData);
                }
            }

            /* renamed from: dk.b$b$a$t */
            class C12184t implements C16877v.C16881c {
                C12184t() {
                }

                /* renamed from: a */
                public C16877v mo32568a(LifestyleOffersFilterResultData lifestyleOffersFilterResultData) {
                    return new C16877v(lifestyleOffersFilterResultData, C12145a.this.f35842c.m44879m7());
                }
            }

            /* renamed from: dk.b$b$a$u */
            class C12185u implements C15087d.C15089b {
                C12185u() {
                }

                /* renamed from: a */
                public C15087d mo32569a(C16521c cVar) {
                    return new C15087d(C12145a.this.f35842c.m44639Ma(), C12145a.this.f35842c.m44978x7(), C12145a.this.f35842c.m44942t7(), C31264d.m92870a(), cVar);
                }
            }

            /* renamed from: dk.b$b$a$v */
            class C12186v implements C13768b.C13770b {
                C12186v() {
                }

                /* renamed from: a */
                public C13768b mo32570a(C24846c cVar) {
                    return new C13768b(C12145a.this.f35842c.m44977x6(), cVar);
                }
            }

            /* renamed from: dk.b$b$a$w */
            class C12187w implements C15101j.C15102a {
                C12187w() {
                }

                /* renamed from: a */
                public C15101j mo32571a(int i) {
                    return new C15101j(C12145a.this.f35842c.m44639Ma(), C12145a.this.f35842c.m44978x7(), C31265e.m92871a(), C31264d.m92870a(), i);
                }
            }

            /* renamed from: dk.b$b$a$x */
            class C12188x implements C39063d {
                C12188x() {
                }

                /* renamed from: a */
                public C39066g mo32572a(List list, LoanSubtypeData loanSubtypeData) {
                    return new C39066g(list, loanSubtypeData);
                }
            }

            /* renamed from: dk.b$b$a$y */
            class C12189y implements C36934b {
                C12189y() {
                }

                /* renamed from: a */
                public C36946m mo32573a(String str, String str2) {
                    return new C36946m((C31581d) C12145a.this.f35842c.f35717P0.get(), C12145a.this.f35842c.m44942t7(), (C31579b) C12145a.this.f35842c.f35726S0.get(), (C31578a) C12145a.this.f35842c.f35729T0.get(), (C31583e) C12145a.this.f35842c.f35732U0.get(), (C36491a) C12145a.this.f35842c.f35735V0.get(), (Client) C12145a.this.f35840a.f36389d0.get(), str, str2);
                }
            }

            /* renamed from: dk.b$b$a$z */
            class C12190z implements C37732b {
                C12190z() {
                }

                /* renamed from: a */
                public C37748j mo32574a(C37728a aVar) {
                    return new C37748j((C39845b0) C12145a.this.f35842c.f35751a1.get(), (C39868l) C12145a.this.f35842c.f35763d1.get(), (C39874n) C12145a.this.f35842c.f35771f1.get(), C12145a.this.f35840a.m46195b8(), (C39844b) C12145a.this.f35842c.f35783i1.get(), (C39857g) C12145a.this.f35842c.f35787j1.get(), (C36990a) C12145a.this.f35842c.f35791k1.get(), (C37264h) C12145a.this.f35842c.f35803n1.get(), aVar);
                }
            }

            C12145a(C12272j jVar, C12192d dVar, C12144b bVar, int i) {
                this.f35840a = jVar;
                this.f35841b = dVar;
                this.f35842c = bVar;
                this.f35843d = i;
            }

            /* renamed from: d */
            private Object m45163d() {
                switch (this.f35843d) {
                    case 0:
                        return new C19982a(this.f35842c.f35749a);
                    case 1:
                        return new C12166k();
                    case 2:
                        return new C12186v();
                    case 3:
                        return new C12159g0();
                    case 4:
                        return new C13849e();
                    case 5:
                        return new C12173n0();
                    case 6:
                        return new C17527b((C17385a) this.f35840a.f36178C1.get());
                    case 7:
                        return new C17529c((C17385a) this.f35840a.f36178C1.get());
                    case 8:
                        return new C12175o0();
                    case 9:
                        return new C16740f((C16586a) this.f35842c.f35804o.get());
                    case 10:
                        return new C15309d0((IRetrofitService) this.f35840a.f36350Y.get(), (C12925a) this.f35840a.f36488p3.get(), this.f35840a.m46195b8(), (C26116a) this.f35840a.f36567z2.get(), (C15700a) this.f35840a.f36496q3.get());
                    case 11:
                        return new C16795y((C16586a) this.f35842c.f35804o.get());
                    case 12:
                        return new C16738e((C16586a) this.f35842c.f35804o.get());
                    case 13:
                        return new C12177p0();
                    case 14:
                        return new C12179q0();
                    case 15:
                        return new C19231d((C30289a) this.f35840a.f36536v3.get());
                    case 16:
                        return new C12181r0();
                    case 17:
                        return new C16777u0((C16795y) this.f35842c.f35810q.get(), this.f35840a.m46195b8(), (C16791w) this.f35842c.f35831x.get(), (C16767q) this.f35842c.f35834y.get(), (C16769r) this.f35842c.f35837z.get(), (C16789v) this.f35842c.f35671A.get(), (C16775u) this.f35842c.f35677C.get(), (C25339b) this.f35840a.f36321U0.get(), (C30120b) this.f35842c.f35680D.get(), (C16793x) this.f35842c.f35683E.get(), this.f35842c.m44942t7(), (C16742g) this.f35842c.f35686F.get(), this.f35842c.m44698T6(), (C16771s) this.f35842c.f35689G.get(), this.f35840a.cardsAndDetailsUseCase(), this.f35842c.m44644N6(), this.f35842c.m44833hb());
                    case 18:
                        return new C16791w((C16586a) this.f35842c.f35804o.get());
                    case 19:
                        return new C16767q((C16586a) this.f35842c.f35804o.get());
                    case 20:
                        return new C16769r((C16586a) this.f35842c.f35804o.get());
                    case 21:
                        return new C16789v((C16586a) this.f35842c.f35804o.get());
                    case 22:
                        return new C16775u((C16586a) this.f35842c.f35804o.get(), (C16735d) this.f35842c.f35674B.get());
                    case 23:
                        return new C16735d((C16586a) this.f35842c.f35804o.get());
                    case 24:
                        return new C30120b((C19280a) this.f35840a.f36376b3.get());
                    case 25:
                        return new C16793x((C16586a) this.f35842c.f35804o.get());
                    case 26:
                        return new C16742g((C16586a) this.f35842c.f35804o.get());
                    case 27:
                        return new C16771s((C16586a) this.f35842c.f35804o.get());
                    case 28:
                        return new C10099q();
                    case 29:
                        return new C10089g();
                    case 30:
                        return new C16724a0((C16586a) this.f35842c.f35804o.get());
                    case 31:
                        return new C16799z0((C16586a) this.f35842c.f35804o.get());
                    case 32:
                        return new C12183s0();
                    case 33:
                        return new C12146a();
                    case 34:
                        return new C26145c();
                    case 35:
                        return new C20517g(this.f35840a.m46328o9(), (C19394c) this.f35842c.f35719Q.get(), new C26050a());
                    case 36:
                        return new C20534p(this.f35840a.m46328o9());
                    case 37:
                        return new C15704c((C15535a) this.f35840a.f36292Q3.get(), (C15362a) this.f35840a.f36300R3.get(), (C15700a) this.f35840a.f36496q3.get());
                    case 38:
                        return new C12148b();
                    case 39:
                        return new C29879c((C29881d) this.f35842c.f35737W.get());
                    case 40:
                        return new C29881d((C19147a) this.f35840a.f36390d1.get());
                    case 41:
                        return new C12150c();
                    case 42:
                        return new C26144b((C26146d) this.f35840a.f36381c0.get());
                    case 43:
                        return new C12152d();
                    case 44:
                        return new C28325b((C29002a) this.f35840a.f36218H1.get());
                    case 45:
                        return new C12154e();
                    case 46:
                        return new C27689c((C28162a) this.f35842c.f35758c0.get(), (C27691d) this.f35842c.f35762d0.get());
                    case 47:
                        return new C19195d((C29000a) this.f35840a.f36202F1.get(), (C19342a) this.f35840a.f36340W3.get());
                    case 48:
                        return new C27691d((C28162a) this.f35842c.f35758c0.get());
                    case 49:
                        return new C20450d((C29000a) this.f35840a.f36202F1.get(), (C20778a) this.f35842c.f35770f0.get(), (Gson) this.f35840a.f36288Q.get());
                    case 50:
                        return new C20778a();
                    case 51:
                        return new C28326c((C29002a) this.f35840a.f36218H1.get());
                    case 52:
                        return new C28327d((C29002a) this.f35840a.f36218H1.get());
                    case 53:
                        return new C29244c((C29954a) this.f35842c.f35774g0.get());
                    case 54:
                        return new C12156f();
                    case 55:
                        return new C26158a((C26767a) this.f35842c.f35802n0.get());
                    case 56:
                        return new C29952b((C29000a) this.f35840a.f36202F1.get(), (C30235a) this.f35842c.f35794l0.get(), (C30236b) this.f35842c.f35798m0.get(), (Gson) this.f35840a.f36288Q.get());
                    case 57:
                        return new C30235a();
                    case 58:
                        return new C30236b();
                    case 59:
                        return new C26159b((C26767a) this.f35842c.f35802n0.get());
                    case 60:
                        return new C12158g();
                    case 61:
                        return new C29242a((C29954a) this.f35842c.f35774g0.get());
                    case 62:
                        return new C12160h();
                    case 63:
                        return new C29560c((C30106b) this.f35840a.f36219H2.get());
                    case 64:
                        return new C12162i();
                    case 65:
                        return new C12164j();
                    case 66:
                        return new C12168l();
                    case 67:
                        return new C37020g((C38267a) this.f35840a.f36558y1.get());
                    case 68:
                        return new C12170m();
                    case 69:
                        return new C39879r((C31186b) this.f35840a.f36163A2.get());
                    case 70:
                        return new C12172n();
                    case 71:
                        return new C12174o();
                    case 72:
                        return new C12176p();
                    case 73:
                        return new C24508h();
                    case 74:
                        return new C12178q();
                    case 75:
                        return new C28471e((C27851a) this.f35840a.f36519t2.get(), (C25679c) this.f35840a.f36456l3.get(), this.f35842c.m44823gb());
                    case 76:
                        return new C12180r();
                    case 77:
                        return new C18490b();
                    case 78:
                        return new C12182s();
                    case 79:
                        return new C12184t();
                    case 80:
                        return new C12185u();
                    case 81:
                        return new C12187w();
                    case 82:
                        return new C12188x();
                    case 83:
                        return new C12189y();
                    case 84:
                        return new C31581d(this.f35842c.m44969w7());
                    case 85:
                        return new C31579b((C31999a) this.f35842c.f35723R0.get());
                    case 86:
                        return new C31041c((C40046a) this.f35840a.f36521t4.get(), (C40243a) this.f35842c.f35720Q0.get());
                    case 87:
                        return new C40243a();
                    case 88:
                        return new C31578a((C31999a) this.f35842c.f35723R0.get());
                    case 89:
                        return new C31583e((C31999a) this.f35842c.f35723R0.get());
                    case 90:
                        return new C36491a();
                    case 91:
                        return new C12190z();
                    case 92:
                        return new C39845b0((C39852e0) this.f35842c.f35747Z0.get(), this.f35842c.m44987y7(), (C39879r) this.f35842c.f35838z0.get());
                    case 93:
                        return new C39852e0((C39860h) this.f35842c.f35741X0.get(), (C39889y) this.f35842c.f35744Y0.get(), this.f35840a.cardsAndDetailsUseCase(), (C38793a) this.f35840a.f36559y2.get());
                    case 94:
                        return new C39860h((C31186b) this.f35840a.f36163A2.get());
                    case 95:
                        return new C39889y((C31186b) this.f35840a.f36163A2.get());
                    case 96:
                        return new C39868l((C39878q) this.f35842c.f35755b1.get(), (C39876o) this.f35842c.f35759c1.get());
                    case 97:
                        return new C39878q((C31186b) this.f35840a.f36163A2.get());
                    case 98:
                        return new C39876o((C31186b) this.f35840a.f36163A2.get());
                    case 99:
                        return new C39874n((C39880s) this.f35842c.f35767e1.get(), (C39876o) this.f35842c.f35759c1.get());
                    default:
                        throw new AssertionError(this.f35843d);
                }
            }

            /* renamed from: e */
            private Object m45164e() {
                switch (this.f35843d) {
                    case 100:
                        return new C39880s((C31186b) this.f35840a.f36163A2.get());
                    case 101:
                        return new C39844b((C31186b) this.f35840a.f36163A2.get(), (C39863i0) this.f35842c.f35775g1.get(), (C28291b) this.f35842c.f35779h1.get(), (C37020g) this.f35842c.f35832x0.get());
                    case 102:
                        return new C39863i0((C31186b) this.f35840a.f36163A2.get());
                    case 103:
                        return new C28291b((C28113a) this.f35840a.f36454l1.get());
                    case 104:
                        return new C39857g((C31186b) this.f35840a.f36163A2.get(), (C28291b) this.f35842c.f35779h1.get());
                    case 105:
                        return new C36990a();
                    case 106:
                        return new C37264h((C37154c) this.f35842c.f35799m1.get(), (C36990a) this.f35842c.f35791k1.get());
                    case 107:
                        return new C37154c((C30123a) this.f35842c.f35795l1.get(), (C36990a) this.f35842c.f35791k1.get());
                    case 108:
                        return new C30123a();
                    case 109:
                        return new C12147a0();
                    case 110:
                        return new C39885x((C28290a) this.f35842c.f35809p1.get(), (C39862i) this.f35842c.f35812q1.get(), (C39860h) this.f35842c.f35741X0.get(), (C39889y) this.f35842c.f35744Y0.get(), this.f35840a.cardsAndDetailsUseCase(), (C25339b) this.f35840a.f36321U0.get(), (C38793a) this.f35840a.f36559y2.get());
                    case 111:
                        return new C28290a((C28113a) this.f35840a.f36454l1.get());
                    case 112:
                        return new C39862i((C31186b) this.f35840a.f36163A2.get());
                    case 113:
                        return new C39871l0((C31186b) this.f35840a.f36163A2.get(), (C37020g) this.f35842c.f35832x0.get(), (C39863i0) this.f35842c.f35775g1.get());
                    case 114:
                        return new C39877p((C31186b) this.f35840a.f36163A2.get());
                    case 115:
                        return new C12149b0();
                    case 116:
                        return new C39849d((C31186b) this.f35840a.f36163A2.get(), (C39863i0) this.f35842c.f35775g1.get(), (C25351j) this.f35840a.f36464m3.get());
                    case 117:
                        return new C12151c0();
                    case 118:
                        return new C12153d0();
                    case 119:
                        return new C37289c((C37013a) this.f35841b.f35917k.get());
                    case 120:
                        return new C37293g((C37013a) this.f35841b.f35917k.get());
                    case 121:
                        return new C37287a((C37013a) this.f35841b.f35917k.get());
                    case 122:
                        return new C37292f((C37013a) this.f35841b.f35917k.get());
                    case 123:
                        return new C12155e0();
                    case 124:
                        return new C12157f0();
                    case 125:
                        return new C39495b(this.f35840a.cardsAndDetailsUseCase());
                    case 126:
                        return new C32038a();
                    case C11051p3.f31760d:
                        return new C38895u0((C38606b) this.f35840a.f36281P0.get());
                    case 128:
                        return new C12161h0();
                    case 129:
                        return new C38395a(C17957b.m61875a(this.f35840a.f36388d), (C38399b) this.f35842c.f35697I1.get());
                    case 130:
                        return new C38399b(C17957b.m61875a(this.f35840a.f36388d));
                    case 131:
                        return new C29096g(this.f35840a.m46328o9(), new C26050a(), (C19394c) this.f35842c.f35719Q.get());
                    case 132:
                        return new C12163i0();
                    case 133:
                        return new C12165j0();
                    case 134:
                        return new C38269a(C17957b.m61875a(this.f35840a.f36388d), (C36990a) this.f35842c.f35791k1.get(), (TargetEnvironment) this.f35840a.f36216H.get());
                    case 135:
                        return new C12167k0();
                    case 136:
                        return new C37056i((C36860a) this.f35840a.f36165A4.get());
                    case 137:
                        return new C37046c((C36860a) this.f35840a.f36165A4.get());
                    case 138:
                        return new C37048e((C25341c) this.f35840a.f36297R0.get(), (C37044b) this.f35842c.f35730T1.get(), (C37054h) this.f35842c.f35733U1.get());
                    case 139:
                        return new C37044b((C25339b) this.f35840a.f36321U0.get(), (C37342a) this.f35842c.f35727S1.get());
                    case 140:
                        return new C37342a();
                    case 141:
                        return new C37054h(this.f35842c.m44680R6(), (C37342a) this.f35842c.f35727S1.get());
                    case 142:
                        return new C37058k((C36860a) this.f35840a.f36165A4.get());
                    case 143:
                        return new C37057j();
                    case 144:
                        return new C12169l0();
                    case 145:
                        return new C12171m0();
                    case 146:
                        return new C34948a();
                    case 147:
                        return new C40136a((C39988a) this.f35840a.f36189D4.get());
                    case 148:
                        return new C40137b((C39988a) this.f35840a.f36189D4.get());
                    case 149:
                        return new C40138c((C39988a) this.f35840a.f36189D4.get());
                    case 150:
                        return new C29824b((C19269a) this.f35842c.f35784i2.get());
                    case 151:
                        return new C29561a((IRetrofitService) this.f35840a.f36350Y.get());
                    case 152:
                        return new C26143a();
                    case 153:
                        return C32018d.m94463a(this.f35842c.f35753b);
                    case 154:
                        return C38390b.m112754a(this.f35842c.f35757c);
                    default:
                        throw new AssertionError(this.f35843d);
                }
            }

            public Object get() {
                int i = this.f35843d / 100;
                if (i == 0) {
                    return m45163d();
                }
                if (i == 1) {
                    return m45164e();
                }
                throw new AssertionError(this.f35843d);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: A6 */
        public C16589c m44528A6() {
            return new C16589c((C17110a) this.f35728T.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: A7 */
        public C19225f m44529A7() {
            return new C19225f((C38267a) this.f35761d.f36558y1.get());
        }

        /* renamed from: A8 */
        private DepositDetailsActivity m44530A8(DepositDetailsActivity depositDetailsActivity) {
            C30746qa.m91941d(depositDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(depositDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(depositDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(depositDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C23175v.m74947a(depositDetailsActivity, (C26423k) this.f35672A0.get());
            return depositDetailsActivity;
        }

        /* renamed from: A9 */
        private OperationDetailsActivity m44531A9(OperationDetailsActivity operationDetailsActivity) {
            C30746qa.m91941d(operationDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(operationDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(operationDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(operationDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C35536w1.m105524d(operationDetailsActivity, (Client) this.f35761d.f36389d0.get());
            C35536w1.m105525e(operationDetailsActivity, (C41438c) this.f35761d.f36184D.get());
            C35536w1.m105526f(operationDetailsActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C35536w1.m105522b(operationDetailsActivity, this.f35761d.getTransactionCategoriesUseCase());
            C35536w1.m105527g(operationDetailsActivity, (C20100q) this.f35761d.f36565z0.get());
            C35536w1.m105521a(operationDetailsActivity, m44697T5());
            C35536w1.m105523c(operationDetailsActivity, (BankApi) this.f35761d.f36405f0.get());
            return operationDetailsActivity;
        }

        /* renamed from: Aa */
        private TemplatesAndProvidersActivity m44532Aa(TemplatesAndProvidersActivity templatesAndProvidersActivity) {
            C30746qa.m91941d(templatesAndProvidersActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(templatesAndProvidersActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(templatesAndProvidersActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(templatesAndProvidersActivity, (C31663a) this.f35761d.f36200F.get());
            C19923n.m65804a(templatesAndProvidersActivity, (Client) this.f35761d.f36389d0.get());
            return templatesAndProvidersActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: B6 */
        public C38877m m44537B6() {
            return new C38877m((C38606b) this.f35761d.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: B7 */
        public C16790v0 m44538B7() {
            return new C16790v0((C16586a) this.f35804o.get());
        }

        /* renamed from: B8 */
        private DepositProlongationActivity m44539B8(DepositProlongationActivity depositProlongationActivity) {
            C30746qa.m91941d(depositProlongationActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(depositProlongationActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(depositProlongationActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(depositProlongationActivity, (C31663a) this.f35761d.f36200F.get());
            C25163c.m80228a(depositProlongationActivity, (C25170h) this.f35675B0.get());
            return depositProlongationActivity;
        }

        /* renamed from: B9 */
        private OrderCardResultActivity m44540B9(OrderCardResultActivity orderCardResultActivity) {
            C30746qa.m91941d(orderCardResultActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(orderCardResultActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(orderCardResultActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(orderCardResultActivity, (C31663a) this.f35761d.f36200F.get());
            C17670u.m61323b(orderCardResultActivity, (C12544i2) this.f35828w.get());
            C17670u.m61322a(orderCardResultActivity, (Client) this.f35761d.f36389d0.get());
            return orderCardResultActivity;
        }

        /* renamed from: Ba */
        private TermsAndConditionsActivity m44541Ba(TermsAndConditionsActivity termsAndConditionsActivity) {
            C30746qa.m91941d(termsAndConditionsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(termsAndConditionsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(termsAndConditionsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(termsAndConditionsActivity, (C31663a) this.f35761d.f36200F.get());
            C20478f.m66684a(termsAndConditionsActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            return termsAndConditionsActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: C6 */
        public C26629k m44546C6() {
            return new C26629k((C27868b) this.f35761d.f36299R2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: C7 */
        public C16792w0 m44547C7() {
            return new C16792w0((C16586a) this.f35804o.get());
        }

        /* renamed from: C8 */
        private DocumentsUploadActivity m44548C8(DocumentsUploadActivity documentsUploadActivity) {
            C30746qa.m91941d(documentsUploadActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(documentsUploadActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(documentsUploadActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(documentsUploadActivity, (C31663a) this.f35761d.f36200F.get());
            C22632a.m73332a(documentsUploadActivity, (C22633b.C22638d) this.f35811q0.get());
            return documentsUploadActivity;
        }

        /* renamed from: C9 */
        private OrderDebitCardActivity m44549C9(OrderDebitCardActivity orderDebitCardActivity) {
            C30746qa.m91941d(orderDebitCardActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(orderDebitCardActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(orderDebitCardActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(orderDebitCardActivity, (C31663a) this.f35761d.f36200F.get());
            C17654e0.m61310a(orderDebitCardActivity, (C12613q2) this.f35707M.get());
            return orderDebitCardActivity;
        }

        /* renamed from: Ca */
        private ThreeDSecurityActivity m44550Ca(ThreeDSecurityActivity threeDSecurityActivity) {
            C30746qa.m91941d(threeDSecurityActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(threeDSecurityActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(threeDSecurityActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(threeDSecurityActivity, (C31663a) this.f35761d.f36200F.get());
            C35444m2.m105201a(threeDSecurityActivity, (RootBankApiManager) this.f35761d.f36413g0.get());
            C35444m2.m105202b(threeDSecurityActivity, (C41438c) this.f35761d.f36184D.get());
            C35444m2.m105203c(threeDSecurityActivity, (C27494a) this.f35761d.f36414g1.get());
            return threeDSecurityActivity;
        }

        /* renamed from: D6 */
        private C26630l m44555D6() {
            return new C26630l((C27868b) this.f35761d.f36299R2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: D7 */
        public C31671d m44556D7() {
            return new C31671d((C36357a) this.f35761d.f36447k2.get(), m44630La(), this.f35761d.m46286k9());
        }

        /* renamed from: D8 */
        private DomesticTransferWizardActivity m44557D8(DomesticTransferWizardActivity domesticTransferWizardActivity) {
            C30746qa.m91941d(domesticTransferWizardActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(domesticTransferWizardActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(domesticTransferWizardActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(domesticTransferWizardActivity, (C31663a) this.f35761d.f36200F.get());
            C35867d.m106708a(domesticTransferWizardActivity, (BankApi) this.f35761d.f36405f0.get());
            C35867d.m106709b(domesticTransferWizardActivity, (Client) this.f35761d.f36389d0.get());
            C35867d.m106710c(domesticTransferWizardActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            return domesticTransferWizardActivity;
        }

        /* renamed from: D9 */
        private OrderInstantCardActivity m44558D9(OrderInstantCardActivity orderInstantCardActivity) {
            C30746qa.m91941d(orderInstantCardActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(orderInstantCardActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(orderInstantCardActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(orderInstantCardActivity, (C31663a) this.f35761d.f36200F.get());
            return orderInstantCardActivity;
        }

        /* renamed from: Da */
        private TransferLoaderActivity m44559Da(TransferLoaderActivity transferLoaderActivity) {
            C30746qa.m91941d(transferLoaderActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(transferLoaderActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(transferLoaderActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(transferLoaderActivity, (C31663a) this.f35761d.f36200F.get());
            C34906e0.m102708a(transferLoaderActivity, (RootBankApiManager) this.f35761d.f36413g0.get());
            C34906e0.m102709b(transferLoaderActivity, (Client) this.f35761d.f36389d0.get());
            C34906e0.m102710c(transferLoaderActivity, (C41438c) this.f35761d.f36184D.get());
            C34906e0.m102711d(transferLoaderActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            return transferLoaderActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: E6 */
        public C16744h m44564E6() {
            return new C16744h((C16586a) this.f35804o.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: E7 */
        public C38880n0 m44565E7() {
            return new C38880n0((C38606b) this.f35761d.f36281P0.get());
        }

        /* renamed from: E8 */
        private ExchangeActivity m44566E8(ExchangeActivity exchangeActivity) {
            C30746qa.m91941d(exchangeActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(exchangeActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(exchangeActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(exchangeActivity, (C31663a) this.f35761d.f36200F.get());
            C35428k.m105170a(exchangeActivity, (RootBankApiManager) this.f35761d.f36413g0.get());
            C35428k.m105171b(exchangeActivity, (Client) this.f35761d.f36389d0.get());
            C35428k.m105172c(exchangeActivity, (C41438c) this.f35761d.f36184D.get());
            C35428k.m105173d(exchangeActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            return exchangeActivity;
        }

        /* renamed from: E9 */
        private OtherSTODetailsActivity m44567E9(OtherSTODetailsActivity otherSTODetailsActivity) {
            C30746qa.m91941d(otherSTODetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(otherSTODetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(otherSTODetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(otherSTODetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C34903d0.m102702a(otherSTODetailsActivity, (Client) this.f35761d.f36389d0.get());
            C34903d0.m102703b(otherSTODetailsActivity, (C41438c) this.f35761d.f36184D.get());
            C34903d0.m102704c(otherSTODetailsActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C34926v.m102731g(otherSTODetailsActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C34926v.m102727c(otherSTODetailsActivity, m44662P6());
            C34926v.m102733i(otherSTODetailsActivity, m44702Ta());
            C34926v.m102728d(otherSTODetailsActivity, m44612Ja());
            C34926v.m102725a(otherSTODetailsActivity, m44724W5());
            C34926v.m102734j(otherSTODetailsActivity, m44783cb());
            C34926v.m102726b(otherSTODetailsActivity, this.f35761d.m46115T7());
            C34926v.m102729e(otherSTODetailsActivity, (BankApi) this.f35761d.f36405f0.get());
            C34926v.m102730f(otherSTODetailsActivity, (Client) this.f35761d.f36389d0.get());
            C34926v.m102732h(otherSTODetailsActivity, (C27494a) this.f35761d.f36414g1.get());
            C34914j.m102721a(otherSTODetailsActivity, (C29742a) this.f35825v.get());
            C34914j.m102722b(otherSTODetailsActivity, (BankApi) this.f35761d.f36405f0.get());
            C34914j.m102723c(otherSTODetailsActivity, (Client) this.f35761d.f36389d0.get());
            return otherSTODetailsActivity;
        }

        /* renamed from: Ea */
        private TransferResultActivity m44568Ea(TransferResultActivity transferResultActivity) {
            C30746qa.m91941d(transferResultActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(transferResultActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(transferResultActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(transferResultActivity, (C31663a) this.f35761d.f36200F.get());
            C35450n2.m105212c(transferResultActivity, (Client) this.f35761d.f36389d0.get());
            C35450n2.m105213d(transferResultActivity, (C41438c) this.f35761d.f36184D.get());
            C35450n2.m105211b(transferResultActivity, m44689S6());
            C35450n2.m105210a(transferResultActivity, m44808f6());
            return transferResultActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: F6 */
        public C38879n m44573F6() {
            return new C38879n((C38606b) this.f35761d.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: F7 */
        public C39178b m44574F7() {
            return new C39178b((C38606b) this.f35761d.f36281P0.get());
        }

        /* renamed from: F8 */
        private ExchangeMrPointsToPlusActivity m44575F8(ExchangeMrPointsToPlusActivity exchangeMrPointsToPlusActivity) {
            C30746qa.m91941d(exchangeMrPointsToPlusActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(exchangeMrPointsToPlusActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(exchangeMrPointsToPlusActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(exchangeMrPointsToPlusActivity, (C31663a) this.f35761d.f36200F.get());
            return exchangeMrPointsToPlusActivity;
        }

        /* renamed from: F9 */
        private OtherTemplateDetailsActivity m44576F9(OtherTemplateDetailsActivity otherTemplateDetailsActivity) {
            C30746qa.m91941d(otherTemplateDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(otherTemplateDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(otherTemplateDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(otherTemplateDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C34903d0.m102702a(otherTemplateDetailsActivity, (Client) this.f35761d.f36389d0.get());
            C34903d0.m102703b(otherTemplateDetailsActivity, (C41438c) this.f35761d.f36184D.get());
            C34903d0.m102704c(otherTemplateDetailsActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C34926v.m102731g(otherTemplateDetailsActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C34926v.m102727c(otherTemplateDetailsActivity, m44662P6());
            C34926v.m102733i(otherTemplateDetailsActivity, m44702Ta());
            C34926v.m102728d(otherTemplateDetailsActivity, m44612Ja());
            C34926v.m102725a(otherTemplateDetailsActivity, m44724W5());
            C34926v.m102734j(otherTemplateDetailsActivity, m44783cb());
            C34926v.m102726b(otherTemplateDetailsActivity, this.f35761d.m46115T7());
            C34926v.m102729e(otherTemplateDetailsActivity, (BankApi) this.f35761d.f36405f0.get());
            C34926v.m102730f(otherTemplateDetailsActivity, (Client) this.f35761d.f36389d0.get());
            C34926v.m102732h(otherTemplateDetailsActivity, (C27494a) this.f35761d.f36414g1.get());
            C34917m.m102724a(otherTemplateDetailsActivity, (Client) this.f35761d.f36389d0.get());
            return otherTemplateDetailsActivity;
        }

        /* renamed from: Fa */
        private TransferTemplatesListActivity m44577Fa(TransferTemplatesListActivity transferTemplatesListActivity) {
            C30746qa.m91941d(transferTemplatesListActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(transferTemplatesListActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(transferTemplatesListActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(transferTemplatesListActivity, (C31663a) this.f35761d.f36200F.get());
            C35456o2.m105240a(transferTemplatesListActivity, (Client) this.f35761d.f36389d0.get());
            C35456o2.m105241b(transferTemplatesListActivity, (C41438c) this.f35761d.f36184D.get());
            C35456o2.m105242c(transferTemplatesListActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            return transferTemplatesListActivity;
        }

        /* renamed from: G6 */
        private C26631m m44582G6() {
            return new C26631m((C27868b) this.f35761d.f36299R2.get());
        }

        /* renamed from: G8 */
        private ExpressLoanDetailsActivity m44583G8(ExpressLoanDetailsActivity expressLoanDetailsActivity) {
            C30746qa.m91941d(expressLoanDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(expressLoanDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(expressLoanDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(expressLoanDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C31294g.m92917c(expressLoanDetailsActivity, m44783cb());
            C31294g.m92915a(expressLoanDetailsActivity, (BankApi) this.f35761d.f36405f0.get());
            C31294g.m92916b(expressLoanDetailsActivity, (C27494a) this.f35761d.f36414g1.get());
            return expressLoanDetailsActivity;
        }

        /* renamed from: G9 */
        private OtherTransferDetailsActivity m44584G9(OtherTransferDetailsActivity otherTransferDetailsActivity) {
            C30746qa.m91941d(otherTransferDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(otherTransferDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(otherTransferDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(otherTransferDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C34903d0.m102702a(otherTransferDetailsActivity, (Client) this.f35761d.f36389d0.get());
            C34903d0.m102703b(otherTransferDetailsActivity, (C41438c) this.f35761d.f36184D.get());
            C34903d0.m102704c(otherTransferDetailsActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C34926v.m102731g(otherTransferDetailsActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C34926v.m102727c(otherTransferDetailsActivity, m44662P6());
            C34926v.m102733i(otherTransferDetailsActivity, m44702Ta());
            C34926v.m102728d(otherTransferDetailsActivity, m44612Ja());
            C34926v.m102725a(otherTransferDetailsActivity, m44724W5());
            C34926v.m102734j(otherTransferDetailsActivity, m44783cb());
            C34926v.m102726b(otherTransferDetailsActivity, this.f35761d.m46115T7());
            C34926v.m102729e(otherTransferDetailsActivity, (BankApi) this.f35761d.f36405f0.get());
            C34926v.m102730f(otherTransferDetailsActivity, (Client) this.f35761d.f36389d0.get());
            C34926v.m102732h(otherTransferDetailsActivity, (C27494a) this.f35761d.f36414g1.get());
            return otherTransferDetailsActivity;
        }

        /* renamed from: Ga */
        private TransportPointExchangeActivity m44585Ga(TransportPointExchangeActivity transportPointExchangeActivity) {
            C30746qa.m91941d(transportPointExchangeActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(transportPointExchangeActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(transportPointExchangeActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(transportPointExchangeActivity, (C31663a) this.f35761d.f36200F.get());
            C35474p2.m105334a(transportPointExchangeActivity, m44959v6());
            C35474p2.m105335b(transportPointExchangeActivity, (BankApi) this.f35761d.f36405f0.get());
            C35474p2.m105336c(transportPointExchangeActivity, (RootBankApiManager) this.f35761d.f36413g0.get());
            C35474p2.m105337d(transportPointExchangeActivity, (C41438c) this.f35761d.f36184D.get());
            return transportPointExchangeActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: H6 */
        public C16753k m44590H6() {
            return new C16753k((C16586a) this.f35804o.get());
        }

        /* renamed from: H7 */
        private C20534p m44591H7() {
            return new C20534p(this.f35761d.m46328o9());
        }

        /* renamed from: H8 */
        private FormActivity m44592H8(FormActivity formActivity) {
            C30746qa.m91941d(formActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(formActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(formActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(formActivity, (C31663a) this.f35761d.f36200F.get());
            C39159l.m114246a(formActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            return formActivity;
        }

        /* renamed from: H9 */
        private OtherTransferTypeListActivity m44593H9(OtherTransferTypeListActivity otherTransferTypeListActivity) {
            C30746qa.m91941d(otherTransferTypeListActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(otherTransferTypeListActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(otherTransferTypeListActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(otherTransferTypeListActivity, (C31663a) this.f35761d.f36200F.get());
            C31136b.m92654a(otherTransferTypeListActivity, (C31138d) this.f35756b2.get());
            return otherTransferTypeListActivity;
        }

        /* renamed from: Ha */
        private TransportPointExchangeSuccessActivity m44594Ha(TransportPointExchangeSuccessActivity transportPointExchangeSuccessActivity) {
            C30746qa.m91941d(transportPointExchangeSuccessActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(transportPointExchangeSuccessActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(transportPointExchangeSuccessActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(transportPointExchangeSuccessActivity, (C31663a) this.f35761d.f36200F.get());
            C35480q2.m105350a(transportPointExchangeSuccessActivity, (Client) this.f35761d.f36389d0.get());
            return transportPointExchangeSuccessActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: I6 */
        public C16758m m44599I6() {
            return new C16758m(m44942t7(), (C16740f) this.f35807p.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: I7 */
        public C29407n m44600I7() {
            return new C29407n((C29077c) this.f35761d.f36375b2.get());
        }

        /* renamed from: I8 */
        private GTActivity m44601I8(GTActivity gTActivity) {
            C30746qa.m91941d(gTActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(gTActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(gTActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(gTActivity, (C31663a) this.f35761d.f36200F.get());
            C26964i.m83791a(gTActivity, this.f35761d.m46115T7());
            return gTActivity;
        }

        /* renamed from: I9 */
        private OwnSTODetailsActivity m44602I9(OwnSTODetailsActivity ownSTODetailsActivity) {
            C30746qa.m91941d(ownSTODetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(ownSTODetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(ownSTODetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(ownSTODetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C34903d0.m102702a(ownSTODetailsActivity, (Client) this.f35761d.f36389d0.get());
            C34903d0.m102703b(ownSTODetailsActivity, (C41438c) this.f35761d.f36184D.get());
            C34903d0.m102704c(ownSTODetailsActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C34884b0.m102634a(ownSTODetailsActivity, (BankApi) this.f35761d.f36405f0.get());
            C34884b0.m102635b(ownSTODetailsActivity, (Client) this.f35761d.f36389d0.get());
            C34928x.m102739e(ownSTODetailsActivity, this.f35761d.m46166Y8());
            C34928x.m102735a(ownSTODetailsActivity, (C29742a) this.f35825v.get());
            C34928x.m102737c(ownSTODetailsActivity, (Client) this.f35761d.f36389d0.get());
            C34928x.m102736b(ownSTODetailsActivity, (BankApi) this.f35761d.f36405f0.get());
            C34928x.m102738d(ownSTODetailsActivity, (C27494a) this.f35761d.f36414g1.get());
            return ownSTODetailsActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ia */
        public C20294d m44603Ia() {
            return new C20294d((C24779a) this.f35761d.f36373b0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: J6 */
        public C16595i m44608J6() {
            return new C16595i((C38606b) this.f35761d.f36281P0.get());
        }

        /* renamed from: J7 */
        private void m44609J7(C38389a aVar, C32017c cVar, Activity activity) {
            this.f35773g = C18327b.m62669a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 0));
            this.f35777h = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 1));
            this.f35781i = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 2));
            this.f35785j = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 4));
            this.f35789k = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 3));
            this.f35793l = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 6));
            this.f35797m = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 7));
            this.f35801n = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 5));
            this.f35804o = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 10));
            this.f35807p = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 9));
            this.f35810q = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 11));
            this.f35813r = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 12));
            this.f35816s = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 8));
            this.f35819t = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 13));
            C12145a aVar2 = new C12145a(this.f35761d, this.f35765e, this.f35769f, 15);
            this.f35822u = aVar2;
            this.f35825v = C18331f.m62681a(aVar2);
            this.f35828w = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 14));
            this.f35831x = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 18));
            this.f35834y = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 19));
            this.f35837z = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 20));
            this.f35671A = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 21));
            this.f35674B = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 23));
            this.f35677C = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 22));
            this.f35680D = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 24));
            this.f35683E = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 25));
            this.f35686F = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 26));
            this.f35689G = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 27));
            this.f35692H = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 17));
            this.f35695I = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 28));
            this.f35698J = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 29));
            this.f35701K = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 30));
            this.f35704L = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 31));
            this.f35707M = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 16));
            this.f35710N = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 32));
            this.f35713O = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 34));
            C12145a aVar3 = new C12145a(this.f35761d, this.f35765e, this.f35769f, 36);
            this.f35716P = aVar3;
            this.f35719Q = C18331f.m62681a(aVar3);
            C12145a aVar4 = new C12145a(this.f35761d, this.f35765e, this.f35769f, 35);
            this.f35722R = aVar4;
            this.f35725S = C18331f.m62681a(aVar4);
            this.f35728T = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 37));
            this.f35731U = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 33));
            this.f35734V = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 38));
            this.f35737W = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 40));
            this.f35740X = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 39));
            this.f35743Y = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 41));
            this.f35746Z = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 42));
            this.f35750a0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 44));
            this.f35754b0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 43));
            this.f35758c0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 47));
            this.f35762d0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 48));
            this.f35766e0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 46));
            this.f35770f0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 50));
            this.f35774g0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 49));
            this.f35778h0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 51));
            this.f35782i0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 52));
            this.f35786j0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 53));
            this.f35790k0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 45));
            this.f35794l0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 57));
            this.f35798m0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 58));
            this.f35802n0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 56));
            this.f35805o0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 55));
            this.f35808p0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 59));
            this.f35811q0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 54));
            this.f35814r0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 61));
            this.f35817s0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 60));
            this.f35820t0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 63));
            this.f35823u0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 62));
            this.f35826v0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 64));
            this.f35829w0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 65));
            this.f35832x0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 67));
            this.f35835y0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 66));
            this.f35838z0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 69));
            this.f35672A0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 68));
            this.f35675B0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 70));
            this.f35678C0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 71));
            this.f35681D0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 73));
            this.f35684E0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 72));
            C12145a aVar5 = new C12145a(this.f35761d, this.f35765e, this.f35769f, 75);
            this.f35687F0 = aVar5;
            this.f35690G0 = C18331f.m62681a(aVar5);
            this.f35693H0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 74));
            this.f35696I0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 77));
            this.f35699J0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 76));
            this.f35702K0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 78));
            this.f35705L0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 79));
            this.f35708M0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 80));
            this.f35711N0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 81));
            this.f35714O0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 82));
            this.f35717P0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 84));
            this.f35720Q0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 87));
            this.f35723R0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 86));
            this.f35726S0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 85));
            this.f35729T0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 88));
            this.f35732U0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 89));
            this.f35735V0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 90));
            this.f35738W0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 83));
            this.f35741X0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 94));
            this.f35744Y0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 95));
            this.f35747Z0 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 93));
            this.f35751a1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 92));
            this.f35755b1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 97));
        }

        /* renamed from: J8 */
        private GTIntroductionActivity m44610J8(GTIntroductionActivity gTIntroductionActivity) {
            C30746qa.m91941d(gTIntroductionActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(gTIntroductionActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(gTIntroductionActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(gTIntroductionActivity, (C31663a) this.f35761d.f36200F.get());
            return gTIntroductionActivity;
        }

        /* renamed from: J9 */
        private OwnTemplateDetailsActivity m44611J9(OwnTemplateDetailsActivity ownTemplateDetailsActivity) {
            C30746qa.m91941d(ownTemplateDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(ownTemplateDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(ownTemplateDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(ownTemplateDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C34903d0.m102702a(ownTemplateDetailsActivity, (Client) this.f35761d.f36389d0.get());
            C34903d0.m102703b(ownTemplateDetailsActivity, (C41438c) this.f35761d.f36184D.get());
            C34903d0.m102704c(ownTemplateDetailsActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C34884b0.m102634a(ownTemplateDetailsActivity, (BankApi) this.f35761d.f36405f0.get());
            C34884b0.m102635b(ownTemplateDetailsActivity, (Client) this.f35761d.f36389d0.get());
            C34881a0.m102630a(ownTemplateDetailsActivity, (Client) this.f35761d.f36389d0.get());
            return ownTemplateDetailsActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ja */
        public C28106n m44612Ja() {
            return new C28106n((C28094c) this.f35761d.f36235J2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: K6 */
        public C16600j m44617K6() {
            return new C16600j((C17110a) this.f35728T.get());
        }

        /* renamed from: K7 */
        private void m44618K7(C38389a aVar, C32017c cVar, Activity activity) {
            this.f35759c1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 98));
            this.f35763d1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 96));
            this.f35767e1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 100));
            this.f35771f1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 99));
            this.f35775g1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 102));
            this.f35779h1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 103));
            this.f35783i1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 101));
            this.f35787j1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 104));
            this.f35791k1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 105));
            this.f35795l1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 108));
            this.f35799m1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 107));
            this.f35803n1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 106));
            this.f35806o1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 91));
            this.f35809p1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 111));
            this.f35812q1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 112));
            this.f35815r1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 110));
            this.f35818s1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 113));
            this.f35821t1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 114));
            this.f35824u1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 109));
            this.f35827v1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 116));
            this.f35830w1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 115));
            this.f35833x1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 117));
            this.f35836y1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 119));
            this.f35839z1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 120));
            this.f35673A1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 121));
            this.f35676B1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 122));
            this.f35679C1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 118));
            this.f35682D1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 123));
            this.f35685E1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 125));
            this.f35688F1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 126));
            this.f35691G1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, C11051p3.f31760d));
            this.f35694H1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 124));
            this.f35697I1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 130));
            this.f35700J1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 129));
            C12145a aVar2 = new C12145a(this.f35761d, this.f35765e, this.f35769f, 131);
            this.f35703K1 = aVar2;
            this.f35706L1 = C18331f.m62681a(aVar2);
            this.f35709M1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 128));
            this.f35712N1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 132));
            this.f35715O1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 134));
            this.f35718P1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 133));
            this.f35721Q1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 136));
            this.f35724R1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 137));
            this.f35727S1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 140));
            this.f35730T1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 139));
            this.f35733U1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 141));
            this.f35736V1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 138));
            this.f35739W1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 142));
            this.f35742X1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 143));
            this.f35745Y1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 135));
            this.f35748Z1 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 144));
            this.f35752a2 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 146));
            this.f35756b2 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 145));
            C12145a aVar3 = new C12145a(this.f35761d, this.f35765e, this.f35769f, 147);
            this.f35760c2 = aVar3;
            this.f35764d2 = C18331f.m62681a(aVar3);
            C12145a aVar4 = new C12145a(this.f35761d, this.f35765e, this.f35769f, 148);
            this.f35768e2 = aVar4;
            this.f35772f2 = C18331f.m62681a(aVar4);
            C12145a aVar5 = new C12145a(this.f35761d, this.f35765e, this.f35769f, 149);
            this.f35776g2 = aVar5;
            this.f35780h2 = C18331f.m62681a(aVar5);
            this.f35784i2 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 151));
            this.f35788j2 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 150));
            this.f35792k2 = C18331f.m62681a(new C12145a(this.f35761d, this.f35765e, this.f35769f, 152));
            this.f35796l2 = new C12145a(this.f35761d, this.f35765e, this.f35769f, 153);
            this.f35800m2 = new C12145a(this.f35761d, this.f35765e, this.f35769f, 154);
        }

        /* renamed from: K8 */
        private GTMoneyExchangeActivity m44619K8(GTMoneyExchangeActivity gTMoneyExchangeActivity) {
            C30746qa.m91941d(gTMoneyExchangeActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(gTMoneyExchangeActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(gTMoneyExchangeActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(gTMoneyExchangeActivity, (C31663a) this.f35761d.f36200F.get());
            return gTMoneyExchangeActivity;
        }

        /* renamed from: K9 */
        private OwnTransferDetailsActivity m44620K9(OwnTransferDetailsActivity ownTransferDetailsActivity) {
            C30746qa.m91941d(ownTransferDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(ownTransferDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(ownTransferDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(ownTransferDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C34903d0.m102702a(ownTransferDetailsActivity, (Client) this.f35761d.f36389d0.get());
            C34903d0.m102703b(ownTransferDetailsActivity, (C41438c) this.f35761d.f36184D.get());
            C34903d0.m102704c(ownTransferDetailsActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C34884b0.m102634a(ownTransferDetailsActivity, (BankApi) this.f35761d.f36405f0.get());
            C34884b0.m102635b(ownTransferDetailsActivity, (Client) this.f35761d.f36389d0.get());
            return ownTransferDetailsActivity;
        }

        /* renamed from: Ka */
        private C26635p m44621Ka() {
            return new C26635p((C27867a) this.f35761d.f36259M2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: L6 */
        public C29397e m44626L6() {
            return new C29397e((C29077c) this.f35761d.f36375b2.get());
        }

        /* renamed from: L7 */
        private ActivateInstantCardActivity m44627L7(ActivateInstantCardActivity activateInstantCardActivity) {
            C30746qa.m91941d(activateInstantCardActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(activateInstantCardActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(activateInstantCardActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(activateInstantCardActivity, (C31663a) this.f35761d.f36200F.get());
            return activateInstantCardActivity;
        }

        /* renamed from: L8 */
        private GTMyInvestmentsActivity m44628L8(GTMyInvestmentsActivity gTMyInvestmentsActivity) {
            C30746qa.m91941d(gTMyInvestmentsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(gTMyInvestmentsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(gTMyInvestmentsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(gTMyInvestmentsActivity, (C31663a) this.f35761d.f36200F.get());
            return gTMyInvestmentsActivity;
        }

        /* renamed from: L9 */
        private P2PLinkActivity m44629L9(P2PLinkActivity p2PLinkActivity) {
            C30746qa.m91941d(p2PLinkActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(p2PLinkActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(p2PLinkActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(p2PLinkActivity, (C31663a) this.f35761d.f36200F.get());
            return p2PLinkActivity;
        }

        /* renamed from: La */
        private C31677g m44630La() {
            return new C31677g(this.f35761d.m46431y8());
        }

        /* access modifiers changed from: private */
        /* renamed from: M6 */
        public C16761n m44635M6() {
            return new C16761n((C16586a) this.f35804o.get());
        }

        /* renamed from: M7 */
        private AddIncomeActivity m44636M7(AddIncomeActivity addIncomeActivity) {
            C30746qa.m91941d(addIncomeActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(addIncomeActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(addIncomeActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(addIncomeActivity, (C31663a) this.f35761d.f36200F.get());
            C30250k.m91350a(addIncomeActivity, (C26801g.C26807c) this.f35754b0.get());
            return addIncomeActivity;
        }

        /* renamed from: M8 */
        private GTOnboardingIntroActivity m44637M8(GTOnboardingIntroActivity gTOnboardingIntroActivity) {
            C30746qa.m91941d(gTOnboardingIntroActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(gTOnboardingIntroActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(gTOnboardingIntroActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(gTOnboardingIntroActivity, (C31663a) this.f35761d.f36200F.get());
            return gTOnboardingIntroActivity;
        }

        /* renamed from: M9 */
        private ParametersActivity m44638M9(ParametersActivity parametersActivity) {
            C30746qa.m91941d(parametersActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(parametersActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(parametersActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(parametersActivity, (C31663a) this.f35761d.f36200F.get());
            C35540x1.m105536a(parametersActivity, m44779c7());
            C35540x1.m105537b(parametersActivity, (RootBankApiManager) this.f35761d.f36413g0.get());
            C35540x1.m105538c(parametersActivity, (Client) this.f35761d.f36389d0.get());
            C35540x1.m105539d(parametersActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            return parametersActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ma */
        public C17133a m44639Ma() {
            return new C17133a((C17573a) this.f35761d.f36513s4.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: N6 */
        public C36734f m44644N6() {
            return new C36734f((C36356a) this.f35761d.f36517t0.get());
        }

        /* renamed from: N7 */
        private AddTemplateActivity m44645N7(AddTemplateActivity addTemplateActivity) {
            C30746qa.m91941d(addTemplateActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(addTemplateActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(addTemplateActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(addTemplateActivity, (C31663a) this.f35761d.f36200F.get());
            C35342a.m104945a(addTemplateActivity, (Client) this.f35761d.f36389d0.get());
            C35342a.m104946b(addTemplateActivity, (C41438c) this.f35761d.f36184D.get());
            return addTemplateActivity;
        }

        /* renamed from: N8 */
        private GTShareDetailsActivity m44646N8(GTShareDetailsActivity gTShareDetailsActivity) {
            C30746qa.m91941d(gTShareDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(gTShareDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(gTShareDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(gTShareDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C26006w.m81623a(gTShareDetailsActivity, this.f35761d.m46115T7());
            return gTShareDetailsActivity;
        }

        /* renamed from: N9 */
        private PaymentFormActivity m44647N9(PaymentFormActivity paymentFormActivity) {
            C30746qa.m91941d(paymentFormActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(paymentFormActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(paymentFormActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(paymentFormActivity, (C31663a) this.f35761d.f36200F.get());
            C33614f.m98683a(paymentFormActivity, m44959v6());
            C33614f.m98684b(paymentFormActivity, (BankApi) this.f35761d.f36405f0.get());
            C33614f.m98685c(paymentFormActivity, (C27494a) this.f35761d.f36414g1.get());
            return paymentFormActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: Na */
        public C17044v m44648Na() {
            return new C17044v((C16718a) this.f35765e.f35914h.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: O6 */
        public C38883p m44653O6() {
            return new C38883p((C38606b) this.f35761d.f36281P0.get());
        }

        /* renamed from: O7 */
        private AdvancedWizardActivity m44654O7(AdvancedWizardActivity advancedWizardActivity) {
            C30746qa.m91941d(advancedWizardActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(advancedWizardActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(advancedWizardActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(advancedWizardActivity, (C31663a) this.f35761d.f36200F.get());
            C35860a.m106639a(advancedWizardActivity, (RootBankApiManager) this.f35761d.f36413g0.get());
            return advancedWizardActivity;
        }

        /* renamed from: O8 */
        private GTShareTradeDetailsActivity m44655O8(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
            C30746qa.m91941d(gTShareTradeDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(gTShareTradeDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(gTShareTradeDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(gTShareTradeDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            return gTShareTradeDetailsActivity;
        }

        /* renamed from: O9 */
        private p341ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity m44656O9(p341ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity paymentFormActivity) {
            C30746qa.m91941d(paymentFormActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(paymentFormActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(paymentFormActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(paymentFormActivity, (C31663a) this.f35761d.f36200F.get());
            C39159l.m114246a(paymentFormActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C33724b.m99118a(paymentFormActivity, (C33725c.C33726a) this.f35679C1.get());
            return paymentFormActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: Oa */
        public C39861h0 m44657Oa() {
            return new C39861h0((C31186b) this.f35761d.f36163A2.get());
        }

        /* renamed from: P6 */
        private C28103l m44662P6() {
            return new C28103l(m44612Ja());
        }

        /* renamed from: P7 */
        private AllTemplateListActivity m44663P7(AllTemplateListActivity allTemplateListActivity) {
            C30746qa.m91941d(allTemplateListActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(allTemplateListActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(allTemplateListActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(allTemplateListActivity, (C31663a) this.f35761d.f36200F.get());
            C35347b.m104954a(allTemplateListActivity, (Client) this.f35761d.f36389d0.get());
            C35347b.m104955b(allTemplateListActivity, (C41438c) this.f35761d.f36184D.get());
            return allTemplateListActivity;
        }

        /* renamed from: P8 */
        private GTShareTradeReviewActivity m44664P8(GTShareTradeReviewActivity gTShareTradeReviewActivity) {
            C30746qa.m91941d(gTShareTradeReviewActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(gTShareTradeReviewActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(gTShareTradeReviewActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(gTShareTradeReviewActivity, (C31663a) this.f35761d.f36200F.get());
            return gTShareTradeReviewActivity;
        }

        /* renamed from: P9 */
        private PaymentOptionWizardActivity m44665P9(PaymentOptionWizardActivity paymentOptionWizardActivity) {
            C30746qa.m91941d(paymentOptionWizardActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(paymentOptionWizardActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(paymentOptionWizardActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(paymentOptionWizardActivity, (C31663a) this.f35761d.f36200F.get());
            C35879k.m106734f(paymentOptionWizardActivity, m44783cb());
            C35879k.m106729a(paymentOptionWizardActivity, (BankApi) this.f35761d.f36405f0.get());
            C35879k.m106730b(paymentOptionWizardActivity, (Client) this.f35761d.f36389d0.get());
            C35879k.m106731c(paymentOptionWizardActivity, (C41438c) this.f35761d.f36184D.get());
            C35879k.m106732d(paymentOptionWizardActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C35879k.m106733e(paymentOptionWizardActivity, (C27494a) this.f35761d.f36414g1.get());
            return paymentOptionWizardActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: Pa */
        public C28057e m44666Pa() {
            return new C28057e((C27851a) this.f35761d.f36519t2.get(), m44823gb());
        }

        /* access modifiers changed from: private */
        /* renamed from: Q6 */
        public C38891t m44671Q6() {
            return new C38891t((C38606b) this.f35761d.f36281P0.get());
        }

        /* renamed from: Q7 */
        private AutoLiabilityInsuranceActivity m44672Q7(AutoLiabilityInsuranceActivity autoLiabilityInsuranceActivity) {
            C30746qa.m91941d(autoLiabilityInsuranceActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(autoLiabilityInsuranceActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(autoLiabilityInsuranceActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(autoLiabilityInsuranceActivity, (C31663a) this.f35761d.f36200F.get());
            C13591a.m50976a(autoLiabilityInsuranceActivity, (C13592b.C13594b) this.f35777h.get());
            return autoLiabilityInsuranceActivity;
        }

        /* renamed from: Q8 */
        private GTTransactionDetailActivity m44673Q8(GTTransactionDetailActivity gTTransactionDetailActivity) {
            C30746qa.m91941d(gTTransactionDetailActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(gTTransactionDetailActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(gTTransactionDetailActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(gTTransactionDetailActivity, (C31663a) this.f35761d.f36200F.get());
            return gTTransactionDetailActivity;
        }

        /* renamed from: Q9 */
        private PaymentResultActivity m44674Q9(PaymentResultActivity paymentResultActivity) {
            C30746qa.m91941d(paymentResultActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(paymentResultActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(paymentResultActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(paymentResultActivity, (C31663a) this.f35761d.f36200F.get());
            C33774b.m99326a(paymentResultActivity, (C33775c.C33776a) this.f35682D1.get());
            return paymentResultActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: Qa */
        public C37301d m44675Qa() {
            return new C37301d((C38267a) this.f35761d.f36558y1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: R6 */
        public C38894u m44680R6() {
            return new C38894u((C38606b) this.f35761d.f36281P0.get());
        }

        /* renamed from: R7 */
        private BankTransferWizardActivity m44681R7(BankTransferWizardActivity bankTransferWizardActivity) {
            C30746qa.m91941d(bankTransferWizardActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(bankTransferWizardActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(bankTransferWizardActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(bankTransferWizardActivity, (C31663a) this.f35761d.f36200F.get());
            C35861b.m106640a(bankTransferWizardActivity, (BankApi) this.f35761d.f36405f0.get());
            C35861b.m106641b(bankTransferWizardActivity, (Client) this.f35761d.f36389d0.get());
            C35861b.m106642c(bankTransferWizardActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            return bankTransferWizardActivity;
        }

        /* renamed from: R8 */
        private GTWatchlistDetailsActivity m44682R8(GTWatchlistDetailsActivity gTWatchlistDetailsActivity) {
            C30746qa.m91941d(gTWatchlistDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(gTWatchlistDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(gTWatchlistDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(gTWatchlistDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            return gTWatchlistDetailsActivity;
        }

        /* renamed from: R9 */
        private p341ge.bog.mobilebank.p975ui.activities.PaymentResultActivity m44683R9(p341ge.bog.mobilebank.p975ui.activities.PaymentResultActivity paymentResultActivity) {
            C30746qa.m91941d(paymentResultActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(paymentResultActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(paymentResultActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(paymentResultActivity, (C31663a) this.f35761d.f36200F.get());
            C35544y1.m105544b(paymentResultActivity, m44689S6());
            C35544y1.m105543a(paymentResultActivity, m44808f6());
            C35544y1.m105546d(paymentResultActivity, (Client) this.f35761d.f36389d0.get());
            C35544y1.m105545c(paymentResultActivity, (BankApi) this.f35761d.f36405f0.get());
            C35544y1.m105547e(paymentResultActivity, (C41438c) this.f35761d.f36184D.get());
            return paymentResultActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ra */
        public C39497c m44684Ra() {
            return new C39497c((C38606b) this.f35761d.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: S6 */
        public C25180b m44689S6() {
            return new C25180b((C25711a) this.f35761d.f36545w4.get());
        }

        /* renamed from: S7 */
        private BnplApplicationResultActivity m44690S7(BnplApplicationResultActivity bnplApplicationResultActivity) {
            C30746qa.m91941d(bnplApplicationResultActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(bnplApplicationResultActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(bnplApplicationResultActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(bnplApplicationResultActivity, (C31663a) this.f35761d.f36200F.get());
            C13767a.m51411a(bnplApplicationResultActivity, (C13768b.C13770b) this.f35781i.get());
            return bnplApplicationResultActivity;
        }

        /* renamed from: S8 */
        private GamificationActivity m44691S8(GamificationActivity gamificationActivity) {
            C30746qa.m91941d(gamificationActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(gamificationActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(gamificationActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(gamificationActivity, (C31663a) this.f35761d.f36200F.get());
            C26232d.m82031a(gamificationActivity, (C26494a) this.f35678C0.get());
            return gamificationActivity;
        }

        /* renamed from: S9 */
        private PaymentResultListActivity m44692S9(PaymentResultListActivity paymentResultListActivity) {
            C30746qa.m91941d(paymentResultListActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(paymentResultListActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(paymentResultListActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(paymentResultListActivity, (C31663a) this.f35761d.f36200F.get());
            C35548z1.m105551a(paymentResultListActivity, (BankApi) this.f35761d.f36405f0.get());
            C35548z1.m105552b(paymentResultListActivity, (Client) this.f35761d.f36389d0.get());
            C35548z1.m105553c(paymentResultListActivity, (C41438c) this.f35761d.f36184D.get());
            return paymentResultListActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: Sa */
        public C20587i m44693Sa() {
            return new C20587i((C25080a) this.f35761d.f36332V3.get());
        }

        /* renamed from: T5 */
        private C24784c m44697T5() {
            return new C24784c(m44803eb(), (C25260a) this.f35761d.f36187D2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: T6 */
        public C16765p m44698T6() {
            return new C16765p((C16586a) this.f35804o.get());
        }

        /* renamed from: T7 */
        private BnplCategoriesActivity m44699T7(BnplCategoriesActivity bnplCategoriesActivity) {
            C30746qa.m91941d(bnplCategoriesActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(bnplCategoriesActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(bnplCategoriesActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(bnplCategoriesActivity, (C31663a) this.f35761d.f36200F.get());
            return bnplCategoriesActivity;
        }

        /* renamed from: T8 */
        private HouseTemplateGroupActivity m44700T8(HouseTemplateGroupActivity houseTemplateGroupActivity) {
            C30746qa.m91941d(houseTemplateGroupActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(houseTemplateGroupActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(houseTemplateGroupActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(houseTemplateGroupActivity, (C31663a) this.f35761d.f36200F.get());
            C35535w0.m105519a(houseTemplateGroupActivity, (Client) this.f35761d.f36389d0.get());
            C35535w0.m105520b(houseTemplateGroupActivity, (C41438c) this.f35761d.f36184D.get());
            return houseTemplateGroupActivity;
        }

        /* renamed from: T9 */
        private PaymentsTemplateListActivity m44701T9(PaymentsTemplateListActivity paymentsTemplateListActivity) {
            C30746qa.m91941d(paymentsTemplateListActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(paymentsTemplateListActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(paymentsTemplateListActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(paymentsTemplateListActivity, (C31663a) this.f35761d.f36200F.get());
            C35346a2.m104951b(paymentsTemplateListActivity, (Client) this.f35761d.f36389d0.get());
            C35346a2.m104952c(paymentsTemplateListActivity, (C41438c) this.f35761d.f36184D.get());
            C35346a2.m104953d(paymentsTemplateListActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C35346a2.m104950a(paymentsTemplateListActivity, this.f35761d.m46115T7());
            return paymentsTemplateListActivity;
        }

        /* renamed from: Ta */
        private C25508l m44702Ta() {
            return new C25508l((C26093a) this.f35761d.f36203F2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: U5 */
        public C28053a m44706U5() {
            return new C28053a((C27851a) this.f35761d.f36519t2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: U6 */
        public C37298b m44707U6() {
            return new C37298b(m44725W6(), m44863kb());
        }

        /* renamed from: U7 */
        private BnplDetailsActivity m44708U7(BnplDetailsActivity bnplDetailsActivity) {
            C30746qa.m91941d(bnplDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(bnplDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(bnplDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(bnplDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C13821b.m51543a(bnplDetailsActivity, (C13851f.C13853b) this.f35789k.get());
            return bnplDetailsActivity;
        }

        /* renamed from: U8 */
        private IdentomatResultActivity m44709U8(IdentomatResultActivity identomatResultActivity) {
            C30746qa.m91941d(identomatResultActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(identomatResultActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(identomatResultActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(identomatResultActivity, (C31663a) this.f35761d.f36200F.get());
            return identomatResultActivity;
        }

        /* renamed from: U9 */
        private PensionDetailsActivity m44710U9(PensionDetailsActivity pensionDetailsActivity) {
            C30746qa.m91941d(pensionDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(pensionDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(pensionDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(pensionDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            return pensionDetailsActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ua */
        public C26617h m44711Ua() {
            return new C26617h((C27622a) this.f35761d.f36495q2.get());
        }

        /* renamed from: V5 */
        private C26618a m44715V5() {
            return new C26618a((C27868b) this.f35761d.f36299R2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: V6 */
        public C30279b m44716V6() {
            return new C30279b((C38267a) this.f35761d.f36558y1.get(), this.f35761d.cardsAndDetailsUseCase(), (C25339b) this.f35761d.f36321U0.get(), this.f35761d.getDepositsAndBondsUseCase());
        }

        /* renamed from: V7 */
        private BnplOfferDetailsActivity m44717V7(BnplOfferDetailsActivity bnplOfferDetailsActivity) {
            C30746qa.m91941d(bnplOfferDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(bnplOfferDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(bnplOfferDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(bnplOfferDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C13890a.m51757b(bnplOfferDetailsActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C13890a.m51756a(bnplOfferDetailsActivity, (C13891b.C13893b) this.f35801n.get());
            return bnplOfferDetailsActivity;
        }

        /* renamed from: V8 */
        private InstantCardStatusActivity m44718V8(InstantCardStatusActivity instantCardStatusActivity) {
            C30746qa.m91941d(instantCardStatusActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(instantCardStatusActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(instantCardStatusActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(instantCardStatusActivity, (C31663a) this.f35761d.f36200F.get());
            return instantCardStatusActivity;
        }

        /* renamed from: V9 */
        private PiggyBankDetailsActivity m44719V9(PiggyBankDetailsActivity piggyBankDetailsActivity) {
            C30746qa.m91941d(piggyBankDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(piggyBankDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(piggyBankDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(piggyBankDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C32008d.m94447a(piggyBankDetailsActivity, (C37983f) this.f35830w1.get());
            return piggyBankDetailsActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: Va */
        public C31679i m44720Va() {
            return new C31679i((C36357a) this.f35761d.f36447k2.get());
        }

        /* renamed from: W5 */
        private C26619b m44724W5() {
            return new C26619b((C27867a) this.f35761d.f36259M2.get());
        }

        /* renamed from: W6 */
        private C37300c m44725W6() {
            return new C37300c((C38267a) this.f35761d.f36558y1.get());
        }

        /* renamed from: W7 */
        private BnplOffersActivity m44726W7(BnplOffersActivity bnplOffersActivity) {
            C30746qa.m91941d(bnplOffersActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(bnplOffersActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(bnplOffersActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(bnplOffersActivity, (C31663a) this.f35761d.f36200F.get());
            return bnplOffersActivity;
        }

        /* renamed from: W8 */
        private InstantDeliveryApplicationActivity m44727W8(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity) {
            C30746qa.m91941d(instantDeliveryApplicationActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(instantDeliveryApplicationActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(instantDeliveryApplicationActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(instantDeliveryApplicationActivity, (C31663a) this.f35761d.f36200F.get());
            C17884y.m61688a(instantDeliveryApplicationActivity, (C12684x1) this.f35710N.get());
            return instantDeliveryApplicationActivity;
        }

        /* renamed from: W9 */
        private PlusActivationActivity m44728W9(PlusActivationActivity plusActivationActivity) {
            C30746qa.m91941d(plusActivationActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(plusActivationActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(plusActivationActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(plusActivationActivity, (C31663a) this.f35761d.f36200F.get());
            C35355b.m104987a(plusActivationActivity, (RootBankApiManager) this.f35761d.f36413g0.get());
            C35355b.m104988b(plusActivationActivity, (C41438c) this.f35761d.f36184D.get());
            return plusActivationActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: Wa */
        public C17536i m44729Wa() {
            return new C17536i((C17385a) this.f35761d.f36178C1.get());
        }

        /* renamed from: X5 */
        private C26620c m44733X5() {
            return new C26620c((C27867a) this.f35761d.f36259M2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: X6 */
        public C19222c m44734X6() {
            return new C19222c((C38267a) this.f35761d.f36558y1.get());
        }

        /* renamed from: X7 */
        private BnplWelcomeActivity m44735X7(BnplWelcomeActivity bnplWelcomeActivity) {
            C30746qa.m91941d(bnplWelcomeActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(bnplWelcomeActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(bnplWelcomeActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(bnplWelcomeActivity, (C31663a) this.f35761d.f36200F.get());
            C10507c.m38078a(bnplWelcomeActivity, (Client) this.f35761d.f36389d0.get());
            C10507c.m38079b(bnplWelcomeActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            return bnplWelcomeActivity;
        }

        /* renamed from: X8 */
        private InsurancePolicesActivity m44736X8(InsurancePolicesActivity insurancePolicesActivity) {
            C30746qa.m91941d(insurancePolicesActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(insurancePolicesActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(insurancePolicesActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(insurancePolicesActivity, (C31663a) this.f35761d.f36200F.get());
            C26547d.m82946a(insurancePolicesActivity, (C26548e) this.f35684E0.get());
            return insurancePolicesActivity;
        }

        /* renamed from: X9 */
        private PlusInvitationResultActivity m44737X9(PlusInvitationResultActivity plusInvitationResultActivity) {
            C30746qa.m91941d(plusInvitationResultActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(plusInvitationResultActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(plusInvitationResultActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(plusInvitationResultActivity, (C31663a) this.f35761d.f36200F.get());
            C35362d.m105009a(plusInvitationResultActivity, (Client) this.f35761d.f36389d0.get());
            return plusInvitationResultActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: Xa */
        public C39865j0 m44738Xa() {
            return new C39865j0((C31186b) this.f35761d.f36163A2.get());
        }

        /* renamed from: Y5 */
        private C26621d m44742Y5() {
            return new C26621d((C27867a) this.f35761d.f36259M2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Y6 */
        public C37018e m44743Y6() {
            return new C37018e((C38267a) this.f35761d.f36558y1.get());
        }

        /* renamed from: Y7 */
        private BreakDepositActivity m44744Y7(BreakDepositActivity breakDepositActivity) {
            C30746qa.m91941d(breakDepositActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(breakDepositActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(breakDepositActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(breakDepositActivity, (C31663a) this.f35761d.f36200F.get());
            C23163j.m74941a(breakDepositActivity, (C26404a) this.f35835y0.get());
            return breakDepositActivity;
        }

        /* renamed from: Y8 */
        private JuniorActivity m44745Y8(JuniorActivity juniorActivity) {
            C30746qa.m91941d(juniorActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(juniorActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(juniorActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(juniorActivity, (C31663a) this.f35761d.f36200F.get());
            C29129c.m89043a(juniorActivity, (C30362i) this.f35693H0.get());
            return juniorActivity;
        }

        /* renamed from: Y9 */
        private PlusPointsTransferActivity m44746Y9(PlusPointsTransferActivity plusPointsTransferActivity) {
            C30746qa.m91941d(plusPointsTransferActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(plusPointsTransferActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(plusPointsTransferActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(plusPointsTransferActivity, (C31663a) this.f35761d.f36200F.get());
            return plusPointsTransferActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: Ya */
        public C26926f m44747Ya() {
            return new C26926f(m44838i6(), m44887n6(), m44848j6());
        }

        /* renamed from: Z5 */
        private C26622e m44751Z5() {
            return new C26622e((C27868b) this.f35761d.f36299R2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Z6 */
        public C30284f m44752Z6() {
            return new C30284f(this.f35761d.getDepositsAndBondsUseCase(), (C39879r) this.f35838z0.get());
        }

        /* renamed from: Z7 */
        private CarTemplateGroupActivity m44753Z7(CarTemplateGroupActivity carTemplateGroupActivity) {
            C30746qa.m91941d(carTemplateGroupActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(carTemplateGroupActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(carTemplateGroupActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(carTemplateGroupActivity, (C31663a) this.f35761d.f36200F.get());
            C35384f.m105036a(carTemplateGroupActivity, (Client) this.f35761d.f36389d0.get());
            C35384f.m105037b(carTemplateGroupActivity, (C41438c) this.f35761d.f36184D.get());
            return carTemplateGroupActivity;
        }

        /* renamed from: Z8 */
        private LauncherActivity m44754Z8(LauncherActivity launcherActivity) {
            C30746qa.m91941d(launcherActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(launcherActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(launcherActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(launcherActivity, (C31663a) this.f35761d.f36200F.get());
            C35539x0.m105531a(launcherActivity, (Client) this.f35761d.f36389d0.get());
            C35539x0.m105532b(launcherActivity, (C41438c) this.f35761d.f36184D.get());
            C35539x0.m105533c(launcherActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C35539x0.m105534d(launcherActivity, (C39766b) this.f35772f2.get());
            C35539x0.m105535e(launcherActivity, (C39767c) this.f35780h2.get());
            return launcherActivity;
        }

        /* renamed from: Z9 */
        private PlusPointsTransferWizardActivity m44755Z9(PlusPointsTransferWizardActivity plusPointsTransferWizardActivity) {
            C30746qa.m91941d(plusPointsTransferWizardActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(plusPointsTransferWizardActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(plusPointsTransferWizardActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(plusPointsTransferWizardActivity, (C31663a) this.f35761d.f36200F.get());
            return plusPointsTransferWizardActivity;
        }

        /* renamed from: Za */
        private C28059g m44756Za() {
            return new C28059g((C27851a) this.f35761d.f36519t2.get());
        }

        /* renamed from: a6 */
        private C26623f m44760a6() {
            return new C26623f((C27868b) this.f35761d.f36299R2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: a7 */
        public C16798z m44761a7() {
            return new C16798z((C16586a) this.f35804o.get());
        }

        /* renamed from: a8 */
        private CardApplicationTypesActivity m44762a8(CardApplicationTypesActivity cardApplicationTypesActivity) {
            C30746qa.m91941d(cardApplicationTypesActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(cardApplicationTypesActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(cardApplicationTypesActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(cardApplicationTypesActivity, (C31663a) this.f35761d.f36200F.get());
            C17656g.m61312a(cardApplicationTypesActivity, (C12531g0) this.f35816s.get());
            return cardApplicationTypesActivity;
        }

        /* renamed from: a9 */
        private LifestyleChooserActivity m44763a9(LifestyleChooserActivity lifestyleChooserActivity) {
            C30746qa.m91941d(lifestyleChooserActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(lifestyleChooserActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(lifestyleChooserActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(lifestyleChooserActivity, (C31663a) this.f35761d.f36200F.get());
            return lifestyleChooserActivity;
        }

        /* renamed from: aa */
        private PlusProgramInvitationActivity m44764aa(PlusProgramInvitationActivity plusProgramInvitationActivity) {
            C30746qa.m91941d(plusProgramInvitationActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(plusProgramInvitationActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(plusProgramInvitationActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(plusProgramInvitationActivity, (C31663a) this.f35761d.f36200F.get());
            C35366h.m105011a(plusProgramInvitationActivity, (RootBankApiManager) this.f35761d.f36413g0.get());
            C35366h.m105012b(plusProgramInvitationActivity, (Client) this.f35761d.f36389d0.get());
            C35366h.m105013c(plusProgramInvitationActivity, (C41438c) this.f35761d.f36184D.get());
            return plusProgramInvitationActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: ab */
        public C37021h m44765ab() {
            return new C37021h((C38267a) this.f35761d.f36558y1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: b6 */
        public C37014a m44769b6() {
            return new C37014a((C38267a) this.f35761d.f36558y1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: b7 */
        public C38900x m44770b7() {
            return new C38900x((C38606b) this.f35761d.f36281P0.get());
        }

        /* renamed from: b8 */
        private CardInsuranceDetailsActivity m44771b8(CardInsuranceDetailsActivity cardInsuranceDetailsActivity) {
            C30746qa.m91941d(cardInsuranceDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(cardInsuranceDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(cardInsuranceDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(cardInsuranceDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C31509i.m93583a(cardInsuranceDetailsActivity, (C36091a) this.f35694H1.get());
            return cardInsuranceDetailsActivity;
        }

        /* renamed from: b9 */
        private LifestyleOfferDetailedActivity m44772b9(LifestyleOfferDetailedActivity lifestyleOfferDetailedActivity) {
            C30746qa.m91941d(lifestyleOfferDetailedActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(lifestyleOfferDetailedActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(lifestyleOfferDetailedActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(lifestyleOfferDetailedActivity, (C31663a) this.f35761d.f36200F.get());
            C15718h.m56648a(lifestyleOfferDetailedActivity, (C16846h.C16852d) this.f35699J0.get());
            return lifestyleOfferDetailedActivity;
        }

        /* renamed from: ba */
        private ProductDetailedActivity m44773ba(ProductDetailedActivity productDetailedActivity) {
            C30746qa.m91941d(productDetailedActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(productDetailedActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(productDetailedActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(productDetailedActivity, (C31663a) this.f35761d.f36200F.get());
            C35351b2.m104960b(productDetailedActivity, (C30123a) this.f35795l1.get());
            C35351b2.m104966h(productDetailedActivity, (C28290a) this.f35809p1.get());
            C35351b2.m104970l(productDetailedActivity, (BankApi) this.f35761d.f36405f0.get());
            C35351b2.m104971m(productDetailedActivity, (Client) this.f35761d.f36389d0.get());
            C35351b2.m104972n(productDetailedActivity, (C41438c) this.f35761d.f36184D.get());
            C35351b2.m104973o(productDetailedActivity, (C27494a) this.f35761d.f36414g1.get());
            C35351b2.m104959a(productDetailedActivity, (C26144b) this.f35746Z.get());
            C35351b2.m104962d(productDetailedActivity, (C26146d) this.f35761d.f36381c0.get());
            C35351b2.m104961c(productDetailedActivity, (C26145c) this.f35713O.get());
            C35351b2.m104974p(productDetailedActivity, this.f35761d.refreshProductTypeListUseCase());
            C35351b2.m104967i(productDetailedActivity, m44546C6());
            C35351b2.m104964f(productDetailedActivity, m44941t6());
            C35351b2.m104963e(productDetailedActivity, m44751Z5());
            C35351b2.m104968j(productDetailedActivity, this.f35761d.cardsAndDetailsUseCase());
            C35351b2.m104969k(productDetailedActivity, m44582G6());
            C35351b2.m104965g(productDetailedActivity, m44715V5());
            return productDetailedActivity;
        }

        /* renamed from: bb */
        private C36745q m44774bb() {
            return new C36745q((C36356a) this.f35761d.f36517t0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: c6 */
        public C28469c m44778c6() {
            return new C28469c(m44644N6(), m44756Za());
        }

        /* renamed from: c7 */
        private C27866a m44779c7() {
            return new C27866a((C28108a) this.f35761d.f36237J4.get());
        }

        /* renamed from: c8 */
        private CardInsuranceStatusesActivity m44780c8(CardInsuranceStatusesActivity cardInsuranceStatusesActivity) {
            C30746qa.m91941d(cardInsuranceStatusesActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(cardInsuranceStatusesActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(cardInsuranceStatusesActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(cardInsuranceStatusesActivity, (C31663a) this.f35761d.f36200F.get());
            return cardInsuranceStatusesActivity;
        }

        /* renamed from: c9 */
        private LifestyleOffersByCategoryActivity m44781c9(LifestyleOffersByCategoryActivity lifestyleOffersByCategoryActivity) {
            C30746qa.m91941d(lifestyleOffersByCategoryActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(lifestyleOffersByCategoryActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(lifestyleOffersByCategoryActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(lifestyleOffersByCategoryActivity, (C31663a) this.f35761d.f36200F.get());
            C15724n.m56651a(lifestyleOffersByCategoryActivity, (C16862o.C16870d) this.f35702K0.get());
            return lifestyleOffersByCategoryActivity;
        }

        /* renamed from: ca */
        private ProductListActivity m44782ca(ProductListActivity productListActivity) {
            C30746qa.m91941d(productListActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(productListActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(productListActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(productListActivity, (C31663a) this.f35761d.f36200F.get());
            C38057g.m111863a(productListActivity, (C38066p) this.f35718P1.get());
            return productListActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: cb */
        public C31658b m44783cb() {
            return new C31658b(this.f35761d.m46115T7());
        }

        /* access modifiers changed from: private */
        /* renamed from: d6 */
        public C38855d m44788d6() {
            return new C38855d((C38606b) this.f35761d.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: d7 */
        public C38902z m44789d7() {
            return new C38902z((C38606b) this.f35761d.f36281P0.get());
        }

        /* renamed from: d8 */
        private CardOrderListActivity m44790d8(CardOrderListActivity cardOrderListActivity) {
            C30746qa.m91941d(cardOrderListActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(cardOrderListActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(cardOrderListActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(cardOrderListActivity, (C31663a) this.f35761d.f36200F.get());
            C17664o.m61317a(cardOrderListActivity, (C12602p) this.f35819t.get());
            return cardOrderListActivity;
        }

        /* renamed from: d9 */
        private LifestyleOffersFilterActivity m44791d9(LifestyleOffersFilterActivity lifestyleOffersFilterActivity) {
            C30746qa.m91941d(lifestyleOffersFilterActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(lifestyleOffersFilterActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(lifestyleOffersFilterActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(lifestyleOffersFilterActivity, (C31663a) this.f35761d.f36200F.get());
            C15731u.m56653a(lifestyleOffersFilterActivity, (C16877v.C16881c) this.f35705L0.get());
            return lifestyleOffersFilterActivity;
        }

        /* renamed from: da */
        private ProviderListActivity m44792da(ProviderListActivity providerListActivity) {
            C30746qa.m91941d(providerListActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(providerListActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(providerListActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(providerListActivity, (C31663a) this.f35761d.f36200F.get());
            C35373c2.m105022a(providerListActivity, this.f35761d.getProductTypeListUseCase());
            C35373c2.m105023b(providerListActivity, (Client) this.f35761d.f36389d0.get());
            C35373c2.m105024c(providerListActivity, (C41438c) this.f35761d.f36184D.get());
            return providerListActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: db */
        public C37359a m44793db() {
            return new C37359a(new C39514b());
        }

        /* access modifiers changed from: private */
        /* renamed from: e6 */
        public C16726b m44798e6() {
            return new C16726b((C16586a) this.f35804o.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: e7 */
        public C26011b m44799e7() {
            return new C26011b(m44813fb(), (TargetEnvironment) this.f35761d.f36216H.get());
        }

        /* renamed from: e8 */
        private CardsDetailActivity m44800e8(CardsDetailActivity cardsDetailActivity) {
            C30746qa.m91941d(cardsDetailActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(cardsDetailActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(cardsDetailActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(cardsDetailActivity, (C31663a) this.f35761d.f36200F.get());
            C14377l.m53260c(cardsDetailActivity, this.f35761d.m46328o9());
            C14377l.m53261d(cardsDetailActivity, (C14337b.C14342d) this.f35731U.get());
            C14377l.m53258a(cardsDetailActivity, (C41438c) this.f35761d.f36184D.get());
            C14377l.m53259b(cardsDetailActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            return cardsDetailActivity;
        }

        /* renamed from: e9 */
        private LifestyleOffersProgressActivity m44801e9(LifestyleOffersProgressActivity lifestyleOffersProgressActivity) {
            C30746qa.m91941d(lifestyleOffersProgressActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(lifestyleOffersProgressActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(lifestyleOffersProgressActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(lifestyleOffersProgressActivity, (C31663a) this.f35761d.f36200F.get());
            C15099h.m55253a(lifestyleOffersProgressActivity, (C15087d.C15089b) this.f35708M0.get());
            return lifestyleOffersProgressActivity;
        }

        /* renamed from: ea */
        private PushNotificationHandlerActivity m44802ea(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            C30746qa.m91941d(pushNotificationHandlerActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(pushNotificationHandlerActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(pushNotificationHandlerActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(pushNotificationHandlerActivity, (C31663a) this.f35761d.f36200F.get());
            C26753t.m83226c(pushNotificationHandlerActivity, (Client) this.f35761d.f36389d0.get());
            C26753t.m83225b(pushNotificationHandlerActivity, (C18569a) this.f35761d.f36437j0.get());
            C26753t.m83236m(pushNotificationHandlerActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C26753t.m83231h(pushNotificationHandlerActivity, this.f35761d.m46115T7());
            C26753t.m83233j(pushNotificationHandlerActivity, m44969w7());
            C26753t.m83229f(pushNotificationHandlerActivity, m44941t6());
            C26753t.m83232i(pushNotificationHandlerActivity, this.f35761d.cardsAndDetailsUseCase());
            C26753t.m83234k(pushNotificationHandlerActivity, (C29879c) this.f35740X.get());
            C26753t.m83228e(pushNotificationHandlerActivity, (C26754u) this.f35743Y.get());
            C26753t.m83230g(pushNotificationHandlerActivity, this.f35761d.m46115T7());
            C26753t.m83235l(pushNotificationHandlerActivity, (BankApi) this.f35761d.f36405f0.get());
            C26753t.m83227d(pushNotificationHandlerActivity, (C41438c) this.f35761d.f36184D.get());
            C26753t.m83224a(pushNotificationHandlerActivity, (C26144b) this.f35746Z.get());
            return pushNotificationHandlerActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: eb */
        public C25074c m44803eb() {
            return new C25074c((C25072a) this.f35761d.f36489p4.get(), this.f35761d.getTransactionCategoriesUseCase(), (Client) this.f35761d.f36389d0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: f6 */
        public C25179a m44808f6() {
            return new C25179a((C25711a) this.f35761d.f36545w4.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: f7 */
        public C20526j m44809f7() {
            return new C20526j(m44819g7(), m44591H7());
        }

        /* renamed from: f8 */
        private CasDetailsActivity m44810f8(CasDetailsActivity casDetailsActivity) {
            C30746qa.m91941d(casDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(casDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(casDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(casDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C31588d.m93697a(casDetailsActivity, (C37732b) this.f35806o1.get());
            return casDetailsActivity;
        }

        /* renamed from: f9 */
        private LimitResultActivity m44811f9(LimitResultActivity limitResultActivity) {
            C30746qa.m91941d(limitResultActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(limitResultActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(limitResultActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(limitResultActivity, (C31663a) this.f35761d.f36200F.get());
            C22698b.m73548a(limitResultActivity, (C22700d.C22706d) this.f35823u0.get());
            return limitResultActivity;
        }

        /* renamed from: fa */
        private QrPayActivity m44812fa(QrPayActivity qrPayActivity) {
            C30746qa.m91941d(qrPayActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(qrPayActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(qrPayActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(qrPayActivity, (C31663a) this.f35761d.f36200F.get());
            C35495e.m105423a(qrPayActivity, (Client) this.f35761d.f36389d0.get());
            return qrPayActivity;
        }

        /* renamed from: fb */
        private C25024p m44813fb() {
            return new C25024p(new C37349a(), m44896o6(), this.f35761d.m46105S7());
        }

        /* access modifiers changed from: private */
        /* renamed from: g6 */
        public C38857e m44818g6() {
            return new C38857e((C38606b) this.f35761d.f36281P0.get());
        }

        /* renamed from: g7 */
        private C20530m m44819g7() {
            return new C20530m(this.f35761d.m46328o9());
        }

        /* renamed from: g8 */
        private CashCoverLoanActivity m44820g8(CashCoverLoanActivity cashCoverLoanActivity) {
            C30746qa.m91941d(cashCoverLoanActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(cashCoverLoanActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(cashCoverLoanActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(cashCoverLoanActivity, (C31663a) this.f35761d.f36200F.get());
            C30709o.m91899g(cashCoverLoanActivity, this.f35761d.refreshProductTypeListUseCase());
            C30709o.m91897e(cashCoverLoanActivity, this.f35761d.refreshAssetLiabilityUseCase());
            C30709o.m91898f(cashCoverLoanActivity, (C25682f) this.f35761d.f36432i3.get());
            C30709o.m91895c(cashCoverLoanActivity, (BankApi) this.f35761d.f36405f0.get());
            C30709o.m91893a(cashCoverLoanActivity, (Client) this.f35761d.f36389d0.get());
            C30709o.m91894b(cashCoverLoanActivity, (C41438c) this.f35761d.f36184D.get());
            C30709o.m91896d(cashCoverLoanActivity, (C27494a) this.f35761d.f36414g1.get());
            C30709o.m91900h(cashCoverLoanActivity, m44783cb());
            return cashCoverLoanActivity;
        }

        /* renamed from: g9 */
        private LoanActivationActivity m44821g9(LoanActivationActivity loanActivationActivity) {
            C30746qa.m91941d(loanActivationActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(loanActivationActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(loanActivationActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(loanActivationActivity, (C31663a) this.f35761d.f36200F.get());
            return loanActivationActivity;
        }

        /* renamed from: ga */
        private QrPayCardSelectActivity m44822ga(QrPayCardSelectActivity qrPayCardSelectActivity) {
            C30746qa.m91941d(qrPayCardSelectActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(qrPayCardSelectActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(qrPayCardSelectActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(qrPayCardSelectActivity, (C31663a) this.f35761d.f36200F.get());
            C35496f.m105424a(qrPayCardSelectActivity, (BankApi) this.f35761d.f36405f0.get());
            C35496f.m105425b(qrPayCardSelectActivity, (Client) this.f35761d.f36389d0.get());
            C35496f.m105426c(qrPayCardSelectActivity, (C41438c) this.f35761d.f36184D.get());
            C35496f.m105427d(qrPayCardSelectActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            return qrPayCardSelectActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: gb */
        public C28060h m44823gb() {
            return new C28060h((C27851a) this.f35761d.f36519t2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: h6 */
        public C16730c m44828h6() {
            return new C16730c((C16586a) this.f35804o.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: h7 */
        public C16736d0 m44829h7() {
            return new C16736d0((C16586a) this.f35804o.get());
        }

        /* renamed from: h8 */
        private CategoryPackagesActivity m44830h8(CategoryPackagesActivity categoryPackagesActivity) {
            C30746qa.m91941d(categoryPackagesActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(categoryPackagesActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(categoryPackagesActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(categoryPackagesActivity, (C31663a) this.f35761d.f36200F.get());
            return categoryPackagesActivity;
        }

        /* renamed from: h9 */
        private LoanListActivity m44831h9(LoanListActivity loanListActivity) {
            C30746qa.m91941d(loanListActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(loanListActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(loanListActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(loanListActivity, (C31663a) this.f35761d.f36200F.get());
            C38053c.m111859a(loanListActivity, (C38066p) this.f35718P1.get());
            return loanListActivity;
        }

        /* renamed from: ha */
        private QrPayResultActivity m44832ha(QrPayResultActivity qrPayResultActivity) {
            C30746qa.m91941d(qrPayResultActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(qrPayResultActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(qrPayResultActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(qrPayResultActivity, (C31663a) this.f35761d.f36200F.get());
            C35497g.m105428a(qrPayResultActivity, (Client) this.f35761d.f36389d0.get());
            return qrPayResultActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: hb */
        public C16734c1 m44833hb() {
            return new C16734c1((C16586a) this.f35804o.get());
        }

        /* renamed from: i6 */
        private C37015b m44838i6() {
            return new C37015b((C38267a) this.f35761d.f36558y1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: i7 */
        public C16747i0 m44839i7() {
            return new C16747i0(m44849j7(), m44590H6(), (C16795y) this.f35810q.get());
        }

        /* renamed from: i8 */
        private ChangeLanguageActivity m44840i8(ChangeLanguageActivity changeLanguageActivity) {
            C30746qa.m91941d(changeLanguageActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(changeLanguageActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(changeLanguageActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(changeLanguageActivity, (C31663a) this.f35761d.f36200F.get());
            C38626g.m113223a(changeLanguageActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            return changeLanguageActivity;
        }

        /* renamed from: i9 */
        private LoanSubtypesActivity m44841i9(LoanSubtypesActivity loanSubtypesActivity) {
            C30746qa.m91941d(loanSubtypesActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(loanSubtypesActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(loanSubtypesActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(loanSubtypesActivity, (C31663a) this.f35761d.f36200F.get());
            C39062c.m114024a(loanSubtypesActivity, (C39063d) this.f35714O0.get());
            return loanSubtypesActivity;
        }

        /* renamed from: ia */
        private QrPayReversalActivity m44842ia(QrPayReversalActivity qrPayReversalActivity) {
            C30746qa.m91941d(qrPayReversalActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(qrPayReversalActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(qrPayReversalActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(qrPayReversalActivity, (C31663a) this.f35761d.f36200F.get());
            C35498h.m105429a(qrPayReversalActivity, (BankApi) this.f35761d.f36405f0.get());
            return qrPayReversalActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: ib */
        public C28061i m44843ib() {
            return new C28061i((C27851a) this.f35761d.f36519t2.get());
        }

        /* renamed from: j6 */
        private C37016c m44848j6() {
            return new C37016c((C38267a) this.f35761d.f36558y1.get());
        }

        /* renamed from: j7 */
        private C16752j0 m44849j7() {
            return new C16752j0((C16586a) this.f35804o.get());
        }

        /* renamed from: j8 */
        private ClaFirstStageActivity m44850j8(ClaFirstStageActivity claFirstStageActivity) {
            C30746qa.m91941d(claFirstStageActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(claFirstStageActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(claFirstStageActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(claFirstStageActivity, (C31663a) this.f35761d.f36200F.get());
            C30259t.m91354a(claFirstStageActivity, (Client) this.f35761d.f36389d0.get());
            return claFirstStageActivity;
        }

        /* renamed from: j9 */
        private LoyaltyListActivity m44851j9(LoyaltyListActivity loyaltyListActivity) {
            C30746qa.m91941d(loyaltyListActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(loyaltyListActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(loyaltyListActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(loyaltyListActivity, (C31663a) this.f35761d.f36200F.get());
            C29186d.m89125a(loyaltyListActivity, (Client) this.f35761d.f36389d0.get());
            return loyaltyListActivity;
        }

        /* renamed from: ja */
        private QrResultPageActivity m44852ja(QrResultPageActivity qrResultPageActivity) {
            C30746qa.m91941d(qrResultPageActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(qrResultPageActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(qrResultPageActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(qrResultPageActivity, (C31663a) this.f35761d.f36200F.get());
            return qrResultPageActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: jb */
        public C37302e m44853jb() {
            return new C37302e((C38267a) this.f35761d.f36558y1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: k6 */
        public C37184b m44858k6() {
            return new C37184b((C38267a) this.f35761d.f36558y1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: k7 */
        public C26053a m44859k7() {
            return new C26053a((C25742a) this.f35765e.f35926t.get());
        }

        /* renamed from: k8 */
        private ClientIncomesActivity m44860k8(ClientIncomesActivity clientIncomesActivity) {
            C30746qa.m91941d(clientIncomesActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(clientIncomesActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(clientIncomesActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(clientIncomesActivity, (C31663a) this.f35761d.f36200F.get());
            C30242c0.m91346a(clientIncomesActivity, (Client) this.f35761d.f36389d0.get());
            C30242c0.m91347b(clientIncomesActivity, (C26887v0.C26897d) this.f35790k0.get());
            return clientIncomesActivity;
        }

        /* renamed from: k9 */
        private LoyaltyProgressActivity m44861k9(LoyaltyProgressActivity loyaltyProgressActivity) {
            C30746qa.m91941d(loyaltyProgressActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(loyaltyProgressActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(loyaltyProgressActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(loyaltyProgressActivity, (C31663a) this.f35761d.f36200F.get());
            C31195i.m92757a(loyaltyProgressActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            return loyaltyProgressActivity;
        }

        /* renamed from: ka */
        private QrScannerActivity m44862ka(QrScannerActivity qrScannerActivity) {
            C30746qa.m91941d(qrScannerActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(qrScannerActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(qrScannerActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(qrScannerActivity, (C31663a) this.f35761d.f36200F.get());
            C20770d.m67225a(qrScannerActivity, (Client) this.f35761d.f36389d0.get());
            return qrScannerActivity;
        }

        /* renamed from: kb */
        private C37303f m44863kb() {
            return new C37303f((C38267a) this.f35761d.f36558y1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: l6 */
        public C37185c m44868l6() {
            return new C37185c((C38267a) this.f35761d.f36558y1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: l7 */
        public C28055c m44869l7() {
            return new C28055c((C27851a) this.f35761d.f36519t2.get());
        }

        /* renamed from: l8 */
        private ClientLimitInfoActivity m44870l8(ClientLimitInfoActivity clientLimitInfoActivity) {
            C30746qa.m91941d(clientLimitInfoActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(clientLimitInfoActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(clientLimitInfoActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(clientLimitInfoActivity, (C31663a) this.f35761d.f36200F.get());
            C19931d.m65811b(clientLimitInfoActivity, (Client) this.f35761d.f36389d0.get());
            C19931d.m65810a(clientLimitInfoActivity, (C19933f) this.f35817s0.get());
            return clientLimitInfoActivity;
        }

        /* renamed from: l9 */
        private MainActivity m44871l9(MainActivity mainActivity) {
            C30746qa.m91941d(mainActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(mainActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(mainActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(mainActivity, (C31663a) this.f35761d.f36200F.get());
            C35455o1.m105237r(mainActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C35455o1.m105224e(mainActivity, (C21546a) this.f35761d.f36197E4.get());
            C35455o1.m105223d(mainActivity, (C26146d) this.f35761d.f36381c0.get());
            C35455o1.m105226g(mainActivity, (C19411a) this.f35761d.f36205F4.get());
            C35455o1.m105238s(mainActivity, (C27494a) this.f35761d.f36414g1.get());
            C35455o1.m105230k(mainActivity, m44951u7());
            C35455o1.m105231l(mainActivity, this.f35761d.getProductTypeListUseCase());
            C35455o1.m105228i(mainActivity, m44555D6());
            C35455o1.m105222c(mainActivity, this.f35761d.cardsAndDetailsUseCase());
            C35455o1.m105233n(mainActivity, this.f35761d.m45976F8());
            C35455o1.m105221b(mainActivity, this.f35761d.getAccountsAndDetailsUseCase());
            C35455o1.m105239t(mainActivity, (C29824b) this.f35788j2.get());
            C35455o1.m105232m(mainActivity, m44621Ka());
            C35455o1.m105229j(mainActivity, this.f35761d.m46195b8());
            C35455o1.m105234o(mainActivity, (BankApi) this.f35761d.f36405f0.get());
            C35455o1.m105235p(mainActivity, (Client) this.f35761d.f36389d0.get());
            C35455o1.m105236q(mainActivity, (C41438c) this.f35761d.f36184D.get());
            C35455o1.m105227h(mainActivity, this.f35761d.m46115T7());
            C35455o1.m105225f(mainActivity, (TargetEnvironment) this.f35761d.f36216H.get());
            C35455o1.m105220a(mainActivity, (C26143a) this.f35792k2.get());
            return mainActivity;
        }

        /* renamed from: la */
        private QrWithdrawalActivity m44872la(QrWithdrawalActivity qrWithdrawalActivity) {
            C30746qa.m91941d(qrWithdrawalActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(qrWithdrawalActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(qrWithdrawalActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(qrWithdrawalActivity, (C31663a) this.f35761d.f36200F.get());
            C34399b.m101117a(qrWithdrawalActivity, (C34402d.C34421i) this.f35745Y1.get());
            return qrWithdrawalActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: lb */
        public C28473g m44873lb() {
            return new C28473g((C27851a) this.f35761d.f36519t2.get(), (C25681e) this.f35761d.f36291Q2.get(), (C25677a) this.f35761d.f36251L2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: m6 */
        public C24974b m44878m6() {
            return new C24974b((TargetEnvironment) this.f35761d.f36216H.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: m7 */
        public C19095i m44879m7() {
            return new C19095i(m44906p7(), (C18490b) this.f35696I0.get());
        }

        /* renamed from: m8 */
        private ConsumerLoanActivationResultActivity m44880m8(ConsumerLoanActivationResultActivity consumerLoanActivationResultActivity) {
            C30746qa.m91941d(consumerLoanActivationResultActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(consumerLoanActivationResultActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(consumerLoanActivationResultActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(consumerLoanActivationResultActivity, (C31663a) this.f35761d.f36200F.get());
            C27061c.m83929a(consumerLoanActivationResultActivity, (C29742a) this.f35825v.get());
            return consumerLoanActivationResultActivity;
        }

        /* renamed from: m9 */
        private ManageAccountsAndCardsActivity m44881m9(ManageAccountsAndCardsActivity manageAccountsAndCardsActivity) {
            C30746qa.m91941d(manageAccountsAndCardsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(manageAccountsAndCardsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(manageAccountsAndCardsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(manageAccountsAndCardsActivity, (C31663a) this.f35761d.f36200F.get());
            C35473p1.m105326a(manageAccountsAndCardsActivity, (C26144b) this.f35746Z.get());
            C35473p1.m105330e(manageAccountsAndCardsActivity, m44941t6());
            C35473p1.m105329d(manageAccountsAndCardsActivity, m44751Z5());
            C35473p1.m105327b(manageAccountsAndCardsActivity, m44724W5());
            C35473p1.m105328c(manageAccountsAndCardsActivity, m44742Y5());
            C35473p1.m105333h(manageAccountsAndCardsActivity, C38392d.m112756a());
            C35473p1.m105331f(manageAccountsAndCardsActivity, (Client) this.f35761d.f36389d0.get());
            C35473p1.m105332g(manageAccountsAndCardsActivity, (C41438c) this.f35761d.f36184D.get());
            return manageAccountsAndCardsActivity;
        }

        /* renamed from: ma */
        private RateChartLandscapeActivity m44882ma(RateChartLandscapeActivity rateChartLandscapeActivity) {
            C30746qa.m91941d(rateChartLandscapeActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(rateChartLandscapeActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(rateChartLandscapeActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(rateChartLandscapeActivity, (C31663a) this.f35761d.f36200F.get());
            C35378d2.m105028a(rateChartLandscapeActivity, (Client) this.f35761d.f36389d0.get());
            return rateChartLandscapeActivity;
        }

        /* renamed from: n6 */
        private C37017d m44887n6() {
            return new C37017d((C38267a) this.f35761d.f36558y1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: n7 */
        public C19100l m44888n7() {
            return new C19100l((C10344a) this.f35761d.f36535v2.get());
        }

        /* renamed from: n8 */
        private ContactDetailsActivity m44889n8(ContactDetailsActivity contactDetailsActivity) {
            C30746qa.m91941d(contactDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(contactDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(contactDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(contactDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C25306t.m80457a(contactDetailsActivity, (Client) this.f35761d.f36389d0.get());
            return contactDetailsActivity;
        }

        /* renamed from: n9 */
        private ManagePensionFundsActivity m44890n9(ManagePensionFundsActivity managePensionFundsActivity) {
            C30746qa.m91941d(managePensionFundsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(managePensionFundsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(managePensionFundsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(managePensionFundsActivity, (C31663a) this.f35761d.f36200F.get());
            C35479q1.m105349f(managePensionFundsActivity, this.f35761d.refreshProductTypeListUseCase());
            C35479q1.m105345b(managePensionFundsActivity, (C25347g) this.f35761d.f36518t1.get());
            C35479q1.m105346c(managePensionFundsActivity, (BankApi) this.f35761d.f36405f0.get());
            C35479q1.m105347d(managePensionFundsActivity, (Client) this.f35761d.f36389d0.get());
            C35479q1.m105348e(managePensionFundsActivity, (C41438c) this.f35761d.f36184D.get());
            C35479q1.m105344a(managePensionFundsActivity, this.f35761d.m46115T7());
            return managePensionFundsActivity;
        }

        /* renamed from: na */
        private RemittanceCreditInfoContractActivity m44891na(RemittanceCreditInfoContractActivity remittanceCreditInfoContractActivity) {
            C30746qa.m91941d(remittanceCreditInfoContractActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(remittanceCreditInfoContractActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(remittanceCreditInfoContractActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(remittanceCreditInfoContractActivity, (C31663a) this.f35761d.f36200F.get());
            C26325k.m82294a(remittanceCreditInfoContractActivity, (C26326l) this.f35734V.get());
            return remittanceCreditInfoContractActivity;
        }

        /* renamed from: o6 */
        private C25007b m44896o6() {
            return new C25007b((C25737a) this.f35761d.f36391d2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: o7 */
        public C19101m m44897o7() {
            return new C19101m((C10344a) this.f35761d.f36535v2.get());
        }

        /* renamed from: o8 */
        private ContactUsActivity m44898o8(ContactUsActivity contactUsActivity) {
            C30746qa.m91941d(contactUsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(contactUsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(contactUsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(contactUsActivity, (C31663a) this.f35761d.f36200F.get());
            C35413h.m105144d(contactUsActivity, (Client) this.f35761d.f36389d0.get());
            C35413h.m105142b(contactUsActivity, (C18569a) this.f35761d.f36437j0.get());
            C35413h.m105141a(contactUsActivity, m44968w6());
            C35413h.m105145e(contactUsActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C35413h.m105143c(contactUsActivity, this.f35761d.m46115T7());
            return contactUsActivity;
        }

        /* renamed from: o9 */
        private MapActivity m44899o9(MapActivity mapActivity) {
            C30746qa.m91941d(mapActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(mapActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(mapActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(mapActivity, (C31663a) this.f35761d.f36200F.get());
            C35503r1.m105437b(mapActivity, (Client) this.f35761d.f36389d0.get());
            C35503r1.m105438c(mapActivity, (C41438c) this.f35761d.f36184D.get());
            C35503r1.m105439d(mapActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C35503r1.m105436a(mapActivity, (GoogleApi) this.f35761d.f36221H4.get());
            return mapActivity;
        }

        /* renamed from: oa */
        private RenameAccountActivity m44900oa(RenameAccountActivity renameAccountActivity) {
            C30746qa.m91941d(renameAccountActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(renameAccountActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(renameAccountActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(renameAccountActivity, (C31663a) this.f35761d.f36200F.get());
            C35383e2.m105032a(renameAccountActivity, m44733X5());
            C35383e2.m105033b(renameAccountActivity, m44760a6());
            C35383e2.m105034c(renameAccountActivity, (BankApi) this.f35761d.f36405f0.get());
            C35383e2.m105035d(renameAccountActivity, (Client) this.f35761d.f36389d0.get());
            return renameAccountActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: p6 */
        public C20524h m44905p6() {
            return new C20524h((C19259a) this.f35761d.f36284P3.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: p7 */
        public C19102n m44906p7() {
            return new C19102n((C10344a) this.f35761d.f36535v2.get());
        }

        /* renamed from: p8 */
        private CreateCasActivity m44907p8(CreateCasActivity createCasActivity) {
            C30746qa.m91941d(createCasActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(createCasActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(createCasActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(createCasActivity, (C31663a) this.f35761d.f36200F.get());
            C31597m.m93702a(createCasActivity, (C37770o) this.f35824u1.get());
            return createCasActivity;
        }

        /* renamed from: p9 */
        private MoneyRequestDetailsActivity m44908p9(MoneyRequestDetailsActivity moneyRequestDetailsActivity) {
            C30746qa.m91941d(moneyRequestDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(moneyRequestDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(moneyRequestDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(moneyRequestDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C28302d.m86948a(moneyRequestDetailsActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            return moneyRequestDetailsActivity;
        }

        /* renamed from: pa */
        private C35388f2 m44909pa(C35388f2 f2Var) {
            C30746qa.m91941d(f2Var, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(f2Var, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(f2Var, (C37071a) this.f35773g.get());
            C30746qa.m91938a(f2Var, (C31663a) this.f35761d.f36200F.get());
            return f2Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: q6 */
        public C39177a m44914q6() {
            return new C39177a((C38606b) this.f35761d.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: q7 */
        public C38862g0 m44915q7() {
            return new C38862g0(this.f35761d.getDepositsAndBondsUseCase());
        }

        /* renamed from: q8 */
        private CreatePiggyBankActivity m44916q8(CreatePiggyBankActivity createPiggyBankActivity) {
            C30746qa.m91941d(createPiggyBankActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(createPiggyBankActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(createPiggyBankActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(createPiggyBankActivity, (C31663a) this.f35761d.f36200F.get());
            return createPiggyBankActivity;
        }

        /* renamed from: q9 */
        private MoneyTransferProviderListActivity m44917q9(MoneyTransferProviderListActivity moneyTransferProviderListActivity) {
            C30746qa.m91941d(moneyTransferProviderListActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(moneyTransferProviderListActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(moneyTransferProviderListActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(moneyTransferProviderListActivity, (C31663a) this.f35761d.f36200F.get());
            C26655n.m83129a(moneyTransferProviderListActivity, (C41438c) this.f35761d.f36184D.get());
            return moneyTransferProviderListActivity;
        }

        /* renamed from: qa */
        private STOTypeListActivity m44918qa(STOTypeListActivity sTOTypeListActivity) {
            C30746qa.m91941d(sTOTypeListActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(sTOTypeListActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(sTOTypeListActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(sTOTypeListActivity, (C31663a) this.f35761d.f36200F.get());
            C35412g2.m105140a(sTOTypeListActivity, this.f35761d.m46166Y8());
            return sTOTypeListActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: r6 */
        public C38864h m44923r6() {
            return new C38864h((C38606b) this.f35761d.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: r7 */
        public C38868i0 m44924r7() {
            return new C38868i0((C38606b) this.f35761d.f36281P0.get());
        }

        /* renamed from: r8 */
        private CreditCardDetailsActivity m44925r8(CreditCardDetailsActivity creditCardDetailsActivity) {
            C30746qa.m91941d(creditCardDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(creditCardDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(creditCardDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(creditCardDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C33934b.m99762c(creditCardDetailsActivity, (C33969f.C33979g) this.f35709M1.get());
            C33934b.m99761b(creditCardDetailsActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C33934b.m99760a(creditCardDetailsActivity, (Client) this.f35761d.f36389d0.get());
            return creditCardDetailsActivity;
        }

        /* renamed from: r9 */
        private MyCreditInfoDescriptionActivity m44926r9(MyCreditInfoDescriptionActivity myCreditInfoDescriptionActivity) {
            C30746qa.m91941d(myCreditInfoDescriptionActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(myCreditInfoDescriptionActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(myCreditInfoDescriptionActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(myCreditInfoDescriptionActivity, (C31663a) this.f35761d.f36200F.get());
            C28955b.m88686a(myCreditInfoDescriptionActivity, (Client) this.f35761d.f36389d0.get());
            return myCreditInfoDescriptionActivity;
        }

        /* renamed from: ra */
        private SearchActivity m44927ra(SearchActivity searchActivity) {
            C30746qa.m91941d(searchActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(searchActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(searchActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(searchActivity, (C31663a) this.f35761d.f36200F.get());
            C35417h2.m105149a(searchActivity, this.f35761d.getTransactionCategoriesUseCase());
            C35417h2.m105150b(searchActivity, (RootBankApiManager) this.f35761d.f36413g0.get());
            C35417h2.m105151c(searchActivity, (Client) this.f35761d.f36389d0.get());
            C35417h2.m105152d(searchActivity, (C41438c) this.f35761d.f36184D.get());
            C35417h2.m105153e(searchActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            return searchActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: s6 */
        public C38870j m44932s6() {
            return new C38870j((C38606b) this.f35761d.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: s7 */
        public C38872j0 m44933s7() {
            return new C38872j0((C38606b) this.f35761d.f36281P0.get());
        }

        /* renamed from: s8 */
        private CreditOfferApplicationActivity m44934s8(CreditOfferApplicationActivity creditOfferApplicationActivity) {
            C30746qa.m91941d(creditOfferApplicationActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(creditOfferApplicationActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(creditOfferApplicationActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(creditOfferApplicationActivity, (C31663a) this.f35761d.f36200F.get());
            return creditOfferApplicationActivity;
        }

        /* renamed from: s9 */
        private NboNavigatorActivity m44935s9(NboNavigatorActivity nboNavigatorActivity) {
            C30746qa.m91941d(nboNavigatorActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(nboNavigatorActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(nboNavigatorActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(nboNavigatorActivity, (C31663a) this.f35761d.f36200F.get());
            C33305c.m97950a(nboNavigatorActivity, (C31074a) this.f35833x1.get());
            return nboNavigatorActivity;
        }

        /* renamed from: sa */
        private SearchResultActivity m44936sa(SearchResultActivity searchResultActivity) {
            C30746qa.m91941d(searchResultActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(searchResultActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(searchResultActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(searchResultActivity, (C31663a) this.f35761d.f36200F.get());
            C35422i2.m105157a(searchResultActivity, (Client) this.f35761d.f36389d0.get());
            return searchResultActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: t6 */
        public C26628j m44941t6() {
            return new C26628j(this.f35761d.cardsAndDetailsUseCase(), this.f35761d.getAccountsAndDetailsUseCase());
        }

        /* access modifiers changed from: private */
        /* renamed from: t7 */
        public C20217b m44942t7() {
            return new C20217b((C20800a) this.f35761d.f36480o3.get());
        }

        /* renamed from: t8 */
        private DDFormActivity m44943t8(DDFormActivity dDFormActivity) {
            C30746qa.m91941d(dDFormActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(dDFormActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(dDFormActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(dDFormActivity, (C31663a) this.f35761d.f36200F.get());
            C39159l.m114246a(dDFormActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C22737a.m73731a(dDFormActivity, (C22738b.C22739a) this.f35826v0.get());
            return dDFormActivity;
        }

        /* renamed from: t9 */
        private NotificationDetailsActivity m44944t9(NotificationDetailsActivity notificationDetailsActivity) {
            C30746qa.m91941d(notificationDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(notificationDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(notificationDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(notificationDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C35513t1.m105453a(notificationDetailsActivity, (BankApi) this.f35761d.f36405f0.get());
            C35513t1.m105454b(notificationDetailsActivity, (RootBankApiManager) this.f35761d.f36413g0.get());
            C35513t1.m105455c(notificationDetailsActivity, (Client) this.f35761d.f36389d0.get());
            C35513t1.m105456d(notificationDetailsActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            return notificationDetailsActivity;
        }

        /* renamed from: ta */
        private SecuredLoanActivity m44945ta(SecuredLoanActivity securedLoanActivity) {
            C30746qa.m91941d(securedLoanActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(securedLoanActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(securedLoanActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(securedLoanActivity, (C31663a) this.f35761d.f36200F.get());
            C32567n.m96225a(securedLoanActivity, (C36934b) this.f35738W0.get());
            return securedLoanActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: u6 */
        public C27242a m44950u6() {
            return new C27242a((C29954a) this.f35774g0.get());
        }

        /* renamed from: u7 */
        private C25505j m44951u7() {
            return new C25505j(m44960v7());
        }

        /* renamed from: u8 */
        private p341ge.bog.mobilebank.payment.activities.DDFormActivity m44952u8(p341ge.bog.mobilebank.payment.activities.DDFormActivity dDFormActivity) {
            C30746qa.m91941d(dDFormActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(dDFormActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(dDFormActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(dDFormActivity, (C31663a) this.f35761d.f36200F.get());
            C33614f.m98683a(dDFormActivity, m44959v6());
            C33614f.m98684b(dDFormActivity, (BankApi) this.f35761d.f36405f0.get());
            C33614f.m98685c(dDFormActivity, (C27494a) this.f35761d.f36414g1.get());
            C33606a.m98670a(dDFormActivity, (C29742a) this.f35825v.get());
            C33606a.m98671b(dDFormActivity, m44783cb());
            return dDFormActivity;
        }

        /* renamed from: u9 */
        private NotificationListActivity m44953u9(NotificationListActivity notificationListActivity) {
            C30746qa.m91941d(notificationListActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(notificationListActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(notificationListActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(notificationListActivity, (C31663a) this.f35761d.f36200F.get());
            C35517u1.m105460a(notificationListActivity, (Client) this.f35761d.f36389d0.get());
            C35517u1.m105461b(notificationListActivity, (C41438c) this.f35761d.f36184D.get());
            C35517u1.m105462c(notificationListActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            return notificationListActivity;
        }

        /* renamed from: ua */
        private SelectBillSplitMoneyRequestActivity m44954ua(SelectBillSplitMoneyRequestActivity selectBillSplitMoneyRequestActivity) {
            C30746qa.m91941d(selectBillSplitMoneyRequestActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(selectBillSplitMoneyRequestActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(selectBillSplitMoneyRequestActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(selectBillSplitMoneyRequestActivity, (C31663a) this.f35761d.f36200F.get());
            C26703p.m83138a(selectBillSplitMoneyRequestActivity, this.f35761d.m46115T7());
            C26703p.m83139b(selectBillSplitMoneyRequestActivity, m44603Ia());
            return selectBillSplitMoneyRequestActivity;
        }

        /* renamed from: v6 */
        private C19797a m44959v6() {
            return new C19797a((C20296a) this.f35761d.f36358Z0.get());
        }

        /* renamed from: v7 */
        private C25507k m44960v7() {
            return new C25507k((C26093a) this.f35761d.f36203F2.get());
        }

        /* renamed from: v8 */
        private DDTransparentLoaderActivity m44961v8(DDTransparentLoaderActivity dDTransparentLoaderActivity) {
            C30746qa.m91941d(dDTransparentLoaderActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(dDTransparentLoaderActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(dDTransparentLoaderActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(dDTransparentLoaderActivity, (C31663a) this.f35761d.f36200F.get());
            C33607b.m98672a(dDTransparentLoaderActivity, (Client) this.f35761d.f36389d0.get());
            C33607b.m98673b(dDTransparentLoaderActivity, (C41438c) this.f35761d.f36184D.get());
            return dDTransparentLoaderActivity;
        }

        /* renamed from: v9 */
        private OfferNotAvailableActivity m44962v9(OfferNotAvailableActivity offerNotAvailableActivity) {
            C30746qa.m91941d(offerNotAvailableActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(offerNotAvailableActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(offerNotAvailableActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(offerNotAvailableActivity, (C31663a) this.f35761d.f36200F.get());
            C35468c.m105319a(offerNotAvailableActivity, m44711Ua());
            return offerNotAvailableActivity;
        }

        /* renamed from: va */
        private SettingsActivity m44963va(SettingsActivity settingsActivity) {
            C30746qa.m91941d(settingsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(settingsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(settingsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(settingsActivity, (C31663a) this.f35761d.f36200F.get());
            C38633n.m113226a(settingsActivity, (Client) this.f35761d.f36389d0.get());
            return settingsActivity;
        }

        /* renamed from: w6 */
        private C29568c m44968w6() {
            return new C29568c((C29567b) this.f35761d.f36181C4.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: w7 */
        public C26615g m44969w7() {
            return new C26615g((C27622a) this.f35761d.f36495q2.get());
        }

        /* renamed from: w8 */
        private DebitCardDetailsActivity m44970w8(DebitCardDetailsActivity debitCardDetailsActivity) {
            C30746qa.m91941d(debitCardDetailsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(debitCardDetailsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(debitCardDetailsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(debitCardDetailsActivity, (C31663a) this.f35761d.f36200F.get());
            C34066b.m100166c(debitCardDetailsActivity, (C34119g.C34133g) this.f35712N1.get());
            C34066b.m100164a(debitCardDetailsActivity, (Client) this.f35761d.f36389d0.get());
            C34066b.m100165b(debitCardDetailsActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            return debitCardDetailsActivity;
        }

        /* renamed from: w9 */
        private OffersAndApplicationsActivity m44971w9(OffersAndApplicationsActivity offersAndApplicationsActivity) {
            C30746qa.m91941d(offersAndApplicationsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(offersAndApplicationsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(offersAndApplicationsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(offersAndApplicationsActivity, (C31663a) this.f35761d.f36200F.get());
            C21405m.m69160a(offersAndApplicationsActivity, (Client) this.f35761d.f36389d0.get());
            C21405m.m69162c(offersAndApplicationsActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C21405m.m69161b(offersAndApplicationsActivity, this.f35761d.m46115T7());
            return offersAndApplicationsActivity;
        }

        /* renamed from: wa */
        private SmsNotifManagerActivity m44972wa(SmsNotifManagerActivity smsNotifManagerActivity) {
            C30746qa.m91941d(smsNotifManagerActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(smsNotifManagerActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(smsNotifManagerActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(smsNotifManagerActivity, (C31663a) this.f35761d.f36200F.get());
            C35432k2.m105181e(smsNotifManagerActivity, m44783cb());
            C35432k2.m105177a(smsNotifManagerActivity, (BankApi) this.f35761d.f36405f0.get());
            C35432k2.m105178b(smsNotifManagerActivity, (Client) this.f35761d.f36389d0.get());
            C35432k2.m105179c(smsNotifManagerActivity, (C41438c) this.f35761d.f36184D.get());
            C35432k2.m105180d(smsNotifManagerActivity, (C27494a) this.f35761d.f36414g1.get());
            return smsNotifManagerActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: x6 */
        public C25258b m44977x6() {
            return new C25258b((C27622a) this.f35761d.f36495q2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: x7 */
        public C19104p m44978x7() {
            return new C19104p((C10344a) this.f35761d.f36535v2.get());
        }

        /* renamed from: x8 */
        private DebugSettingsActivity m44979x8(DebugSettingsActivity debugSettingsActivity) {
            C30746qa.m91941d(debugSettingsActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(debugSettingsActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(debugSettingsActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(debugSettingsActivity, (C31663a) this.f35761d.f36200F.get());
            C35423j.m105161d(debugSettingsActivity, m44774bb());
            C35423j.m105160c(debugSettingsActivity, (PreferencesApiManager) this.f35761d.f36224I.get());
            C35423j.m105159b(debugSettingsActivity, (C34676e) this.f35761d.f36208G.get());
            C35423j.m105163f(debugSettingsActivity, (TargetEnvironment) this.f35761d.f36216H.get());
            C35423j.m105158a(debugSettingsActivity, (C31663a) this.f35761d.f36200F.get());
            C35423j.m105162e(debugSettingsActivity, (C39765a) this.f35764d2.get());
            return debugSettingsActivity;
        }

        /* renamed from: x9 */
        private OffersProgressDetailActivity m44980x9(OffersProgressDetailActivity offersProgressDetailActivity) {
            C30746qa.m91941d(offersProgressDetailActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(offersProgressDetailActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(offersProgressDetailActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(offersProgressDetailActivity, (C31663a) this.f35761d.f36200F.get());
            C15100i.m55254a(offersProgressDetailActivity, (C15101j.C15102a) this.f35711N0.get());
            return offersProgressDetailActivity;
        }

        /* renamed from: xa */
        private StatementActivity m44981xa(StatementActivity statementActivity) {
            C30746qa.m91941d(statementActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(statementActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(statementActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(statementActivity, (C31663a) this.f35761d.f36200F.get());
            C35438l2.m105189b(statementActivity, (C30123a) this.f35795l1.get());
            C35438l2.m105191d(statementActivity, (C28290a) this.f35809p1.get());
            C35438l2.m105192e(statementActivity, this.f35761d.getDepositsAndBondsUseCase());
            C35438l2.m105188a(statementActivity, (C26143a) this.f35792k2.get());
            C35438l2.m105190c(statementActivity, this.f35761d.getAccountsAndDetailsUseCase());
            C35438l2.m105193f(statementActivity, (Client) this.f35761d.f36389d0.get());
            C35438l2.m105194g(statementActivity, (C41438c) this.f35761d.f36184D.get());
            return statementActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: y6 */
        public C17534g m44986y6() {
            return new C17534g((C17385a) this.f35761d.f36178C1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: y7 */
        public C39848c0 m44987y7() {
            return new C39848c0((C31186b) this.f35761d.f36163A2.get());
        }

        /* renamed from: y8 */
        private DepositApplicationResultActivity m44988y8(DepositApplicationResultActivity depositApplicationResultActivity) {
            C30746qa.m91941d(depositApplicationResultActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(depositApplicationResultActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(depositApplicationResultActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(depositApplicationResultActivity, (C31663a) this.f35761d.f36200F.get());
            return depositApplicationResultActivity;
        }

        /* renamed from: y9 */
        private OldPaymentWizardActivity m44989y9(OldPaymentWizardActivity oldPaymentWizardActivity) {
            C30746qa.m91941d(oldPaymentWizardActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(oldPaymentWizardActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(oldPaymentWizardActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(oldPaymentWizardActivity, (C31663a) this.f35761d.f36200F.get());
            C35878j.m106726a(oldPaymentWizardActivity, (RootBankApiManager) this.f35761d.f36413g0.get());
            C35878j.m106727b(oldPaymentWizardActivity, (Client) this.f35761d.f36389d0.get());
            C35878j.m106728c(oldPaymentWizardActivity, (C41438c) this.f35761d.f36184D.get());
            return oldPaymentWizardActivity;
        }

        /* renamed from: ya */
        private StatementsFilterActivity m44990ya(StatementsFilterActivity statementsFilterActivity) {
            C30746qa.m91941d(statementsFilterActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(statementsFilterActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(statementsFilterActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(statementsFilterActivity, (C31663a) this.f35761d.f36200F.get());
            return statementsFilterActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: z6 */
        public C38875l m44995z6() {
            return new C38875l((C17385a) this.f35761d.f36178C1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: z7 */
        public C26054b m44996z7() {
            return new C26054b((C25742a) this.f35765e.f35926t.get());
        }

        /* renamed from: z8 */
        private DepositApplicationSubmissionActivity m44997z8(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
            C30746qa.m91941d(depositApplicationSubmissionActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(depositApplicationSubmissionActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(depositApplicationSubmissionActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(depositApplicationSubmissionActivity, (C31663a) this.f35761d.f36200F.get());
            C20205l.m66175a(depositApplicationSubmissionActivity, (C25906p) this.f35829w0.get());
            return depositApplicationSubmissionActivity;
        }

        /* renamed from: z9 */
        private OpenBankingAuthActivity m44998z9(OpenBankingAuthActivity openBankingAuthActivity) {
            C30746qa.m91941d(openBankingAuthActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(openBankingAuthActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(openBankingAuthActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(openBankingAuthActivity, (C31663a) this.f35761d.f36200F.get());
            C25286d.m80454a(openBankingAuthActivity, new C36736h());
            return openBankingAuthActivity;
        }

        /* renamed from: za */
        private StoryGroupActivity m44999za(StoryGroupActivity storyGroupActivity) {
            C30746qa.m91941d(storyGroupActivity, (SessionManager) this.f35761d.f36256M.get());
            C30746qa.m91939b(storyGroupActivity, (C36728a) this.f35761d.f36400e3.get());
            C30746qa.m91940c(storyGroupActivity, (C37071a) this.f35773g.get());
            C30746qa.m91938a(storyGroupActivity, (C31663a) this.f35761d.f36200F.get());
            C34806h.m102248a(storyGroupActivity, (C37910a) this.f35748Z1.get());
            return storyGroupActivity;
        }

        /* renamed from: A */
        public void mo32374A(DebugSettingsActivity debugSettingsActivity) {
            m44979x8(debugSettingsActivity);
        }

        /* renamed from: A0 */
        public void mo32375A0(SecuredLoanActivity securedLoanActivity) {
            m44945ta(securedLoanActivity);
        }

        /* renamed from: A1 */
        public void mo26531A1(BnplOffersActivity bnplOffersActivity) {
            m44726W7(bnplOffersActivity);
        }

        /* renamed from: B */
        public void mo32376B(NboNavigatorActivity nboNavigatorActivity) {
            m44935s9(nboNavigatorActivity);
        }

        /* renamed from: B0 */
        public void mo32377B0(PaymentResultListActivity paymentResultListActivity) {
            m44692S9(paymentResultListActivity);
        }

        /* renamed from: B1 */
        public void mo32378B1(QrPayActivity qrPayActivity) {
            m44812fa(qrPayActivity);
        }

        /* renamed from: C */
        public void mo32379C(STOTypeListActivity sTOTypeListActivity) {
            m44918qa(sTOTypeListActivity);
        }

        /* renamed from: C0 */
        public void mo32380C0(SelectBillSplitMoneyRequestActivity selectBillSplitMoneyRequestActivity) {
            m44954ua(selectBillSplitMoneyRequestActivity);
        }

        /* renamed from: C1 */
        public void mo32381C1(LoyaltyProgressActivity loyaltyProgressActivity) {
            m44861k9(loyaltyProgressActivity);
        }

        /* renamed from: D */
        public void mo32382D(P2PLinkActivity p2PLinkActivity) {
            m44629L9(p2PLinkActivity);
        }

        /* renamed from: D0 */
        public void mo32383D0(LifestyleOffersFilterActivity lifestyleOffersFilterActivity) {
            m44791d9(lifestyleOffersFilterActivity);
        }

        /* renamed from: D1 */
        public void mo32384D1(QrPayReversalActivity qrPayReversalActivity) {
            m44842ia(qrPayReversalActivity);
        }

        /* renamed from: E */
        public void mo32385E(TransferTemplatesListActivity transferTemplatesListActivity) {
            m44577Fa(transferTemplatesListActivity);
        }

        /* renamed from: E0 */
        public void mo32386E0(OtherTransferTypeListActivity otherTransferTypeListActivity) {
            m44593H9(otherTransferTypeListActivity);
        }

        /* renamed from: E1 */
        public void mo32387E1(DDTransparentLoaderActivity dDTransparentLoaderActivity) {
            m44961v8(dDTransparentLoaderActivity);
        }

        /* renamed from: F */
        public void mo32388F(ManagePensionFundsActivity managePensionFundsActivity) {
            m44890n9(managePensionFundsActivity);
        }

        /* renamed from: F0 */
        public void mo32389F0(ActivateInstantCardActivity activateInstantCardActivity) {
            m44627L7(activateInstantCardActivity);
        }

        /* renamed from: F1 */
        public void mo32390F1(NotificationDetailsActivity notificationDetailsActivity) {
            m44944t9(notificationDetailsActivity);
        }

        /* renamed from: G */
        public void mo32391G(OwnSTODetailsActivity ownSTODetailsActivity) {
            m44602I9(ownSTODetailsActivity);
        }

        /* renamed from: G0 */
        public void mo32392G0(ProviderListActivity providerListActivity) {
            m44792da(providerListActivity);
        }

        /* renamed from: G1 */
        public void mo32393G1(StatementsFilterActivity statementsFilterActivity) {
            m44990ya(statementsFilterActivity);
        }

        /* renamed from: G7 */
        public Set mo32394G7() {
            return C18330e.m62678c(SubsamplingScaleImageView.ORIENTATION_180).mo46102a(C12577k.m47850a()).mo46102a(C17981c.m61952a()).mo46102a(C25633e.m80835a()).mo46102a(C27888d.m86148a()).mo46102a(C40120i.m116246a()).mo46102a(C20146f.m66137a()).mo46102a(C20159s.m66139a()).mo46102a(C19268e.m64712a()).mo46102a(C37001g.m109506a()).mo46102a(C25050b.m80000a()).mo46102a(C27854c.m86060a()).mo46102a(C24862j.m79527a()).mo46102a(C20657n.m66956a()).mo46102a(C18418h.m62839a()).mo46102a(C10082i.m36939a()).mo46102a(C10511g.m38083a()).mo46102a(C28322b.m86958a()).mo46102a(C25638j.m80837a()).mo46102a(C25643o.m80839a()).mo46102a(C30207l.m91294a()).mo46102a(C17635o.m61290a()).mo46102a(C17831k.m61602a()).mo46102a(C29154f.m89083a()).mo46102a(C17554f.m61112a()).mo46102a(C27879b.m86126a()).mo46102a(C36095b0.m107391a()).mo46102a(C27234e.m84257a()).mo46102a(C28138f.m86591a()).mo46102a(C38266c.m112481a()).mo46102a(C38388c.m112752a()).mo46102a(C39504d.m114831a()).mo46102a(C15452g.m55930a()).mo46102a(C26832l0.m83461a()).mo46102a(C18643f.m63197a()).mo46102a(C28342f.m86976a()).mo46102a(C28957b.m88688a()).mo46102a(C28959d.m88690a()).mo46102a(C28500o.m87329a()).mo46102a(C26665d0.m83133a()).mo46102a(C19188l.m64599a()).mo46102a(C37737d0.m110918a()).mo46102a(C19328t.m64776a()).mo46102a(C39508h.m114836a()).mo46102a(C19684p.m65349a()).mo46102a(C19959d.m65861a()).mo46102a(C19969n.m65868a()).mo46102a(C28171f.m86617a()).mo46102a(C27961g.m86315a()).mo46102a(C27772g.m85934a()).mo46102a(C30063h.m91029a()).mo46102a(C40010k.m115943a()).mo46102a(C25654z.m80841a()).mo46102a(C28982w.m88692a()).mo46102a(C12953h.m48884a()).mo46102a(C25132g.m80181a()).mo46102a(C31809l.m94037a()).mo46102a(C28143b.m86597a()).mo46102a(C30095l.m91064a()).mo46102a(C30217v.m91296a()).mo46102a(C31656e.m93791a()).mo46102a(C26985s.m83811a()).mo46102a(C29073h.m88907a()).mo46102a(C29389i.m89475a()).mo46102a(C30054k.m91023a()).mo46102a(C27527g.m85332a()).mo46102a(C26953c0.m83786a()).mo46102a(C25957d.m81599a()).mo46102a(C25968n.m81613a()).mo46102a(C25207o.m80261a()).mo46102a(C29054n.m88889a()).mo46102a(C19384g.m64865a()).mo46102a(C28378g.m87040a()).mo46102a(C28774i.m88206a()).mo46102a(C20239g.m66249a()).mo46102a(C24722k.m79285a()).mo46102a(C25735k.m80975a()).mo46102a(C25446i.m80613a()).mo46102a(C26215m.m82018a()).mo46102a(C26219q.m82021a()).mo46102a(C26228z.m82028a()).mo46102a(C25986f0.m81619a()).mo46102a(C27803j.m85978a()).mo46102a(C25974t.m81616a()).mo46102a(C29773g.m90461a()).mo46102a(C30307j.m91414a()).mo46102a(C19256i.m64697a()).mo46102a(C30078l.m91040a()).mo46102a(C20259m.m66274a()).mo46102a(C26520e.m82877a()).mo46102a(C29448k.m89562a()).mo46102a(C26524d.m82879a()).mo46102a(C25574a1.m80811a()).mo46102a(C19780o.m65543a()).mo46102a(C16491d0.m58709a()).mo46102a(C28289j.m86926a()).mo46102a(C30297g.m91408a()).mo46102a(C19244i.m64690a()).mo46102a(C26827j2.m83459a()).mo46102a(C29869h.m90668a()).mo46102a(C19061w.m64394a()).mo46102a(C16813l.m59282a()).mo46102a(C20006f.m65913a()).mo46102a(C25793h.m81089a()).mo46102a(C12807w.m48560a()).mo46102a(C12401l.m47399a()).mo46102a(C15410o.m55876a()).mo46102a(C31408e.m93336a()).mo46102a(C37075d.m109611a()).mo46102a(C30415b.m91724a()).mo46102a(C36226g.m107656a()).mo46102a(C30793u5.m91954a()).mo46102a(C40280e.m116680a()).mo46102a(C19191c.m64601a()).mo46102a(C29204e.m89166a()).mo46102a(C29902n.m90717a()).mo46102a(C24878z.m79529a()).mo46102a(C20667x.m66958a()).mo46102a(C25274h.m80445a()).mo46102a(C26650i.m83127a()).mo46102a(C25282p.m80447a()).mo46102a(MoreViewModel_ViewModel_HiltModules_KeyModule_ProvideFactory.provide()).mo46102a(C29188b.m89127a()).mo46102a(C19441l.m64941a()).mo46102a(C17130r.m60204a()).mo46102a(C26140q.m81833a()).mo46102a(C25097q.m80058a()).mo46102a(C36803l.m109017a()).mo46102a(C38364o.m112660a()).mo46102a(C12496a4.m47531a()).mo46102a(C31259h.m92855a()).mo46102a(C16906r.m59482a()).mo46102a(C16661i.m58984a()).mo46102a(C16541l.m58748a()).mo46102a(C12959f.m48889a()).mo46102a(C36261s.m107693a()).mo46102a(C17146k.m60223a()).mo46102a(C12418m.m47421a()).mo46102a(C37673l.m110746a()).mo46102a(C29218s.m89168a()).mo46102a(C39191m.m114296a()).mo46102a(C37747i0.m110923a()).mo46102a(C19085e.m64435a()).mo46102a(C37776q0.m111010a()).mo46102a(C37796v0.m111070a()).mo46102a(C37802y0.m111086a()).mo46102a(C18410k.m62835a()).mo46102a(C18610i.m63170a()).mo46102a(C18940m.m64021a()).mo46102a(C25667m.m80843a()).mo46102a(C28157f.m86601a()).mo46102a(C37485q.m110398a()).mo46102a(C37817i.m111104a()).mo46102a(C30461v0.m91739a()).mo46102a(C20777k.m67228a()).mo46102a(C26114h.m81812a()).mo46102a(C28151h.m86599a()).mo46102a(C10504t.m38076a()).mo46102a(C30478l.m91755a()).mo46102a(C31970m.m94367a()).mo46102a(C28600n.m87555a()).mo46102a(C37172o.m109856a()).mo46102a(C39606h.m115082a()).mo46102a(C12322h.m47244a()).mo46102a(C15301k.m55701a()).mo46102a(C38159y.m112283a()).mo46102a(C38305k.m112576a()).mo46102a(C31920n.m94270a()).mo46102a(C39216h0.m114344a()).mo46102a(C38666g0.m113328a()).mo46102a(C39829f.m115580a()).mo46102a(C19925p.m65806a()).mo46102a(C20484l.m66689a()).mo46102a(C20179t.m66141a()).mo46102a(C28033k.m86425a()).mo46102a(C27005m.m83834a()).mo46102a(C29124e.m89038a()).mo46102a(C16322n.m58121a()).mo46102a(C40217f.m116518a()).mo46102a(C25336c.m80508a()).mo46102a(C24888f.m79539a()).mo46103b();
        }

        /* renamed from: H */
        public void mo32395H(OffersAndApplicationsActivity offersAndApplicationsActivity) {
            m44971w9(offersAndApplicationsActivity);
        }

        /* renamed from: H0 */
        public void mo32396H0(SmsNotifManagerActivity smsNotifManagerActivity) {
            m44972wa(smsNotifManagerActivity);
        }

        /* renamed from: H1 */
        public void mo32397H1(DepositDetailsActivity depositDetailsActivity) {
            m44530A8(depositDetailsActivity);
        }

        /* renamed from: I */
        public void mo32398I(MoneyRequestDetailsActivity moneyRequestDetailsActivity) {
            m44908p9(moneyRequestDetailsActivity);
        }

        /* renamed from: I0 */
        public void mo32399I0(CardApplicationTypesActivity cardApplicationTypesActivity) {
            m44762a8(cardApplicationTypesActivity);
        }

        /* renamed from: I1 */
        public void mo32400I1(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            m44802ea(pushNotificationHandlerActivity);
        }

        /* renamed from: J */
        public void mo32401J(MoneyTransferProviderListActivity moneyTransferProviderListActivity) {
            m44917q9(moneyTransferProviderListActivity);
        }

        /* renamed from: J0 */
        public void mo32402J0(QrPayResultActivity qrPayResultActivity) {
            m44832ha(qrPayResultActivity);
        }

        /* renamed from: J1 */
        public void mo32403J1(PaymentsTemplateListActivity paymentsTemplateListActivity) {
            m44701T9(paymentsTemplateListActivity);
        }

        /* renamed from: K */
        public void mo32404K(ExchangeActivity exchangeActivity) {
            m44566E8(exchangeActivity);
        }

        /* renamed from: K0 */
        public void mo32405K0(OrderCardResultActivity orderCardResultActivity) {
            m44540B9(orderCardResultActivity);
        }

        /* renamed from: K1 */
        public void mo32406K1(SearchResultActivity searchResultActivity) {
            m44936sa(searchResultActivity);
        }

        /* renamed from: L */
        public void mo32407L(CasDetailsActivity casDetailsActivity) {
            m44810f8(casDetailsActivity);
        }

        /* renamed from: L0 */
        public void mo32408L0(TemplatesAndProvidersActivity templatesAndProvidersActivity) {
            m44532Aa(templatesAndProvidersActivity);
        }

        /* renamed from: L1 */
        public void mo32409L1(OwnTransferDetailsActivity ownTransferDetailsActivity) {
            m44620K9(ownTransferDetailsActivity);
        }

        /* renamed from: M */
        public void mo32410M(CreateCasActivity createCasActivity) {
            m44907p8(createCasActivity);
        }

        /* renamed from: M0 */
        public void mo32411M0(PlusActivationActivity plusActivationActivity) {
            m44728W9(plusActivationActivity);
        }

        /* renamed from: M1 */
        public void mo32412M1(MainActivity mainActivity) {
            m44871l9(mainActivity);
        }

        /* renamed from: N */
        public void mo32413N(CategoryPackagesActivity categoryPackagesActivity) {
            m44830h8(categoryPackagesActivity);
        }

        /* renamed from: N0 */
        public void mo32414N0(QrWithdrawalActivity qrWithdrawalActivity) {
            m44872la(qrWithdrawalActivity);
        }

        /* renamed from: N1 */
        public void mo32415N1(ClaFirstStageActivity claFirstStageActivity) {
            m44850j8(claFirstStageActivity);
        }

        /* renamed from: O */
        public void mo32416O(CardInsuranceStatusesActivity cardInsuranceStatusesActivity) {
            m44780c8(cardInsuranceStatusesActivity);
        }

        /* renamed from: O0 */
        public void mo32417O0(DomesticTransferWizardActivity domesticTransferWizardActivity) {
            m44557D8(domesticTransferWizardActivity);
        }

        /* renamed from: O1 */
        public void mo32418O1(ProductDetailedActivity productDetailedActivity) {
            m44773ba(productDetailedActivity);
        }

        /* renamed from: P */
        public void mo32419P(p341ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity paymentFormActivity) {
            m44656O9(paymentFormActivity);
        }

        /* renamed from: P0 */
        public void mo32420P0(C35388f2 f2Var) {
            m44909pa(f2Var);
        }

        /* renamed from: P1 */
        public void mo32421P1(CreatePiggyBankActivity createPiggyBankActivity) {
            m44916q8(createPiggyBankActivity);
        }

        /* renamed from: Q */
        public void mo32422Q(LifestyleOffersByCategoryActivity lifestyleOffersByCategoryActivity) {
            m44781c9(lifestyleOffersByCategoryActivity);
        }

        /* renamed from: Q0 */
        public void mo32423Q0(TransportPointExchangeSuccessActivity transportPointExchangeSuccessActivity) {
            m44594Ha(transportPointExchangeSuccessActivity);
        }

        /* renamed from: Q1 */
        public void mo32424Q1(GTWatchlistDetailsActivity gTWatchlistDetailsActivity) {
            m44682R8(gTWatchlistDetailsActivity);
        }

        /* renamed from: R */
        public void mo32425R(PaymentResultActivity paymentResultActivity) {
            m44674Q9(paymentResultActivity);
        }

        /* renamed from: R0 */
        public void mo32426R0(GamificationActivity gamificationActivity) {
            m44691S8(gamificationActivity);
        }

        /* renamed from: R1 */
        public void mo32427R1(ParametersActivity parametersActivity) {
            m44638M9(parametersActivity);
        }

        /* renamed from: S */
        public void mo32428S(OutOfServiceActivity outOfServiceActivity) {
        }

        /* renamed from: S0 */
        public void mo32429S0(FormActivity formActivity) {
            m44592H8(formActivity);
        }

        /* renamed from: S1 */
        public void mo32430S1(LifestyleOffersProgressActivity lifestyleOffersProgressActivity) {
            m44801e9(lifestyleOffersProgressActivity);
        }

        /* renamed from: T */
        public void mo32431T(CashCoverLoanActivity cashCoverLoanActivity) {
            m44820g8(cashCoverLoanActivity);
        }

        /* renamed from: T0 */
        public void mo32432T0(PlusInvitationResultActivity plusInvitationResultActivity) {
            m44737X9(plusInvitationResultActivity);
        }

        /* renamed from: T1 */
        public void mo32433T1(GTShareTradeDetailsActivity gTShareTradeDetailsActivity) {
            m44655O8(gTShareTradeDetailsActivity);
        }

        /* renamed from: U */
        public void mo32434U(OperationDetailsActivity operationDetailsActivity) {
            m44531A9(operationDetailsActivity);
        }

        /* renamed from: U0 */
        public void mo32435U0(GTMoneyExchangeActivity gTMoneyExchangeActivity) {
            m44619K8(gTMoneyExchangeActivity);
        }

        /* renamed from: U1 */
        public void mo32436U1(p341ge.bog.mobilebank.p975ui.activities.PaymentResultActivity paymentResultActivity) {
            m44683R9(paymentResultActivity);
        }

        /* renamed from: V */
        public void mo32437V(CardOrderListActivity cardOrderListActivity) {
            m44790d8(cardOrderListActivity);
        }

        /* renamed from: V0 */
        public void mo32438V0(BnplDetailsActivity bnplDetailsActivity) {
            m44708U7(bnplDetailsActivity);
        }

        /* renamed from: V1 */
        public void mo32439V1(LoanActivationActivity loanActivationActivity) {
            m44821g9(loanActivationActivity);
        }

        /* renamed from: W */
        public void mo32440W(InstantDeliveryApplicationActivity instantDeliveryApplicationActivity) {
            m44727W8(instantDeliveryApplicationActivity);
        }

        /* renamed from: W0 */
        public void mo32441W0(TransferLoaderActivity transferLoaderActivity) {
            m44559Da(transferLoaderActivity);
        }

        /* renamed from: W1 */
        public void mo32442W1(OtherTemplateDetailsActivity otherTemplateDetailsActivity) {
            m44576F9(otherTemplateDetailsActivity);
        }

        /* renamed from: X */
        public void mo32443X(OtherTransferDetailsActivity otherTransferDetailsActivity) {
            m44584G9(otherTransferDetailsActivity);
        }

        /* renamed from: X0 */
        public void mo32444X0(ClientLimitInfoActivity clientLimitInfoActivity) {
            m44870l8(clientLimitInfoActivity);
        }

        /* renamed from: X1 */
        public void mo32445X1(GTShareTradeReviewActivity gTShareTradeReviewActivity) {
            m44664P8(gTShareTradeReviewActivity);
        }

        /* renamed from: Y */
        public void mo32446Y(LoanListActivity loanListActivity) {
            m44831h9(loanListActivity);
        }

        /* renamed from: Y0 */
        public void mo32447Y0(OffersProgressDetailActivity offersProgressDetailActivity) {
            m44980x9(offersProgressDetailActivity);
        }

        /* renamed from: Y1 */
        public void mo32448Y1(CarTemplateGroupActivity carTemplateGroupActivity) {
            m44753Z7(carTemplateGroupActivity);
        }

        /* renamed from: Z */
        public void mo32449Z(MapActivity mapActivity) {
            m44899o9(mapActivity);
        }

        /* renamed from: Z0 */
        public void mo32450Z0(DepositApplicationResultActivity depositApplicationResultActivity) {
            m44988y8(depositApplicationResultActivity);
        }

        /* renamed from: Z1 */
        public C17607c mo32192Z1() {
            return new C12195f(this.f35761d, this.f35765e, this.f35769f);
        }

        /* renamed from: a */
        public C17766a.C17769c mo32451a() {
            return C17770b.m61458a(mo32394G7(), new C12278m(this.f35761d, this.f35765e));
        }

        /* renamed from: a0 */
        public void mo32452a0(PensionDetailsActivity pensionDetailsActivity) {
            m44710U9(pensionDetailsActivity);
        }

        /* renamed from: a1 */
        public void mo32453a1(SearchActivity searchActivity) {
            m44927ra(searchActivity);
        }

        /* renamed from: a2 */
        public void mo32454a2(ClientIncomesActivity clientIncomesActivity) {
            m44860k8(clientIncomesActivity);
        }

        /* renamed from: b */
        public void mo32455b(ManageAccountsAndCardsActivity manageAccountsAndCardsActivity) {
            m44881m9(manageAccountsAndCardsActivity);
        }

        /* renamed from: b0 */
        public void mo32456b0(StoryGroupActivity storyGroupActivity) {
            m44999za(storyGroupActivity);
        }

        /* renamed from: b1 */
        public void mo32457b1(QrPayCardSelectActivity qrPayCardSelectActivity) {
            m44822ga(qrPayCardSelectActivity);
        }

        /* renamed from: b2 */
        public void mo32458b2(ThreeDSecurityActivity threeDSecurityActivity) {
            m44550Ca(threeDSecurityActivity);
        }

        /* renamed from: c */
        public void mo32459c(PlusPointsTransferWizardActivity plusPointsTransferWizardActivity) {
            m44755Z9(plusPointsTransferWizardActivity);
        }

        /* renamed from: c0 */
        public void mo32460c0(GTIntroductionActivity gTIntroductionActivity) {
            m44610J8(gTIntroductionActivity);
        }

        /* renamed from: c1 */
        public void mo32461c1(AutoLiabilityInsuranceActivity autoLiabilityInsuranceActivity) {
            m44672Q7(autoLiabilityInsuranceActivity);
        }

        /* renamed from: c2 */
        public void mo32462c2(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
            m44997z8(depositApplicationSubmissionActivity);
        }

        /* renamed from: d */
        public void mo32463d(AddTemplateActivity addTemplateActivity) {
            m44645N7(addTemplateActivity);
        }

        /* renamed from: d0 */
        public void mo32464d0(LoyaltyListActivity loyaltyListActivity) {
            m44851j9(loyaltyListActivity);
        }

        /* renamed from: d1 */
        public void mo32465d1(ContactUsActivity contactUsActivity) {
            m44898o8(contactUsActivity);
        }

        /* renamed from: e */
        public void mo32466e(OldPaymentWizardActivity oldPaymentWizardActivity) {
            m44989y9(oldPaymentWizardActivity);
        }

        /* renamed from: e0 */
        public void mo32467e0(CreditOfferApplicationActivity creditOfferApplicationActivity) {
            m44934s8(creditOfferApplicationActivity);
        }

        /* renamed from: e1 */
        public void mo32468e1(SsoWindowActivity ssoWindowActivity) {
        }

        /* renamed from: f */
        public void mo32469f(GTOnboardingIntroActivity gTOnboardingIntroActivity) {
            m44637M8(gTOnboardingIntroActivity);
        }

        /* renamed from: f0 */
        public void mo32470f0(OrderInstantCardActivity orderInstantCardActivity) {
            m44558D9(orderInstantCardActivity);
        }

        /* renamed from: f1 */
        public void mo32471f1(InstantCardStatusActivity instantCardStatusActivity) {
            m44718V8(instantCardStatusActivity);
        }

        /* renamed from: g */
        public void mo32472g(ChangeLanguageActivity changeLanguageActivity) {
            m44840i8(changeLanguageActivity);
        }

        /* renamed from: g0 */
        public void mo32473g0(GTTransactionDetailActivity gTTransactionDetailActivity) {
            m44673Q8(gTTransactionDetailActivity);
        }

        /* renamed from: g1 */
        public void mo32474g1(OtherSTODetailsActivity otherSTODetailsActivity) {
            m44567E9(otherSTODetailsActivity);
        }

        /* renamed from: h */
        public void mo32475h(LoanSubtypesActivity loanSubtypesActivity) {
            m44841i9(loanSubtypesActivity);
        }

        /* renamed from: h0 */
        public void mo32476h0(ConsumerLoanActivationResultActivity consumerLoanActivationResultActivity) {
            m44880m8(consumerLoanActivationResultActivity);
        }

        /* renamed from: h1 */
        public void mo32477h1(CardInsuranceDetailsActivity cardInsuranceDetailsActivity) {
            m44771b8(cardInsuranceDetailsActivity);
        }

        /* renamed from: i */
        public void mo32478i(LauncherActivity launcherActivity) {
            m44754Z8(launcherActivity);
        }

        /* renamed from: i0 */
        public void mo32479i0(LifestyleOfferDetailedActivity lifestyleOfferDetailedActivity) {
            m44772b9(lifestyleOfferDetailedActivity);
        }

        /* renamed from: i1 */
        public void mo32480i1(BnplOfferDetailsActivity bnplOfferDetailsActivity) {
            m44717V7(bnplOfferDetailsActivity);
        }

        /* renamed from: j */
        public void mo32481j(BnplApplicationResultActivity bnplApplicationResultActivity) {
            m44690S7(bnplApplicationResultActivity);
        }

        /* renamed from: j0 */
        public void mo32482j0(QrScannerActivity qrScannerActivity) {
            m44862ka(qrScannerActivity);
        }

        /* renamed from: j1 */
        public void mo32483j1(RenameAccountActivity renameAccountActivity) {
            m44900oa(renameAccountActivity);
        }

        /* renamed from: k */
        public void mo32484k(ExpressLoanDetailsActivity expressLoanDetailsActivity) {
            m44583G8(expressLoanDetailsActivity);
        }

        /* renamed from: k0 */
        public void mo32485k0(InsurancePolicesActivity insurancePolicesActivity) {
            m44736X8(insurancePolicesActivity);
        }

        /* renamed from: k1 */
        public void mo32486k1(AdvancedWizardActivity advancedWizardActivity) {
            m44654O7(advancedWizardActivity);
        }

        /* renamed from: l */
        public void mo32487l(TermsAndConditionsActivity termsAndConditionsActivity) {
            m44541Ba(termsAndConditionsActivity);
        }

        /* renamed from: l0 */
        public void mo32488l0(HouseTemplateGroupActivity houseTemplateGroupActivity) {
            m44700T8(houseTemplateGroupActivity);
        }

        /* renamed from: l1 */
        public void mo32489l1(TransferResultActivity transferResultActivity) {
            m44568Ea(transferResultActivity);
        }

        /* renamed from: m */
        public void mo32490m(StatementActivity statementActivity) {
            m44981xa(statementActivity);
        }

        /* renamed from: m0 */
        public void mo32491m0(OfferNotAvailableActivity offerNotAvailableActivity) {
            m44962v9(offerNotAvailableActivity);
        }

        /* renamed from: m1 */
        public void mo32492m1(GTShareDetailsActivity gTShareDetailsActivity) {
            m44646N8(gTShareDetailsActivity);
        }

        /* renamed from: n */
        public void mo32493n(PiggyBankDetailsActivity piggyBankDetailsActivity) {
            m44719V9(piggyBankDetailsActivity);
        }

        /* renamed from: n0 */
        public void mo32494n0(SettingsActivity settingsActivity) {
            m44963va(settingsActivity);
        }

        /* renamed from: n1 */
        public void mo32495n1(AddIncomeActivity addIncomeActivity) {
            m44636M7(addIncomeActivity);
        }

        /* renamed from: o */
        public void mo32496o(QrResultPageActivity qrResultPageActivity) {
            m44852ja(qrResultPageActivity);
        }

        /* renamed from: o0 */
        public void mo32497o0(TransportPointExchangeActivity transportPointExchangeActivity) {
            m44585Ga(transportPointExchangeActivity);
        }

        /* renamed from: o1 */
        public void mo32498o1(PaymentOptionWizardActivity paymentOptionWizardActivity) {
            m44665P9(paymentOptionWizardActivity);
        }

        /* renamed from: p */
        public void mo32499p(BnplCategoriesActivity bnplCategoriesActivity) {
            m44699T7(bnplCategoriesActivity);
        }

        /* renamed from: p0 */
        public void mo32500p0(CreditCardDetailsActivity creditCardDetailsActivity) {
            m44925r8(creditCardDetailsActivity);
        }

        /* renamed from: p1 */
        public void mo32501p1(ProductListActivity productListActivity) {
            m44782ca(productListActivity);
        }

        /* renamed from: q */
        public void mo32502q(BankTransferWizardActivity bankTransferWizardActivity) {
            m44681R7(bankTransferWizardActivity);
        }

        /* renamed from: q0 */
        public void mo32503q0(DocumentsUploadActivity documentsUploadActivity) {
            m44548C8(documentsUploadActivity);
        }

        /* renamed from: q1 */
        public void mo32504q1(p341ge.bog.mobilebank.payment.activities.DDFormActivity dDFormActivity) {
            m44952u8(dDFormActivity);
        }

        /* renamed from: r */
        public void mo32505r(LimitResultActivity limitResultActivity) {
            m44811f9(limitResultActivity);
        }

        /* renamed from: r0 */
        public void mo32506r0(DDFormActivity dDFormActivity) {
            m44943t8(dDFormActivity);
        }

        /* renamed from: r1 */
        public void mo32507r1(GooglePayActivity googlePayActivity) {
        }

        /* renamed from: s */
        public void mo32508s(PaymentFormActivity paymentFormActivity) {
            m44647N9(paymentFormActivity);
        }

        /* renamed from: s0 */
        public void mo32509s0(GTMyInvestmentsActivity gTMyInvestmentsActivity) {
            m44628L8(gTMyInvestmentsActivity);
        }

        /* renamed from: s1 */
        public void mo32510s1(CardsDetailActivity cardsDetailActivity) {
            m44800e8(cardsDetailActivity);
        }

        /* renamed from: t */
        public void mo32511t(OpenBankingAuthActivity openBankingAuthActivity) {
            m44998z9(openBankingAuthActivity);
        }

        /* renamed from: t0 */
        public C17609e mo32182t0() {
            return new C12276k(this.f35761d, this.f35765e, this.f35769f);
        }

        /* renamed from: t1 */
        public void mo32512t1(OrderDebitCardActivity orderDebitCardActivity) {
            m44549C9(orderDebitCardActivity);
        }

        /* renamed from: u */
        public void mo32513u(NotificationListActivity notificationListActivity) {
            m44953u9(notificationListActivity);
        }

        /* renamed from: u0 */
        public void mo32514u0(GTActivity gTActivity) {
            m44601I8(gTActivity);
        }

        /* renamed from: u1 */
        public void mo32515u1(PlusProgramInvitationActivity plusProgramInvitationActivity) {
            m44764aa(plusProgramInvitationActivity);
        }

        /* renamed from: v */
        public void mo32516v(PlusPointsTransferActivity plusPointsTransferActivity) {
            m44746Y9(plusPointsTransferActivity);
        }

        /* renamed from: v0 */
        public void mo32517v0(AllTemplateListActivity allTemplateListActivity) {
            m44663P7(allTemplateListActivity);
        }

        /* renamed from: v1 */
        public void mo32518v1(BreakDepositActivity breakDepositActivity) {
            m44744Y7(breakDepositActivity);
        }

        /* renamed from: w */
        public void mo32519w(ExchangeMrPointsToPlusActivity exchangeMrPointsToPlusActivity) {
            m44575F8(exchangeMrPointsToPlusActivity);
        }

        /* renamed from: w0 */
        public void mo32520w0(RateChartLandscapeActivity rateChartLandscapeActivity) {
            m44882ma(rateChartLandscapeActivity);
        }

        /* renamed from: w1 */
        public void mo32521w1(OwnTemplateDetailsActivity ownTemplateDetailsActivity) {
            m44611J9(ownTemplateDetailsActivity);
        }

        /* renamed from: x */
        public void mo32522x(IdentomatResultActivity identomatResultActivity) {
            m44709U8(identomatResultActivity);
        }

        /* renamed from: x0 */
        public void mo32523x0(JuniorActivity juniorActivity) {
            m44745Y8(juniorActivity);
        }

        /* renamed from: x1 */
        public void mo32524x1(RemittanceCreditInfoContractActivity remittanceCreditInfoContractActivity) {
            m44891na(remittanceCreditInfoContractActivity);
        }

        /* renamed from: y */
        public void mo32525y(DepositProlongationActivity depositProlongationActivity) {
            m44539B8(depositProlongationActivity);
        }

        /* renamed from: y0 */
        public void mo32526y0(ContactDetailsActivity contactDetailsActivity) {
            m44889n8(contactDetailsActivity);
        }

        /* renamed from: y1 */
        public void mo32527y1(LifestyleChooserActivity lifestyleChooserActivity) {
            m44763a9(lifestyleChooserActivity);
        }

        /* renamed from: z */
        public void mo32528z(MyCreditInfoDescriptionActivity myCreditInfoDescriptionActivity) {
            m44926r9(myCreditInfoDescriptionActivity);
        }

        /* renamed from: z0 */
        public void mo32529z0(DebitCardDetailsActivity debitCardDetailsActivity) {
            m44970w8(debitCardDetailsActivity);
        }

        /* renamed from: z1 */
        public void mo27227z1(BnplWelcomeActivity bnplWelcomeActivity) {
            m44735X7(bnplWelcomeActivity);
        }

        private C12144b(C12272j jVar, C12192d dVar, C38389a aVar, C32017c cVar, Activity activity) {
            this.f35769f = this;
            this.f35761d = jVar;
            this.f35765e = dVar;
            this.f35749a = activity;
            this.f35753b = cVar;
            this.f35757c = aVar;
            m44609J7(aVar, cVar, activity);
            m44618K7(aVar, cVar, activity);
        }
    }

    /* renamed from: dk.b$c */
    private static final class C12191c implements C17606b {

        /* renamed from: a */
        private final C12272j f35889a;

        /* renamed from: b */
        public C12309u mo32575a() {
            return new C12192d(this.f35889a);
        }

        private C12191c(C12272j jVar) {
            this.f35889a = jVar;
        }
    }

    /* renamed from: dk.b$d */
    private static final class C12192d extends C12309u {
        /* access modifiers changed from: private */

        /* renamed from: A */
        public C41084a f35890A;
        /* access modifiers changed from: private */

        /* renamed from: B */
        public C41084a f35891B;
        /* access modifiers changed from: private */

        /* renamed from: C */
        public C41084a f35892C;
        /* access modifiers changed from: private */

        /* renamed from: D */
        public C41084a f35893D;
        /* access modifiers changed from: private */

        /* renamed from: E */
        public C41084a f35894E;
        /* access modifiers changed from: private */

        /* renamed from: F */
        public C41084a f35895F;
        /* access modifiers changed from: private */

        /* renamed from: G */
        public C41084a f35896G;
        /* access modifiers changed from: private */

        /* renamed from: H */
        public C41084a f35897H;
        /* access modifiers changed from: private */

        /* renamed from: I */
        public C41084a f35898I;
        /* access modifiers changed from: private */

        /* renamed from: J */
        public C41084a f35899J;
        /* access modifiers changed from: private */

        /* renamed from: K */
        public C41084a f35900K;
        /* access modifiers changed from: private */

        /* renamed from: L */
        public C41084a f35901L;
        /* access modifiers changed from: private */

        /* renamed from: M */
        public C41084a f35902M;
        /* access modifiers changed from: private */

        /* renamed from: N */
        public C41084a f35903N;
        /* access modifiers changed from: private */

        /* renamed from: O */
        public C41084a f35904O;
        /* access modifiers changed from: private */

        /* renamed from: P */
        public C41084a f35905P;
        /* access modifiers changed from: private */

        /* renamed from: Q */
        public C41084a f35906Q;

        /* renamed from: a */
        private final C12272j f35907a;

        /* renamed from: b */
        private final C12192d f35908b;

        /* renamed from: c */
        private C41084a f35909c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C41084a f35910d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C41084a f35911e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C41084a f35912f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C41084a f35913g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C41084a f35914h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C41084a f35915i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C41084a f35916j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C41084a f35917k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C41084a f35918l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public C41084a f35919m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public C41084a f35920n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public C41084a f35921o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public C41084a f35922p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public C41084a f35923q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public C41084a f35924r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public C41084a f35925s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public C41084a f35926t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public C41084a f35927u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public C41084a f35928v;
        /* access modifiers changed from: private */

        /* renamed from: w */
        public C41084a f35929w;
        /* access modifiers changed from: private */

        /* renamed from: x */
        public C41084a f35930x;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public C41084a f35931y;
        /* access modifiers changed from: private */

        /* renamed from: z */
        public C41084a f35932z;

        /* renamed from: dk.b$d$a */
        private static final class C12193a implements C41084a {

            /* renamed from: a */
            private final C12272j f35933a;

            /* renamed from: b */
            private final C12192d f35934b;

            /* renamed from: c */
            private final int f35935c;

            C12193a(C12272j jVar, C12192d dVar, int i) {
                this.f35933a = jVar;
                this.f35934b = dVar;
                this.f35935c = i;
            }

            public Object get() {
                switch (this.f35935c) {
                    case 0:
                        return C12062c.m44263a();
                    case 1:
                        return new C15674l(this.f35934b.m45238b0(), (C16207c) this.f35934b.f35910d.get(), (C16205a) this.f35934b.f35911e.get(), (C16209d) this.f35934b.f35912f.get(), (C16206b) this.f35934b.f35913g.get());
                    case 2:
                        return new C16207c();
                    case 3:
                        return new C16205a();
                    case 4:
                        return new C16209d();
                    case 5:
                        return new C16206b();
                    case 6:
                        return new C39119d0((C36869a) this.f35933a.f36248L.get(), this.f35933a.m46115T7(), (C37290d) this.f35934b.f35918l.get(), (C39237c) this.f35934b.f35920n.get(), (C37291e) this.f35934b.f35921o.get(), (C27494a) this.f35933a.f36414g1.get(), (C37288b) this.f35934b.f35922p.get(), (Gson) this.f35933a.f36288Q.get());
                    case 7:
                        return new C37290d((C37013a) this.f35934b.f35917k.get());
                    case 8:
                        return new C36569i((C36266e) this.f35933a.f36354Y3.get(), (C36262a) this.f35933a.f36361Z3.get(), (C36086a) this.f35934b.f35915i.get(), (C36087b) this.f35934b.f35916j.get());
                    case 9:
                        return new C36086a();
                    case 10:
                        return new C36087b();
                    case 11:
                        return new C39237c((C39235a) this.f35934b.f35919m.get());
                    case 12:
                        return new C39235a((C38703a) this.f35933a.f36385c4.get());
                    case 13:
                        return new C37291e((C37013a) this.f35934b.f35917k.get());
                    case 14:
                        return new C37288b((C37013a) this.f35934b.f35917k.get());
                    case 15:
                        return new C20539d(this.f35934b.m45246f0(), (C25037b) this.f35934b.f35924r.get(), (C25036a) this.f35934b.f35925s.get());
                    case 16:
                        return new C25037b();
                    case 17:
                        return new C25036a();
                    case 18:
                        return new C37495d((C31874d) this.f35933a.f36537v4.get());
                    case 19:
                        return new C28226l((C27532a) this.f35933a.f36359Z1.get(), new C28040g());
                    case 20:
                        return new C27043g(this.f35934b.m45260m0(), new C27850d(), (C27846b) this.f35934b.f35929w.get(), (C27849c) this.f35934b.f35930x.get(), this.f35933a.m46195b8());
                    case 21:
                        return new C27846b(C17958c.m61876a(this.f35933a.f36388d));
                    case 22:
                        return new C27849c();
                    case 23:
                        return new C12346k(this.f35934b.m45248g0(), new C10342c(), new C10341b(), new C10340a());
                    case 24:
                        return new C16255a0();
                    case 25:
                        return new C37717f(this.f35934b.m45250h0(), (C37453b) this.f35933a.f36394d5.get(), new C37456e(), new C37455d(), new C37452a(), new C37454c());
                    case 26:
                        return new C39691m(this.f35934b.m45256k0(), (C39477c) this.f35934b.f35892C.get(), (C39479e) this.f35934b.f35893D.get(), (C39476b) this.f35934b.f35894E.get(), (C39475a) this.f35934b.f35895F.get(), (C39478d) this.f35934b.f35896G.get());
                    case 27:
                        return new C39477c();
                    case 28:
                        return new C39479e();
                    case 29:
                        return new C39476b();
                    case 30:
                        return new C39475a();
                    case 31:
                        return new C39478d();
                    case 32:
                        return new C31946g(this.f35934b.m45258l0(), (C31548e) this.f35934b.f35898I.get(), (C31544a) this.f35934b.f35899J.get(), (C31546c) this.f35934b.f35900K.get(), new C31547d(), (C31545b) this.f35934b.f35901L.get());
                    case 33:
                        return new C31548e();
                    case 34:
                        return new C31544a();
                    case 35:
                        return new C31546c();
                    case 36:
                        return new C31545b();
                    case 37:
                        return new C37101k();
                    case 38:
                        return new C15690o();
                    case 39:
                        return new C37492b((C31876e) this.f35933a.f36570z5.get());
                    case 40:
                        return new C18986g(this.f35934b.m45252i0(), new C18869a(), new C18870b(), (PreferencesApiManager) this.f35933a.f36224I.get());
                    default:
                        throw new AssertionError(this.f35935c);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b0 */
        public C15687m m45238b0() {
            return C16584b.m58846a((C43511w) this.f35907a.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: c0 */
        public C15252c.C15253a m45240c0() {
            return new C15252c.C15253a(new C15252c.C15254b.C15255a());
        }

        /* access modifiers changed from: private */
        /* renamed from: d0 */
        public CardRegistrationProcessor.C15143a m45242d0() {
            return new CardRegistrationProcessor.C15143a((Client) this.f35907a.f36389d0.get(), this.f35907a.m46115T7());
        }

        /* renamed from: e0 */
        private void m45244e0() {
            this.f35909c = C18327b.m62669a(new C12193a(this.f35907a, this.f35908b, 0));
            this.f35910d = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 2));
            this.f35911e = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 3));
            this.f35912f = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 4));
            this.f35913g = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 5));
            this.f35914h = C18327b.m62669a(new C12193a(this.f35907a, this.f35908b, 1));
            this.f35915i = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 9));
            this.f35916j = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 10));
            this.f35917k = C18327b.m62669a(new C12193a(this.f35907a, this.f35908b, 8));
            this.f35918l = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 7));
            this.f35919m = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 12));
            this.f35920n = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 11));
            this.f35921o = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 13));
            this.f35922p = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 14));
            this.f35923q = C18327b.m62669a(new C12193a(this.f35907a, this.f35908b, 6));
            this.f35924r = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 16));
            this.f35925s = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 17));
            this.f35926t = C18327b.m62669a(new C12193a(this.f35907a, this.f35908b, 15));
            this.f35927u = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 18));
            this.f35928v = C18327b.m62669a(new C12193a(this.f35907a, this.f35908b, 19));
            this.f35929w = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 21));
            this.f35930x = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 22));
            this.f35931y = C18327b.m62669a(new C12193a(this.f35907a, this.f35908b, 20));
            this.f35932z = C18327b.m62669a(new C12193a(this.f35907a, this.f35908b, 23));
            this.f35890A = C18327b.m62669a(new C12193a(this.f35907a, this.f35908b, 24));
            this.f35891B = C18327b.m62669a(new C12193a(this.f35907a, this.f35908b, 25));
            this.f35892C = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 27));
            this.f35893D = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 28));
            this.f35894E = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 29));
            this.f35895F = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 30));
            this.f35896G = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 31));
            this.f35897H = C18327b.m62669a(new C12193a(this.f35907a, this.f35908b, 26));
            this.f35898I = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 33));
            this.f35899J = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 34));
            this.f35900K = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 35));
            this.f35901L = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 36));
            this.f35902M = C18327b.m62669a(new C12193a(this.f35907a, this.f35908b, 32));
            this.f35903N = C18327b.m62669a(new C12193a(this.f35907a, this.f35908b, 37));
            this.f35904O = C18327b.m62669a(new C12193a(this.f35907a, this.f35908b, 38));
            this.f35905P = C18331f.m62681a(new C12193a(this.f35907a, this.f35908b, 39));
            this.f35906Q = C18327b.m62669a(new C12193a(this.f35907a, this.f35908b, 40));
        }

        /* access modifiers changed from: private */
        /* renamed from: f0 */
        public C24762a m45246f0() {
            return C25476b.m80646a((C43511w) this.f35907a.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: g0 */
        public C10519a m45248g0() {
            return C12935b.m48861a((C43511w) this.f35907a.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: h0 */
        public C37252a m45250h0() {
            return C38240b.m112446a((C43511w) this.f35907a.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: i0 */
        public C19146a m45252i0() {
            return C10378b.m37701a((C43511w) this.f35907a.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: j0 */
        public C39678a m45254j0() {
            return new C39678a((SharedPreferences) this.f35907a.f36176C.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: k0 */
        public C39916a m45256k0() {
            return C40260b.m116632a((C43511w) this.f35907a.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: l0 */
        public C31683a m45258l0() {
            return C36157b.m107549a((C43511w) this.f35907a.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: m0 */
        public C27599a m45260m0() {
            return C28052b.m86465a((C43511w) this.f35907a.f36320U.get());
        }

        /* renamed from: a */
        public C17605a mo32185a() {
            return new C12143a(this.f35907a, this.f35908b);
        }

        /* renamed from: b */
        public C16918a mo32189b() {
            return (C16918a) this.f35909c.get();
        }

        private C12192d(C12272j jVar) {
            this.f35908b = this;
            this.f35907a = jVar;
            m45244e0();
        }
    }

    /* renamed from: dk.b$e */
    public static final class C12194e {

        /* renamed from: a */
        private AppModule f35936a;

        /* renamed from: b */
        private C31666c f35937b;

        /* renamed from: c */
        private C17956a f35938c;

        /* renamed from: d */
        private BankApiManagerModule f35939d;

        /* renamed from: e */
        private C20286a f35940e;

        /* renamed from: f */
        private C12922a f35941f;

        /* renamed from: g */
        private C19795a f35942g;

        /* renamed from: h */
        private C25133a f35943h;

        /* renamed from: i */
        private C29245a f35944i;

        /* renamed from: j */
        private C12479b f35945j;

        /* renamed from: k */
        private C16480a f35946k;

        /* renamed from: l */
        private C25137a f35947l;

        /* renamed from: m */
        private C36871b f35948m;

        /* renamed from: n */
        private C34672a f35949n;

        /* renamed from: o */
        private EventBusModule f35950o;

        /* renamed from: p */
        private C18977a f35951p;

        /* renamed from: q */
        private C39675a f35952q;

        /* renamed from: r */
        private C25059b f35953r;

        /* renamed from: s */
        private C28795a f35954s;

        /* renamed from: t */
        private C36263b f35955t;

        /* renamed from: u */
        private C32015a f35956u;

        /* renamed from: v */
        private PreferencesApiManagerModule f35957v;

        /* renamed from: w */
        private C38393e f35958w;

        /* renamed from: x */
        private RetrofitApiModule f35959x;

        /* renamed from: y */
        private RetrofitGoogleApiModule f35960y;

        /* renamed from: z */
        private SharedPreferencesModule f35961z;

        /* renamed from: a */
        public C12194e mo32577a(C17956a aVar) {
            this.f35938c = (C17956a) C18329d.m62675b(aVar);
            return this;
        }

        /* renamed from: b */
        public C12312x mo32578b() {
            if (this.f35936a == null) {
                this.f35936a = new AppModule();
            }
            if (this.f35937b == null) {
                this.f35937b = new C31666c();
            }
            C18329d.m62674a(this.f35938c, C17956a.class);
            if (this.f35939d == null) {
                this.f35939d = new BankApiManagerModule();
            }
            if (this.f35940e == null) {
                this.f35940e = new C20286a();
            }
            if (this.f35941f == null) {
                this.f35941f = new C12922a();
            }
            if (this.f35942g == null) {
                this.f35942g = new C19795a();
            }
            if (this.f35943h == null) {
                this.f35943h = new C25133a();
            }
            if (this.f35944i == null) {
                this.f35944i = new C29245a();
            }
            if (this.f35945j == null) {
                this.f35945j = new C12479b();
            }
            if (this.f35946k == null) {
                this.f35946k = new C16480a();
            }
            if (this.f35947l == null) {
                this.f35947l = new C25137a();
            }
            if (this.f35948m == null) {
                this.f35948m = new C36871b();
            }
            if (this.f35949n == null) {
                this.f35949n = new C34672a();
            }
            if (this.f35950o == null) {
                this.f35950o = new EventBusModule();
            }
            if (this.f35951p == null) {
                this.f35951p = new C18977a();
            }
            if (this.f35952q == null) {
                this.f35952q = new C39675a();
            }
            if (this.f35953r == null) {
                this.f35953r = new C25059b();
            }
            if (this.f35954s == null) {
                this.f35954s = new C28795a();
            }
            if (this.f35955t == null) {
                this.f35955t = new C36263b();
            }
            if (this.f35956u == null) {
                this.f35956u = new C32015a();
            }
            if (this.f35957v == null) {
                this.f35957v = new PreferencesApiManagerModule();
            }
            if (this.f35958w == null) {
                this.f35958w = new C38393e();
            }
            if (this.f35959x == null) {
                this.f35959x = new RetrofitApiModule();
            }
            if (this.f35960y == null) {
                this.f35960y = new RetrofitGoogleApiModule();
            }
            if (this.f35961z == null) {
                this.f35961z = new SharedPreferencesModule();
            }
            C12272j jVar = r2;
            C12272j jVar2 = new C12272j(this.f35936a, this.f35937b, this.f35938c, this.f35939d, this.f35940e, this.f35941f, this.f35942g, this.f35943h, this.f35944i, this.f35945j, this.f35946k, this.f35947l, this.f35948m, this.f35949n, this.f35950o, this.f35951p, this.f35952q, this.f35953r, this.f35954s, this.f35955t, this.f35956u, this.f35957v, this.f35958w, this.f35959x, this.f35960y, this.f35961z);
            return jVar;
        }

        private C12194e() {
        }
    }

    /* renamed from: dk.b$f */
    private static final class C12195f implements C17607c {

        /* renamed from: a */
        private final C12272j f35962a;

        /* renamed from: b */
        private final C12192d f35963b;

        /* renamed from: c */
        private final C12144b f35964c;

        /* renamed from: d */
        private Fragment f35965d;

        /* renamed from: c */
        public C12310v mo32579a() {
            C18329d.m62674a(this.f35965d, Fragment.class);
            return new C12196g(this.f35962a, this.f35963b, this.f35964c, this.f35965d);
        }

        /* renamed from: d */
        public C12195f mo32580b(Fragment fragment) {
            this.f35965d = (Fragment) C18329d.m62675b(fragment);
            return this;
        }

        private C12195f(C12272j jVar, C12192d dVar, C12144b bVar) {
            this.f35962a = jVar;
            this.f35963b = dVar;
            this.f35964c = bVar;
        }
    }

    /* renamed from: dk.b$g */
    private static final class C12196g extends C12310v {
        /* access modifiers changed from: private */

        /* renamed from: A */
        public C41084a f35966A;

        /* renamed from: A0 */
        private C41084a f35967A0;
        /* access modifiers changed from: private */

        /* renamed from: B */
        public C41084a f35968B;

        /* renamed from: B0 */
        private C41084a f35969B0;
        /* access modifiers changed from: private */

        /* renamed from: C */
        public C41084a f35970C;

        /* renamed from: C0 */
        private C41084a f35971C0;

        /* renamed from: D */
        private C41084a f35972D;

        /* renamed from: D0 */
        private C41084a f35973D0;
        /* access modifiers changed from: private */

        /* renamed from: E */
        public C41084a f35974E;

        /* renamed from: E0 */
        private C41084a f35975E0;
        /* access modifiers changed from: private */

        /* renamed from: F */
        public C41084a f35976F;

        /* renamed from: F0 */
        private C41084a f35977F0;

        /* renamed from: G */
        private C41084a f35978G;

        /* renamed from: G0 */
        private C41084a f35979G0;
        /* access modifiers changed from: private */

        /* renamed from: H */
        public C41084a f35980H;

        /* renamed from: H0 */
        private C41084a f35981H0;

        /* renamed from: I */
        private C41084a f35982I;

        /* renamed from: I0 */
        private C41084a f35983I0;

        /* renamed from: J */
        private C41084a f35984J;

        /* renamed from: J0 */
        private C41084a f35985J0;
        /* access modifiers changed from: private */

        /* renamed from: K */
        public C41084a f35986K;
        /* access modifiers changed from: private */

        /* renamed from: K0 */
        public C41084a f35987K0;
        /* access modifiers changed from: private */

        /* renamed from: L */
        public C41084a f35988L;

        /* renamed from: L0 */
        private C41084a f35989L0;

        /* renamed from: M */
        private C41084a f35990M;
        /* access modifiers changed from: private */

        /* renamed from: M0 */
        public C41084a f35991M0;
        /* access modifiers changed from: private */

        /* renamed from: N */
        public C41084a f35992N;

        /* renamed from: N0 */
        private C41084a f35993N0;

        /* renamed from: O */
        private C41084a f35994O;
        /* access modifiers changed from: private */

        /* renamed from: O0 */
        public C41084a f35995O0;

        /* renamed from: P */
        private C41084a f35996P;

        /* renamed from: P0 */
        private C41084a f35997P0;

        /* renamed from: Q */
        private C41084a f35998Q;

        /* renamed from: Q0 */
        private C41084a f35999Q0;
        /* access modifiers changed from: private */

        /* renamed from: R */
        public C41084a f36000R;

        /* renamed from: R0 */
        private C41084a f36001R0;

        /* renamed from: S */
        private C41084a f36002S;

        /* renamed from: S0 */
        private C41084a f36003S0;

        /* renamed from: T */
        private C41084a f36004T;

        /* renamed from: T0 */
        private C41084a f36005T0;

        /* renamed from: U */
        private C41084a f36006U;

        /* renamed from: U0 */
        private C41084a f36007U0;
        /* access modifiers changed from: private */

        /* renamed from: V */
        public C41084a f36008V;

        /* renamed from: V0 */
        private C41084a f36009V0;

        /* renamed from: W */
        private C41084a f36010W;

        /* renamed from: W0 */
        private C41084a f36011W0;

        /* renamed from: X */
        private C41084a f36012X;

        /* renamed from: X0 */
        private C41084a f36013X0;

        /* renamed from: Y */
        private C41084a f36014Y;

        /* renamed from: Y0 */
        private C41084a f36015Y0;

        /* renamed from: Z */
        private C41084a f36016Z;

        /* renamed from: Z0 */
        private C41084a f36017Z0;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Fragment f36018a;

        /* renamed from: a0 */
        private C41084a f36019a0;
        /* access modifiers changed from: private */

        /* renamed from: a1 */
        public C41084a f36020a1;

        /* renamed from: b */
        private final C12272j f36021b;

        /* renamed from: b0 */
        private C41084a f36022b0;

        /* renamed from: b1 */
        private C41084a f36023b1;

        /* renamed from: c */
        private final C12192d f36024c;

        /* renamed from: c0 */
        private C41084a f36025c0;

        /* renamed from: c1 */
        private C41084a f36026c1;

        /* renamed from: d */
        private final C12144b f36027d;

        /* renamed from: d0 */
        private C41084a f36028d0;

        /* renamed from: d1 */
        private C41084a f36029d1;

        /* renamed from: e */
        private final C12196g f36030e;

        /* renamed from: e0 */
        private C41084a f36031e0;

        /* renamed from: e1 */
        private C41084a f36032e1;

        /* renamed from: f */
        private C41084a f36033f;

        /* renamed from: f0 */
        private C41084a f36034f0;

        /* renamed from: f1 */
        private C41084a f36035f1;

        /* renamed from: g */
        private C41084a f36036g;

        /* renamed from: g0 */
        private C41084a f36037g0;

        /* renamed from: g1 */
        private C41084a f36038g1;

        /* renamed from: h */
        private C41084a f36039h;

        /* renamed from: h0 */
        private C41084a f36040h0;
        /* access modifiers changed from: private */

        /* renamed from: h1 */
        public C41084a f36041h1;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C41084a f36042i;
        /* access modifiers changed from: private */

        /* renamed from: i0 */
        public C41084a f36043i0;

        /* renamed from: i1 */
        private C41084a f36044i1;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C41084a f36045j;

        /* renamed from: j0 */
        private C41084a f36046j0;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C41084a f36047k;

        /* renamed from: k0 */
        private C41084a f36048k0;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C41084a f36049l;

        /* renamed from: l0 */
        private C41084a f36050l0;

        /* renamed from: m */
        private C41084a f36051m;

        /* renamed from: m0 */
        private C41084a f36052m0;

        /* renamed from: n */
        private C41084a f36053n;
        /* access modifiers changed from: private */

        /* renamed from: n0 */
        public C41084a f36054n0;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public C41084a f36055o;
        /* access modifiers changed from: private */

        /* renamed from: o0 */
        public C41084a f36056o0;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public C41084a f36057p;

        /* renamed from: p0 */
        private C41084a f36058p0;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public C41084a f36059q;

        /* renamed from: q0 */
        private C41084a f36060q0;

        /* renamed from: r */
        private C41084a f36061r;
        /* access modifiers changed from: private */

        /* renamed from: r0 */
        public C41084a f36062r0;

        /* renamed from: s */
        private C41084a f36063s;

        /* renamed from: s0 */
        private C41084a f36064s0;

        /* renamed from: t */
        private C41084a f36065t;

        /* renamed from: t0 */
        private C41084a f36066t0;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public C41084a f36067u;

        /* renamed from: u0 */
        private C41084a f36068u0;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public C41084a f36069v;

        /* renamed from: v0 */
        private C41084a f36070v0;

        /* renamed from: w */
        private C41084a f36071w;

        /* renamed from: w0 */
        private C41084a f36072w0;

        /* renamed from: x */
        private C41084a f36073x;

        /* renamed from: x0 */
        private C41084a f36074x0;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public C41084a f36075y;

        /* renamed from: y0 */
        private C41084a f36076y0;
        /* access modifiers changed from: private */

        /* renamed from: z */
        public C41084a f36077z;
        /* access modifiers changed from: private */

        /* renamed from: z0 */
        public C41084a f36078z0;

        /* renamed from: dk.b$g$a */
        private static final class C12197a implements C41084a {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public final C12272j f36079a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public final C12192d f36080b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public final C12144b f36081c;
            /* access modifiers changed from: private */

            /* renamed from: d */
            public final C12196g f36082d;

            /* renamed from: e */
            private final int f36083e;

            /* renamed from: dk.b$g$a$a */
            class C12198a implements C14716h.C14718b {
                C12198a() {
                }

                /* renamed from: a */
                public C14716h mo32775a(PackageType packageType) {
                    return new C14716h((C20108a) C12197a.this.f36082d.f36075y.get(), (C15376d) C12197a.this.f36082d.f36077z.get(), (C15386k) C12197a.this.f36082d.f36047k.get(), (C14696e) C12197a.this.f36082d.f35966A.get(), C12197a.this.f36082d.m45348K5(), C12197a.this.f36081c.m44942t7(), (C15381f) C12197a.this.f36082d.f36059q.get(), (C15382g) C12197a.this.f36082d.f35968B.get(), C12197a.this.f36082d.m45389Q5(), (C15392o) C12197a.this.f36082d.f35970C.get(), C12197a.this.f36079a.m46115T7(), (Client) C12197a.this.f36079a.f36389d0.get(), packageType);
                }
            }

            /* renamed from: dk.b$g$a$a0 */
            class C12199a0 implements C24577a.C24578a {
                C12199a0() {
                }

                /* renamed from: a */
                public C24577a mo32776a(TravelInsuranceFilledInfo travelInsuranceFilledInfo) {
                    return new C24577a(travelInsuranceFilledInfo);
                }
            }

            /* renamed from: dk.b$g$a$a1 */
            class C12200a1 implements C36113m {
                C12200a1() {
                }

                /* renamed from: a */
                public C36124w mo32777a(C31895a aVar) {
                    return new C36124w((C39495b) C12197a.this.f36081c.f35685E1.get(), (C36149a) C12197a.this.f36081c.f35689G.get(), (C29742a) C12197a.this.f36081c.f35825v.get(), (C32038a) C12197a.this.f36081c.f35688F1.get(), (C38895u0) C12197a.this.f36081c.f35691G1.get(), C12197a.this.f36079a.m46195b8(), (C27494a) C12197a.this.f36079a.f36414g1.get(), aVar);
                }
            }

            /* renamed from: dk.b$g$a$b */
            class C12201b implements C15439k.C15442b {
                C12201b() {
                }

                /* renamed from: a */
                public C15439k mo32778a(long j) {
                    return new C15439k((C15391n) C12197a.this.f36082d.f35974E.get(), (C15732a) C12197a.this.f36082d.f35976F.get(), j);
                }
            }

            /* renamed from: dk.b$g$a$b0 */
            class C12202b0 implements C24596d.C24603f {
                C12202b0() {
                }

                /* renamed from: a */
                public C24596d mo32779a(TravelInsuranceFilledInfo travelInsuranceFilledInfo) {
                    return new C24596d(travelInsuranceFilledInfo, C12197a.this.f36082d.m45637z9(), new C20543a());
                }
            }

            /* renamed from: dk.b$g$a$b1 */
            class C12203b1 implements C36313r.C36314a {
                C12203b1() {
                }

                /* renamed from: a */
                public C36313r mo32780a(CheckChildMBankActiveModel checkChildMBankActiveModel) {
                    return new C36313r(checkChildMBankActiveModel, C12197a.this.f36082d.m45609v9(), C12197a.this.f36082d.m45302C9(), C12197a.this.f36082d.m45479d5(), C12197a.this.f36082d.m45423V4(), C12197a.this.f36081c.m44644N6());
                }
            }

            /* renamed from: dk.b$g$a$c */
            class C12204c implements C14687c.C14689b {
                C12204c() {
                }

                /* renamed from: a */
                public C14687c mo32781a(String str, String str2) {
                    return new C14687c((C15384i) C12197a.this.f36082d.f35980H.get(), (C15382g) C12197a.this.f36082d.f35968B.get(), C12197a.this.f36079a.m46115T7(), str, str2);
                }
            }

            /* renamed from: dk.b$g$a$c0 */
            class C12205c0 implements C24768f {
                C12205c0() {
                }

                /* renamed from: a */
                public C24772j mo32782a(int i) {
                    return new C24772j(C12197a.this.f36082d.m45511h9(), (Client) C12197a.this.f36079a.f36389d0.get(), i);
                }
            }

            /* renamed from: dk.b$g$a$c1 */
            class C12206c1 implements C14475b.C14477b {
                C12206c1() {
                }

                /* renamed from: a */
                public C14475b mo32783a(SoloApplicationFormData soloApplicationFormData, boolean z) {
                    return new C14475b((C15389l) C12197a.this.f36082d.f36045j.get(), (C15375c) C12197a.this.f36082d.f36055o.get(), (C15373a) C12197a.this.f36082d.f36057p.get(), (PreferencesApiManager) C12197a.this.f36079a.f36224I.get(), C12197a.this.f36079a.m46115T7(), (C15381f) C12197a.this.f36082d.f36059q.get(), C12197a.this.f36082d.m45295B9(), (Client) C12197a.this.f36079a.f36389d0.get(), (C27494a) C12197a.this.f36079a.f36414g1.get(), soloApplicationFormData, z);
                }
            }

            /* renamed from: dk.b$g$a$d */
            class C12207d implements C14787c.C14789b {
                C12207d() {
                }

                /* renamed from: a */
                public C14787c mo32784a(boolean z) {
                    return new C14787c((Client) C12197a.this.f36079a.f36389d0.get(), C12197a.this.f36079a.m46115T7(), (C15376d) C12197a.this.f36082d.f36077z.get(), (C15382g) C12197a.this.f36082d.f35968B.get(), (C15386k) C12197a.this.f36082d.f36047k.get(), C12197a.this.f36082d.m45389Q5(), new C17329t(), z);
                }
            }

            /* renamed from: dk.b$g$a$d0 */
            class C12208d0 implements C24646d.C24652d {
                C12208d0() {
                }

                /* renamed from: a */
                public C24646d mo32785a(TravelInsuranceFilledInfo travelInsuranceFilledInfo) {
                    return new C24646d(travelInsuranceFilledInfo, C12197a.this.f36079a.m46195b8(), C12197a.this.f36082d.m45525j9(), C12197a.this.f36082d.m45630y9(), (C25042e) C12197a.this.f36082d.f36054n0.get(), (C27845a) C12197a.this.f36082d.f36056o0.get(), (C27494a) C12197a.this.f36079a.f36414g1.get());
                }
            }

            /* renamed from: dk.b$g$a$d1 */
            class C12209d1 implements C36679l.C36683c {
                C12209d1() {
                }

                /* renamed from: a */
                public C36679l mo32786a(long j) {
                    return new C36679l(j, C12197a.this.f36082d.m45577r5(), C12197a.this.f36081c.m44818g6());
                }
            }

            /* renamed from: dk.b$g$a$e */
            class C12210e implements C26868u.C26870b {
                C12210e() {
                }

                /* renamed from: a */
                public C26868u mo32787a(String str) {
                    return new C26868u((C25354b) C12197a.this.f36082d.f35988L.get(), C12197a.this.f36082d.m45570q5(), C12197a.this.f36082d.m45472c5(), (Client) C12197a.this.f36079a.f36389d0.get(), (PreferencesApiManager) C12197a.this.f36079a.f36224I.get(), str);
                }
            }

            /* renamed from: dk.b$g$a$e0 */
            class C12211e0 implements C30351a {
                C12211e0() {
                }

                /* renamed from: a */
                public C30357g mo32788a(JuniorRequestDataUiModel juniorRequestDataUiModel) {
                    return new C30357g((C28054b) C12197a.this.f36082d.f36062r0.get(), C12197a.this.f36079a.m46195b8(), C12197a.this.f36081c.m44818g6(), juniorRequestDataUiModel, (C27494a) C12197a.this.f36079a.f36414g1.get());
                }
            }

            /* renamed from: dk.b$g$a$e1 */
            class C12212e1 implements C37040h.C37041a {
                C12212e1() {
                }

                /* renamed from: a */
                public C37040h mo32789a(List list) {
                    return new C37040h(list, (C38399b) C12197a.this.f36081c.f35697I1.get());
                }
            }

            /* renamed from: dk.b$g$a$f */
            class C12213f implements C26809g1.C26814c {
                C12213f() {
                }

                /* renamed from: a */
                public C26809g1 mo32790a(Country country) {
                    return new C26809g1(country, (C28324a) C12197a.this.f36082d.f35992N.get());
                }
            }

            /* renamed from: dk.b$g$a$f0 */
            class C12214f0 implements C16603b {
                C12214f0() {
                }

                /* renamed from: a */
                public C14855c mo32791a(C16629w wVar) {
                    return new C14855c(C12197a.this.f36082d.m45375O5(), C12197a.this.f36082d.m45291B5(), C12197a.this.f36082d.m45623x9(), (C16277c0) C12197a.this.f36080b.f35890A.get(), (C16281g) C12197a.this.f36080b.f35890A.get(), wVar);
                }
            }

            /* renamed from: dk.b$g$a$f1 */
            class C12215f1 {
                C12215f1() {
                }
            }

            /* renamed from: dk.b$g$a$g */
            class C12216g implements C26836m1.C26840b {
                C12216g() {
                }

                /* renamed from: a */
                public C26836m1 mo32792a(FormData formData, String str) {
                    return new C26836m1(formData, str, (C28325b) C12197a.this.f36081c.f35750a0.get(), new C27094a());
                }
            }

            /* renamed from: dk.b$g$a$g0 */
            class C12217g0 implements C14439e.C14445c {
                C12217g0() {
                }

                /* renamed from: a */
                public C14439e mo32793a(SoloApplicationFormData soloApplicationFormData) {
                    return new C14439e(C12197a.this.f36081c.m44644N6(), C12197a.this.f36082d.m45563p5(), (C17572a) C12197a.this.f36082d.f36042i.get(), (C15389l) C12197a.this.f36082d.f36045j.get(), (C15386k) C12197a.this.f36082d.f36047k.get(), (C17575a) C12197a.this.f36082d.f36049l.get(), soloApplicationFormData);
                }
            }

            /* renamed from: dk.b$g$a$g1 */
            class C12218g1 implements C37862j.C37863a {
                C12218g1() {
                }

                /* renamed from: a */
                public C37862j mo32794a(BillInfo billInfo) {
                    return new C37862j(billInfo);
                }
            }

            /* renamed from: dk.b$g$a$h */
            class C12219h implements C26861t1.C26867c {
                C12219h() {
                }

                /* renamed from: a */
                public C26861t1 mo32795a(LookupUiModel lookupUiModel) {
                    return new C26861t1(lookupUiModel, (C28327d) C12197a.this.f36081c.f35782i0.get(), new C27094a());
                }
            }

            /* renamed from: dk.b$g$a$h0 */
            class C12220h0 implements C17432d {
                C12220h0() {
                }

                /* renamed from: a */
                public C17444p mo32796a(C16254a aVar) {
                    return new C17444p(C12197a.this.f36082d.m45549n5(), (C16276c) C12197a.this.f36080b.f35890A.get(), aVar);
                }
            }

            /* renamed from: dk.b$g$a$h1 */
            class C12221h1 implements C38923d0.C38931h {
                C12221h1() {
                }

                /* renamed from: a */
                public C38923d0 mo32797a(long j, long j2) {
                    return new C38923d0(C12197a.this.f36082d.m45288A9(), (C25352k) C12197a.this.f36079a.f36464m3.get(), (C38884p0) C12197a.this.f36079a.f36260M3.get(), C12197a.this.f36081c.m44923r6(), C12197a.this.f36082d.m45539l9(), C12197a.this.f36082d.m45546m9(), C12197a.this.f36082d.m45438X5(), C12197a.this.f36082d.m45430W4(), C12197a.this.f36082d.m45437X4(), C12197a.this.f36082d.m45591t5(), C12197a.this.f36079a.m46135V7(), j, j2);
                }
            }

            /* renamed from: dk.b$g$a$i */
            class C12222i implements C26771a2.C26773b {
                C12222i() {
                }

                /* renamed from: a */
                public C26771a2 mo32798a(OrganizationUiModel organizationUiModel) {
                    return new C26771a2(organizationUiModel, (C28329f) C12197a.this.f36082d.f36000R.get(), new C20455b(), (PreferencesApiManager) C12197a.this.f36079a.f36224I.get());
                }
            }

            /* renamed from: dk.b$g$a$i0 */
            class C12223i0 implements C17557c {
                C12223i0() {
                }

                /* renamed from: a */
                public C17565k mo32799a(C16254a aVar) {
                    return new C17565k(C12197a.this.f36082d.m45584s5(), (C16278d) C12197a.this.f36080b.f35890A.get(), aVar);
                }
            }

            /* renamed from: dk.b$g$a$i1 */
            class C12224i1 implements C39985k.C39987b {
                C12224i1() {
                }

                /* renamed from: a */
                public C39985k mo32800a(LiabilityOverdueInfoUiModel liabilityOverdueInfoUiModel) {
                    return new C39985k((PreferencesApiManager) C12197a.this.f36079a.f36224I.get(), liabilityOverdueInfoUiModel);
                }
            }

            /* renamed from: dk.b$g$a$j */
            class C12225j implements C29018m {
                C12225j() {
                }

                /* renamed from: a */
                public C29025t mo32801a(CombinedOfferModel combinedOfferModel, DepositTypeDetailsUiModel depositTypeDetailsUiModel) {
                    return new C29025t(C12197a.this.f36079a.m46035L7(), C12197a.this.f36082d.m45630y9(), combinedOfferModel, depositTypeDetailsUiModel);
                }
            }

            /* renamed from: dk.b$g$a$j0 */
            class C12226j0 implements C31022e {
                C12226j0() {
                }

                /* renamed from: a */
                public C31028k mo32802a(ActivationDetailsData activationDetailsData) {
                    return new C31028k(activationDetailsData, new C31019d(), C12197a.this.f36082d.m45507h5(), C12197a.this.f36082d.m45532k9(), C12197a.this.f36081c.m44711Ua(), (C38345b) C12197a.this.f36079a.f36431i2.get(), (C25352k) C12197a.this.f36079a.f36464m3.get(), (PreferencesApiManager) C12197a.this.f36079a.f36224I.get(), C12197a.this.f36079a.m46115T7(), (C28474a) C12197a.this.f36079a.f36252L3.get(), (C27494a) C12197a.this.f36079a.f36414g1.get());
                }
            }

            /* renamed from: dk.b$g$a$j1 */
            class C12227j1 implements C37885h.C37886a {
                C12227j1() {
                }

                /* renamed from: a */
                public C37885h mo32803a(CardChooserData cardChooserData) {
                    return new C37885h(cardChooserData, (C37882e) C12197a.this.f36082d.f36020a1.get());
                }
            }

            /* renamed from: dk.b$g$a$k */
            class C12228k implements C12582l {
                C12228k() {
                }

                /* renamed from: a */
                public C12597o mo32804a(List list, C18781a aVar, Set set) {
                    return new C12597o(list, set, aVar);
                }
            }

            /* renamed from: dk.b$g$a$k0 */
            class C12229k0 implements C31386o {
                C12229k0() {
                }

                /* renamed from: a */
                public C32445c mo32805a(String str, String str2, C37124a aVar) {
                    return new C32445c(str, str2, aVar, new C31383m(), new C38331b(), C12197a.this.f36082d.m45465b5(), C12197a.this.f36082d.m45305D5(), C12197a.this.f36082d.m45452Z5());
                }
            }

            /* renamed from: dk.b$g$a$k1 */
            class C12230k1 implements C36717c {
                C12230k1() {
                }

                /* renamed from: a */
                public C36721f mo32806a(long j, List list) {
                    return new C36721f(C12197a.this.f36082d.m45444Y4(), (C27494a) C12197a.this.f36079a.f36414g1.get(), j, list);
                }
            }

            /* renamed from: dk.b$g$a$l */
            class C12231l implements C29259j {
                C12231l() {
                }

                /* renamed from: a */
                public C29263n mo32807a(C29255g gVar) {
                    return new C29263n(C12197a.this.f36079a.m46045M7(), gVar, C12197a.this.f36082d.m45630y9());
                }
            }

            /* renamed from: dk.b$g$a$l0 */
            class C12232l0 implements C31742c {
                C12232l0() {
                }

                /* renamed from: a */
                public C31747h mo32808a(LoanAccountSelectorData loanAccountSelectorData) {
                    return new C31747h(loanAccountSelectorData, (C39056c) C12197a.this.f36082d.f36078z0.get(), C12197a.this.f36082d.m45630y9(), new C38329a());
                }
            }

            /* renamed from: dk.b$g$a$l1 */
            class C12233l1 implements C38444h.C38447c {
                C12233l1() {
                }

                /* renamed from: a */
                public C38444h mo32809a(long j, boolean z) {
                    return new C38444h(C12197a.this.f36082d.m45368N5(), j, z);
                }
            }

            /* renamed from: dk.b$g$a$m */
            class C12234m implements C25878a {
                C12234m() {
                }

                /* renamed from: a */
                public C25884g mo32810a(AccumulateOnPaymentModel accumulateOnPaymentModel) {
                    return new C25884g(accumulateOnPaymentModel, (C39889y) C12197a.this.f36081c.f35744Y0.get(), (C39860h) C12197a.this.f36081c.f35741X0.get(), C12197a.this.f36079a.cardsAndDetailsUseCase(), (C25339b) C12197a.this.f36079a.f36321U0.get(), (C37154c) C12197a.this.f36081c.f35799m1.get(), (C25376a) C12197a.this.f36082d.f36008V.get());
                }
            }

            /* renamed from: dk.b$g$a$m0 */
            class C12235m0 implements C31995i {
                C12235m0() {
                }

                /* renamed from: a */
                public C31998l mo32811a(List list) {
                    return new C31998l(list);
                }
            }

            /* renamed from: dk.b$g$a$m1 */
            class C12236m1 implements C39532c0.C39536c {
                C12236m1() {
                }

                /* renamed from: a */
                public C39532c0 mo32812a(long j, long j2, long j3, boolean z, boolean z2, boolean z3, String str) {
                    return new C39532c0(C12197a.this.f36082d.m45500g5(), C12197a.this.f36082d.m45382P5(), C12197a.this.f36082d.m45368N5(), j, j2, j3, z, z2, z3, str);
                }
            }

            /* renamed from: dk.b$g$a$n */
            class C12237n implements C25895m.C25897b {
                C12237n() {
                }

                /* renamed from: a */
                public C25895m mo32813a(AccumulateOnSpecificDateModel accumulateOnSpecificDateModel) {
                    return new C25895m(accumulateOnSpecificDateModel, C12197a.this.f36082d.m45630y9());
                }
            }

            /* renamed from: dk.b$g$a$n0 */
            class C12238n0 implements C36045j {
                C12238n0() {
                }

                /* renamed from: a */
                public C36048m mo32814a(RecommenderData recommenderData) {
                    return new C36048m(recommenderData);
                }
            }

            /* renamed from: dk.b$g$a$n1 */
            class C12239n1 implements C14548g.C14556d {
                C12239n1() {
                }

                /* renamed from: a */
                public C14548g mo32815a(SoloApplicationFormData soloApplicationFormData) {
                    return new C14548g((C15389l) C12197a.this.f36082d.f36045j.get(), (C15386k) C12197a.this.f36082d.f36047k.get(), (C17575a) C12197a.this.f36082d.f36049l.get(), C12197a.this.f36081c.m44942t7(), soloApplicationFormData);
                }
            }

            /* renamed from: dk.b$g$a$o */
            class C12240o implements C25929n {
                C12240o() {
                }

                /* renamed from: a */
                public C25940x mo32816a(DepositProlongationMainFragmentArgs depositProlongationMainFragmentArgs) {
                    return new C25940x(depositProlongationMainFragmentArgs, C12197a.this.f36082d.m45605v5(), C12197a.this.f36082d.m45612w5(), C12197a.this.f36082d.m45451Z4(), C12197a.this.f36082d.m45616w9(), C12197a.this.f36082d.m45598u5(), new C25167e());
                }
            }

            /* renamed from: dk.b$g$a$o0 */
            class C12241o0 implements C32618h.C32620b {
                C12241o0() {
                }

                /* renamed from: a */
                public C32618h mo32817a(LoansFlow.Details details) {
                    return new C32618h(details, (C25346f) C12197a.this.f36079a.f36486p1.get(), (C25683g) C12197a.this.f36079a.f36416g3.get(), (C10463g) C12197a.this.f36079a.f36497q4.get(), new C32605f());
                }
            }

            /* renamed from: dk.b$g$a$o1 */
            class C12242o1 implements C37918g {
                C12242o1() {
                }

                /* renamed from: a */
                public C37922k mo32818a(StoryGroupUiModel storyGroupUiModel, boolean z, boolean z2) {
                    return new C37922k(C12197a.this.f36079a.m46006I8(), storyGroupUiModel, z, z2);
                }
            }

            /* renamed from: dk.b$g$a$p */
            class C12243p implements C30026d {
                C12243p() {
                }

                /* renamed from: a */
                public C30028f mo32819a(List list) {
                    return new C30028f(list);
                }
            }

            /* renamed from: dk.b$g$a$p0 */
            class C12244p0 implements C32658g.C32666h {
                C12244p0() {
                }

                /* renamed from: a */
                public C32658g mo32820a(HistoryScheduleDataModel historyScheduleDataModel) {
                    return new C32658g(historyScheduleDataModel, C12197a.this.f36082d.m45336I5(), C12197a.this.f36082d.m45312E5(), C12197a.this.f36082d.m45318F5(), new C32673h(), new C32643b(), new C32645c());
                }
            }

            /* renamed from: dk.b$g$a$p1 */
            class C12245p1 implements C35105c.C35112g {
                C12245p1() {
                }

                /* renamed from: a */
                public C35105c mo32821a(boolean z, String str) {
                    return new C35105c(C12197a.this.f36082d.m45354L5(), (C37096f) C12197a.this.f36080b.f35903N.get(), z, str);
                }
            }

            /* renamed from: dk.b$g$a$q */
            class C12246q implements C24142c.C24146c {
                C12246q() {
                }

                /* renamed from: a */
                public C24142c mo32822a(GiftCardsFlow.Animations animations) {
                    return new C24142c(animations, C12197a.this.f36082d.m45458a5(), new C24727b(), new C25459a(), C12197a.this.f36082d.m45486e5(), new C24726a(), C12197a.this.f36081c.m44644N6(), C12197a.this.f36082d.m45626y5(), C12197a.this.f36082d.m45309D9(), C12197a.this.f36082d.m45633z5(), C12197a.this.f36082d.m45581r9(), C12197a.this.f36082d.m45619x5(), C12197a.this.f36082d.m45595t9(), C12197a.this.f36082d.m45602u9(), C12197a.this.f36082d.m45588s9());
                }
            }

            /* renamed from: dk.b$g$a$q0 */
            class C12247q0 implements C31789h.C31792c {
                C12247q0() {
                }

                /* renamed from: a */
                public C31789h mo32823a(InstallmentReversalCancelData installmentReversalCancelData) {
                    return new C31789h(C12197a.this.f36081c.m44942t7(), C12197a.this.f36082d.m45574q9(), (C25683g) C12197a.this.f36079a.f36416g3.get(), (C25680d) C12197a.this.f36079a.f36448k3.get(), installmentReversalCancelData);
                }
            }

            /* renamed from: dk.b$g$a$q1 */
            class C12248q1 implements C35135d.C35137b {
                C12248q1() {
                }

                /* renamed from: a */
                public C35135d mo32824a(String str) {
                    return new C35135d(C12197a.this.f36082d.m45521j5(), C12197a.this.f36082d.m45342J5(), (C39613a) C12197a.this.f36082d.f36041h1.get(), str, (C37091a) C12197a.this.f36080b.f35903N.get());
                }
            }

            /* renamed from: dk.b$g$a$r */
            class C12249r implements C24193c.C24200c {
                C12249r() {
                }

                /* renamed from: a */
                public C24193c mo32825a(GiftCardsFlow.GiftCardDetails giftCardDetails) {
                    return new C24193c(C12197a.this.f36082d.m45396R5(), giftCardDetails, C12197a.this.f36081c.m44626L6(), C12197a.this.f36082d.m45556o5(), new C25034b(), (Client) C12197a.this.f36079a.f36389d0.get());
                }
            }

            /* renamed from: dk.b$g$a$r0 */
            class C12250r0 implements C16836i.C16837a {
                C12250r0() {
                }

                /* renamed from: a */
                public C16836i mo32826a(String str) {
                    return new C16836i(str, C12197a.this.f36082d.m45563p5(), (C17572a) C12197a.this.f36082d.f36042i.get());
                }
            }

            /* renamed from: dk.b$g$a$r1 */
            class C12251r1 implements C18484l.C18487c {
                C12251r1() {
                }

                /* renamed from: a */
                public C18484l mo32827a(FinancialInfoLookupUiModel financialInfoLookupUiModel) {
                    return new C18484l(financialInfoLookupUiModel, C12197a.this.f36081c.m44942t7());
                }
            }

            /* renamed from: dk.b$g$a$s */
            class C12252s implements C24227c.C24231c {
                C12252s() {
                }

                /* renamed from: a */
                public C24227c mo32828a(GiftCardsFlow.Filter filter) {
                    return new C24227c(filter, C12197a.this.f36082d.m45284A5(), C12197a.this.f36082d.m45410T5());
                }
            }

            /* renamed from: dk.b$g$a$s0 */
            class C12253s0 implements C32703b.C32705b {
                C12253s0() {
                }

                /* renamed from: a */
                public C32703b mo32829a(LoansFlow.PawnLoanPayment pawnLoanPayment) {
                    return new C32703b(pawnLoanPayment, C12197a.this.f36082d.m45504g9(), C12197a.this.f36079a.refreshAssetLiabilityUseCase(), C12197a.this.f36079a.refreshProductTypeListUseCase(), (C25683g) C12197a.this.f36079a.f36416g3.get(), new C36194g(), (C10463g) C12197a.this.f36079a.f36497q4.get());
                }
            }

            /* renamed from: dk.b$g$a$s1 */
            class C12254s1 implements C19138n.C19144d {
                C12254s1() {
                }

                /* renamed from: a */
                public C19138n mo32830a(SelectedLoungeData selectedLoungeData) {
                    return new C19138n(selectedLoungeData, (C15390m) C12197a.this.f36082d.f36067u.get(), (C18979a) C12197a.this.f36082d.f36069v.get());
                }
            }

            /* renamed from: dk.b$g$a$t */
            class C12255t implements C24263f.C24266c {
                C12255t() {
                }

                /* renamed from: a */
                public C24263f mo32831a(GiftCardsFlow.FilteredOffers filteredOffers) {
                    return new C24263f(filteredOffers, C12197a.this.f36082d.m45284A5(), C12197a.this.f36082d.m45417U5(), new C25217c());
                }
            }

            /* renamed from: dk.b$g$a$t0 */
            class C12256t0 implements C36515j.C36517b {
                C12256t0() {
                }

                /* renamed from: a */
                public C36515j mo32832a(RenameLoanData renameLoanData) {
                    return new C36515j(C12197a.this.f36079a.m46195b8(), C12197a.this.f36082d.m45553n9(), renameLoanData);
                }
            }

            /* renamed from: dk.b$g$a$t1 */
            class C12257t1 implements C10371l.C10375c {
                C12257t1() {
                }

                /* renamed from: a */
                public C10371l mo27000a(String str) {
                    return new C10371l(C12197a.this.f36081c.m44942t7(), new C12019a(), str);
                }
            }

            /* renamed from: dk.b$g$a$u */
            class C12258u implements C24315c.C24316a {
                C12258u() {
                }

                /* renamed from: a */
                public C24315c mo32833a(GiftCardsFlow.GiftCardOffersAndApplicationsDetails giftCardOffersAndApplicationsDetails) {
                    return new C24315c(giftCardOffersAndApplicationsDetails, C12197a.this.f36082d.m45497f9(), new C25034b(), C12197a.this.f36082d.m45567p9());
                }
            }

            /* renamed from: dk.b$g$a$u0 */
            class C12259u0 implements C32745c.C32750d {
                C12259u0() {
                }

                /* renamed from: a */
                public C32745c mo32834a(LoansFlow.Repayment repayment) {
                    return new C32745c(repayment, C12197a.this.f36082d.m45324G5(), C12197a.this.f36082d.m45330H5(), C12197a.this.f36079a.refreshAssetLiabilityUseCase(), C12197a.this.f36079a.refreshProductTypeListUseCase(), C12197a.this.f36082d.m45630y9(), new C37458b(), C12197a.this.f36082d.m45560o9(), (C10463g) C12197a.this.f36079a.f36497q4.get());
                }
            }

            /* renamed from: dk.b$g$a$v */
            class C12260v implements C12612q1 {
                C12260v() {
                }

                /* renamed from: a */
                public C12676w1 mo32835a(ExpiringCardPopUpData expiringCardPopUpData) {
                    return new C12676w1(C12197a.this.f36081c.m44538B7(), (C10092j) C12197a.this.f36079a.f36520t3.get(), (PreferencesApiManager) C12197a.this.f36079a.f36224I.get(), expiringCardPopUpData);
                }
            }

            /* renamed from: dk.b$g$a$v0 */
            class C12261v0 implements C37978a {
                C12261v0() {
                }

                /* renamed from: a */
                public C37981d mo32836a(List list) {
                    return new C37981d(list);
                }
            }

            /* renamed from: dk.b$g$a$w */
            class C12262w implements C24759j.C24760a {
                C12262w() {
                }

                /* renamed from: a */
                public C24759j mo32837a(List list, boolean z) {
                    return new C24759j(list, z, C12197a.this.f36082d.m45403S5(), C12197a.this.f36081c.m44600I7());
                }
            }

            /* renamed from: dk.b$g$a$w0 */
            class C12263w0 implements C31865h.C31868c {
                C12263w0() {
                }

                /* renamed from: a */
                public C31865h mo32838a(int i) {
                    return new C31865h(C12197a.this.f36082d.m45298C5(), (C36085a) C12197a.this.f36082d.f35987K0.get(), i);
                }
            }

            /* renamed from: dk.b$g$a$x */
            class C12264x implements C24399e.C24400a {
                C12264x() {
                }

                /* renamed from: a */
                public C24399e mo32839a(GiftCardsFlow.GiftCardIntroduction giftCardIntroduction) {
                    return new C24399e(giftCardIntroduction, C12197a.this.f36082d.m45518i9(), C12197a.this.f36082d.m45445Y5());
                }
            }

            /* renamed from: dk.b$g$a$x0 */
            class C12265x0 implements C34994b.C35003i {
                C12265x0() {
                }

                /* renamed from: a */
                public C34994b mo32840a(boolean z) {
                    return new C34994b(C12197a.this.f36082d.m45535l5(), C12197a.this.f36082d.m45514i5(), (C37233a) C12197a.this.f36082d.f35991M0.get(), (C37092b) C12197a.this.f36080b.f35903N.get(), z);
                }
            }

            /* renamed from: dk.b$g$a$y */
            class C12266y implements C26525e {
                C12266y() {
                }

                /* renamed from: a */
                public C26532l mo32841a(Long l) {
                    return new C26532l(C12197a.this.f36081c.m44905p6(), C12197a.this.f36079a.cardsAndDetailsUseCase(), C12197a.this.f36079a.m46195b8(), C12197a.this.f36081c.m44809f7(), C12197a.this.f36081c.m44546C6(), (C19393b) C12197a.this.f36081c.f35706L1.get(), C12197a.this.f36082d.m45431W5(), new C26050a(), (C27494a) C12197a.this.f36079a.f36414g1.get(), C12197a.this.f36081c.m44783cb(), l);
                }
            }

            /* renamed from: dk.b$g$a$y0 */
            class C12267y0 implements C33568e.C33575e {
                C12267y0() {
                }

                /* renamed from: a */
                public C33568e mo32842a(String str) {
                    return new C33568e(C12197a.this.f36082d.m45542m5(), (C36560a) C12197a.this.f36082d.f35995O0.get(), C12197a.this.f36082d.m45528k5(), (C10463g) C12197a.this.f36079a.f36497q4.get(), str);
                }
            }

            /* renamed from: dk.b$g$a$z */
            class C12268z implements C24529d.C24530a {
                C12268z() {
                }

                /* renamed from: a */
                public C24529d mo32843a(PolicyDetailsUiModel policyDetailsUiModel) {
                    return new C24529d(policyDetailsUiModel, C12197a.this.f36082d.m45511h9(), (C29818b) C12197a.this.f36082d.f36043i0.get());
                }
            }

            /* renamed from: dk.b$g$a$z0 */
            class C12269z0 implements C33593c.C33596c {
                C12269z0() {
                }

                /* renamed from: a */
                public C33593c mo32844a(P2PTopUpViewModel$TopUpState p2PTopUpViewModel$TopUpState) {
                    return new C33593c(C12197a.this.f36082d.m45493f5(), p2PTopUpViewModel$TopUpState);
                }
            }

            C12197a(C12272j jVar, C12192d dVar, C12144b bVar, C12196g gVar, int i) {
                this.f36079a = jVar;
                this.f36080b = dVar;
                this.f36081c = bVar;
                this.f36082d = gVar;
                this.f36083e = i;
            }

            /* renamed from: e */
            private Object m45836e() {
                switch (this.f36083e) {
                    case 0:
                        return new C19990c(this.f36082d.f36018a);
                    case 1:
                        return new C12228k();
                    case 2:
                        return new C12260v();
                    case 3:
                        return new C12217g0();
                    case 4:
                        return new C17572a();
                    case 5:
                        return new C15389l((C16301a) this.f36079a.f36269N4.get());
                    case 6:
                        return new C15386k((C16301a) this.f36079a.f36269N4.get());
                    case 7:
                        return new C17575a();
                    case 8:
                        return new C12250r0();
                    case 9:
                        return new C12206c1();
                    case 10:
                        return new C15375c((C16301a) this.f36079a.f36269N4.get());
                    case 11:
                        return new C15373a((C16301a) this.f36079a.f36269N4.get());
                    case 12:
                        return new C15381f((C16301a) this.f36079a.f36269N4.get());
                    case 13:
                        return new C12239n1();
                    case 14:
                        return new C12251r1();
                    case 15:
                        return new C12254s1();
                    case 16:
                        return new C15390m((C16301a) this.f36079a.f36269N4.get());
                    case 17:
                        return new C18979a();
                    case 18:
                        return new C12257t1();
                    case 19:
                        return new C12198a();
                    case 20:
                        return new C20108a((C20304a) this.f36079a.f36277O4.get());
                    case 21:
                        return new C15376d((C16301a) this.f36079a.f36269N4.get());
                    case 22:
                        return new C14696e(C17958c.m61876a(this.f36079a.f36388d), (PreferencesApiManager) this.f36079a.f36224I.get(), this.f36079a.m46115T7(), (Client) this.f36079a.f36389d0.get());
                    case 23:
                        return new C15382g((C16301a) this.f36079a.f36269N4.get());
                    case 24:
                        return new C15392o((C16301a) this.f36079a.f36269N4.get());
                    case 25:
                        return new C12201b();
                    case 26:
                        return new C15391n((C16301a) this.f36079a.f36269N4.get());
                    case 27:
                        return new C15732a();
                    case 28:
                        return new C12204c();
                    case 29:
                        return new C15384i((C16301a) this.f36079a.f36269N4.get());
                    case 30:
                        return new C12207d();
                    case 31:
                        return new C12210e();
                    case 32:
                        return new C25354b((C25847a) this.f36082d.f35986K.get());
                    case 33:
                        return new C29239b((C29000a) this.f36079a.f36202F1.get());
                    case 34:
                        return new C12213f();
                    case 35:
                        return new C28324a((C29002a) this.f36079a.f36218H1.get());
                    case 36:
                        return new C12216g();
                    case 37:
                        return new C12219h();
                    case 38:
                        return new C12222i();
                    case 39:
                        return new C28329f((C29002a) this.f36079a.f36218H1.get());
                    case 40:
                        return new C12225j();
                    case 41:
                        return new C12231l();
                    case 42:
                        return new C12234m();
                    case 43:
                        return new C25376a();
                    case 44:
                        return new C12237n();
                    case 45:
                        return new C12240o();
                    case 46:
                        return new C12243p();
                    case 47:
                        return new C12246q();
                    case 48:
                        return new C12249r();
                    case 49:
                        return new C12252s();
                    case 50:
                        return new C12255t();
                    case 51:
                        return new C12258u();
                    case 52:
                        return new C12262w();
                    case 53:
                        return new C12264x();
                    case 54:
                        return new C12266y();
                    case 55:
                        return new C12268z();
                    case 56:
                        return new C29818b();
                    case 57:
                        return new C12199a0();
                    case 58:
                        return new C12202b0();
                    case 59:
                        return new C12205c0();
                    case 60:
                        return new C12208d0();
                    case 61:
                        return new C25042e((Client) this.f36079a.f36389d0.get(), C17958c.m61876a(this.f36079a.f36388d));
                    case 62:
                        return new C27845a(new C39513a());
                    case 63:
                        return new C12211e0();
                    case 64:
                        return new C28467b((C27851a) this.f36079a.f36519t2.get(), (C25679c) this.f36079a.f36456l3.get(), this.f36081c.m44823gb());
                    case 65:
                        return new C12214f0();
                    case 66:
                        return new C20109b((C20304a) this.f36079a.f36277O4.get());
                    case 67:
                        return new C12220h0();
                    case 68:
                        return new C12223i0();
                    case 69:
                        return new C12226j0();
                    case 70:
                        return new C12229k0();
                    case 71:
                        return new C12232l0();
                    case 72:
                        return new C39056c((C39834a) this.f36079a.f36386c5.get());
                    case 73:
                        return new C12235m0();
                    case 74:
                        return new C12238n0();
                    case 75:
                        return new C12241o0();
                    case 76:
                        return new C12244p0();
                    case 77:
                        return new C12247q0();
                    case 78:
                        return new C12253s0();
                    case 79:
                        return new C12256t0();
                    case 80:
                        return new C12259u0();
                    case 81:
                        return new C12261v0();
                    case 82:
                        return new C12263w0();
                    case 83:
                        return new C36085a();
                    case 84:
                        return new C12265x0();
                    case 85:
                        return new C37233a();
                    case 86:
                        return new C12267y0();
                    case 87:
                        return new C36560a();
                    case 88:
                        return new C12269z0();
                    case 89:
                        return new C12200a1();
                    case 90:
                        return new C12203b1();
                    case 91:
                        return new C12209d1();
                    case 92:
                        return new C12212e1();
                    case 93:
                        return new C12215f1();
                    case 94:
                        return new C37186a();
                    case 95:
                        return new C12218g1();
                    case 96:
                        return new C12221h1();
                    case 97:
                        return new C12224i1();
                    case 98:
                        return new C12227j1();
                    case 99:
                        return new C37882e();
                    default:
                        throw new AssertionError(this.f36083e);
                }
            }

            /* renamed from: f */
            private Object m45837f() {
                switch (this.f36083e) {
                    case 100:
                        return new C12230k1();
                    case 101:
                        return new C12233l1();
                    case 102:
                        return new C12236m1();
                    case 103:
                        return new C12242o1();
                    case 104:
                        return new C12245p1();
                    case 105:
                        return new C12248q1();
                    case 106:
                        return new C39613a();
                    default:
                        throw new AssertionError(this.f36083e);
                }
            }

            public Object get() {
                int i = this.f36083e / 100;
                if (i == 0) {
                    return m45836e();
                }
                if (i == 1) {
                    return m45837f();
                }
                throw new AssertionError(this.f36083e);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: A5 */
        public C29403j m45284A5() {
            return new C29403j((C29077c) this.f36021b.f36375b2.get());
        }

        /* renamed from: A6 */
        private C33635a m45285A6(C33635a aVar) {
            C35657p1.m105891d(aVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(aVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(aVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(aVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(aVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(aVar, this.f36027d.m44941t6());
            C35657p1.m105890c(aVar, this.f36021b.m46115T7());
            return aVar;
        }

        /* renamed from: A7 */
        private IncomeSourceSelectorFragment m45286A7(IncomeSourceSelectorFragment incomeSourceSelectorFragment) {
            C16628v.m58947a(incomeSourceSelectorFragment, (C16603b) this.f36068u0.get());
            return incomeSourceSelectorFragment;
        }

        /* renamed from: A8 */
        private C35612i1 m45287A8(C35612i1 i1Var) {
            C35657p1.m105891d(i1Var, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(i1Var, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(i1Var, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(i1Var, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(i1Var, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(i1Var, this.f36027d.m44941t6());
            C35657p1.m105890c(i1Var, this.f36021b.m46115T7());
            C35637k1.m105848c(i1Var, this.f36027d.f35796l2);
            C35637k1.m105847b(i1Var, this.f36027d.f35800m2);
            C35637k1.m105846a(i1Var, this.f36021b.m46115T7());
            return i1Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: A9 */
        public C26636q m45288A9() {
            return new C26636q((C25677a) this.f36021b.f36251L2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: B5 */
        public C15366d m45291B5() {
            return new C15366d((C15707a) this.f36024c.f35932z.get());
        }

        /* renamed from: B6 */
        private C36657c m45292B6(C36657c cVar) {
            C19790c.m65552a(cVar, (C37071a) this.f36033f.get());
            C36672e.m108778a(cVar, (C36679l.C36683c) this.f36005T0.get());
            return cVar;
        }

        /* renamed from: B7 */
        private C19631o0 m45293B7(C19631o0 o0Var) {
            C19790c.m65552a(o0Var, (C37071a) this.f36033f.get());
            return o0Var;
        }

        /* renamed from: B8 */
        private C15108l m45294B8(C15108l lVar) {
            C35657p1.m105891d(lVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(lVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(lVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(lVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(lVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(lVar, this.f36027d.m44941t6());
            C35657p1.m105890c(lVar, this.f36021b.m46115T7());
            return lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: B9 */
        public C36746r m45295B9() {
            return new C36746r((C36356a) this.f36021b.f36517t0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: C5 */
        public C31093h m45298C5() {
            return new C31093h((C31452b) this.f36024c.f35897H.get());
        }

        /* renamed from: C6 */
        private C37025c m45299C6(C37025c cVar) {
            C37037e.m109552a(cVar, (C37040h.C37041a) this.f36007U0.get());
            return cVar;
        }

        /* renamed from: C7 */
        private C18465f m45300C7(C18465f fVar) {
            C18480h.m62937a(fVar, (C18484l.C18487c) this.f36065t.get());
            return fVar;
        }

        /* renamed from: C8 */
        private C24731c m45301C8(C24731c cVar) {
            C19790c.m65552a(cVar, (C37071a) this.f36033f.get());
            C24748e.m79322a(cVar, (C24759j.C24760a) this.f36034f0.get());
            return cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: C9 */
        public C38897v0 m45302C9() {
            return new C38897v0((C38606b) this.f36021b.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: D5 */
        public C39057d m45305D5() {
            return new C39057d((C39834a) this.f36021b.f36386c5.get());
        }

        /* renamed from: D6 */
        private C31846a m45306D6(C31846a aVar) {
            C31860c.m94187a(aVar, (C31865h.C31868c) this.f35989L0.get());
            return aVar;
        }

        /* renamed from: D7 */
        private C19300h m45307D7(C19300h hVar) {
            C19790c.m65552a(hVar, (C37071a) this.f36033f.get());
            return hVar;
        }

        /* renamed from: D8 */
        private C36029g m45308D8(C36029g gVar) {
            C19790c.m65552a(gVar, (C37071a) this.f36033f.get());
            C36044i.m107249a(gVar, (C36045j) this.f35971C0.get());
            return gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: D9 */
        public C29419z m45309D9() {
            return new C29419z((C29077c) this.f36021b.f36375b2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: E5 */
        public C38515a m45312E5() {
            return new C38515a((C38333a) this.f36024c.f35891B.get());
        }

        /* renamed from: E6 */
        private ChooseCardDialogFragment m45313E6(ChooseCardDialogFragment chooseCardDialogFragment) {
            C34993a.m102872a(chooseCardDialogFragment, (C34994b.C35003i) this.f35993N0.get());
            return chooseCardDialogFragment;
        }

        /* renamed from: E7 */
        private C21092b m45314E7(C21092b bVar) {
            C19790c.m65552a(bVar, (C37071a) this.f36033f.get());
            return bVar;
        }

        /* renamed from: E8 */
        private C38977m0 m45315E8(C38977m0 m0Var) {
            C35657p1.m105891d(m0Var, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(m0Var, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(m0Var, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(m0Var, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(m0Var, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(m0Var, this.f36027d.m44941t6());
            C35657p1.m105890c(m0Var, this.f36021b.m46115T7());
            return m0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: F5 */
        public C38516b m45318F5() {
            return new C38516b((C38333a) this.f36024c.f35891B.get());
        }

        /* renamed from: F6 */
        private CitySelectorActionSheet m45319F6(CitySelectorActionSheet citySelectorActionSheet) {
            C17431c.m60888a(citySelectorActionSheet, (C17432d) this.f36070v0.get());
            return citySelectorActionSheet;
        }

        /* renamed from: F7 */
        private C25233b m45320F7(C25233b bVar) {
            C19790c.m65552a(bVar, (C37071a) this.f36033f.get());
            return bVar;
        }

        /* renamed from: F8 */
        private C36497d m45321F8(C36497d dVar) {
            C19790c.m65552a(dVar, (C37071a) this.f36033f.get());
            C36511f.m108256a(dVar, (C36515j.C36517b) this.f35981H0.get());
            return dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: G5 */
        public C38518d m45324G5() {
            return new C38518d((C38333a) this.f36024c.f35891B.get());
        }

        /* renamed from: G6 */
        private C19567d m45325G6(C19567d dVar) {
            C19790c.m65552a(dVar, (C37071a) this.f36033f.get());
            C19587f.m65220a(dVar, (C26868u.C26870b) this.f35990M.get());
            return dVar;
        }

        /* renamed from: G7 */
        private C31977d m45326G7(C31977d dVar) {
            C19790c.m65552a(dVar, (C37071a) this.f36033f.get());
            C31992f.m94416a(dVar, (C31995i) this.f35969B0.get());
            return dVar;
        }

        /* renamed from: G8 */
        private C37137d m45327G8(C37137d dVar) {
            C19790c.m65552a(dVar, (C37071a) this.f36033f.get());
            return dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: H5 */
        public C38520e m45330H5() {
            return new C38520e((C38333a) this.f36024c.f35891B.get());
        }

        /* renamed from: H6 */
        private C19292b m45331H6(C19292b bVar) {
            C19790c.m65552a(bVar, (C37071a) this.f36033f.get());
            return bVar;
        }

        /* renamed from: H7 */
        private InsuranceProvidersFragment m45332H7(InsuranceProvidersFragment insuranceProvidersFragment) {
            C35657p1.m105891d(insuranceProvidersFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(insuranceProvidersFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(insuranceProvidersFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(insuranceProvidersFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(insuranceProvidersFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(insuranceProvidersFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(insuranceProvidersFragment, this.f36021b.m46115T7());
            C24595c.m78996b(insuranceProvidersFragment, (C24596d.C24603f) this.f36050l0.get());
            C24595c.m78995a(insuranceProvidersFragment, (TargetEnvironment) this.f36021b.f36216H.get());
            return insuranceProvidersFragment;
        }

        /* renamed from: H8 */
        private RepaymentFragment m45333H8(RepaymentFragment repaymentFragment) {
            C35657p1.m105891d(repaymentFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(repaymentFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(repaymentFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(repaymentFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(repaymentFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(repaymentFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(repaymentFragment, this.f36021b.m46115T7());
            C32744b.m96712a(repaymentFragment, (C32745c.C32750d) this.f35983I0.get());
            return repaymentFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: I5 */
        public C38521f m45336I5() {
            return new C38521f((C38333a) this.f36024c.f35891B.get());
        }

        /* renamed from: I6 */
        private C18443d m45337I6(C18443d dVar) {
            C19790c.m65552a(dVar, (C37071a) this.f36033f.get());
            return dVar;
        }

        /* renamed from: I7 */
        private InsuranceSummaryFragment m45338I7(InsuranceSummaryFragment insuranceSummaryFragment) {
            C35657p1.m105891d(insuranceSummaryFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(insuranceSummaryFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(insuranceSummaryFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(insuranceSummaryFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(insuranceSummaryFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(insuranceSummaryFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(insuranceSummaryFragment, this.f36021b.m46115T7());
            C24644b.m79103a(insuranceSummaryFragment, (C24646d.C24652d) this.f36058p0.get());
            return insuranceSummaryFragment;
        }

        /* renamed from: I8 */
        private RepaymentSuccessFragment m45339I8(RepaymentSuccessFragment repaymentSuccessFragment) {
            C35657p1.m105891d(repaymentSuccessFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(repaymentSuccessFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(repaymentSuccessFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(repaymentSuccessFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(repaymentSuccessFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(repaymentSuccessFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(repaymentSuccessFragment, this.f36021b.m46115T7());
            return repaymentSuccessFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: J5 */
        public C36363e m45342J5() {
            return new C36363e((C36888a) this.f36024c.f35902M.get());
        }

        /* renamed from: J6 */
        private ClosePiggyBankActionSheet m45343J6(ClosePiggyBankActionSheet closePiggyBankActionSheet) {
            C19790c.m65552a(closePiggyBankActionSheet, (C37071a) this.f36033f.get());
            return closePiggyBankActionSheet;
        }

        /* renamed from: J7 */
        private C29507n m45344J7(C29507n nVar) {
            C35657p1.m105891d(nVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(nVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(nVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(nVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(nVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(nVar, this.f36027d.m44941t6());
            C35657p1.m105890c(nVar, this.f36021b.m46115T7());
            return nVar;
        }

        /* renamed from: J8 */
        private C35651n1 m45345J8(C35651n1 n1Var) {
            C35657p1.m105891d(n1Var, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(n1Var, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(n1Var, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(n1Var, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(n1Var, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(n1Var, this.f36027d.m44941t6());
            C35657p1.m105890c(n1Var, this.f36021b.m46115T7());
            return n1Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: K5 */
        public C15385j m45348K5() {
            return new C15385j((C16301a) this.f36021b.f36269N4.get());
        }

        /* renamed from: K6 */
        private C33055d m45349K6(C33055d dVar) {
            C35657p1.m105891d(dVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(dVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(dVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(dVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(dVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(dVar, this.f36027d.m44941t6());
            C35657p1.m105890c(dVar, this.f36021b.m46115T7());
            return dVar;
        }

        /* renamed from: K7 */
        private C28886f m45350K7(C28886f fVar) {
            C19790c.m65552a(fVar, (C37071a) this.f36033f.get());
            C28905h.m88535a(fVar, (C30351a) this.f36064s0.get());
            return fVar;
        }

        /* renamed from: K8 */
        private C23023l m45351K8(C23023l lVar) {
            C19790c.m65552a(lVar, (C37071a) this.f36033f.get());
            return lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: L5 */
        public C36364f m45354L5() {
            return new C36364f((C36888a) this.f36024c.f35902M.get());
        }

        /* renamed from: L6 */
        private ClosePiggyBankFragment m45355L6(ClosePiggyBankFragment closePiggyBankFragment) {
            C35657p1.m105891d(closePiggyBankFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(closePiggyBankFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(closePiggyBankFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(closePiggyBankFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(closePiggyBankFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(closePiggyBankFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(closePiggyBankFragment, this.f36021b.m46115T7());
            return closePiggyBankFragment;
        }

        /* renamed from: L7 */
        private C25515c m45356L7(C25515c cVar) {
            C19790c.m65552a(cVar, (C37071a) this.f36033f.get());
            return cVar;
        }

        /* renamed from: L8 */
        private SavingGoalChooserActionSheet m45357L8(SavingGoalChooserActionSheet savingGoalChooserActionSheet) {
            C19790c.m65552a(savingGoalChooserActionSheet, (C37071a) this.f36033f.get());
            return savingGoalChooserActionSheet;
        }

        /* renamed from: M5 */
        private C28109a m45361M5() {
            return new C28109a((C28520a) this.f36021b.f36307S2.get());
        }

        /* renamed from: M6 */
        private CombinedOfferFirstStepFragment m45362M6(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
            C35657p1.m105891d(combinedOfferFirstStepFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(combinedOfferFirstStepFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(combinedOfferFirstStepFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(combinedOfferFirstStepFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(combinedOfferFirstStepFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(combinedOfferFirstStepFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(combinedOfferFirstStepFragment, this.f36021b.m46115T7());
            C29016k.m88753a(combinedOfferFirstStepFragment, (C29018m) this.f36004T.get());
            return combinedOfferFirstStepFragment;
        }

        /* renamed from: M7 */
        private C31752k m45363M7(C31752k kVar) {
            C19790c.m65552a(kVar, (C37071a) this.f36033f.get());
            C31767m.m93965a(kVar, (C31742c) this.f35967A0.get());
            return kVar;
        }

        /* renamed from: M8 */
        private SecondStageFragment m45364M8(SecondStageFragment secondStageFragment) {
            C14537b.m53681a(secondStageFragment, (C14548g.C14556d) this.f36063s.get());
            return secondStageFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: N5 */
        public C37906g m45368N5() {
            return new C37906g((C38606b) this.f36021b.f36281P0.get(), new C39032a());
        }

        /* renamed from: N6 */
        private CombinedOfferSecondStepFragment m45369N6(CombinedOfferSecondStepFragment combinedOfferSecondStepFragment) {
            C35657p1.m105891d(combinedOfferSecondStepFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(combinedOfferSecondStepFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(combinedOfferSecondStepFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(combinedOfferSecondStepFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(combinedOfferSecondStepFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(combinedOfferSecondStepFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(combinedOfferSecondStepFragment, this.f36021b.m46115T7());
            C29258i.m89227a(combinedOfferSecondStepFragment, (C29259j) this.f36006U.get());
            return combinedOfferSecondStepFragment;
        }

        /* renamed from: N7 */
        private LoanDetailsFragment m45370N7(LoanDetailsFragment loanDetailsFragment) {
            C32596d.m96322a(loanDetailsFragment, (C32618h.C32620b) this.f35973D0.get());
            return loanDetailsFragment;
        }

        /* renamed from: N8 */
        private C31226f m45371N8(C31226f fVar) {
            C19790c.m65552a(fVar, (C37071a) this.f36033f.get());
            C31250h.m92848a(fVar, (C36113m) this.f36001R0.get());
            return fVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: O5 */
        public C15369g m45375O5() {
            return new C15369g((C15707a) this.f36024c.f35932z.get());
        }

        /* renamed from: O6 */
        private C33362b m45376O6(C33362b bVar) {
            C35657p1.m105891d(bVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(bVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(bVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(bVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(bVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(bVar, this.f36027d.m44941t6());
            C35657p1.m105890c(bVar, this.f36021b.m46115T7());
            return bVar;
        }

        /* renamed from: O7 */
        private C31772c m45377O7(C31772c cVar) {
            C19790c.m65552a(cVar, (C37071a) this.f36033f.get());
            C31786e.m94005a(cVar, (C31789h.C31792c) this.f35977F0.get());
            return cVar;
        }

        /* renamed from: O8 */
        private SelectTransportCardDetailsFragment m45378O8(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment) {
            C35657p1.m105891d(selectTransportCardDetailsFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(selectTransportCardDetailsFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(selectTransportCardDetailsFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(selectTransportCardDetailsFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(selectTransportCardDetailsFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(selectTransportCardDetailsFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(selectTransportCardDetailsFragment, this.f36021b.m46115T7());
            return selectTransportCardDetailsFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: P5 */
        public C37909h m45382P5() {
            return new C37909h((C38606b) this.f36021b.f36281P0.get());
        }

        /* renamed from: P6 */
        private CountrySelectorActionSheet m45383P6(CountrySelectorActionSheet countrySelectorActionSheet) {
            C17556b.m61114a(countrySelectorActionSheet, (C17557c) this.f36072w0.get());
            return countrySelectorActionSheet;
        }

        /* renamed from: P7 */
        private C31397b m45384P7(C31397b bVar) {
            C19790c.m65552a(bVar, (C37071a) this.f36033f.get());
            return bVar;
        }

        /* renamed from: P8 */
        private SelectTransportCardPassTypeDialogFragment m45385P8(SelectTransportCardPassTypeDialogFragment selectTransportCardPassTypeDialogFragment) {
            C35104b.m103142a(selectTransportCardPassTypeDialogFragment, (C35105c.C35112g) this.f36038g1.get());
            return selectTransportCardPassTypeDialogFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: Q5 */
        public C36738j m45389Q5() {
            return new C36738j((C36356a) this.f36021b.f36517t0.get());
        }

        /* renamed from: Q6 */
        private C35669t m45390Q6(C35669t tVar) {
            C35657p1.m105891d(tVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(tVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(tVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(tVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(tVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(tVar, this.f36027d.m44941t6());
            C35657p1.m105890c(tVar, this.f36021b.m46115T7());
            C35674v.m105944a(tVar, (C30123a) this.f36027d.f35795l1.get());
            C35674v.m105946c(tVar, (C28290a) this.f36027d.f35809p1.get());
            C35674v.m105945b(tVar, (TargetEnvironment) this.f36021b.f36216H.get());
            return tVar;
        }

        /* renamed from: Q7 */
        private C34217d m45391Q7(C34217d dVar) {
            C35657p1.m105891d(dVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(dVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(dVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(dVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(dVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(dVar, this.f36027d.m44941t6());
            C35657p1.m105890c(dVar, this.f36021b.m46115T7());
            return dVar;
        }

        /* renamed from: Q8 */
        private C19108c m45392Q8(C19108c cVar) {
            C19790c.m65552a(cVar, (C37071a) this.f36033f.get());
            C19127e.m64492a(cVar, (C19138n.C19144d) this.f36071w.get());
            return cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: R5 */
        public C26030c m45396R5() {
            return new C26030c(new C25034b());
        }

        /* renamed from: R6 */
        private C37846d m45397R6(C37846d dVar) {
            C19790c.m65552a(dVar, (C37071a) this.f36033f.get());
            C37858f.m111327a(dVar, (C37862j.C37863a) this.f36013X0.get());
            return dVar;
        }

        /* renamed from: R7 */
        private C39968f m45398R7(C39968f fVar) {
            C39982h.m115894a(fVar, (C39985k.C39987b) this.f36017Z0.get());
            return fVar;
        }

        /* renamed from: R8 */
        private C34709c m45399R8(C34709c cVar) {
            C35657p1.m105891d(cVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(cVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(cVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(cVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(cVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(cVar, this.f36027d.m44941t6());
            C35657p1.m105890c(cVar, this.f36021b.m46115T7());
            return cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: S5 */
        public C29405l m45403S5() {
            return new C29405l((C29077c) this.f36021b.f36375b2.get());
        }

        /* renamed from: S6 */
        private C38406d m45404S6(C38406d dVar) {
            C19790c.m65552a(dVar, (C37071a) this.f36033f.get());
            return dVar;
        }

        /* renamed from: S7 */
        private LoansHistoryGraphicsFragment m45405S7(LoansHistoryGraphicsFragment loansHistoryGraphicsFragment) {
            C35657p1.m105891d(loansHistoryGraphicsFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(loansHistoryGraphicsFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(loansHistoryGraphicsFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(loansHistoryGraphicsFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(loansHistoryGraphicsFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(loansHistoryGraphicsFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(loansHistoryGraphicsFragment, this.f36021b.m46115T7());
            C32647e.m96459a(loansHistoryGraphicsFragment, (TargetEnvironment) this.f36021b.f36216H.get());
            C32647e.m96460b(loansHistoryGraphicsFragment, (C32658g.C32666h) this.f35975E0.get());
            return loansHistoryGraphicsFragment;
        }

        /* renamed from: S8 */
        private C39565o m45406S8(C39565o oVar) {
            C19790c.m65552a(oVar, (C37071a) this.f36033f.get());
            C39586q.m115058a(oVar, (C39532c0.C39536c) this.f36032e1.get());
            return oVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: T5 */
        public C28233f m45410T5() {
            return new C28233f((PreferencesApiManager) this.f36021b.f36224I.get());
        }

        /* renamed from: T6 */
        private C38660f m45411T6(C38660f fVar) {
            C19790c.m65552a(fVar, (C37071a) this.f36033f.get());
            return fVar;
        }

        /* renamed from: T7 */
        private C29932d m45412T7(C29932d dVar) {
            C19790c.m65552a(dVar, (C37071a) this.f36033f.get());
            return dVar;
        }

        /* renamed from: T8 */
        private C15418d m45413T8(C15418d dVar) {
            C19790c.m65552a(dVar, (C37071a) this.f36033f.get());
            C15434f.m55913b(dVar, (C15439k.C15442b) this.f35978G.get());
            C15434f.m55912a(dVar, (Client) this.f36021b.f36389d0.get());
            return dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: U5 */
        public C24253c m45417U5() {
            return new C24253c((PreferencesApiManager) this.f36021b.f36224I.get(), m45424V5(), new C25462c());
        }

        /* renamed from: U6 */
        private DdStoIntroFragment m45418U6(DdStoIntroFragment ddStoIntroFragment) {
            C35657p1.m105891d(ddStoIntroFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(ddStoIntroFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(ddStoIntroFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(ddStoIntroFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(ddStoIntroFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(ddStoIntroFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(ddStoIntroFragment, this.f36021b.m46115T7());
            return ddStoIntroFragment;
        }

        /* renamed from: U7 */
        private C27165f m45419U7(C27165f fVar) {
            C19790c.m65552a(fVar, (C37071a) this.f36033f.get());
            return fVar;
        }

        /* renamed from: U8 */
        private StoryGroupFragment m45420U8(StoryGroupFragment storyGroupFragment) {
            C35657p1.m105891d(storyGroupFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(storyGroupFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(storyGroupFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(storyGroupFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(storyGroupFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(storyGroupFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(storyGroupFragment, this.f36021b.m46115T7());
            C34834d.m102305a(storyGroupFragment, (C37918g) this.f36035f1.get());
            return storyGroupFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: V4 */
        public C38849a m45423V4() {
            return new C38849a((C38606b) this.f36021b.f36281P0.get());
        }

        /* renamed from: V5 */
        private C25461b m45424V5() {
            return new C25461b((PreferencesApiManager) this.f36021b.f36224I.get());
        }

        /* renamed from: V6 */
        private C35606h0 m45425V6(C35606h0 h0Var) {
            C35657p1.m105891d(h0Var, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(h0Var, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(h0Var, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(h0Var, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(h0Var, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(h0Var, this.f36027d.m44941t6());
            C35657p1.m105890c(h0Var, this.f36021b.m46115T7());
            C35627j0.m105798a(h0Var, (C30123a) this.f36027d.f35795l1.get());
            C35627j0.m105799b(h0Var, (C28290a) this.f36027d.f35809p1.get());
            return h0Var;
        }

        /* renamed from: V7 */
        private MoreFragment m45426V7(MoreFragment moreFragment) {
            C35657p1.m105891d(moreFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(moreFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(moreFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(moreFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(moreFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(moreFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(moreFragment, this.f36021b.m46115T7());
            MoreFragment_MembersInjector.injectGetReferalBannerInfoUseCase(moreFragment, m45361M5());
            MoreFragment_MembersInjector.injectGetAppSettingByNameUseCase(moreFragment, this.f36021b.m46115T7());
            MoreFragment_MembersInjector.injectAuthHelper(moreFragment, (C36728a) this.f36021b.f36400e3.get());
            return moreFragment;
        }

        /* renamed from: V8 */
        private C35025d m45427V8(C35025d dVar) {
            C35657p1.m105891d(dVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(dVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(dVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(dVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(dVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(dVar, this.f36027d.m44941t6());
            C35657p1.m105890c(dVar, this.f36021b.m46115T7());
            return dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: W4 */
        public C38851b m45430W4() {
            return new C38851b((C38606b) this.f36021b.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: W5 */
        public C26052b m45431W5() {
            return new C26052b((C26146d) this.f36021b.f36381c0.get());
        }

        /* renamed from: W6 */
        private DepositProlongationMainFragment m45432W6(DepositProlongationMainFragment depositProlongationMainFragment) {
            C35657p1.m105891d(depositProlongationMainFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(depositProlongationMainFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(depositProlongationMainFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(depositProlongationMainFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(depositProlongationMainFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(depositProlongationMainFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(depositProlongationMainFragment, this.f36021b.m46115T7());
            C25925j.m81481a(depositProlongationMainFragment, (C25929n) this.f36014Y.get());
            return depositProlongationMainFragment;
        }

        /* renamed from: W7 */
        private C19305k m45433W7(C19305k kVar) {
            C19790c.m65552a(kVar, (C37071a) this.f36033f.get());
            return kVar;
        }

        /* renamed from: W8 */
        private C30010c m45434W8(C30010c cVar) {
            C30031h.m90994a(cVar, (C30026d) this.f36016Z.get());
            return cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: X4 */
        public C38853c m45437X4() {
            return new C38853c((C38606b) this.f36021b.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: X5 */
        public C38882o0 m45438X5() {
            return new C38882o0((C38606b) this.f36021b.f36281P0.get());
        }

        /* renamed from: X6 */
        private DepositProlongationResultFragment m45439X6(DepositProlongationResultFragment depositProlongationResultFragment) {
            C35657p1.m105891d(depositProlongationResultFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(depositProlongationResultFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(depositProlongationResultFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(depositProlongationResultFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(depositProlongationResultFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(depositProlongationResultFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(depositProlongationResultFragment, this.f36021b.m46115T7());
            return depositProlongationResultFragment;
        }

        /* renamed from: X7 */
        private C19417a m45440X7(C19417a aVar) {
            C19790c.m65552a(aVar, (C37071a) this.f36033f.get());
            return aVar;
        }

        /* renamed from: X8 */
        private SuccessTransportCardFragment m45441X8(SuccessTransportCardFragment successTransportCardFragment) {
            C35657p1.m105891d(successTransportCardFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(successTransportCardFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(successTransportCardFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(successTransportCardFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(successTransportCardFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(successTransportCardFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(successTransportCardFragment, this.f36021b.m46115T7());
            return successTransportCardFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: Y4 */
        public C16723a m45444Y4() {
            return new C16723a((C16586a) this.f36027d.f35804o.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Y5 */
        public C29408o m45445Y5() {
            return new C29408o((C29077c) this.f36021b.f36375b2.get());
        }

        /* renamed from: Y6 */
        private C38174g m45446Y6(C38174g gVar) {
            C38181i.m112345a(gVar, (C21546a) this.f36021b.f36197E4.get());
            return gVar;
        }

        /* renamed from: Y7 */
        private OffersAndApplicationsDetailsFragment m45447Y7(OffersAndApplicationsDetailsFragment offersAndApplicationsDetailsFragment) {
            C35657p1.m105891d(offersAndApplicationsDetailsFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(offersAndApplicationsDetailsFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(offersAndApplicationsDetailsFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(offersAndApplicationsDetailsFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(offersAndApplicationsDetailsFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(offersAndApplicationsDetailsFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(offersAndApplicationsDetailsFragment, this.f36021b.m46115T7());
            C24314b.m78223a(offersAndApplicationsDetailsFragment, (C24315c.C24316a) this.f36031e0.get());
            return offersAndApplicationsDetailsFragment;
        }

        /* renamed from: Y8 */
        private TermsAndConditionsFragment m45448Y8(TermsAndConditionsFragment termsAndConditionsFragment) {
            C35657p1.m105891d(termsAndConditionsFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(termsAndConditionsFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(termsAndConditionsFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(termsAndConditionsFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(termsAndConditionsFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(termsAndConditionsFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(termsAndConditionsFragment, this.f36021b.m46115T7());
            C24398d.m78398a(termsAndConditionsFragment, (C24399e.C24400a) this.f36037g0.get());
            return termsAndConditionsFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: Z4 */
        public C19220a m45451Z4() {
            return new C19220a((C38267a) this.f36021b.f36558y1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Z5 */
        public C39058e m45452Z5() {
            return new C39058e((C39834a) this.f36021b.f36386c5.get());
        }

        /* renamed from: Z6 */
        private C24054a m45453Z6(C24054a aVar) {
            C35657p1.m105891d(aVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(aVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(aVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(aVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(aVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(aVar, this.f36027d.m44941t6());
            C35657p1.m105890c(aVar, this.f36021b.m46115T7());
            return aVar;
        }

        /* renamed from: Z7 */
        private C33465b m45454Z7(C33465b bVar) {
            C35657p1.m105891d(bVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(bVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(bVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(bVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(bVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(bVar, this.f36027d.m44941t6());
            C35657p1.m105890c(bVar, this.f36021b.m46115T7());
            return bVar;
        }

        /* renamed from: Z8 */
        private C23966b m45455Z8(C23966b bVar) {
            C19790c.m65552a(bVar, (C37071a) this.f36033f.get());
            return bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a5 */
        public C25214a m45458a5() {
            return new C25214a(C17958c.m61876a(this.f36021b.f36388d));
        }

        /* renamed from: a6 */
        private void m45459a6(Fragment fragment) {
            this.f36033f = C18327b.m62669a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 0));
            this.f36036g = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 1));
            this.f36039h = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 2));
            this.f36042i = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 4));
            this.f36045j = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 5));
            this.f36047k = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 6));
            this.f36049l = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 7));
            this.f36051m = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 3));
            this.f36053n = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 8));
            this.f36055o = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 10));
            this.f36057p = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 11));
            this.f36059q = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 12));
            this.f36061r = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 9));
            this.f36063s = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 13));
            this.f36065t = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 14));
            this.f36067u = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 16));
            this.f36069v = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 17));
            this.f36071w = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 15));
            this.f36073x = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 18));
            this.f36075y = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 20));
            this.f36077z = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 21));
            this.f35966A = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 22));
            this.f35968B = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 23));
            this.f35970C = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 24));
            this.f35972D = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 19));
            this.f35974E = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 26));
            this.f35976F = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 27));
            this.f35978G = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 25));
            this.f35980H = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 29));
            this.f35982I = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 28));
            this.f35984J = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 30));
            this.f35986K = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 33));
            this.f35988L = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 32));
            this.f35990M = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 31));
            this.f35992N = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 35));
            this.f35994O = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 34));
            this.f35996P = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 36));
            this.f35998Q = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 37));
            this.f36000R = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 39));
            this.f36002S = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 38));
            this.f36004T = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 40));
            this.f36006U = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 41));
            this.f36008V = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 43));
            this.f36010W = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 42));
            this.f36012X = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 44));
            this.f36014Y = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 45));
            this.f36016Z = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 46));
            this.f36019a0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 47));
            this.f36022b0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 48));
            this.f36025c0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 49));
            this.f36028d0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 50));
            this.f36031e0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 51));
            this.f36034f0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 52));
            this.f36037g0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 53));
            this.f36040h0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 54));
            this.f36043i0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 56));
            this.f36046j0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 55));
            this.f36048k0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 57));
            this.f36050l0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 58));
            this.f36052m0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 59));
            this.f36054n0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 61));
            this.f36056o0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 62));
            this.f36058p0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 60));
            C12197a aVar = new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 64);
            this.f36060q0 = aVar;
            this.f36062r0 = C18331f.m62681a(aVar);
            this.f36064s0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 63));
            this.f36066t0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 66));
            this.f36068u0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 65));
            this.f36070v0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 67));
            this.f36072w0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 68));
            this.f36074x0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 69));
            this.f36076y0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 70));
            this.f36078z0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 72));
            this.f35967A0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 71));
            this.f35969B0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 73));
            this.f35971C0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 74));
            this.f35973D0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 75));
            this.f35975E0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 76));
            this.f35977F0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 77));
            this.f35979G0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 78));
            this.f35981H0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 79));
            this.f35983I0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 80));
            this.f35985J0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 81));
            this.f35987K0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 83));
            this.f35989L0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 82));
            this.f35991M0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 85));
            this.f35993N0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 84));
            this.f35995O0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 87));
            this.f35997P0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 86));
            this.f35999Q0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 88));
            this.f36001R0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 89));
            this.f36003S0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 90));
            this.f36005T0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 91));
            this.f36007U0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 92));
            this.f36009V0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 94));
            this.f36011W0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 93));
            this.f36013X0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 95));
            this.f36015Y0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 96));
            this.f36017Z0 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 97));
            this.f36020a1 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 99));
        }

        /* renamed from: a7 */
        private C39992d m45460a7(C39992d dVar) {
            C19790c.m65552a(dVar, (C37071a) this.f36033f.get());
            return dVar;
        }

        /* renamed from: a8 */
        private C33072h m45461a8(C33072h hVar) {
            C35657p1.m105891d(hVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(hVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(hVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(hVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(hVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(hVar, this.f36027d.m44941t6());
            C35657p1.m105890c(hVar, this.f36021b.m46115T7());
            return hVar;
        }

        /* renamed from: a9 */
        private C29108a m45462a9(C29108a aVar) {
            C19790c.m65552a(aVar, (C37071a) this.f36033f.get());
            return aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b5 */
        public C39054a m45465b5() {
            return new C39054a((C39834a) this.f36021b.f36386c5.get());
        }

        /* renamed from: b6 */
        private void m45466b6(Fragment fragment) {
            this.f36023b1 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 98));
            this.f36026c1 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 100));
            this.f36029d1 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 101));
            this.f36032e1 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 102));
            this.f36035f1 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 103));
            this.f36038g1 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 104));
            this.f36041h1 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 106));
            this.f36044i1 = C18331f.m62681a(new C12197a(this.f36021b, this.f36024c, this.f36027d, this.f36030e, 105));
        }

        /* renamed from: b7 */
        private EditPackageConfirmationActionSheet m45467b7(EditPackageConfirmationActionSheet editPackageConfirmationActionSheet) {
            C19790c.m65552a(editPackageConfirmationActionSheet, (C37071a) this.f36033f.get());
            return editPackageConfirmationActionSheet;
        }

        /* renamed from: b8 */
        private C18220m m45468b8(C18220m mVar) {
            C35657p1.m105891d(mVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(mVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(mVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(mVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(mVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(mVar, this.f36027d.m44941t6());
            C35657p1.m105890c(mVar, this.f36021b.m46115T7());
            return mVar;
        }

        /* renamed from: b9 */
        private TransportCardInfoFragment m45469b9(TransportCardInfoFragment transportCardInfoFragment) {
            C35657p1.m105891d(transportCardInfoFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(transportCardInfoFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(transportCardInfoFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(transportCardInfoFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(transportCardInfoFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(transportCardInfoFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(transportCardInfoFragment, this.f36021b.m46115T7());
            C35134c.m103208a(transportCardInfoFragment, (C35135d.C35137b) this.f36044i1.get());
            return transportCardInfoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: c5 */
        public C25353a m45472c5() {
            return new C25353a((C25847a) this.f35986K.get());
        }

        /* renamed from: c6 */
        private C38427a m45473c6(C38427a aVar) {
            C19790c.m65552a(aVar, (C37071a) this.f36033f.get());
            C38439c.m112868a(aVar, (C38444h.C38447c) this.f36029d1.get());
            return aVar;
        }

        /* renamed from: c7 */
        private C16815b m45474c7(C16815b bVar) {
            C19790c.m65552a(bVar, (C37071a) this.f36033f.get());
            C16829d.m59301a(bVar, (C16836i.C16837a) this.f36053n.get());
            return bVar;
        }

        /* renamed from: c8 */
        private C18240p m45475c8(C18240p pVar) {
            C35657p1.m105891d(pVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(pVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(pVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(pVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(pVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(pVar, this.f36027d.m44941t6());
            C35657p1.m105890c(pVar, this.f36021b.m46115T7());
            return pVar;
        }

        /* renamed from: c9 */
        private TravelInsuranceDetailsFragment m45476c9(TravelInsuranceDetailsFragment travelInsuranceDetailsFragment) {
            C35657p1.m105891d(travelInsuranceDetailsFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(travelInsuranceDetailsFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(travelInsuranceDetailsFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(travelInsuranceDetailsFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(travelInsuranceDetailsFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(travelInsuranceDetailsFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(travelInsuranceDetailsFragment, this.f36021b.m46115T7());
            C24524b.m78794b(travelInsuranceDetailsFragment, (C24529d.C24530a) this.f36046j0.get());
            C24524b.m78793a(travelInsuranceDetailsFragment, (TargetEnvironment) this.f36021b.f36216H.get());
            return travelInsuranceDetailsFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: d5 */
        public C38859f m45479d5() {
            return new C38859f((C38606b) this.f36021b.f36281P0.get());
        }

        /* renamed from: d6 */
        private C24955f m45480d6(C24955f fVar) {
            C19790c.m65552a(fVar, (C37071a) this.f36033f.get());
            C24972h.m79814a(fVar, (C25878a) this.f36010W.get());
            return fVar;
        }

        /* renamed from: d7 */
        private C18421c m45481d7(C18421c cVar) {
            C18438e.m62871b(cVar, (C12612q1) this.f36039h.get());
            C18438e.m62870a(cVar, (C37071a) this.f36033f.get());
            return cVar;
        }

        /* renamed from: d8 */
        private C18188b0 m45482d8(C18188b0 b0Var) {
            C35657p1.m105891d(b0Var, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(b0Var, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(b0Var, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(b0Var, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(b0Var, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(b0Var, this.f36027d.m44941t6());
            C35657p1.m105890c(b0Var, this.f36021b.m46115T7());
            return b0Var;
        }

        /* renamed from: d9 */
        private TravelInsuranceSuccessFragment m45483d9(TravelInsuranceSuccessFragment travelInsuranceSuccessFragment) {
            C35657p1.m105891d(travelInsuranceSuccessFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(travelInsuranceSuccessFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(travelInsuranceSuccessFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(travelInsuranceSuccessFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(travelInsuranceSuccessFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(travelInsuranceSuccessFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(travelInsuranceSuccessFragment, this.f36021b.m46115T7());
            C24766d.m79352b(travelInsuranceSuccessFragment, (C24768f) this.f36052m0.get());
            C24766d.m79351a(travelInsuranceSuccessFragment, (TargetEnvironment) this.f36021b.f36216H.get());
            return travelInsuranceSuccessFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: e5 */
        public C25215b m45486e5() {
            return new C25215b(C17958c.m61876a(this.f36021b.f36388d));
        }

        /* renamed from: e6 */
        private C25143e m45487e6(C25143e eVar) {
            C19790c.m65552a(eVar, (C37071a) this.f36033f.get());
            C25160g.m80226a(eVar, (C25895m.C25897b) this.f36012X.get());
            return eVar;
        }

        /* renamed from: e7 */
        private FillOtherPersonInsuranceInfo m45488e7(FillOtherPersonInsuranceInfo fillOtherPersonInsuranceInfo) {
            C35657p1.m105891d(fillOtherPersonInsuranceInfo, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(fillOtherPersonInsuranceInfo, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(fillOtherPersonInsuranceInfo, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(fillOtherPersonInsuranceInfo, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(fillOtherPersonInsuranceInfo, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(fillOtherPersonInsuranceInfo, this.f36027d.m44941t6());
            C35657p1.m105890c(fillOtherPersonInsuranceInfo, this.f36021b.m46115T7());
            C24580b.m78978a(fillOtherPersonInsuranceInfo, (C24577a.C24578a) this.f36048k0.get());
            return fillOtherPersonInsuranceInfo;
        }

        /* renamed from: e8 */
        private P2PHelpFragment m45489e8(P2PHelpFragment p2PHelpFragment) {
            C35657p1.m105891d(p2PHelpFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(p2PHelpFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(p2PHelpFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(p2PHelpFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(p2PHelpFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(p2PHelpFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(p2PHelpFragment, this.f36021b.m46115T7());
            return p2PHelpFragment;
        }

        /* renamed from: e9 */
        private C14643c m45490e9(C14643c cVar) {
            C19790c.m65552a(cVar, (C37071a) this.f36033f.get());
            return cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: f5 */
        public C31088c m45493f5() {
            return new C31088c((C31452b) this.f36024c.f35897H.get());
        }

        /* renamed from: f6 */
        private C31566b m45494f6(C31566b bVar) {
            C19790c.m65552a(bVar, (C37071a) this.f36033f.get());
            return bVar;
        }

        /* renamed from: f7 */
        private FirstStageFragment m45495f7(FirstStageFragment firstStageFragment) {
            C14423a.m53386a(firstStageFragment, (C14439e.C14445c) this.f36051m.get());
            return firstStageFragment;
        }

        /* renamed from: f8 */
        private P2PLinkGenerationFragment m45496f8(P2PLinkGenerationFragment p2PLinkGenerationFragment) {
            C35657p1.m105891d(p2PLinkGenerationFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(p2PLinkGenerationFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(p2PLinkGenerationFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(p2PLinkGenerationFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(p2PLinkGenerationFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(p2PLinkGenerationFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(p2PLinkGenerationFragment, this.f36021b.m46115T7());
            C15262f.m55608a(p2PLinkGenerationFragment, this.f36024c.m45240c0());
            C15262f.m55610c(p2PLinkGenerationFragment, new C15252c.C15254b.C15255a());
            C15262f.m55609b(p2PLinkGenerationFragment, new KeyboardVisibility.Base());
            return p2PLinkGenerationFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: f9 */
        public C30312c m45497f9() {
            return new C30312c(new C25034b(), new C24726a());
        }

        /* access modifiers changed from: private */
        /* renamed from: g5 */
        public C37903d m45500g5() {
            return new C37903d((C38606b) this.f36021b.f36281P0.get());
        }

        /* renamed from: g6 */
        private ActivationDetailsFragment m45501g6(ActivationDetailsFragment activationDetailsFragment) {
            C35657p1.m105891d(activationDetailsFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(activationDetailsFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(activationDetailsFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(activationDetailsFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(activationDetailsFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(activationDetailsFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(activationDetailsFragment, this.f36021b.m46115T7());
            C31018c.m92371a(activationDetailsFragment, (C31022e) this.f36074x0.get());
            return activationDetailsFragment;
        }

        /* renamed from: g7 */
        private C31522b m45502g7(C31522b bVar) {
            C19790c.m65552a(bVar, (C37071a) this.f36033f.get());
            return bVar;
        }

        /* renamed from: g8 */
        private P2PLinkRouterFragment m45503g8(P2PLinkRouterFragment p2PLinkRouterFragment) {
            C35657p1.m105891d(p2PLinkRouterFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(p2PLinkRouterFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(p2PLinkRouterFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(p2PLinkRouterFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(p2PLinkRouterFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(p2PLinkRouterFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(p2PLinkRouterFragment, this.f36021b.m46115T7());
            return p2PLinkRouterFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: g9 */
        public C38522g m45504g9() {
            return new C38522g((C38333a) this.f36024c.f35891B.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: h5 */
        public C39055b m45507h5() {
            return new C39055b((C39834a) this.f36021b.f36386c5.get());
        }

        /* renamed from: h6 */
        private ActivationFormFragment m45508h6(ActivationFormFragment activationFormFragment) {
            C35657p1.m105891d(activationFormFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(activationFormFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(activationFormFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(activationFormFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(activationFormFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(activationFormFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(activationFormFragment, this.f36021b.m46115T7());
            C31382l.m93298a(activationFormFragment, (C31386o) this.f36076y0.get());
            return activationFormFragment;
        }

        /* renamed from: h7 */
        private C24991g m45509h7(C24991g gVar) {
            C35657p1.m105891d(gVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(gVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(gVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(gVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(gVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(gVar, this.f36027d.m44941t6());
            C35657p1.m105890c(gVar, this.f36021b.m46115T7());
            return gVar;
        }

        /* renamed from: h8 */
        private P2PLinkSharingFragment m45510h8(P2PLinkSharingFragment p2PLinkSharingFragment) {
            C35657p1.m105891d(p2PLinkSharingFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(p2PLinkSharingFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(p2PLinkSharingFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(p2PLinkSharingFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(p2PLinkSharingFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(p2PLinkSharingFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(p2PLinkSharingFragment, this.f36021b.m46115T7());
            return p2PLinkSharingFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: h9 */
        public C28463c m45511h9() {
            return new C28463c((C28248a) this.f36024c.f35931y.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: i5 */
        public C36360b m45514i5() {
            return new C36360b((C36888a) this.f36024c.f35902M.get());
        }

        /* renamed from: i6 */
        private C36282f m45515i6(C36282f fVar) {
            C19790c.m65552a(fVar, (C37071a) this.f36033f.get());
            C36300h.m107745a(fVar, (C36313r.C36314a) this.f36003S0.get());
            return fVar;
        }

        /* renamed from: i7 */
        private C23939a m45516i7(C23939a aVar) {
            C35657p1.m105891d(aVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(aVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(aVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(aVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(aVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(aVar, this.f36027d.m44941t6());
            C35657p1.m105890c(aVar, this.f36021b.m46115T7());
            return aVar;
        }

        /* renamed from: i8 */
        private P2PSendFragment m45517i8(P2PSendFragment p2PSendFragment) {
            C35657p1.m105891d(p2PSendFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(p2PSendFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(p2PSendFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(p2PSendFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(p2PSendFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(p2PSendFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(p2PSendFragment, this.f36021b.m46115T7());
            return p2PSendFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: i9 */
        public C27020a m45518i9() {
            return new C27020a(new C25034b());
        }

        /* access modifiers changed from: private */
        /* renamed from: j5 */
        public C36361c m45521j5() {
            return new C36361c((C36888a) this.f36024c.f35902M.get());
        }

        /* renamed from: j6 */
        private C38903a m45522j6(C38903a aVar) {
            C38920c.m113746a(aVar, (C38923d0.C38931h) this.f36015Y0.get());
            return aVar;
        }

        /* renamed from: j7 */
        private C24019b m45523j7(C24019b bVar) {
            C35657p1.m105891d(bVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(bVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(bVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(bVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(bVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(bVar, this.f36027d.m44941t6());
            C35657p1.m105890c(bVar, this.f36021b.m46115T7());
            return bVar;
        }

        /* renamed from: j8 */
        private P2PTopUpFragment m45524j8(P2PTopUpFragment p2PTopUpFragment) {
            C35657p1.m105891d(p2PTopUpFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(p2PTopUpFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(p2PTopUpFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(p2PTopUpFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(p2PTopUpFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(p2PTopUpFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(p2PTopUpFragment, this.f36021b.m46115T7());
            C33561b.m98508a(p2PTopUpFragment, (C33568e.C33575e) this.f35997P0.get());
            return p2PTopUpFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: j9 */
        public C28464d m45525j9() {
            return new C28464d((C28248a) this.f36024c.f35931y.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: k5 */
        public C31089d m45528k5() {
            return new C31089d((C31452b) this.f36024c.f35897H.get());
        }

        /* renamed from: k6 */
        private C38960k m45529k6(C38960k kVar) {
            C35657p1.m105891d(kVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(kVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(kVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(kVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(kVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(kVar, this.f36027d.m44941t6());
            C35657p1.m105890c(kVar, this.f36021b.m46115T7());
            return kVar;
        }

        /* renamed from: k7 */
        private C20497c m45530k7(C20497c cVar) {
            C19790c.m65552a(cVar, (C37071a) this.f36033f.get());
            return cVar;
        }

        /* renamed from: k8 */
        private P2PTopUpWebViewFragment m45531k8(P2PTopUpWebViewFragment p2PTopUpWebViewFragment) {
            C35657p1.m105891d(p2PTopUpWebViewFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(p2PTopUpWebViewFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(p2PTopUpWebViewFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(p2PTopUpWebViewFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(p2PTopUpWebViewFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(p2PTopUpWebViewFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(p2PTopUpWebViewFragment, this.f36021b.m46115T7());
            C33599d.m98580a(p2PTopUpWebViewFragment, (C33593c.C33596c) this.f35999Q0.get());
            return p2PTopUpWebViewFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: k9 */
        public C39059f m45532k9() {
            return new C39059f((C39834a) this.f36021b.f36386c5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: l5 */
        public C36362d m45535l5() {
            return new C36362d((C36888a) this.f36024c.f35902M.get());
        }

        /* renamed from: l6 */
        private AddressChooserActionSheet m45536l6(AddressChooserActionSheet addressChooserActionSheet) {
            C19790c.m65552a(addressChooserActionSheet, (C37071a) this.f36033f.get());
            C13954c.m51923a(addressChooserActionSheet, (C12582l) this.f36036g.get());
            return addressChooserActionSheet;
        }

        /* renamed from: l7 */
        private GiftCardDetailsFragment m45537l7(GiftCardDetailsFragment giftCardDetailsFragment) {
            C35657p1.m105891d(giftCardDetailsFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(giftCardDetailsFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(giftCardDetailsFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(giftCardDetailsFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(giftCardDetailsFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(giftCardDetailsFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(giftCardDetailsFragment, this.f36021b.m46115T7());
            C24192b.m77930a(giftCardDetailsFragment, (C24193c.C24200c) this.f36022b0.get());
            return giftCardDetailsFragment;
        }

        /* renamed from: l8 */
        private PackageBenefitsDetailsFragment m45538l8(PackageBenefitsDetailsFragment packageBenefitsDetailsFragment) {
            C14686b.m54052a(packageBenefitsDetailsFragment, (C14687c.C14689b) this.f35982I.get());
            return packageBenefitsDetailsFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: l9 */
        public C38886q0 m45539l9() {
            return new C38886q0((C38606b) this.f36021b.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: m5 */
        public C31091f m45542m5() {
            return new C31091f((C31452b) this.f36024c.f35897H.get());
        }

        /* renamed from: m6 */
        private ApplicationNavigatorFragment m45543m6(ApplicationNavigatorFragment applicationNavigatorFragment) {
            C14474a.m53518a(applicationNavigatorFragment, (C14475b.C14477b) this.f36061r.get());
            return applicationNavigatorFragment;
        }

        /* renamed from: m7 */
        private GiftCardsChooseAmountFragment m45544m7(GiftCardsChooseAmountFragment giftCardsChooseAmountFragment) {
            C35657p1.m105891d(giftCardsChooseAmountFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(giftCardsChooseAmountFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(giftCardsChooseAmountFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(giftCardsChooseAmountFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(giftCardsChooseAmountFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(giftCardsChooseAmountFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(giftCardsChooseAmountFragment, this.f36021b.m46115T7());
            return giftCardsChooseAmountFragment;
        }

        /* renamed from: m8 */
        private PackageCancelFeedbackFragment m45545m8(PackageCancelFeedbackFragment packageCancelFeedbackFragment) {
            C35657p1.m105891d(packageCancelFeedbackFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(packageCancelFeedbackFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(packageCancelFeedbackFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(packageCancelFeedbackFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(packageCancelFeedbackFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(packageCancelFeedbackFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(packageCancelFeedbackFragment, this.f36021b.m46115T7());
            return packageCancelFeedbackFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: m9 */
        public C38888r0 m45546m9() {
            return new C38888r0((C38606b) this.f36021b.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: n5 */
        public C15363a m45549n5() {
            return new C15363a((C15707a) this.f36024c.f35932z.get());
        }

        /* renamed from: n6 */
        private ApplicationResultFragment m45550n6(ApplicationResultFragment applicationResultFragment) {
            C35657p1.m105891d(applicationResultFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(applicationResultFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(applicationResultFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(applicationResultFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(applicationResultFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(applicationResultFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(applicationResultFragment, this.f36021b.m46115T7());
            return applicationResultFragment;
        }

        /* renamed from: n7 */
        private GiftCardsChooseAnimationFragment m45551n7(GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment) {
            C35657p1.m105891d(giftCardsChooseAnimationFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(giftCardsChooseAnimationFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(giftCardsChooseAnimationFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(giftCardsChooseAnimationFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(giftCardsChooseAnimationFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(giftCardsChooseAnimationFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(giftCardsChooseAnimationFragment, this.f36021b.m46115T7());
            C24141b.m77801a(giftCardsChooseAnimationFragment, (C24142c.C24146c) this.f36019a0.get());
            return giftCardsChooseAnimationFragment;
        }

        /* renamed from: n8 */
        private PackageCancelFragment m45552n8(PackageCancelFragment packageCancelFragment) {
            C35657p1.m105891d(packageCancelFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(packageCancelFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(packageCancelFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(packageCancelFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(packageCancelFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(packageCancelFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(packageCancelFragment, this.f36021b.m46115T7());
            return packageCancelFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: n9 */
        public C38523h m45553n9() {
            return new C38523h((C38333a) this.f36024c.f35891B.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: o5 */
        public C29396d m45556o5() {
            return new C29396d((C29077c) this.f36021b.f36375b2.get());
        }

        /* renamed from: o6 */
        private C10349c m45557o6(C10349c cVar) {
            C19790c.m65552a(cVar, (C37071a) this.f36033f.get());
            C10362e.m37676a(cVar, (C10371l.C10375c) this.f36073x.get());
            return cVar;
        }

        /* renamed from: o7 */
        private GiftCardsFilterFragment m45558o7(GiftCardsFilterFragment giftCardsFilterFragment) {
            C35657p1.m105891d(giftCardsFilterFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(giftCardsFilterFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(giftCardsFilterFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(giftCardsFilterFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(giftCardsFilterFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(giftCardsFilterFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(giftCardsFilterFragment, this.f36021b.m46115T7());
            C24225a.m78008a(giftCardsFilterFragment, (C24227c.C24231c) this.f36025c0.get());
            return giftCardsFilterFragment;
        }

        /* renamed from: o8 */
        private PackageDetailsFragment m45559o8(PackageDetailsFragment packageDetailsFragment) {
            C35657p1.m105891d(packageDetailsFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(packageDetailsFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(packageDetailsFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(packageDetailsFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(packageDetailsFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(packageDetailsFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(packageDetailsFragment, this.f36021b.m46115T7());
            C14695d.m54078a(packageDetailsFragment, (C14716h.C14718b) this.f35972D.get());
            return packageDetailsFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: o9 */
        public C37457a m45560o9() {
            return new C37457a(new C39513a());
        }

        /* access modifiers changed from: private */
        /* renamed from: p5 */
        public C36732d m45563p5() {
            return new C36732d((C36356a) this.f36021b.f36517t0.get());
        }

        /* renamed from: p6 */
        private C33353a m45564p6(C33353a aVar) {
            C35657p1.m105891d(aVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(aVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(aVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(aVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(aVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(aVar, this.f36027d.m44941t6());
            C35657p1.m105890c(aVar, this.f36021b.m46115T7());
            return aVar;
        }

        /* renamed from: p7 */
        private GiftCardsFilteredOffersFragment m45565p7(GiftCardsFilteredOffersFragment giftCardsFilteredOffersFragment) {
            C35657p1.m105891d(giftCardsFilteredOffersFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(giftCardsFilteredOffersFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(giftCardsFilteredOffersFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(giftCardsFilteredOffersFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(giftCardsFilteredOffersFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(giftCardsFilteredOffersFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(giftCardsFilteredOffersFragment, this.f36021b.m46115T7());
            C24262e.m78089a(giftCardsFilteredOffersFragment, (C24263f.C24266c) this.f36028d0.get());
            return giftCardsFilteredOffersFragment;
        }

        /* renamed from: p8 */
        private PackageListFragment m45566p8(PackageListFragment packageListFragment) {
            C35657p1.m105891d(packageListFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(packageListFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(packageListFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(packageListFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(packageListFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(packageListFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(packageListFragment, this.f36021b.m46115T7());
            C14786b.m54379a(packageListFragment, (C14787c.C14789b) this.f35984J.get());
            return packageListFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: p9 */
        public C29410q m45567p9() {
            return new C29410q((C29077c) this.f36021b.f36375b2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: q5 */
        public C29823a m45570q5() {
            return new C29823a((C19270b) this.f36021b.f36301R4.get());
        }

        /* renamed from: q6 */
        private C19788a m45571q6(C19788a aVar) {
            C19790c.m65552a(aVar, (C37071a) this.f36033f.get());
            return aVar;
        }

        /* renamed from: q7 */
        private GiftCardsNominationFragment m45572q7(GiftCardsNominationFragment giftCardsNominationFragment) {
            C35657p1.m105891d(giftCardsNominationFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(giftCardsNominationFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(giftCardsNominationFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(giftCardsNominationFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(giftCardsNominationFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(giftCardsNominationFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(giftCardsNominationFragment, this.f36021b.m46115T7());
            return giftCardsNominationFragment;
        }

        /* renamed from: q8 */
        private PawnLoanFragment m45573q8(PawnLoanFragment pawnLoanFragment) {
            C32708c.m96642a(pawnLoanFragment, (C32703b.C32705b) this.f35979G0.get());
            return pawnLoanFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: q9 */
        public C38525i m45574q9() {
            return new C38525i((C38333a) this.f36024c.f35891B.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: r5 */
        public C38887r m45577r5() {
            return new C38887r((C38606b) this.f36021b.f36281P0.get());
        }

        /* renamed from: r6 */
        private C13870i m45578r6(C13870i iVar) {
            C19790c.m65552a(iVar, (C37071a) this.f36033f.get());
            return iVar;
        }

        /* renamed from: r7 */
        private GiftCardsPurchaseFragment m45579r7(GiftCardsPurchaseFragment giftCardsPurchaseFragment) {
            C35657p1.m105891d(giftCardsPurchaseFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(giftCardsPurchaseFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(giftCardsPurchaseFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(giftCardsPurchaseFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(giftCardsPurchaseFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(giftCardsPurchaseFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(giftCardsPurchaseFragment, this.f36021b.m46115T7());
            return giftCardsPurchaseFragment;
        }

        /* renamed from: r8 */
        private C31414f m45580r8(C31414f fVar) {
            C19790c.m65552a(fVar, (C37071a) this.f36033f.get());
            C31430i.m93366a(fVar, (C37978a) this.f35985J0.get());
            return fVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: r9 */
        public C29412s m45581r9() {
            return new C29412s((C29079e) this.f36024c.f35928v.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: s5 */
        public C15364b m45584s5() {
            return new C15364b((C15707a) this.f36024c.f35932z.get());
        }

        /* renamed from: s6 */
        private C17271d m45585s6(C17271d dVar) {
            C19790c.m65552a(dVar, (C37071a) this.f36033f.get());
            return dVar;
        }

        /* renamed from: s7 */
        private GiftCardsSuccessFragment m45586s7(GiftCardsSuccessFragment giftCardsSuccessFragment) {
            C35657p1.m105891d(giftCardsSuccessFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(giftCardsSuccessFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(giftCardsSuccessFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(giftCardsSuccessFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(giftCardsSuccessFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(giftCardsSuccessFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(giftCardsSuccessFragment, this.f36021b.m46115T7());
            return giftCardsSuccessFragment;
        }

        /* renamed from: s8 */
        private PiggyBankDetailsFragment m45587s8(PiggyBankDetailsFragment piggyBankDetailsFragment) {
            C35657p1.m105891d(piggyBankDetailsFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(piggyBankDetailsFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(piggyBankDetailsFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(piggyBankDetailsFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(piggyBankDetailsFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(piggyBankDetailsFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(piggyBankDetailsFragment, this.f36021b.m46115T7());
            return piggyBankDetailsFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: s9 */
        public C29413t m45588s9() {
            return new C29413t((C29079e) this.f36024c.f35928v.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: t5 */
        public C38898w m45591t5() {
            return new C38898w((C38606b) this.f36021b.f36281P0.get());
        }

        /* renamed from: t6 */
        private C29133c m45592t6(C29133c cVar) {
            C19790c.m65552a(cVar, (C37071a) this.f36033f.get());
            return cVar;
        }

        /* renamed from: t7 */
        private GooglePlayActionSheet m45593t7(GooglePlayActionSheet googlePlayActionSheet) {
            C19790c.m65552a(googlePlayActionSheet, (C37071a) this.f36033f.get());
            C24430c.m78459b(googlePlayActionSheet, this.f36021b.m46328o9());
            C24430c.m78458a(googlePlayActionSheet, (C26525e) this.f36040h0.get());
            return googlePlayActionSheet;
        }

        /* renamed from: t8 */
        private C33084i m45594t8(C33084i iVar) {
            C35657p1.m105891d(iVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(iVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(iVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(iVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(iVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(iVar, this.f36027d.m44941t6());
            C35657p1.m105890c(iVar, this.f36021b.m46115T7());
            return iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: t9 */
        public C29414u m45595t9() {
            return new C29414u((C29079e) this.f36024c.f35928v.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: u5 */
        public C19221b m45598u5() {
            return new C19221b((C38267a) this.f36021b.f36558y1.get());
        }

        /* renamed from: u6 */
        private C37868a m45599u6(C37868a aVar) {
            C37881d.m111356a(aVar, (C37885h.C37886a) this.f36023b1.get());
            return aVar;
        }

        /* renamed from: u7 */
        private C28808h m45600u7(C28808h hVar) {
            C35657p1.m105891d(hVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(hVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(hVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(hVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(hVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(hVar, this.f36027d.m44941t6());
            C35657p1.m105890c(hVar, this.f36021b.m46115T7());
            C28873j.m88469a(hVar, (C36728a) this.f36021b.f36400e3.get());
            return hVar;
        }

        /* renamed from: u8 */
        private C33092j m45601u8(C33092j jVar) {
            C35657p1.m105891d(jVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(jVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(jVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(jVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(jVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(jVar, this.f36027d.m44941t6());
            C35657p1.m105890c(jVar, this.f36021b.m46115T7());
            return jVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: u9 */
        public C29416w m45602u9() {
            return new C29416w((C29079e) this.f36024c.f35928v.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: v5 */
        public C19223d m45605v5() {
            return new C19223d((C38267a) this.f36021b.f36558y1.get());
        }

        /* renamed from: v6 */
        private C36699b m45606v6(C36699b bVar) {
            C19790c.m65552a(bVar, (C37071a) this.f36033f.get());
            C36723h.m108888a(bVar, (C36717c) this.f36026c1.get());
            return bVar;
        }

        /* renamed from: v7 */
        private C23583b m45607v7(C23583b bVar) {
            C19790c.m65552a(bVar, (C37071a) this.f36033f.get());
            return bVar;
        }

        /* renamed from: v8 */
        private C18961d m45608v8(C18961d dVar) {
            C19790c.m65552a(dVar, (C37071a) this.f36033f.get());
            return dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: v9 */
        public C38890s0 m45609v9() {
            return new C38890s0((C38606b) this.f36021b.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: w5 */
        public C19224e m45612w5() {
            return new C19224e((C38267a) this.f36021b.f36558y1.get());
        }

        /* renamed from: w6 */
        private CasDetailsFragment m45613w6(CasDetailsFragment casDetailsFragment) {
            C35657p1.m105891d(casDetailsFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(casDetailsFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(casDetailsFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(casDetailsFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(casDetailsFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(casDetailsFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(casDetailsFragment, this.f36021b.m46115T7());
            return casDetailsFragment;
        }

        /* renamed from: w7 */
        private C19650u m45614w7(C19650u uVar) {
            C19790c.m65552a(uVar, (C37071a) this.f36033f.get());
            C19665w.m65327a(uVar, (C26809g1.C26814c) this.f35994O.get());
            return uVar;
        }

        /* renamed from: w8 */
        private PolicyDetailFragment m45615w8(PolicyDetailFragment policyDetailFragment) {
            C35657p1.m105891d(policyDetailFragment, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(policyDetailFragment, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(policyDetailFragment, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(policyDetailFragment, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(policyDetailFragment, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(policyDetailFragment, this.f36027d.m44941t6());
            C35657p1.m105890c(policyDetailFragment, this.f36021b.m46115T7());
            C18406g.m62833a(policyDetailFragment, (TargetEnvironment) this.f36021b.f36216H.get());
            return policyDetailFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: w9 */
        public C19226g m45616w9() {
            return new C19226g((C38267a) this.f36021b.f36558y1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: x5 */
        public C29398f m45619x5() {
            return new C29398f((C29079e) this.f36024c.f35928v.get());
        }

        /* renamed from: x6 */
        private C33023a m45620x6(C33023a aVar) {
            C35657p1.m105891d(aVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(aVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(aVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(aVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(aVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(aVar, this.f36027d.m44941t6());
            C35657p1.m105890c(aVar, this.f36021b.m46115T7());
            return aVar;
        }

        /* renamed from: x7 */
        private C19546a0 m45621x7(C19546a0 a0Var) {
            C19790c.m65552a(a0Var, (C37071a) this.f36033f.get());
            C19584d0.m65218a(a0Var, (C26836m1.C26840b) this.f35996P.get());
            return a0Var;
        }

        /* renamed from: x8 */
        private PolicyDownloadFragment m45622x8(PolicyDownloadFragment policyDownloadFragment) {
            C18932e.m64016a(policyDownloadFragment, (TargetEnvironment) this.f36021b.f36216H.get());
            return policyDownloadFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: x9 */
        public C15371i m45623x9() {
            return new C15371i((C15707a) this.f36024c.f35932z.get(), (C20109b) this.f36066t0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: y5 */
        public C29399g m45626y5() {
            return new C29399g((C29077c) this.f36021b.f36375b2.get());
        }

        /* renamed from: y6 */
        private C28125c m45627y6(C28125c cVar) {
            C19790c.m65552a(cVar, (C37071a) this.f36033f.get());
            return cVar;
        }

        /* renamed from: y7 */
        private C19590g0 m45628y7(C19590g0 g0Var) {
            C19790c.m65552a(g0Var, (C37071a) this.f36033f.get());
            C19607i0.m65245a(g0Var, (C26861t1.C26867c) this.f35998Q.get());
            return g0Var;
        }

        /* renamed from: y8 */
        private C27113k m45629y8(C27113k kVar) {
            C27126m.m84076a(kVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            return kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: y9 */
        public C24836a m45630y9() {
            return new C24836a((C20576a) this.f36021b.f36362Z4.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: z5 */
        public C29400h m45633z5() {
            return new C29400h((C29079e) this.f36024c.f35928v.get());
        }

        /* renamed from: z6 */
        private C38311f m45634z6(C38311f fVar) {
            C35657p1.m105891d(fVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(fVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(fVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(fVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(fVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(fVar, this.f36027d.m44941t6());
            C35657p1.m105890c(fVar, this.f36021b.m46115T7());
            C38313h.m112592b(fVar, this.f36027d.m44941t6());
            C38313h.m112591a(fVar, (C26144b) this.f36027d.f35746Z.get());
            return fVar;
        }

        /* renamed from: z7 */
        private C19611k0 m45635z7(C19611k0 k0Var) {
            C19790c.m65552a(k0Var, (C37071a) this.f36033f.get());
            C19627m0.m65268a(k0Var, (C26771a2.C26773b) this.f36002S.get());
            return k0Var;
        }

        /* renamed from: z8 */
        private C34332b m45636z8(C34332b bVar) {
            C35657p1.m105891d(bVar, (BankApi) this.f36021b.f36405f0.get());
            C35657p1.m105892e(bVar, (RootBankApiManager) this.f36021b.f36413g0.get());
            C35657p1.m105888a(bVar, (EventBusWrapper) this.f36021b.f36245K4.get());
            C35657p1.m105893f(bVar, (Client) this.f36021b.f36389d0.get());
            C35657p1.m105894g(bVar, (PreferencesApiManager) this.f36021b.f36224I.get());
            C35657p1.m105889b(bVar, this.f36027d.m44941t6());
            C35657p1.m105890c(bVar, this.f36021b.m46115T7());
            return bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: z9 */
        public C28465e m45637z9() {
            return new C28465e((C28248a) this.f36024c.f35931y.get());
        }

        /* renamed from: A */
        public void mo32583A(C16815b bVar) {
            m45474c7(bVar);
        }

        /* renamed from: A0 */
        public void mo32584A0(C19788a aVar) {
            m45571q6(aVar);
        }

        /* renamed from: A1 */
        public void mo32585A1(SelectInsuranceCardActionSheet selectInsuranceCardActionSheet) {
        }

        /* renamed from: A2 */
        public void mo32586A2(C35025d dVar) {
            m45427V8(dVar);
        }

        /* renamed from: B */
        public void mo32587B(C35612i1 i1Var) {
            m45287A8(i1Var);
        }

        /* renamed from: B0 */
        public void mo32588B0(SelectInsurancePackageActionSheet selectInsurancePackageActionSheet) {
        }

        /* renamed from: B1 */
        public void mo32589B1(C18443d dVar) {
            m45337I6(dVar);
        }

        /* renamed from: B2 */
        public void mo32590B2(C38311f fVar) {
            m45634z6(fVar);
        }

        /* renamed from: C */
        public void mo32591C(EditPackageConfirmationActionSheet editPackageConfirmationActionSheet) {
            m45467b7(editPackageConfirmationActionSheet);
        }

        /* renamed from: C0 */
        public void mo32592C0(CombinedOfferFirstStepFragment combinedOfferFirstStepFragment) {
            m45362M6(combinedOfferFirstStepFragment);
        }

        /* renamed from: C1 */
        public void mo32593C1(C19417a aVar) {
            m45440X7(aVar);
        }

        /* renamed from: C2 */
        public void mo32594C2(C38660f fVar) {
            m45411T6(fVar);
        }

        /* renamed from: D */
        public void mo32595D(InsuranceActivationDateInputFragment insuranceActivationDateInputFragment) {
        }

        /* renamed from: D0 */
        public void mo32596D0(C38406d dVar) {
            m45404S6(dVar);
        }

        /* renamed from: D1 */
        public void mo32597D1(C31397b bVar) {
            m45384P7(bVar);
        }

        /* renamed from: D2 */
        public void mo32598D2(C33055d dVar) {
            m45349K6(dVar);
        }

        /* renamed from: E */
        public void mo32599E(C31522b bVar) {
            m45502g7(bVar);
        }

        /* renamed from: E0 */
        public void mo32600E0(CarNumberInputFragment carNumberInputFragment) {
        }

        /* renamed from: E1 */
        public void mo32601E1(C19300h hVar) {
            m45307D7(hVar);
        }

        /* renamed from: E2 */
        public void mo32602E2(C15257d dVar) {
        }

        /* renamed from: F */
        public void mo32603F(C18240p pVar) {
            m45475c8(pVar);
        }

        /* renamed from: F0 */
        public void mo32604F0(GiftCardsNominationFragment giftCardsNominationFragment) {
            m45572q7(giftCardsNominationFragment);
        }

        /* renamed from: F1 */
        public void mo32605F1(C15108l lVar) {
            m45294B8(lVar);
        }

        /* renamed from: F2 */
        public void mo32606F2(CarOwnerInputFragment carOwnerInputFragment) {
        }

        /* renamed from: G */
        public void mo32607G(C39968f fVar) {
            m45398R7(fVar);
        }

        /* renamed from: G0 */
        public void mo32608G0(P2PHelpFragment p2PHelpFragment) {
            m45489e8(p2PHelpFragment);
        }

        /* renamed from: G1 */
        public void mo32609G1(C23494d dVar) {
        }

        /* renamed from: G2 */
        public void mo32610G2(C19292b bVar) {
            m45331H6(bVar);
        }

        /* renamed from: H */
        public void mo32611H(CombinedOfferSecondStepFragment combinedOfferSecondStepFragment) {
            m45369N6(combinedOfferSecondStepFragment);
        }

        /* renamed from: H0 */
        public void mo32612H0(C19631o0 o0Var) {
            m45293B7(o0Var);
        }

        /* renamed from: H1 */
        public void mo32613H1(C33072h hVar) {
            m45461a8(hVar);
        }

        /* renamed from: H2 */
        public void mo32614H2(ClosePiggyBankActionSheet closePiggyBankActionSheet) {
            m45343J6(closePiggyBankActionSheet);
        }

        /* renamed from: I */
        public void mo32615I(C24731c cVar) {
            m45301C8(cVar);
        }

        /* renamed from: I0 */
        public void mo32616I0(InsuranceConditionsFragment insuranceConditionsFragment) {
        }

        /* renamed from: I1 */
        public void mo32617I1(C19590g0 g0Var) {
            m45628y7(g0Var);
        }

        /* renamed from: I2 */
        public void mo32618I2(SavingGoalChooserActionSheet savingGoalChooserActionSheet) {
            m45357L8(savingGoalChooserActionSheet);
        }

        /* renamed from: J */
        public void mo32619J(C28808h hVar) {
            m45600u7(hVar);
        }

        /* renamed from: J0 */
        public void mo32620J0(PackageListFragment packageListFragment) {
            m45566p8(packageListFragment);
        }

        /* renamed from: J1 */
        public void mo32621J1(C24955f fVar) {
            m45480d6(fVar);
        }

        /* renamed from: J2 */
        public void mo32622J2(C14643c cVar) {
            m45490e9(cVar);
        }

        /* renamed from: K */
        public void mo32623K(GiftCardsFilterFragment giftCardsFilterFragment) {
            m45558o7(giftCardsFilterFragment);
        }

        /* renamed from: K0 */
        public void mo32624K0(C34332b bVar) {
            m45636z8(bVar);
        }

        /* renamed from: K1 */
        public void mo32625K1(C34709c cVar) {
            m45399R8(cVar);
        }

        /* renamed from: K2 */
        public void mo32626K2(C29932d dVar) {
            m45412T7(dVar);
        }

        /* renamed from: L */
        public void mo32627L(C36657c cVar) {
            m45292B6(cVar);
        }

        /* renamed from: L0 */
        public void mo32628L0(C33362b bVar) {
            m45376O6(bVar);
        }

        /* renamed from: L1 */
        public void mo32629L1(C38903a aVar) {
            m45522j6(aVar);
        }

        /* renamed from: L2 */
        public void mo32630L2(PackageBenefitsDetailsFragment packageBenefitsDetailsFragment) {
            m45538l8(packageBenefitsDetailsFragment);
        }

        /* renamed from: M */
        public void mo32631M(C34750a aVar) {
        }

        /* renamed from: M0 */
        public void mo32632M0(C33084i iVar) {
            m45594t8(iVar);
        }

        /* renamed from: M1 */
        public void mo32633M1(C27165f fVar) {
            m45419U7(fVar);
        }

        /* renamed from: N */
        public void mo32634N(C25725b bVar) {
        }

        /* renamed from: N0 */
        public void mo32635N0(PolicyDetailsFragment policyDetailsFragment) {
        }

        /* renamed from: N1 */
        public void mo32636N1(SelectTransportCardPassTypeDialogFragment selectTransportCardPassTypeDialogFragment) {
            m45385P8(selectTransportCardPassTypeDialogFragment);
        }

        /* renamed from: O */
        public void mo32637O(C37137d dVar) {
            m45327G8(dVar);
        }

        /* renamed from: O0 */
        public void mo32638O0(C31846a aVar) {
            m45306D6(aVar);
        }

        /* renamed from: O1 */
        public void mo32639O1(C36282f fVar) {
            m45515i6(fVar);
        }

        /* renamed from: P */
        public void mo32640P(C31226f fVar) {
            m45371N8(fVar);
        }

        /* renamed from: P0 */
        public void mo32641P0(C39992d dVar) {
            m45460a7(dVar);
        }

        /* renamed from: P1 */
        public void mo32642P1(IncomeSourceSelectorFragment incomeSourceSelectorFragment) {
            m45286A7(incomeSourceSelectorFragment);
        }

        /* renamed from: Q */
        public void mo32643Q(C23023l lVar) {
            m45351K8(lVar);
        }

        /* renamed from: Q0 */
        public void mo32644Q0(C19650u uVar) {
            m45614w7(uVar);
        }

        /* renamed from: Q1 */
        public void mo32645Q1(C17271d dVar) {
            m45585s6(dVar);
        }

        /* renamed from: R */
        public void mo32646R(C18961d dVar) {
            m45608v8(dVar);
        }

        /* renamed from: R0 */
        public void mo32647R0(GiftCardsChooseAmountFragment giftCardsChooseAmountFragment) {
            m45544m7(giftCardsChooseAmountFragment);
        }

        /* renamed from: R1 */
        public void mo32648R1(C25465c cVar) {
        }

        /* renamed from: S */
        public void mo32649S(LoansHistoryGraphicsFragment loansHistoryGraphicsFragment) {
            m45405S7(loansHistoryGraphicsFragment);
        }

        /* renamed from: S0 */
        public void mo32650S0(PackageDetailsFragment packageDetailsFragment) {
            m45559o8(packageDetailsFragment);
        }

        /* renamed from: S1 */
        public void mo32651S1(C18188b0 b0Var) {
            m45482d8(b0Var);
        }

        /* renamed from: T */
        public void mo32652T(C19567d dVar) {
            m45325G6(dVar);
        }

        /* renamed from: T0 */
        public void mo32653T0(DepositProlongationResultFragment depositProlongationResultFragment) {
            m45439X6(depositProlongationResultFragment);
        }

        /* renamed from: T1 */
        public void mo26988T1(C10349c cVar) {
            m45557o6(cVar);
        }

        /* renamed from: U */
        public void mo32654U(ChooseCardDialogFragment chooseCardDialogFragment) {
            m45313E6(chooseCardDialogFragment);
        }

        /* renamed from: U0 */
        public void mo32655U0(C23966b bVar) {
            m45455Z8(bVar);
        }

        /* renamed from: U1 */
        public void mo32656U1(C31752k kVar) {
            m45363M7(kVar);
        }

        /* renamed from: V */
        public void mo32657V(DepositProlongationMainFragment depositProlongationMainFragment) {
            m45432W6(depositProlongationMainFragment);
        }

        /* renamed from: V0 */
        public void mo32658V0(C33374e eVar) {
        }

        /* renamed from: V1 */
        public void mo32659V1(C18465f fVar) {
            m45300C7(fVar);
        }

        /* renamed from: W */
        public void mo32660W(LoanDetailsFragment loanDetailsFragment) {
            m45370N7(loanDetailsFragment);
        }

        /* renamed from: W0 */
        public void mo32661W0(C20497c cVar) {
            m45530k7(cVar);
        }

        /* renamed from: W1 */
        public void mo32662W1(C23583b bVar) {
            m45607v7(bVar);
        }

        /* renamed from: X */
        public void mo32663X(C29372b bVar) {
        }

        /* renamed from: X0 */
        public void mo27205X0(RegisterMtplPolicyFragment registerMtplPolicyFragment) {
        }

        /* renamed from: X1 */
        public void mo32664X1(ApplicationNavigatorFragment applicationNavigatorFragment) {
            m45543m6(applicationNavigatorFragment);
        }

        /* renamed from: Y */
        public void mo32665Y(PackageCancelFeedbackFragment packageCancelFeedbackFragment) {
            m45545m8(packageCancelFeedbackFragment);
        }

        /* renamed from: Y0 */
        public void mo32666Y0(C26457a aVar) {
        }

        /* renamed from: Y1 */
        public void mo32667Y1(PawnLoanFragment pawnLoanFragment) {
            m45573q8(pawnLoanFragment);
        }

        /* renamed from: Z */
        public void mo32668Z(P2PLinkGenerationFragment p2PLinkGenerationFragment) {
            m45496f8(p2PLinkGenerationFragment);
        }

        /* renamed from: Z0 */
        public void mo32669Z0(C29133c cVar) {
            m45592t6(cVar);
        }

        /* renamed from: Z1 */
        public void mo32670Z1(DdStoIntroFragment ddStoIntroFragment) {
            m45418U6(ddStoIntroFragment);
        }

        /* renamed from: a */
        public C17766a.C17769c mo32671a() {
            return this.f36027d.mo32451a();
        }

        /* renamed from: a0 */
        public void mo32672a0(C27612f fVar) {
        }

        /* renamed from: a1 */
        public void mo32673a1(C37025c cVar) {
            m45299C6(cVar);
        }

        /* renamed from: a2 */
        public void mo32674a2(StoryGroupFragment storyGroupFragment) {
            m45420U8(storyGroupFragment);
        }

        /* renamed from: b */
        public void mo32675b(InsuranceProviderListFragment insuranceProviderListFragment) {
        }

        /* renamed from: b0 */
        public void mo32676b0(C36699b bVar) {
            m45606v6(bVar);
        }

        /* renamed from: b1 */
        public void mo32677b1(C25515c cVar) {
            m45356L7(cVar);
        }

        /* renamed from: b2 */
        public void mo32678b2(ChooseAccountDialogFragment chooseAccountDialogFragment) {
        }

        /* renamed from: c */
        public void mo32679c(GiftCardsChooseAnimationFragment giftCardsChooseAnimationFragment) {
            m45551n7(giftCardsChooseAnimationFragment);
        }

        /* renamed from: c0 */
        public void mo32680c0(C34761c cVar) {
        }

        /* renamed from: c1 */
        public void mo32681c1(InsuranceSummaryFragment insuranceSummaryFragment) {
            m45338I7(insuranceSummaryFragment);
        }

        /* renamed from: c2 */
        public void mo32682c2(ActivationFormFragment activationFormFragment) {
            m45508h6(activationFormFragment);
        }

        /* renamed from: d */
        public void mo32683d(C35606h0 h0Var) {
            m45425V6(h0Var);
        }

        /* renamed from: d0 */
        public void mo32684d0(C38427a aVar) {
            m45473c6(aVar);
        }

        /* renamed from: d1 */
        public void mo32685d1(TermsAndConditionsFragment termsAndConditionsFragment) {
            m45448Y8(termsAndConditionsFragment);
        }

        /* renamed from: d2 */
        public void mo32686d2(GiftCardDetailsFragment giftCardDetailsFragment) {
            m45537l7(giftCardDetailsFragment);
        }

        /* renamed from: e */
        public void mo32687e(OffersAndApplicationsDetailsFragment offersAndApplicationsDetailsFragment) {
            m45447Y7(offersAndApplicationsDetailsFragment);
        }

        /* renamed from: e0 */
        public void mo32688e0(PolicyDownloadFragment policyDownloadFragment) {
            m45622x8(policyDownloadFragment);
        }

        /* renamed from: e1 */
        public void mo32689e1(TravelInsuranceSuccessFragment travelInsuranceSuccessFragment) {
            m45483d9(travelInsuranceSuccessFragment);
        }

        /* renamed from: e2 */
        public void mo32690e2(C13870i iVar) {
            m45578r6(iVar);
        }

        /* renamed from: f */
        public void mo32691f(CitySelectorActionSheet citySelectorActionSheet) {
            m45319F6(citySelectorActionSheet);
        }

        /* renamed from: f0 */
        public void mo32692f0(P2PLinkRouterFragment p2PLinkRouterFragment) {
            m45503g8(p2PLinkRouterFragment);
        }

        /* renamed from: f1 */
        public void mo32693f1(C26098b bVar) {
        }

        /* renamed from: f2 */
        public void mo32694f2(C30010c cVar) {
            m45434W8(cVar);
        }

        /* renamed from: g */
        public void mo32695g(C29507n nVar) {
            m45344J7(nVar);
        }

        /* renamed from: g0 */
        public void mo32696g0(GiftCardsFilteredOffersFragment giftCardsFilteredOffersFragment) {
            m45565p7(giftCardsFilteredOffersFragment);
        }

        /* renamed from: g1 */
        public void mo32697g1(CountrySelectorActionSheet countrySelectorActionSheet) {
            m45383P6(countrySelectorActionSheet);
        }

        /* renamed from: g2 */
        public void mo32698g2(C18421c cVar) {
            m45481d7(cVar);
        }

        /* renamed from: h */
        public void mo32699h(C35651n1 n1Var) {
            m45345J8(n1Var);
        }

        /* renamed from: h0 */
        public void mo32700h0(P2PLinkSharingFragment p2PLinkSharingFragment) {
            m45510h8(p2PLinkSharingFragment);
        }

        /* renamed from: h1 */
        public void mo32701h1(C33023a aVar) {
            m45620x6(aVar);
        }

        /* renamed from: h2 */
        public void mo32702h2(PackageCancelFragment packageCancelFragment) {
            m45552n8(packageCancelFragment);
        }

        /* renamed from: i */
        public void mo32703i(RepaymentSuccessFragment repaymentSuccessFragment) {
            m45339I8(repaymentSuccessFragment);
        }

        /* renamed from: i0 */
        public void mo32704i0(ApplicationResultFragment applicationResultFragment) {
            m45550n6(applicationResultFragment);
        }

        /* renamed from: i1 */
        public void mo32705i1(JobPositionSelectorActionSheet jobPositionSelectorActionSheet) {
        }

        /* renamed from: i2 */
        public void mo32706i2(InsuranceProvidersFragment insuranceProvidersFragment) {
            m45332H7(insuranceProvidersFragment);
        }

        public void injectMoreFragment(MoreFragment moreFragment) {
            m45426V7(moreFragment);
        }

        /* renamed from: j */
        public void mo32708j(C37868a aVar) {
            m45599u6(aVar);
        }

        /* renamed from: j0 */
        public void mo32709j0(C36029g gVar) {
            m45308D8(gVar);
        }

        /* renamed from: j1 */
        public void mo32710j1(C31977d dVar) {
            m45326G7(dVar);
        }

        /* renamed from: j2 */
        public void mo32711j2(C24991g gVar) {
            m45509h7(gVar);
        }

        /* renamed from: k */
        public void mo32712k(TransportCardInfoFragment transportCardInfoFragment) {
            m45469b9(transportCardInfoFragment);
        }

        /* renamed from: k0 */
        public void mo32713k0(C21092b bVar) {
            m45314E7(bVar);
        }

        /* renamed from: k1 */
        public void mo32714k1(C18220m mVar) {
            m45468b8(mVar);
        }

        /* renamed from: k2 */
        public void mo32715k2(RepaymentFragment repaymentFragment) {
            m45333H8(repaymentFragment);
        }

        /* renamed from: l */
        public void mo32716l(C27113k kVar) {
            m45629y8(kVar);
        }

        /* renamed from: l0 */
        public void mo32717l0(C19611k0 k0Var) {
            m45635z7(k0Var);
        }

        /* renamed from: l1 */
        public void mo32718l1(GiftCardsSuccessFragment giftCardsSuccessFragment) {
            m45586s7(giftCardsSuccessFragment);
        }

        /* renamed from: l2 */
        public void mo32719l2(C34217d dVar) {
            m45391Q7(dVar);
        }

        /* renamed from: m */
        public void mo32720m(C28125c cVar) {
            m45627y6(cVar);
        }

        /* renamed from: m0 */
        public C17611g mo32183m0() {
            return new C12281o(this.f36021b, this.f36024c, this.f36027d, this.f36030e);
        }

        /* renamed from: m1 */
        public void mo32721m1(TravelInsuranceDetailsFragment travelInsuranceDetailsFragment) {
            m45476c9(travelInsuranceDetailsFragment);
        }

        /* renamed from: m2 */
        public void mo32722m2(P2PSendFragment p2PSendFragment) {
            m45517i8(p2PSendFragment);
        }

        /* renamed from: n */
        public void mo32723n(C33092j jVar) {
            m45601u8(jVar);
        }

        /* renamed from: n0 */
        public void mo32724n0(C37846d dVar) {
            m45397R6(dVar);
        }

        /* renamed from: n1 */
        public void mo32725n1(C39565o oVar) {
            m45406S8(oVar);
        }

        /* renamed from: n2 */
        public void mo32726n2(C29108a aVar) {
            m45462a9(aVar);
        }

        /* renamed from: o */
        public void mo32727o(PiggyBankDetailsFragment piggyBankDetailsFragment) {
            m45587s8(piggyBankDetailsFragment);
        }

        /* renamed from: o0 */
        public void mo32728o0(C26967l lVar) {
        }

        /* renamed from: o1 */
        public void mo32729o1(C33353a aVar) {
            m45564p6(aVar);
        }

        /* renamed from: o2 */
        public void mo32730o2(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment) {
            m45378O8(selectTransportCardDetailsFragment);
        }

        /* renamed from: p */
        public void mo32731p(PolicyDetailFragment policyDetailFragment) {
            m45615w8(policyDetailFragment);
        }

        /* renamed from: p0 */
        public void mo32732p0(SecondStageFragment secondStageFragment) {
            m45364M8(secondStageFragment);
        }

        /* renamed from: p1 */
        public void mo32733p1(C19546a0 a0Var) {
            m45621x7(a0Var);
        }

        /* renamed from: p2 */
        public void mo32734p2(C19305k kVar) {
            m45433W7(kVar);
        }

        /* renamed from: q */
        public void mo32735q(C35669t tVar) {
            m45390Q6(tVar);
        }

        /* renamed from: q0 */
        public void mo32736q0(FirstStageFragment firstStageFragment) {
            m45495f7(firstStageFragment);
        }

        /* renamed from: q1 */
        public void mo32737q1(C30036e eVar) {
        }

        /* renamed from: q2 */
        public void mo32738q2(GiftCardsPurchaseFragment giftCardsPurchaseFragment) {
            m45579r7(giftCardsPurchaseFragment);
        }

        /* renamed from: r */
        public void mo32739r(AddressChooserActionSheet addressChooserActionSheet) {
            m45536l6(addressChooserActionSheet);
        }

        /* renamed from: r0 */
        public void mo32740r0(C38174g gVar) {
            m45446Y6(gVar);
        }

        /* renamed from: r1 */
        public void mo32741r1(C33465b bVar) {
            m45454Z7(bVar);
        }

        /* renamed from: r2 */
        public void mo32742r2(C23939a aVar) {
            m45516i7(aVar);
        }

        /* renamed from: s */
        public void mo32743s(C24019b bVar) {
            m45523j7(bVar);
        }

        /* renamed from: s0 */
        public void mo32744s0(P2PTopUpFragment p2PTopUpFragment) {
            m45524j8(p2PTopUpFragment);
        }

        /* renamed from: s1 */
        public void mo32745s1(SetConciergeResultFragment setConciergeResultFragment) {
        }

        /* renamed from: s2 */
        public void mo32746s2(C18648c cVar) {
        }

        /* renamed from: t */
        public void mo32747t(C26476g gVar) {
        }

        /* renamed from: t0 */
        public void mo32748t0(C33635a aVar) {
            m45285A6(aVar);
        }

        /* renamed from: t1 */
        public void mo32749t1(C15418d dVar) {
            m45413T8(dVar);
        }

        /* renamed from: t2 */
        public void mo32750t2(C19108c cVar) {
            m45392Q8(cVar);
        }

        /* renamed from: u */
        public void mo32751u(SuccessTransportCardFragment successTransportCardFragment) {
            m45441X8(successTransportCardFragment);
        }

        /* renamed from: u0 */
        public void mo32752u0(FillOtherPersonInsuranceInfo fillOtherPersonInsuranceInfo) {
            m45488e7(fillOtherPersonInsuranceInfo);
        }

        /* renamed from: u1 */
        public void mo32753u1(C36497d dVar) {
            m45321F8(dVar);
        }

        /* renamed from: u2 */
        public void mo32754u2(C29056b bVar) {
        }

        /* renamed from: v */
        public void mo32755v(IdentityDataInputFragment identityDataInputFragment) {
        }

        /* renamed from: v0 */
        public void mo32756v0(C38960k kVar) {
            m45529k6(kVar);
        }

        /* renamed from: v1 */
        public void mo32757v1(C23824d dVar) {
        }

        /* renamed from: v2 */
        public void mo32758v2(C31566b bVar) {
            m45494f6(bVar);
        }

        /* renamed from: w */
        public void mo32759w(P2PTopUpWebViewFragment p2PTopUpWebViewFragment) {
            m45531k8(p2PTopUpWebViewFragment);
        }

        /* renamed from: w0 */
        public void mo32760w0(PassMigrateActionSheet passMigrateActionSheet) {
        }

        /* renamed from: w1 */
        public void mo32761w1(GooglePlayActionSheet googlePlayActionSheet) {
            m45593t7(googlePlayActionSheet);
        }

        /* renamed from: w2 */
        public void mo32762w2(C28886f fVar) {
            m45350K7(fVar);
        }

        /* renamed from: x */
        public void mo32763x(C38686x xVar) {
        }

        /* renamed from: x0 */
        public void mo32764x0(OccupationInputFragment occupationInputFragment) {
        }

        /* renamed from: x1 */
        public void mo32765x1(CasDetailsFragment casDetailsFragment) {
            m45613w6(casDetailsFragment);
        }

        /* renamed from: x2 */
        public void mo32766x2(ActivationDetailsFragment activationDetailsFragment) {
            m45501g6(activationDetailsFragment);
        }

        /* renamed from: y */
        public void mo32767y(ClosePiggyBankFragment closePiggyBankFragment) {
            m45355L6(closePiggyBankFragment);
        }

        /* renamed from: y0 */
        public void mo32768y0(C25143e eVar) {
            m45487e6(eVar);
        }

        /* renamed from: y1 */
        public void mo32769y1(C24054a aVar) {
            m45453Z6(aVar);
        }

        /* renamed from: y2 */
        public void mo32770y2(C38977m0 m0Var) {
            m45315E8(m0Var);
        }

        /* renamed from: z */
        public void mo32771z(C31414f fVar) {
            m45580r8(fVar);
        }

        /* renamed from: z0 */
        public void mo32772z0(C25233b bVar) {
            m45320F7(bVar);
        }

        /* renamed from: z1 */
        public void mo32773z1(SelectTransportCardPassDevicesDialogFragment selectTransportCardPassDevicesDialogFragment) {
        }

        /* renamed from: z2 */
        public void mo32774z2(C31772c cVar) {
            m45377O7(cVar);
        }

        private C12196g(C12272j jVar, C12192d dVar, C12144b bVar, Fragment fragment) {
            this.f36030e = this;
            this.f36021b = jVar;
            this.f36024c = dVar;
            this.f36027d = bVar;
            this.f36018a = fragment;
            m45459a6(fragment);
            m45466b6(fragment);
        }
    }

    /* renamed from: dk.b$h */
    private static final class C12270h implements C17608d {

        /* renamed from: a */
        private final C12272j f36156a;

        /* renamed from: b */
        private Service f36157b;

        /* renamed from: c */
        public C12311w mo32845a() {
            C18329d.m62674a(this.f36157b, Service.class);
            return new C12271i(this.f36156a, this.f36157b);
        }

        /* renamed from: d */
        public C12270h mo32846b(Service service) {
            this.f36157b = (Service) C18329d.m62675b(service);
            return this;
        }

        private C12270h(C12272j jVar) {
            this.f36156a = jVar;
        }
    }

    /* renamed from: dk.b$i */
    private static final class C12271i extends C12311w {

        /* renamed from: a */
        private final C12272j f36158a;

        /* renamed from: b */
        private final C12271i f36159b;

        /* renamed from: c */
        private CommonDataSyncService m45913c(CommonDataSyncService commonDataSyncService) {
            C34843d.m102336a(commonDataSyncService, (RootBankApiManager) this.f36158a.f36413g0.get());
            C34843d.m102337b(commonDataSyncService, (PreferencesApiManager) this.f36158a.f36224I.get());
            return commonDataSyncService;
        }

        /* renamed from: d */
        private C34566c m45914d(C34566c cVar) {
            C34567d.m101387a(cVar, (EventBusWrapper) this.f36158a.f36245K4.get());
            C34567d.m101388b(cVar, (PreferencesApiManager) this.f36158a.f36224I.get());
            return cVar;
        }

        /* renamed from: a */
        public void mo32849a(C34566c cVar) {
            m45914d(cVar);
        }

        /* renamed from: b */
        public void mo32850b(CommonDataSyncService commonDataSyncService) {
            m45913c(commonDataSyncService);
        }

        private C12271i(C12272j jVar, Service service) {
            this.f36159b = this;
            this.f36158a = jVar;
        }
    }

    /* renamed from: dk.b$j */
    private static final class C12272j extends C12312x {

        /* renamed from: A */
        private final C12272j f36160A;

        /* renamed from: A0 */
        private C41084a f36161A0;
        /* access modifiers changed from: private */

        /* renamed from: A1 */
        public C41084a f36162A1;
        /* access modifiers changed from: private */

        /* renamed from: A2 */
        public C41084a f36163A2;
        /* access modifiers changed from: private */

        /* renamed from: A3 */
        public C41084a f36164A3;
        /* access modifiers changed from: private */

        /* renamed from: A4 */
        public C41084a f36165A4;
        /* access modifiers changed from: private */

        /* renamed from: A5 */
        public C41084a f36166A5;
        /* access modifiers changed from: private */

        /* renamed from: A6 */
        public C41084a f36167A6;
        /* access modifiers changed from: private */

        /* renamed from: B */
        public C41084a f36168B;
        /* access modifiers changed from: private */

        /* renamed from: B0 */
        public C41084a f36169B0;
        /* access modifiers changed from: private */

        /* renamed from: B1 */
        public C41084a f36170B1;
        /* access modifiers changed from: private */

        /* renamed from: B2 */
        public C41084a f36171B2;
        /* access modifiers changed from: private */

        /* renamed from: B3 */
        public C41084a f36172B3;
        /* access modifiers changed from: private */

        /* renamed from: B4 */
        public C41084a f36173B4;
        /* access modifiers changed from: private */

        /* renamed from: B5 */
        public C41084a f36174B5;
        /* access modifiers changed from: private */

        /* renamed from: B6 */
        public C41084a f36175B6;
        /* access modifiers changed from: private */

        /* renamed from: C */
        public C41084a f36176C;
        /* access modifiers changed from: private */

        /* renamed from: C0 */
        public C41084a f36177C0;
        /* access modifiers changed from: private */

        /* renamed from: C1 */
        public C41084a f36178C1;
        /* access modifiers changed from: private */

        /* renamed from: C2 */
        public C41084a f36179C2;
        /* access modifiers changed from: private */

        /* renamed from: C3 */
        public C41084a f36180C3;
        /* access modifiers changed from: private */

        /* renamed from: C4 */
        public C41084a f36181C4;
        /* access modifiers changed from: private */

        /* renamed from: C5 */
        public C41084a f36182C5;

        /* renamed from: C6 */
        private C41084a f36183C6;
        /* access modifiers changed from: private */

        /* renamed from: D */
        public C41084a f36184D;
        /* access modifiers changed from: private */

        /* renamed from: D0 */
        public C41084a f36185D0;
        /* access modifiers changed from: private */

        /* renamed from: D1 */
        public C41084a f36186D1;
        /* access modifiers changed from: private */

        /* renamed from: D2 */
        public C41084a f36187D2;
        /* access modifiers changed from: private */

        /* renamed from: D3 */
        public C41084a f36188D3;
        /* access modifiers changed from: private */

        /* renamed from: D4 */
        public C41084a f36189D4;
        /* access modifiers changed from: private */

        /* renamed from: D5 */
        public C41084a f36190D5;
        /* access modifiers changed from: private */

        /* renamed from: D6 */
        public C41084a f36191D6;
        /* access modifiers changed from: private */

        /* renamed from: E */
        public C41084a f36192E;
        /* access modifiers changed from: private */

        /* renamed from: E0 */
        public C41084a f36193E0;
        /* access modifiers changed from: private */

        /* renamed from: E1 */
        public C41084a f36194E1;
        /* access modifiers changed from: private */

        /* renamed from: E2 */
        public C41084a f36195E2;
        /* access modifiers changed from: private */

        /* renamed from: E3 */
        public C41084a f36196E3;
        /* access modifiers changed from: private */

        /* renamed from: E4 */
        public C41084a f36197E4;

        /* renamed from: E5 */
        private C41084a f36198E5;
        /* access modifiers changed from: private */

        /* renamed from: E6 */
        public C41084a f36199E6;
        /* access modifiers changed from: private */

        /* renamed from: F */
        public C41084a f36200F;
        /* access modifiers changed from: private */

        /* renamed from: F0 */
        public C41084a f36201F0;
        /* access modifiers changed from: private */

        /* renamed from: F1 */
        public C41084a f36202F1;
        /* access modifiers changed from: private */

        /* renamed from: F2 */
        public C41084a f36203F2;
        /* access modifiers changed from: private */

        /* renamed from: F3 */
        public C41084a f36204F3;
        /* access modifiers changed from: private */

        /* renamed from: F4 */
        public C41084a f36205F4;
        /* access modifiers changed from: private */

        /* renamed from: F5 */
        public C41084a f36206F5;
        /* access modifiers changed from: private */

        /* renamed from: F6 */
        public C41084a f36207F6;
        /* access modifiers changed from: private */

        /* renamed from: G */
        public C41084a f36208G;
        /* access modifiers changed from: private */

        /* renamed from: G0 */
        public C41084a f36209G0;
        /* access modifiers changed from: private */

        /* renamed from: G1 */
        public C41084a f36210G1;
        /* access modifiers changed from: private */

        /* renamed from: G2 */
        public C41084a f36211G2;
        /* access modifiers changed from: private */

        /* renamed from: G3 */
        public C41084a f36212G3;
        /* access modifiers changed from: private */

        /* renamed from: G4 */
        public C41084a f36213G4;
        /* access modifiers changed from: private */

        /* renamed from: G5 */
        public C41084a f36214G5;

        /* renamed from: G6 */
        private C41084a f36215G6;
        /* access modifiers changed from: private */

        /* renamed from: H */
        public C41084a f36216H;
        /* access modifiers changed from: private */

        /* renamed from: H0 */
        public C41084a f36217H0;
        /* access modifiers changed from: private */

        /* renamed from: H1 */
        public C41084a f36218H1;
        /* access modifiers changed from: private */

        /* renamed from: H2 */
        public C41084a f36219H2;
        /* access modifiers changed from: private */

        /* renamed from: H3 */
        public C41084a f36220H3;
        /* access modifiers changed from: private */

        /* renamed from: H4 */
        public C41084a f36221H4;
        /* access modifiers changed from: private */

        /* renamed from: H5 */
        public C41084a f36222H5;
        /* access modifiers changed from: private */

        /* renamed from: H6 */
        public C41084a f36223H6;
        /* access modifiers changed from: private */

        /* renamed from: I */
        public C41084a f36224I;
        /* access modifiers changed from: private */

        /* renamed from: I0 */
        public C41084a f36225I0;
        /* access modifiers changed from: private */

        /* renamed from: I1 */
        public C41084a f36226I1;
        /* access modifiers changed from: private */

        /* renamed from: I2 */
        public C41084a f36227I2;
        /* access modifiers changed from: private */

        /* renamed from: I3 */
        public C41084a f36228I3;
        /* access modifiers changed from: private */

        /* renamed from: I4 */
        public C41084a f36229I4;

        /* renamed from: I5 */
        private C41084a f36230I5;
        /* access modifiers changed from: private */

        /* renamed from: I6 */
        public C41084a f36231I6;
        /* access modifiers changed from: private */

        /* renamed from: J */
        public C41084a f36232J;
        /* access modifiers changed from: private */

        /* renamed from: J0 */
        public C41084a f36233J0;
        /* access modifiers changed from: private */

        /* renamed from: J1 */
        public C41084a f36234J1;
        /* access modifiers changed from: private */

        /* renamed from: J2 */
        public C41084a f36235J2;
        /* access modifiers changed from: private */

        /* renamed from: J3 */
        public C41084a f36236J3;
        /* access modifiers changed from: private */

        /* renamed from: J4 */
        public C41084a f36237J4;
        /* access modifiers changed from: private */

        /* renamed from: J5 */
        public C41084a f36238J5;

        /* renamed from: J6 */
        private C41084a f36239J6;

        /* renamed from: K */
        private C41084a f36240K;
        /* access modifiers changed from: private */

        /* renamed from: K0 */
        public C41084a f36241K0;
        /* access modifiers changed from: private */

        /* renamed from: K1 */
        public C41084a f36242K1;
        /* access modifiers changed from: private */

        /* renamed from: K2 */
        public C41084a f36243K2;
        /* access modifiers changed from: private */

        /* renamed from: K3 */
        public C41084a f36244K3;
        /* access modifiers changed from: private */

        /* renamed from: K4 */
        public C41084a f36245K4;

        /* renamed from: K5 */
        private C41084a f36246K5;
        /* access modifiers changed from: private */

        /* renamed from: K6 */
        public C41084a f36247K6;
        /* access modifiers changed from: private */

        /* renamed from: L */
        public C41084a f36248L;
        /* access modifiers changed from: private */

        /* renamed from: L0 */
        public C41084a f36249L0;
        /* access modifiers changed from: private */

        /* renamed from: L1 */
        public C41084a f36250L1;
        /* access modifiers changed from: private */

        /* renamed from: L2 */
        public C41084a f36251L2;
        /* access modifiers changed from: private */

        /* renamed from: L3 */
        public C41084a f36252L3;
        /* access modifiers changed from: private */

        /* renamed from: L4 */
        public C41084a f36253L4;
        /* access modifiers changed from: private */

        /* renamed from: L5 */
        public C41084a f36254L5;
        /* access modifiers changed from: private */

        /* renamed from: L6 */
        public C41084a f36255L6;
        /* access modifiers changed from: private */

        /* renamed from: M */
        public C41084a f36256M;
        /* access modifiers changed from: private */

        /* renamed from: M0 */
        public C41084a f36257M0;
        /* access modifiers changed from: private */

        /* renamed from: M1 */
        public C41084a f36258M1;
        /* access modifiers changed from: private */

        /* renamed from: M2 */
        public C41084a f36259M2;
        /* access modifiers changed from: private */

        /* renamed from: M3 */
        public C41084a f36260M3;
        /* access modifiers changed from: private */

        /* renamed from: M4 */
        public C41084a f36261M4;
        /* access modifiers changed from: private */

        /* renamed from: M5 */
        public C41084a f36262M5;
        /* access modifiers changed from: private */

        /* renamed from: M6 */
        public C41084a f36263M6;

        /* renamed from: N */
        private C41084a f36264N;

        /* renamed from: N0 */
        private C41084a f36265N0;
        /* access modifiers changed from: private */

        /* renamed from: N1 */
        public C41084a f36266N1;
        /* access modifiers changed from: private */

        /* renamed from: N2 */
        public C41084a f36267N2;
        /* access modifiers changed from: private */

        /* renamed from: N3 */
        public C41084a f36268N3;
        /* access modifiers changed from: private */

        /* renamed from: N4 */
        public C41084a f36269N4;
        /* access modifiers changed from: private */

        /* renamed from: N5 */
        public C41084a f36270N5;
        /* access modifiers changed from: private */

        /* renamed from: N6 */
        public C41084a f36271N6;
        /* access modifiers changed from: private */

        /* renamed from: O */
        public C41084a f36272O;
        /* access modifiers changed from: private */

        /* renamed from: O0 */
        public C41084a f36273O0;
        /* access modifiers changed from: private */

        /* renamed from: O1 */
        public C41084a f36274O1;
        /* access modifiers changed from: private */

        /* renamed from: O2 */
        public C41084a f36275O2;

        /* renamed from: O3 */
        private C41084a f36276O3;
        /* access modifiers changed from: private */

        /* renamed from: O4 */
        public C41084a f36277O4;
        /* access modifiers changed from: private */

        /* renamed from: O5 */
        public C41084a f36278O5;
        /* access modifiers changed from: private */

        /* renamed from: O6 */
        public C41084a f36279O6;
        /* access modifiers changed from: private */

        /* renamed from: P */
        public C41084a f36280P;
        /* access modifiers changed from: private */

        /* renamed from: P0 */
        public C41084a f36281P0;
        /* access modifiers changed from: private */

        /* renamed from: P1 */
        public C41084a f36282P1;
        /* access modifiers changed from: private */

        /* renamed from: P2 */
        public C41084a f36283P2;
        /* access modifiers changed from: private */

        /* renamed from: P3 */
        public C41084a f36284P3;
        /* access modifiers changed from: private */

        /* renamed from: P4 */
        public C41084a f36285P4;

        /* renamed from: P5 */
        private C41084a f36286P5;
        /* access modifiers changed from: private */

        /* renamed from: P6 */
        public C41084a f36287P6;
        /* access modifiers changed from: private */

        /* renamed from: Q */
        public C41084a f36288Q;

        /* renamed from: Q0 */
        private C41084a f36289Q0;
        /* access modifiers changed from: private */

        /* renamed from: Q1 */
        public C41084a f36290Q1;
        /* access modifiers changed from: private */

        /* renamed from: Q2 */
        public C41084a f36291Q2;
        /* access modifiers changed from: private */

        /* renamed from: Q3 */
        public C41084a f36292Q3;

        /* renamed from: Q4 */
        private C41084a f36293Q4;
        /* access modifiers changed from: private */

        /* renamed from: Q5 */
        public C41084a f36294Q5;

        /* renamed from: Q6 */
        private C41084a f36295Q6;

        /* renamed from: R */
        private C41084a f36296R;
        /* access modifiers changed from: private */

        /* renamed from: R0 */
        public C41084a f36297R0;
        /* access modifiers changed from: private */

        /* renamed from: R1 */
        public C41084a f36298R1;
        /* access modifiers changed from: private */

        /* renamed from: R2 */
        public C41084a f36299R2;
        /* access modifiers changed from: private */

        /* renamed from: R3 */
        public C41084a f36300R3;
        /* access modifiers changed from: private */

        /* renamed from: R4 */
        public C41084a f36301R4;
        /* access modifiers changed from: private */

        /* renamed from: R5 */
        public C41084a f36302R5;
        /* access modifiers changed from: private */

        /* renamed from: R6 */
        public C41084a f36303R6;
        /* access modifiers changed from: private */

        /* renamed from: S */
        public C41084a f36304S;
        /* access modifiers changed from: private */

        /* renamed from: S0 */
        public C41084a f36305S0;
        /* access modifiers changed from: private */

        /* renamed from: S1 */
        public C41084a f36306S1;
        /* access modifiers changed from: private */

        /* renamed from: S2 */
        public C41084a f36307S2;
        /* access modifiers changed from: private */

        /* renamed from: S3 */
        public C41084a f36308S3;

        /* renamed from: S4 */
        private C41084a f36309S4;
        /* access modifiers changed from: private */

        /* renamed from: S5 */
        public C41084a f36310S5;
        /* access modifiers changed from: private */

        /* renamed from: S6 */
        public C41084a f36311S6;
        /* access modifiers changed from: private */

        /* renamed from: T */
        public C41084a f36312T;

        /* renamed from: T0 */
        private C41084a f36313T0;
        /* access modifiers changed from: private */

        /* renamed from: T1 */
        public C41084a f36314T1;
        /* access modifiers changed from: private */

        /* renamed from: T2 */
        public C41084a f36315T2;
        /* access modifiers changed from: private */

        /* renamed from: T3 */
        public C41084a f36316T3;
        /* access modifiers changed from: private */

        /* renamed from: T4 */
        public C41084a f36317T4;
        /* access modifiers changed from: private */

        /* renamed from: T5 */
        public C41084a f36318T5;
        /* access modifiers changed from: private */

        /* renamed from: T6 */
        public C41084a f36319T6;
        /* access modifiers changed from: private */

        /* renamed from: U */
        public C41084a f36320U;
        /* access modifiers changed from: private */

        /* renamed from: U0 */
        public C41084a f36321U0;
        /* access modifiers changed from: private */

        /* renamed from: U1 */
        public C41084a f36322U1;
        /* access modifiers changed from: private */

        /* renamed from: U2 */
        public C41084a f36323U2;
        /* access modifiers changed from: private */

        /* renamed from: U3 */
        public C41084a f36324U3;
        /* access modifiers changed from: private */

        /* renamed from: U4 */
        public C41084a f36325U4;

        /* renamed from: U5 */
        private C41084a f36326U5;

        /* renamed from: U6 */
        private C41084a f36327U6;
        /* access modifiers changed from: private */

        /* renamed from: V */
        public C41084a f36328V;

        /* renamed from: V0 */
        private C41084a f36329V0;
        /* access modifiers changed from: private */

        /* renamed from: V1 */
        public C41084a f36330V1;
        /* access modifiers changed from: private */

        /* renamed from: V2 */
        public C41084a f36331V2;
        /* access modifiers changed from: private */

        /* renamed from: V3 */
        public C41084a f36332V3;

        /* renamed from: V4 */
        private C41084a f36333V4;
        /* access modifiers changed from: private */

        /* renamed from: V5 */
        public C41084a f36334V5;
        /* access modifiers changed from: private */

        /* renamed from: V6 */
        public C41084a f36335V6;
        /* access modifiers changed from: private */

        /* renamed from: W */
        public C41084a f36336W;
        /* access modifiers changed from: private */

        /* renamed from: W0 */
        public C41084a f36337W0;
        /* access modifiers changed from: private */

        /* renamed from: W1 */
        public C41084a f36338W1;
        /* access modifiers changed from: private */

        /* renamed from: W2 */
        public C41084a f36339W2;
        /* access modifiers changed from: private */

        /* renamed from: W3 */
        public C41084a f36340W3;

        /* renamed from: W4 */
        private C41084a f36341W4;

        /* renamed from: W5 */
        private C41084a f36342W5;
        /* access modifiers changed from: private */

        /* renamed from: X */
        public C41084a f36343X;
        /* access modifiers changed from: private */

        /* renamed from: X0 */
        public C41084a f36344X0;
        /* access modifiers changed from: private */

        /* renamed from: X1 */
        public C41084a f36345X1;
        /* access modifiers changed from: private */

        /* renamed from: X2 */
        public C41084a f36346X2;
        /* access modifiers changed from: private */

        /* renamed from: X3 */
        public C41084a f36347X3;

        /* renamed from: X4 */
        private C41084a f36348X4;
        /* access modifiers changed from: private */

        /* renamed from: X5 */
        public C41084a f36349X5;
        /* access modifiers changed from: private */

        /* renamed from: Y */
        public C41084a f36350Y;
        /* access modifiers changed from: private */

        /* renamed from: Y0 */
        public C41084a f36351Y0;
        /* access modifiers changed from: private */

        /* renamed from: Y1 */
        public C41084a f36352Y1;

        /* renamed from: Y2 */
        private C41084a f36353Y2;
        /* access modifiers changed from: private */

        /* renamed from: Y3 */
        public C41084a f36354Y3;

        /* renamed from: Y4 */
        private C41084a f36355Y4;
        /* access modifiers changed from: private */

        /* renamed from: Y5 */
        public C41084a f36356Y5;
        /* access modifiers changed from: private */

        /* renamed from: Z */
        public C41084a f36357Z;
        /* access modifiers changed from: private */

        /* renamed from: Z0 */
        public C41084a f36358Z0;
        /* access modifiers changed from: private */

        /* renamed from: Z1 */
        public C41084a f36359Z1;
        /* access modifiers changed from: private */

        /* renamed from: Z2 */
        public C41084a f36360Z2;
        /* access modifiers changed from: private */

        /* renamed from: Z3 */
        public C41084a f36361Z3;
        /* access modifiers changed from: private */

        /* renamed from: Z4 */
        public C41084a f36362Z4;
        /* access modifiers changed from: private */

        /* renamed from: Z5 */
        public C41084a f36363Z5;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final PreferencesApiManagerModule f36364a;
        /* access modifiers changed from: private */

        /* renamed from: a0 */
        public C41084a f36365a0;
        /* access modifiers changed from: private */

        /* renamed from: a1 */
        public C41084a f36366a1;

        /* renamed from: a2 */
        private C41084a f36367a2;
        /* access modifiers changed from: private */

        /* renamed from: a3 */
        public C41084a f36368a3;
        /* access modifiers changed from: private */

        /* renamed from: a4 */
        public C41084a f36369a4;
        /* access modifiers changed from: private */

        /* renamed from: a5 */
        public C41084a f36370a5;

        /* renamed from: a6 */
        private C41084a f36371a6;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final SharedPreferencesModule f36372b;
        /* access modifiers changed from: private */

        /* renamed from: b0 */
        public C41084a f36373b0;
        /* access modifiers changed from: private */

        /* renamed from: b1 */
        public C41084a f36374b1;
        /* access modifiers changed from: private */

        /* renamed from: b2 */
        public C41084a f36375b2;
        /* access modifiers changed from: private */

        /* renamed from: b3 */
        public C41084a f36376b3;
        /* access modifiers changed from: private */

        /* renamed from: b4 */
        public C41084a f36377b4;

        /* renamed from: b5 */
        private C41084a f36378b5;
        /* access modifiers changed from: private */

        /* renamed from: b6 */
        public C41084a f36379b6;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final AppModule f36380c;
        /* access modifiers changed from: private */

        /* renamed from: c0 */
        public C41084a f36381c0;
        /* access modifiers changed from: private */

        /* renamed from: c1 */
        public C41084a f36382c1;
        /* access modifiers changed from: private */

        /* renamed from: c2 */
        public C41084a f36383c2;
        /* access modifiers changed from: private */

        /* renamed from: c3 */
        public C41084a f36384c3;
        /* access modifiers changed from: private */

        /* renamed from: c4 */
        public C41084a f36385c4;
        /* access modifiers changed from: private */

        /* renamed from: c5 */
        public C41084a f36386c5;

        /* renamed from: c6 */
        private C41084a f36387c6;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C17956a f36388d;
        /* access modifiers changed from: private */

        /* renamed from: d0 */
        public C41084a f36389d0;
        /* access modifiers changed from: private */

        /* renamed from: d1 */
        public C41084a f36390d1;
        /* access modifiers changed from: private */

        /* renamed from: d2 */
        public C41084a f36391d2;

        /* renamed from: d3 */
        private C41084a f36392d3;
        /* access modifiers changed from: private */

        /* renamed from: d4 */
        public C41084a f36393d4;
        /* access modifiers changed from: private */

        /* renamed from: d5 */
        public C41084a f36394d5;
        /* access modifiers changed from: private */

        /* renamed from: d6 */
        public C41084a f36395d6;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final EventBusModule f36396e;
        /* access modifiers changed from: private */

        /* renamed from: e0 */
        public C41084a f36397e0;
        /* access modifiers changed from: private */

        /* renamed from: e1 */
        public C41084a f36398e1;
        /* access modifiers changed from: private */

        /* renamed from: e2 */
        public C41084a f36399e2;
        /* access modifiers changed from: private */

        /* renamed from: e3 */
        public C41084a f36400e3;
        /* access modifiers changed from: private */

        /* renamed from: e4 */
        public C41084a f36401e4;
        /* access modifiers changed from: private */

        /* renamed from: e5 */
        public C41084a f36402e5;
        /* access modifiers changed from: private */

        /* renamed from: e6 */
        public C41084a f36403e6;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final C34672a f36404f;
        /* access modifiers changed from: private */

        /* renamed from: f0 */
        public C41084a f36405f0;
        /* access modifiers changed from: private */

        /* renamed from: f1 */
        public C41084a f36406f1;
        /* access modifiers changed from: private */

        /* renamed from: f2 */
        public C41084a f36407f2;
        /* access modifiers changed from: private */

        /* renamed from: f3 */
        public C41084a f36408f3;

        /* renamed from: f4 */
        private C41084a f36409f4;

        /* renamed from: f5 */
        private C41084a f36410f5;
        /* access modifiers changed from: private */

        /* renamed from: f6 */
        public C41084a f36411f6;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final C31666c f36412g;
        /* access modifiers changed from: private */

        /* renamed from: g0 */
        public C41084a f36413g0;
        /* access modifiers changed from: private */

        /* renamed from: g1 */
        public C41084a f36414g1;
        /* access modifiers changed from: private */

        /* renamed from: g2 */
        public C41084a f36415g2;
        /* access modifiers changed from: private */

        /* renamed from: g3 */
        public C41084a f36416g3;
        /* access modifiers changed from: private */

        /* renamed from: g4 */
        public C41084a f36417g4;
        /* access modifiers changed from: private */

        /* renamed from: g5 */
        public C41084a f36418g5;
        /* access modifiers changed from: private */

        /* renamed from: g6 */
        public C41084a f36419g6;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final C36871b f36420h;
        /* access modifiers changed from: private */

        /* renamed from: h0 */
        public C41084a f36421h0;

        /* renamed from: h1 */
        private C41084a f36422h1;

        /* renamed from: h2 */
        private C41084a f36423h2;
        /* access modifiers changed from: private */

        /* renamed from: h3 */
        public C41084a f36424h3;

        /* renamed from: h4 */
        private C41084a f36425h4;
        /* access modifiers changed from: private */

        /* renamed from: h5 */
        public C41084a f36426h5;
        /* access modifiers changed from: private */

        /* renamed from: h6 */
        public C41084a f36427h6;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public final RetrofitApiModule f36428i;
        /* access modifiers changed from: private */

        /* renamed from: i0 */
        public C41084a f36429i0;

        /* renamed from: i1 */
        private C41084a f36430i1;
        /* access modifiers changed from: private */

        /* renamed from: i2 */
        public C41084a f36431i2;
        /* access modifiers changed from: private */

        /* renamed from: i3 */
        public C41084a f36432i3;

        /* renamed from: i4 */
        private C41084a f36433i4;

        /* renamed from: i5 */
        private C41084a f36434i5;
        /* access modifiers changed from: private */

        /* renamed from: i6 */
        public C41084a f36435i6;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public final BankApiManagerModule f36436j;
        /* access modifiers changed from: private */

        /* renamed from: j0 */
        public C41084a f36437j0;

        /* renamed from: j1 */
        private C41084a f36438j1;

        /* renamed from: j2 */
        private C41084a f36439j2;
        /* access modifiers changed from: private */

        /* renamed from: j3 */
        public C41084a f36440j3;
        /* access modifiers changed from: private */

        /* renamed from: j4 */
        public C41084a f36441j4;
        /* access modifiers changed from: private */

        /* renamed from: j5 */
        public C41084a f36442j5;
        /* access modifiers changed from: private */

        /* renamed from: j6 */
        public C41084a f36443j6;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public final C19795a f36444k;
        /* access modifiers changed from: private */

        /* renamed from: k0 */
        public C41084a f36445k0;
        /* access modifiers changed from: private */

        /* renamed from: k1 */
        public C41084a f36446k1;
        /* access modifiers changed from: private */

        /* renamed from: k2 */
        public C41084a f36447k2;
        /* access modifiers changed from: private */

        /* renamed from: k3 */
        public C41084a f36448k3;

        /* renamed from: k4 */
        private C41084a f36449k4;
        /* access modifiers changed from: private */

        /* renamed from: k5 */
        public C41084a f36450k5;
        /* access modifiers changed from: private */

        /* renamed from: k6 */
        public C41084a f36451k6;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public final C12479b f36452l;
        /* access modifiers changed from: private */

        /* renamed from: l0 */
        public C41084a f36453l0;
        /* access modifiers changed from: private */

        /* renamed from: l1 */
        public C41084a f36454l1;
        /* access modifiers changed from: private */

        /* renamed from: l2 */
        public C41084a f36455l2;
        /* access modifiers changed from: private */

        /* renamed from: l3 */
        public C41084a f36456l3;
        /* access modifiers changed from: private */

        /* renamed from: l4 */
        public C41084a f36457l4;
        /* access modifiers changed from: private */

        /* renamed from: l5 */
        public C41084a f36458l5;
        /* access modifiers changed from: private */

        /* renamed from: l6 */
        public C41084a f36459l6;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public final C12922a f36460m;
        /* access modifiers changed from: private */

        /* renamed from: m0 */
        public C41084a f36461m0;

        /* renamed from: m1 */
        private C41084a f36462m1;

        /* renamed from: m2 */
        private C41084a f36463m2;
        /* access modifiers changed from: private */

        /* renamed from: m3 */
        public C41084a f36464m3;
        /* access modifiers changed from: private */

        /* renamed from: m4 */
        public C41084a f36465m4;

        /* renamed from: m5 */
        private C41084a f36466m5;
        /* access modifiers changed from: private */

        /* renamed from: m6 */
        public C41084a f36467m6;

        /* renamed from: n */
        private final C38393e f36468n;

        /* renamed from: n0 */
        private C41084a f36469n0;

        /* renamed from: n1 */
        private C41084a f36470n1;
        /* access modifiers changed from: private */

        /* renamed from: n2 */
        public C41084a f36471n2;

        /* renamed from: n3 */
        private C41084a f36472n3;
        /* access modifiers changed from: private */

        /* renamed from: n4 */
        public C41084a f36473n4;
        /* access modifiers changed from: private */

        /* renamed from: n5 */
        public C41084a f36474n5;
        /* access modifiers changed from: private */

        /* renamed from: n6 */
        public C41084a f36475n6;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public final C25133a f36476o;
        /* access modifiers changed from: private */

        /* renamed from: o0 */
        public C41084a f36477o0;

        /* renamed from: o1 */
        private C41084a f36478o1;
        /* access modifiers changed from: private */

        /* renamed from: o2 */
        public C41084a f36479o2;
        /* access modifiers changed from: private */

        /* renamed from: o3 */
        public C41084a f36480o3;

        /* renamed from: o4 */
        private C41084a f36481o4;
        /* access modifiers changed from: private */

        /* renamed from: o5 */
        public C41084a f36482o5;
        /* access modifiers changed from: private */

        /* renamed from: o6 */
        public C41084a f36483o6;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public final C28795a f36484p;

        /* renamed from: p0 */
        private C41084a f36485p0;
        /* access modifiers changed from: private */

        /* renamed from: p1 */
        public C41084a f36486p1;
        /* access modifiers changed from: private */

        /* renamed from: p2 */
        public C41084a f36487p2;
        /* access modifiers changed from: private */

        /* renamed from: p3 */
        public C41084a f36488p3;
        /* access modifiers changed from: private */

        /* renamed from: p4 */
        public C41084a f36489p4;
        /* access modifiers changed from: private */

        /* renamed from: p5 */
        public C41084a f36490p5;
        /* access modifiers changed from: private */

        /* renamed from: p6 */
        public C41084a f36491p6;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public final C18977a f36492q;

        /* renamed from: q0 */
        private C41084a f36493q0;

        /* renamed from: q1 */
        private C41084a f36494q1;
        /* access modifiers changed from: private */

        /* renamed from: q2 */
        public C41084a f36495q2;
        /* access modifiers changed from: private */

        /* renamed from: q3 */
        public C41084a f36496q3;
        /* access modifiers changed from: private */

        /* renamed from: q4 */
        public C41084a f36497q4;
        /* access modifiers changed from: private */

        /* renamed from: q5 */
        public C41084a f36498q5;
        /* access modifiers changed from: private */

        /* renamed from: q6 */
        public C41084a f36499q6;

        /* renamed from: r */
        private final C32015a f36500r;
        /* access modifiers changed from: private */

        /* renamed from: r0 */
        public C41084a f36501r0;
        /* access modifiers changed from: private */

        /* renamed from: r1 */
        public C41084a f36502r1;
        /* access modifiers changed from: private */

        /* renamed from: r2 */
        public C41084a f36503r2;
        /* access modifiers changed from: private */

        /* renamed from: r3 */
        public C41084a f36504r3;

        /* renamed from: r4 */
        private C41084a f36505r4;

        /* renamed from: r5 */
        private C41084a f36506r5;
        /* access modifiers changed from: private */

        /* renamed from: r6 */
        public C41084a f36507r6;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public final C16480a f36508s;
        /* access modifiers changed from: private */

        /* renamed from: s0 */
        public C41084a f36509s0;

        /* renamed from: s1 */
        private C41084a f36510s1;

        /* renamed from: s2 */
        private C41084a f36511s2;
        /* access modifiers changed from: private */

        /* renamed from: s3 */
        public C41084a f36512s3;
        /* access modifiers changed from: private */

        /* renamed from: s4 */
        public C41084a f36513s4;
        /* access modifiers changed from: private */

        /* renamed from: s5 */
        public C41084a f36514s5;
        /* access modifiers changed from: private */

        /* renamed from: s6 */
        public C41084a f36515s6;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public final C36263b f36516t;
        /* access modifiers changed from: private */

        /* renamed from: t0 */
        public C41084a f36517t0;
        /* access modifiers changed from: private */

        /* renamed from: t1 */
        public C41084a f36518t1;
        /* access modifiers changed from: private */

        /* renamed from: t2 */
        public C41084a f36519t2;
        /* access modifiers changed from: private */

        /* renamed from: t3 */
        public C41084a f36520t3;
        /* access modifiers changed from: private */

        /* renamed from: t4 */
        public C41084a f36521t4;

        /* renamed from: t5 */
        private C41084a f36522t5;

        /* renamed from: t6 */
        private C41084a f36523t6;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public final C25137a f36524u;

        /* renamed from: u0 */
        private C41084a f36525u0;

        /* renamed from: u1 */
        private C41084a f36526u1;
        /* access modifiers changed from: private */

        /* renamed from: u2 */
        public C41084a f36527u2;
        /* access modifiers changed from: private */

        /* renamed from: u3 */
        public C41084a f36528u3;
        /* access modifiers changed from: private */

        /* renamed from: u4 */
        public C41084a f36529u4;
        /* access modifiers changed from: private */

        /* renamed from: u5 */
        public C41084a f36530u5;
        /* access modifiers changed from: private */

        /* renamed from: u6 */
        public C41084a f36531u6;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public final C25059b f36532v;

        /* renamed from: v0 */
        private C41084a f36533v0;
        /* access modifiers changed from: private */

        /* renamed from: v1 */
        public C41084a f36534v1;
        /* access modifiers changed from: private */

        /* renamed from: v2 */
        public C41084a f36535v2;
        /* access modifiers changed from: private */

        /* renamed from: v3 */
        public C41084a f36536v3;
        /* access modifiers changed from: private */

        /* renamed from: v4 */
        public C41084a f36537v4;
        /* access modifiers changed from: private */

        /* renamed from: v5 */
        public C41084a f36538v5;
        /* access modifiers changed from: private */

        /* renamed from: v6 */
        public C41084a f36539v6;
        /* access modifiers changed from: private */

        /* renamed from: w */
        public final RetrofitGoogleApiModule f36540w;

        /* renamed from: w0 */
        private C41084a f36541w0;
        /* access modifiers changed from: private */

        /* renamed from: w1 */
        public C41084a f36542w1;
        /* access modifiers changed from: private */

        /* renamed from: w2 */
        public C41084a f36543w2;
        /* access modifiers changed from: private */

        /* renamed from: w3 */
        public C41084a f36544w3;
        /* access modifiers changed from: private */

        /* renamed from: w4 */
        public C41084a f36545w4;

        /* renamed from: w5 */
        private C41084a f36546w5;

        /* renamed from: w6 */
        private C41084a f36547w6;
        /* access modifiers changed from: private */

        /* renamed from: x */
        public final C29245a f36548x;
        /* access modifiers changed from: private */

        /* renamed from: x0 */
        public C41084a f36549x0;
        /* access modifiers changed from: private */

        /* renamed from: x1 */
        public C41084a f36550x1;
        /* access modifiers changed from: private */

        /* renamed from: x2 */
        public C41084a f36551x2;
        /* access modifiers changed from: private */

        /* renamed from: x3 */
        public C41084a f36552x3;
        /* access modifiers changed from: private */

        /* renamed from: x4 */
        public C41084a f36553x4;
        /* access modifiers changed from: private */

        /* renamed from: x5 */
        public C41084a f36554x5;
        /* access modifiers changed from: private */

        /* renamed from: x6 */
        public C41084a f36555x6;

        /* renamed from: y */
        private final C20286a f36556y;
        /* access modifiers changed from: private */

        /* renamed from: y0 */
        public C41084a f36557y0;
        /* access modifiers changed from: private */

        /* renamed from: y1 */
        public C41084a f36558y1;
        /* access modifiers changed from: private */

        /* renamed from: y2 */
        public C41084a f36559y2;
        /* access modifiers changed from: private */

        /* renamed from: y3 */
        public C41084a f36560y3;
        /* access modifiers changed from: private */

        /* renamed from: y4 */
        public C41084a f36561y4;
        /* access modifiers changed from: private */

        /* renamed from: y5 */
        public C41084a f36562y5;

        /* renamed from: y6 */
        private C41084a f36563y6;

        /* renamed from: z */
        private final C39675a f36564z;
        /* access modifiers changed from: private */

        /* renamed from: z0 */
        public C41084a f36565z0;
        /* access modifiers changed from: private */

        /* renamed from: z1 */
        public C41084a f36566z1;
        /* access modifiers changed from: private */

        /* renamed from: z2 */
        public C41084a f36567z2;
        /* access modifiers changed from: private */

        /* renamed from: z3 */
        public C41084a f36568z3;

        /* renamed from: z4 */
        private C41084a f36569z4;
        /* access modifiers changed from: private */

        /* renamed from: z5 */
        public C41084a f36570z5;
        /* access modifiers changed from: private */

        /* renamed from: z6 */
        public C41084a f36571z6;

        /* renamed from: dk.b$j$a */
        private static final class C12273a implements C41084a {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public final C12272j f36572a;

            /* renamed from: b */
            private final int f36573b;

            /* renamed from: dk.b$j$a$a */
            class C12274a implements C6503b {
                C12274a() {
                }

                /* renamed from: b */
                public InstalledAppsDataReportWorker mo20442a(Context context, WorkerParameters workerParameters) {
                    return C12273a.this.f36572a.m46381t8(C31644b.m93774a(context, workerParameters));
                }
            }

            /* renamed from: dk.b$j$a$b */
            class C12275b implements C6503b {
                C12275b() {
                }

                /* renamed from: b */
                public LocationWifiDataReportWorker mo20442a(Context context, WorkerParameters workerParameters) {
                    return C12273a.this.f36572a.m46391u8(C31648f.m93777a(context, workerParameters));
                }
            }

            C12273a(C12272j jVar, int i) {
                this.f36572a = jVar;
                this.f36573b = i;
            }

            /* renamed from: b */
            private Object m46456b() {
                switch (this.f36573b) {
                    case 0:
                        C12272j jVar = this.f36572a;
                        return jVar.m46360r8(Client_Factory.newInstance((PreferencesApiManager) jVar.f36224I.get(), C17958c.m61876a(this.f36572a.f36388d)));
                    case 1:
                        return PreferencesApiManagerModule_ProvidePreferencesApiManagerFactory.providePreferencesApiManager(this.f36572a.f36364a, (SharedPreferences) this.f36572a.f36176C.get(), (C41438c) this.f36572a.f36184D.get(), (C37350a) this.f36572a.f36192E.get(), (TargetEnvironment) this.f36572a.f36216H.get());
                    case 2:
                        return SharedPreferencesModule_ProvideSharedPreferencesFactory.provideSharedPreferences(this.f36572a.f36372b, (C36546y) this.f36572a.f36168B.get());
                    case 3:
                        return AppModule_ProvideAppFactory.provideApp(this.f36572a.f36380c, C17957b.m61875a(this.f36572a.f36388d));
                    case 4:
                        return EventBusModule_ProvideEventBusFactory.provideEventBus(this.f36572a.f36396e);
                    case 5:
                        return new C37351b((SharedPreferences) this.f36572a.f36176C.get());
                    case 6:
                        return C34675d.m101861a(this.f36572a.f36404f, (C31663a) this.f36572a.f36200F.get(), (C34676e) this.f36572a.f36208G.get());
                    case 7:
                        return C31667d.m93807a(this.f36572a.f36412g, (SharedPreferences) this.f36572a.f36176C.get());
                    case 8:
                        return C34674c.m101860a(this.f36572a.f36404f);
                    case 9:
                        return new C28614c((C28617d) this.f36572a.f36328V.get(), (C28611a) this.f36572a.f36336W.get());
                    case 10:
                        return C29248d.m89218a((C43511w) this.f36572a.f36320U.get());
                    case 11:
                        return C37642l.m110666a((TargetEnvironment) this.f36572a.f36216H.get(), (C41944z) this.f36572a.f36312T.get(), this.f36572a.m46156X8());
                    case 12:
                        return C37634f.m110653a(this.f36572a.m46046M8(), this.f36572a.m46186a9(), this.f36572a.m46146W8(), (C41935w) this.f36572a.f36280P.get(), this.f36572a.m46136V8());
                    case 13:
                        return new C38128a((C37635g) this.f36572a.f36232J.get());
                    case 14:
                        return new C37635g(C17958c.m61876a(this.f36572a.f36388d));
                    case 15:
                        return C36872c.m109235a(this.f36572a.f36420h, C17958c.m61876a(this.f36572a.f36388d));
                    case 16:
                        return C34698i.m101917a(new C36743o());
                    case 17:
                        return C37627a.f90395a.mo90810d((C39200a) this.f36572a.f36272O.get());
                    case 18:
                        return new C38106f((PreferencesApiManager) this.f36572a.f36224I.get());
                    case 19:
                        return AppModule_ProvideGsonFactory.provideGson(this.f36572a.f36380c);
                    case 20:
                        return new C39784e(this.f36572a.m46245g8());
                    case 21:
                        return C30494b.m91797a((C41935w) this.f36572a.f36280P.get(), this.f36572a.m46156X8(), (TargetEnvironment) this.f36572a.f36216H.get());
                    case 22:
                        return new C28611a();
                    case 23:
                        return new C29835h((IRetrofitService) this.f36572a.f36350Y.get(), (C30111a) this.f36572a.f36357Z.get(), (PreferencesApiManager) this.f36572a.f36224I.get(), (C29825a) this.f36572a.f36365a0.get(), C17958c.m61876a(this.f36572a.f36388d));
                    case 24:
                        return RetrofitApiModule_ProvideRetrofitServiceFactory.provideRetrofitService(this.f36572a.f36428i, (C43511w) this.f36572a.f36320U.get());
                    case 25:
                        return new C30111a();
                    case 26:
                        return new C29825a((C36546y) this.f36572a.f36168B.get());
                    case 27:
                        return new C26146d();
                    case 28:
                        return BankApiManagerModule_ProvideBankApiManagerFactory.provideBankApiManager(this.f36572a.f36436j, (C41438c) this.f36572a.f36184D.get(), (BankApi) this.f36572a.f36405f0.get(), (Client) this.f36572a.f36389d0.get());
                    case 29:
                        return RetrofitApiModule_ProvideRetrofitApiFactory.provideRetrofitApi(this.f36572a.f36428i, (IRetrofitService) this.f36572a.f36350Y.get(), (C43511w) this.f36572a.f36397e0.get());
                    case 30:
                        return C37641k.m110665a((C41944z) this.f36572a.f36312T.get(), (C43511w) this.f36572a.f36320U.get());
                    case 31:
                        return new RetrofitClient((PreferencesApiManager) this.f36572a.f36224I.get(), (C36869a) this.f36572a.f36248L.get(), (TargetEnvironment) this.f36572a.f36216H.get(), this.f36572a.m46421x8());
                    case 32:
                        return new C19792a();
                    case 33:
                        return C19796b.m65559a(this.f36572a.f36444k, C17957b.m61875a(this.f36572a.f36388d), this.f36572a.m46430y7(), this.f36572a.m45925A7(), this.f36572a.m46440z7(), new C25488d(), this.f36572a.m45935B7(), this.f36572a.m46420x7(), new C25485a(), this.f36572a.m45945C7());
                    case 34:
                        return new C27082a(this.f36572a.m46295l8());
                    case 35:
                        return new C27990a((C28188a) this.f36572a.f36445k0.get(), (C28700a) this.f36572a.f36477o0.get(), this.f36572a.m46115T7(), this.f36572a.m46175Z7(), (C19792a) this.f36572a.f36429i0.get(), new C29035a(), (PreferencesApiManager) this.f36572a.f36224I.get(), (Gson) this.f36572a.f36288Q.get(), C17958c.m61876a(this.f36572a.f36388d));
                    case 36:
                        return C28356b.m87001a((C41935w) this.f36572a.f36280P.get(), (TargetEnvironment) this.f36572a.f36216H.get(), new C36740l());
                    case 37:
                        return new C28701b((C29300a) this.f36572a.f36461m0.get(), new C29035a());
                    case 38:
                        return C12480c.m47518a(this.f36572a.f36452l, (BogDatabase) this.f36572a.f36453l0.get());
                    case 39:
                        return C12923b.m48827a(this.f36572a.f36460m, (C36546y) this.f36572a.f36168B.get());
                    case 40:
                        return new C27084b(this.f36572a.m46361r9());
                    case 41:
                        return new C32090i((IRetrofitService) this.f36572a.f36350Y.get(), (Client) this.f36572a.f36389d0.get(), (PreferencesApiManager) this.f36572a.f36224I.get(), (C36153a) this.f36572a.f36509s0.get(), this.f36572a.m46115T7());
                    case 42:
                        return new C36153a();
                    case 43:
                        return new C12274a();
                    case 44:
                        return new C12275b();
                    case 45:
                        return new C38820i(this.f36572a.m45956D8(), this.f36572a.m46025K7(), this.f36572a.m46036L8(), C31214a.f77582a.mo71465b(), this.f36572a.m46096R8());
                    case 46:
                        return new C20087p((IRetrofitService) this.f36572a.f36350Y.get(), (C20290a) this.f36572a.f36549x0.get(), (C20072b) this.f36572a.f36557y0.get(), (C20100q) this.f36572a.f36565z0.get());
                    case 47:
                        return new C20290a();
                    case 48:
                        return new C20072b((C36546y) this.f36572a.f36168B.get(), (Gson) this.f36572a.f36288Q.get());
                    case 49:
                        return new C20100q();
                    case 50:
                        return new C38881o((C38606b) this.f36572a.f36281P0.get());
                    case 51:
                        PensionApiModelMapper pensionApiModelMapper = r12;
                        PensionApiModelMapper pensionApiModelMapper2 = new PensionApiModelMapper();
                        ProductsRepositoryImpl productsRepositoryImpl = r2;
                        ProductsRepositoryImpl productsRepositoryImpl2 = new ProductsRepositoryImpl(this.f36572a.m46116T8(), (Client) this.f36572a.f36389d0.get(), (ProductTypeApiModelMapper) this.f36572a.f36177C0.get(), (AccountsApiModelMapper) this.f36572a.f36185D0.get(), (CardsAndDetailsApiModelMapper) this.f36572a.f36193E0.get(), (LoansWrapperLegacyModelMapper) this.f36572a.f36201F0.get(), (CreditCardsLegacyWrapperMapper) this.f36572a.f36209G0.get(), (BondsWrapperApiModelMapper) this.f36572a.f36217H0.get(), pensionApiModelMapper, (ContractApiModelMapper) this.f36572a.f36225I0.get(), (GTMapper) this.f36572a.f36233J0.get(), (StatementsMapper) this.f36572a.f36241K0.get(), (ChildMBankMapper) this.f36572a.f36249L0.get(), (LiabilityInfoMapper) this.f36572a.f36257M0.get(), (C38605a) this.f36572a.f36273O0.get(), this.f36572a.m46195b8());
                        return productsRepositoryImpl;
                    case 52:
                        return new ProductTypeApiModelMapper();
                    case 53:
                        return new AccountsApiModelMapper();
                    case 54:
                        return new CardsAndDetailsApiModelMapper();
                    case 55:
                        return new LoansWrapperLegacyModelMapper();
                    case 56:
                        return new CreditCardsLegacyWrapperMapper();
                    case 57:
                        return new BondsWrapperApiModelMapper();
                    case 58:
                        return new ContractApiModelMapper();
                    case 59:
                        return new GTMapper();
                    case 60:
                        return new StatementsMapper();
                    case 61:
                        return new ChildMBankMapper();
                    case 62:
                        return new LiabilityInfoMapper();
                    case 63:
                        return new ProductsPreferenceManagerImpl((SharedPreferences) this.f36572a.f36176C.get());
                    case 64:
                        return new C27092a();
                    case 65:
                        return new C38873k((C38606b) this.f36572a.f36281P0.get());
                    case 66:
                        return new C38878m0((C38606b) this.f36572a.f36281P0.get());
                    case 67:
                        return new C39749f((C38606b) this.f36572a.f36281P0.get());
                    case 68:
                        return new C26270d((IRetrofitService) this.f36572a.f36350Y.get(), (C26061a) this.f36572a.f36351Y0.get());
                    case 69:
                        return new C26061a();
                    case 70:
                        return new C29882e((C19147a) this.f36572a.f36390d1.get());
                    case 71:
                        return new C29599d((IRetrofitService) this.f36572a.f36350Y.get(), (C30416a) this.f36572a.f36366a1.get(), (C30417b) this.f36572a.f36374b1.get(), (C26094a) this.f36572a.f36382c1.get());
                    case 72:
                        return new C30416a();
                    case 73:
                        return new C30417b();
                    case 74:
                        return new C26094a();
                    case 75:
                        return new C19509h(this.f36572a.m46296l9(), this.f36572a.m45985G7(), (PreferencesApiManager) this.f36572a.f36224I.get());
                    case 76:
                        return new C28506b((IRetrofitService) this.f36572a.f36350Y.get(), (C28934a) this.f36572a.f36406f1.get(), (C27494a) this.f36572a.f36414g1.get());
                    case 77:
                        return new C28934a();
                    case 78:
                        return new C27495b((C36546y) this.f36572a.f36168B.get(), (C36869a) this.f36572a.f36248L.get(), (Gson) this.f36572a.f36288Q.get(), (PreferencesApiManager) this.f36572a.f36224I.get());
                    case 79:
                        return new C27872c((IRetrofitService) this.f36572a.f36350Y.get(), (C27640a) this.f36572a.f36446k1.get());
                    case 80:
                        return new C27640a((Gson) this.f36572a.f36288Q.get());
                    case 81:
                        return new C38852b0((C38606b) this.f36572a.f36281P0.get());
                    case 82:
                        return new C38854c0((C38606b) this.f36572a.f36281P0.get());
                    case 83:
                        return new C38850a0((C38606b) this.f36572a.f36281P0.get());
                    case 84:
                        return new C38856d0((C38606b) this.f36572a.f36281P0.get());
                    case 85:
                        return new C29283o(this.f36572a.m46055N7(), (C36845a) this.f36572a.f36534v1.get(), this.f36572a.m46195b8(), (C28698b) this.f36572a.f36542w1.get(), (C28697a) this.f36572a.f36550x1.get());
                    case 86:
                        return new C29033a((SharedPreferences) this.f36572a.f36176C.get());
                    case 87:
                        return new C28698b();
                    case 88:
                        return new C28697a();
                    case 89:
                        return new C15289b((SessionManager) this.f36572a.f36256M.get(), this.f36572a.m45966E8(), this.f36572a.m45976F8());
                    case 90:
                        return new C27775b(this.f36572a.f36384c3);
                    case 91:
                        return C18330e.m62678c(33).mo46102a((C27774a) this.f36572a.f36178C1.get()).mo46102a((C27774a) this.f36572a.f36194E1.get()).mo46102a((C27774a) this.f36572a.f36218H1.get()).mo46102a((C27774a) this.f36572a.f36298R1.get()).mo46102a((C27774a) this.f36572a.f36314T1.get()).mo46102a((C27774a) this.f36572a.f36330V1.get()).mo46102a((C27774a) this.f36572a.f36345X1.get()).mo46102a((C27774a) this.f36572a.f36375b2.get()).mo46102a((C27774a) this.f36572a.f36558y1.get()).mo46102a((C27774a) this.f36572a.f36391d2.get()).mo46102a((C27774a) this.f36572a.f36447k2.get()).mo46102a((C27774a) this.f36572a.f36471n2.get()).mo46102a((C27774a) this.f36572a.f36358Z0.get()).mo46102a((C27774a) this.f36572a.f36487p2.get()).mo46102a((C27774a) this.f36572a.f36495q2.get()).mo46102a((C27774a) this.f36572a.f36519t2.get()).mo46102a((C27774a) this.f36572a.f36535v2.get()).mo46102a((C27774a) this.f36572a.f36163A2.get()).mo46102a((C27774a) this.f36572a.f36187D2.get()).mo46102a((C27774a) this.f36572a.f36203F2.get()).mo46102a((C27774a) this.f36572a.f36195E2.get()).mo46102a((C27774a) this.f36572a.f36415g2.get()).mo46102a((C27774a) this.f36572a.f36219H2.get()).mo46102a((C27774a) this.f36572a.f36390d1.get()).mo46102a((C27774a) this.f36572a.f36235J2.get()).mo46102a((C27774a) this.f36572a.f36227I2.get()).mo46102a((C27774a) this.f36572a.f36259M2.get()).mo46102a((C27774a) this.f36572a.f36299R2.get()).mo46102a((C27774a) this.f36572a.f36307S2.get()).mo46102a((C27774a) this.f36572a.f36346X2.get()).mo46102a((C27774a) this.f36572a.f36281P0.get()).mo46102a((C27774a) this.f36572a.f36360Z2.get()).mo46102a((C27774a) this.f36572a.f36376b3.get()).mo46103b();
                    case 92:
                        return new C16473f(this.f36572a.m46410w7(), (C16720a) this.f36572a.f36566z1.get(), (C16721b) this.f36572a.f36162A1.get(), (C16722c) this.f36572a.f36170B1.get());
                    case 93:
                        return new C16720a();
                    case 94:
                        return new C16721b();
                    case 95:
                        return new C16722c();
                    case 96:
                        return new C29851g((IRetrofitService) this.f36572a.f36350Y.get(), (C30112a) this.f36572a.f36186D1.get(), (Gson) this.f36572a.f36288Q.get());
                    case 97:
                        return new C30112a();
                    case 98:
                        return new C19532l((IRetrofitService) this.f36572a.f36350Y.get(), (C29000a) this.f36572a.f36202F1.get(), (C20183a) this.f36572a.f36210G1.get());
                    case 99:
                        return C25134b.m80183a(this.f36572a.f36476o, (C43511w) this.f36572a.f36320U.get());
                    default:
                        throw new AssertionError(this.f36573b);
                }
            }

            /* renamed from: c */
            private Object m46457c() {
                switch (this.f36573b) {
                    case 100:
                        return new C20183a();
                    case 101:
                        return new GTRepositoryImpl(this.f36572a.m46095R7(), (C25717e) this.f36572a.f36226I1.get(), (C25719g) this.f36572a.f36234J1.get(), (C25718f) this.f36572a.f36242K1.get(), (C29858a) this.f36572a.f36250L1.get(), (C25722j) this.f36572a.f36258M1.get(), (C25712a) this.f36572a.f36266N1.get(), (C25716d) this.f36572a.f36274O1.get(), (C25713b) this.f36572a.f36282P1.get(), (C25714c) this.f36572a.f36290Q1.get());
                    case 102:
                        return new C25717e();
                    case 103:
                        return new C25719g();
                    case 104:
                        return new C25718f();
                    case 105:
                        return new C29858a();
                    case 106:
                        return new C25722j();
                    case 107:
                        return new C25712a();
                    case 108:
                        return new C25716d();
                    case 109:
                        return new C25713b();
                    case 110:
                        return new C25714c();
                    case 111:
                        return new C26945c(this.f36572a.m46095R7(), (C26456a) this.f36572a.f36306S1.get(), (PreferencesApiManager) this.f36572a.f36224I.get());
                    case 112:
                        return new C26456a();
                    case 113:
                        return new C27782g(this.f36572a.m46095R7(), (C27519a) this.f36572a.f36322U1.get(), this.f36572a.m46115T7());
                    case 114:
                        return new C27519a();
                    case 115:
                        return new C28365g(this.f36572a.m46095R7(), (C28191a) this.f36572a.f36338W1.get());
                    case 116:
                        return new C28191a();
                    case 117:
                        return new C28212i((C27532a) this.f36572a.f36359Z1.get(), this.f36572a.m46350q9(), this.f36572a.m46195b8(), new C28039f(), new C28042i(), this.f36572a.m45955D7(), new C28041h(), new C28038e(), new C28037d(), new C28043j(), new C28035b(), new C28034a(), (SharedPreferences) this.f36572a.f36176C.get());
                    case 118:
                        return C28796b.m88261a(this.f36572a.f36484p, this.f36572a.m46400v7(), (C41944z) this.f36572a.f36352Y1.get(), (TargetEnvironment) this.f36572a.f36216H.get());
                    case 119:
                        return C37632d.m110651a(this.f36572a.m46046M8(), this.f36572a.m46186a9(), this.f36572a.m46359r7(), (C41935w) this.f36572a.f36280P.get(), this.f36572a.m46390u7());
                    case 120:
                        return new C20241b((C19385a) this.f36572a.f36383c2.get(), this.f36572a.m46195b8(), new C19756a());
                    case 121:
                        return C24725b.m79287a((C43511w) this.f36572a.f36320U.get());
                    case 122:
                        return new C30497c((C31134a) this.f36572a.f36399e2.get(), this.f36572a.m46306m9(), (C38345b) this.f36572a.f36431i2.get(), (Client) this.f36572a.f36389d0.get());
                    case 123:
                        return C31543b.m93620a((C43511w) this.f36572a.f36320U.get());
                    case 124:
                        return new C39908c((C39474a) this.f36572a.f36415g2.get());
                    case 125:
                        return new C37464c(this.f36572a.m46016J8(), this.f36572a.m46195b8(), (C39103a) this.f36572a.f36407f2.get(), this.f36572a.m46026K8(), (Client) this.f36572a.f36389d0.get());
                    case 126:
                        return new C37265a((SharedPreferences) this.f36572a.f36176C.get());
                    case C11051p3.f31760d:
                        return new C37701b((C37248a) this.f36572a.f36455l2.get(), new C37386a());
                    case 128:
                        return C38228b.m112429a((C43511w) this.f36572a.f36320U.get());
                    case 129:
                        return new C26277g((IRetrofitService) this.f36572a.f36350Y.get(), (C26063b) this.f36572a.f36479o2.get());
                    case 130:
                        return new C26063b();
                    case 131:
                        return new C28074i((IRetrofitService) this.f36572a.f36350Y.get(), new C27861a());
                    case 132:
                        return new C26558e(this.f36572a.m46441z8(), (C26055a) this.f36572a.f36503r2.get(), this.f36572a.m46195b8());
                    case 133:
                        return new C26055a();
                    case 134:
                        return new C18046k((C18263a) this.f36572a.f36527u2.get(), new C18459a(), new C18645b(), new C18644a());
                    case 135:
                        return C18978b.m64090a(this.f36572a.f36492q, (C43511w) this.f36572a.f36320U.get());
                    case 136:
                        return new C39085o((C38526a) this.f36572a.f36543w2.get(), (C27640a) this.f36572a.f36446k1.get(), (C38794b) this.f36572a.f36551x2.get(), (C38793a) this.f36572a.f36559y2.get(), (C26116a) this.f36572a.f36567z2.get());
                    case 137:
                        return C39674b.m115267a((C43511w) this.f36572a.f36320U.get());
                    case 138:
                        return new C38794b();
                    case 139:
                        return new C38793a();
                    case 140:
                        return new C26116a();
                    case 141:
                        return new C26584k((IRetrofitService) this.f36572a.f36350Y.get(), (C27618a) this.f36572a.f36179C2.get());
                    case 142:
                        return new C27618a((C20289a) this.f36572a.f36171B2.get(), (Client) this.f36572a.f36389d0.get());
                    case 143:
                        return new C20289a();
                    case 144:
                        return new C26591q((IRetrofitService) this.f36572a.f36350Y.get(), (C27618a) this.f36572a.f36179C2.get(), (C27074a) this.f36572a.f36195E2.get());
                    case 145:
                        return new C27077d();
                    case 146:
                        return new C28477d((IRetrofitService) this.f36572a.f36350Y.get(), (C29130a) this.f36572a.f36211G2.get());
                    case 147:
                        return new C29130a();
                    case 148:
                        return new ContactsRepositoryImpl((IRetrofitService) this.f36572a.f36350Y.get(), (C20289a) this.f36572a.f36171B2.get(), (C20051a) this.f36572a.f36227I2.get(), (C27494a) this.f36572a.f36414g1.get());
                    case 149:
                        return new C20052b();
                    case 150:
                        return new C26071f((IRetrofitService) this.f36572a.f36350Y.get(), (C25764a) this.f36572a.f36243K2.get(), (C25677a) this.f36572a.f36251L2.get());
                    case 151:
                        return new C25764a();
                    case 152:
                        return new C39744a((C38606b) this.f36572a.f36281P0.get());
                    case 153:
                        return new C26082n((IRetrofitService) this.f36572a.f36350Y.get(), (C25768d) this.f36572a.f36267N2.get(), (C25767c) this.f36572a.f36275O2.get(), (C25766b) this.f36572a.f36283P2.get(), (RetrofitClient) this.f36572a.f36421h0.get(), (RootBankApiManager) this.f36572a.f36413g0.get(), (C25681e) this.f36572a.f36291Q2.get());
                    case 154:
                        return new C25768d();
                    case 155:
                        return new C25767c();
                    case 156:
                        return new C25766b();
                    case 157:
                        return new C39746c((C38606b) this.f36572a.f36281P0.get());
                    case 158:
                        return new C26291g((IRetrofitService) this.f36572a.f36350Y.get(), new C26606a());
                    case 159:
                        return new C31441h(this.f36572a.m46066O8(), (C31610c) this.f36572a.f36315T2.get(), (C31611d) this.f36572a.f36323U2.get(), (C31608a) this.f36572a.f36331V2.get(), (C31609b) this.f36572a.f36339W2.get());
                    case 160:
                        return new C31610c();
                    case 161:
                        return new C31611d();
                    case 162:
                        return new C31608a();
                    case 163:
                        return new C31609b();
                    case 164:
                        return new C36340b(this.f36572a.m46195b8(), this.f36572a.m46216d9());
                    case 165:
                        return new C28087d((IRetrofitService) this.f36572a.f36350Y.get(), (C28260a) this.f36572a.f36368a3.get());
                    case 166:
                        return new C28260a();
                    case 167:
                        return new C17047y();
                    case 168:
                        return new C25352k((C25679c) this.f36572a.f36456l3.get());
                    case 169:
                        return new C25679c((C25683g) this.f36572a.f36416g3.get(), (C25684h) this.f36572a.f36344X0.get(), (C25677a) this.f36572a.f36251L2.get(), (C25678b) this.f36572a.f36424h3.get(), (C25682f) this.f36572a.f36432i3.get(), (C25681e) this.f36572a.f36291Q2.get(), (C25680d) this.f36572a.f36448k3.get());
                    case 170:
                        return new C39748e((C38606b) this.f36572a.f36281P0.get());
                    case 171:
                        return new C39745b((C38606b) this.f36572a.f36281P0.get());
                    case 172:
                        return new C39747d((C38606b) this.f36572a.f36281P0.get());
                    case 173:
                        return new C17640e((C17535h) this.f36572a.f36440j3.get(), this.f36572a.getProductTypeListUseCase());
                    case 174:
                        return new C17535h((C17385a) this.f36572a.f36178C1.get());
                    case 175:
                        return new C26312b((IRetrofitService) this.f36572a.f36350Y.get());
                    case 176:
                        return C16481b.m58703a(this.f36572a.f36508s, (C43511w) this.f36572a.f36320U.get());
                    case 177:
                        return new C15700a();
                    case 178:
                        return new C10083a(new C27094a(), (C10092j) this.f36572a.f36520t3.get());
                    case 179:
                        return new C10092j((C10101r) this.f36572a.f36512s3.get());
                    case SubsamplingScaleImageView.ORIENTATION_180 /*180*/:
                        return new C10101r((C10102s) this.f36572a.f36504r3.get());
                    case 181:
                        return new C10102s();
                    case 182:
                        return new C28706b(this.f36572a.m46065O7(), this.f36572a.m46195b8(), this.f36572a.m46115T7(), new C28357a());
                    case 183:
                        return new C10085c((C10088f) this.f36572a.f36544w3.get(), (C10093k) this.f36572a.f36552x3.get(), (C10095m) this.f36572a.f36560y3.get(), (C10098p) this.f36572a.f36568z3.get(), (C10084b) this.f36572a.f36164A3.get(), (C10103t) this.f36572a.f36172B3.get(), (C10094l) this.f36572a.f36180C3.get(), (C10096n) this.f36572a.f36188D3.get(), (C10097o) this.f36572a.f36196E3.get(), (C10090h) this.f36572a.f36204F3.get(), (C19337a) this.f36572a.f36212G3.get(), (C10087e) this.f36572a.f36220H3.get(), (C10091i) this.f36572a.f36228I3.get(), (C10092j) this.f36572a.f36520t3.get(), (C32053a) this.f36572a.f36236J3.get());
                    case 184:
                        return new C10088f();
                    case 185:
                        return new C10093k();
                    case 186:
                        return new C10095m();
                    case 187:
                        return new C10098p();
                    case 188:
                        return new C10084b();
                    case 189:
                        return new C10103t();
                    case 190:
                        return new C10094l();
                    case 191:
                        return new C10096n(new C27094a());
                    case 192:
                        return new C10097o(new C27094a());
                    case 193:
                        return new C10090h();
                    case 194:
                        return new C19337a();
                    case 195:
                        return new C10087e();
                    case 196:
                        return new C10091i();
                    case 197:
                        return new C32053a();
                    case 198:
                        return new C28474a();
                    case 199:
                        return new C38884p0();
                    default:
                        throw new AssertionError(this.f36573b);
                }
            }

            /* renamed from: d */
            private Object m46458d() {
                switch (this.f36573b) {
                    case BogInputLayout.INPUT_NORMAL_STATE /*200*/:
                        return new C29814b(this.f36572a.m46265i8(), (C29449a) this.f36572a.f36268N3.get(), this.f36572a.m46195b8());
                    case BogInputLayout.INPUT_ERROR_STATE /*201*/:
                        return new C29449a();
                    case 202:
                        return C16483b.m58705a((C43511w) this.f36572a.f36320U.get());
                    case 203:
                        return new C15362a();
                    case 204:
                        return new C18262a();
                    case 205:
                        return new MoneyTransferRepositoryImpl(this.f36572a.m46176Z8(), (IRetrofitService) this.f36572a.f36350Y.get(), (C19416b) this.f36572a.f36316T3.get(), (C19415a) this.f36572a.f36324U3.get(), (C29858a) this.f36572a.f36250L1.get());
                    case 206:
                        return new C19416b();
                    case 207:
                        return new C19415a();
                    case 208:
                        return new C19342a();
                    case 209:
                        return new C24922c();
                    case 210:
                        return C36265d.m107698a(this.f36572a.f36516t, (C43511w) this.f36572a.f36320U.get());
                    case 211:
                        return C36264c.m107697a(this.f36572a.f36516t, (C43511w) this.f36572a.f36397e0.get());
                    case 212:
                        return new C38290c((C38293d) this.f36572a.f36369a4.get(), (C38288a) this.f36572a.f36377b4.get());
                    case 213:
                        return C38454b.m112886a((C43511w) this.f36572a.f36320U.get());
                    case 214:
                        return new C38288a();
                    case 215:
                        return new C25369e((C25865a) this.f36572a.f36417g4.get());
                    case 216:
                        return new DepositRepositoryImpl((IRetrofitService) this.f36572a.f36350Y.get(), (C20456a) this.f36572a.f36393d4.get(), (C20787a) this.f36572a.f36401e4.get(), (C26116a) this.f36572a.f36567z2.get(), (Gson) this.f36572a.f36288Q.get());
                    case 217:
                        return C25138b.m80192a(this.f36572a.f36524u, (C43511w) this.f36572a.f36320U.get());
                    case 218:
                        return new C20787a();
                    case 219:
                        return new C25375j((C25865a) this.f36572a.f36417g4.get());
                    case 220:
                        return new C25370f((C25865a) this.f36572a.f36417g4.get());
                    case 221:
                        return new C27696b();
                    case 222:
                        return new C20553c((C25057a) this.f36572a.f36473n4.get(), this.f36572a.m46339p9());
                    case 223:
                        return C25062c.m80015a(this.f36572a.f36532v, (C43511w) this.f36572a.f36465m4.get());
                    case 224:
                        return C25064e.m80017a(this.f36572a.f36532v, (C41944z) this.f36572a.f36457l4.get(), (TargetEnvironment) this.f36572a.f36216H.get());
                    case 225:
                        return C25063d.m80016a(this.f36572a.f36532v, (C37350a) this.f36572a.f36192E.get(), (PreferencesApiManager) this.f36572a.f36224I.get());
                    case 226:
                        return C31262b.m92867a();
                    case 227:
                        return new C17574b();
                    case 228:
                        return C31395b.m93319a((C43511w) this.f36572a.f36320U.get());
                    case 229:
                        return new C31874d((C31614b) this.f36572a.f36529u4.get(), this.f36572a.m46215d8());
                    case 230:
                        return new C31614b();
                    case 231:
                        return new C25544d(this.f36572a.m45995H7(), new C25542b());
                    case 232:
                        return new C31904c(this.f36572a.m46126U8(), (C36139a) this.f36572a.f36553x4.get(), (C36141b) this.f36572a.f36561y4.get());
                    case 233:
                        return new C36139a();
                    case 234:
                        return new C36141b();
                    case 235:
                        return new C28928c((IRetrofitService) this.f36572a.f36350Y.get(), (C29155a) this.f36572a.f36173B4.get());
                    case 236:
                        return new C29155a();
                    case 237:
                        return new C39192a((SharedPreferences) this.f36572a.f36176C.get());
                    case 238:
                        return new C21546a();
                    case 239:
                        return new C19411a();
                    case 240:
                        return RetrofitGoogleApiModule_ProvideRetrofitGoogleApiFactory.provideRetrofitGoogleApi(this.f36572a.f36540w, (RetrofitGoogleClient) this.f36572a.f36213G4.get());
                    case 241:
                        return RetrofitGoogleApiModule_ProvideRetrofitGoogleClientFactory.provideRetrofitGoogleClient(this.f36572a.f36540w, (PreferencesApiManager) this.f36572a.f36224I.get());
                    case 242:
                        return new C28502b((IRetrofitService) this.f36572a.f36350Y.get(), (C28259a) this.f36572a.f36229I4.get());
                    case 243:
                        return new C28259a();
                    case 244:
                        return EventBusModule_ProvideEventBusWrapperFactory.provideEventBusWrapper(this.f36572a.f36396e, (C41438c) this.f36572a.f36184D.get());
                    case 245:
                        return new C12372p((C10520a) this.f36572a.f36253L4.get(), (C26116a) this.f36572a.f36567z2.get(), (C10343a) this.f36572a.f36261M4.get(), (Gson) this.f36572a.f36288Q.get());
                    case 246:
                        return new C10520a();
                    case 247:
                        return C12937b.m48863a((C43511w) this.f36572a.f36320U.get());
                    case 248:
                        return new C19284d(this.f36572a.m45926A8());
                    case 249:
                        return new C29563c((IRetrofitService) this.f36572a.f36350Y.get(), (C30393a) this.f36572a.f36285P4.get());
                    case 250:
                        return new C30393a();
                    case 251:
                        return new C25374i((C25865a) this.f36572a.f36417g4.get());
                    case 252:
                        return new C25367d((C25365b) this.f36572a.f36317T4.get(), (C25366c) this.f36572a.f36325U4.get());
                    case 253:
                        return new C25365b((C25865a) this.f36572a.f36417g4.get());
                    case 254:
                        return new C25366c((C25865a) this.f36572a.f36417g4.get());
                    case C11051p3.f31759c:
                        return new C27697c();
                    case C11398b.f33139r:
                        return new C27695a();
                    case 257:
                        return new C29571b((IRetrofitService) this.f36572a.f36350Y.get(), (C29858a) this.f36572a.f36250L1.get());
                    case 258:
                        return new C38324e((C37705a) this.f36572a.f36370a5.get(), (C26116a) this.f36572a.f36567z2.get(), new C37939a(), new C38233a());
                    case 259:
                        return C38777b.m113504a((C43511w) this.f36572a.f36320U.get());
                    case 260:
                        return new C37453b();
                    case 261:
                        return new C25326a();
                    case 262:
                        return new C29157b((IRetrofitService) this.f36572a.f36350Y.get(), new C29569a());
                    case 263:
                        return new C29644a();
                    case 264:
                        return new C25054b((IRetrofitService) this.f36572a.f36350Y.get());
                    case 265:
                        return new C36242m();
                    case 266:
                        return new C25247b((IRetrofitService) this.f36572a.f36350Y.get(), (C27621a) this.f36572a.f36458l5.get());
                    case 267:
                        return new C27621a();
                    case 268:
                        return new C20049a();
                    case 269:
                        return new C19404c((IRetrofitService) this.f36572a.f36350Y.get(), (C19793a) this.f36572a.f36498q5.get());
                    case SubsamplingScaleImageView.ORIENTATION_270 /*270*/:
                        return new C19793a((C19410e) this.f36572a.f36490p5.get());
                    case 271:
                        return new C19410e();
                    case 272:
                        return new C28253a((IRetrofitService) this.f36572a.f36350Y.get());
                    case 273:
                        return new C30401b((IRetrofitService) this.f36572a.f36350Y.get(), (C19276a) this.f36572a.f36538v5.get());
                    case 274:
                        return new C19276a();
                    case 275:
                        return new C31871b((C31613a) this.f36572a.f36562y5.get(), this.f36572a.m46215d8());
                    case 276:
                        return new C31613a();
                    case 277:
                        return new C27493a();
                    case 278:
                        return new C30396c((IRetrofitService) this.f36572a.f36350Y.get(), (C26092d) this.f36572a.f36174B5.get(), (C26091c) this.f36572a.f36190D5.get());
                    case 279:
                        return new C26092d();
                    case 280:
                        return new C26091c((C26065d) this.f36572a.f36182C5.get());
                    case 281:
                        return new C26065d();
                    case 282:
                        return new C26089b();
                    case 283:
                        return new C25252d((IRetrofitService) this.f36572a.f36350Y.get(), (C26116a) this.f36572a.f36567z2.get(), (C26059a) this.f36572a.f36222H5.get(), (C27494a) this.f36572a.f36414g1.get());
                    case 284:
                        return new C26059a();
                    case 285:
                        return new CreditInfoRepositoryImpl((IRetrofitService) this.f36572a.f36350Y.get(), new C25763a());
                    case 286:
                        return new C28064b();
                    case 287:
                        return new C28063a((C28064b) this.f36572a.f36262M5.get());
                    case 288:
                        return new CreditOfferRepositoryImpl((IRetrofitService) this.f36572a.f36350Y.get(), (C24777a) this.f36572a.f36278O5.get(), (C26116a) this.f36572a.f36567z2.get(), (Gson) this.f36572a.f36288Q.get());
                    case 289:
                        return new C24777a();
                    case 290:
                        return new C19150a();
                    case 291:
                        return new C38108h((PreferencesApiManager) this.f36572a.f36224I.get());
                    case 292:
                        return new C28331b((C28334c) this.f36572a.f36318T5.get(), this.f36572a.m46005I7());
                    case 293:
                        return C29246b.m89216a(this.f36572a.f36548x, this.f36572a.m46400v7(), (C41944z) this.f36572a.f36352Y1.get(), (TargetEnvironment) this.f36572a.f36216H.get());
                    case 294:
                        return new C37295i((C31874d) this.f36572a.f36537v4.get());
                    case 295:
                        return new C27809c(this.f36572a.m46115T7(), this.f36572a.m46411w8());
                    case 296:
                        return new C37637h(C17958c.m61876a(this.f36572a.f36388d));
                    case 297:
                        return new C26282i((IRetrofitService) this.f36572a.f36350Y.get(), (C26064c) this.f36572a.f36363Z5.get());
                    case 298:
                        return new C26064c((C26092d) this.f36572a.f36174B5.get(), (C26065d) this.f36572a.f36182C5.get());
                    case 299:
                        return new C29161b((IRetrofitService) this.f36572a.f36350Y.get());
                    default:
                        throw new AssertionError(this.f36573b);
                }
            }

            /* renamed from: e */
            private Object m46459e() {
                switch (this.f36573b) {
                    case BogInputLayout.INPUT_TYPE_TEXT_PASSWORD /*300*/:
                        return new C32080b((Client) this.f36572a.f36389d0.get());
                    case BogInputLayout.INPUT_TYPE_NUM_PASSWORD /*301*/:
                        return new C28455i();
                    case BogInputLayout.INPUT_TYPE_NUM_REAL /*302*/:
                        return new C28450e();
                    case BogInputLayout.INPUT_TYPE_NUM_DIGIT /*303*/:
                        return new C28451f((C32080b) this.f36572a.f36403e6.get());
                    case BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS /*304*/:
                        return new C28453g();
                    case BogInputLayout.INPUT_TYPE_NUM_PHONE /*305*/:
                        return new C27843a((C28449d) this.f36572a.f36459l6.get(), (C28455i) this.f36572a.f36411f6.get(), (C28450e) this.f36572a.f36419g6.get(), (C28451f) this.f36572a.f36427h6.get(), (C28453g) this.f36572a.f36435i6.get(), (C38105e) this.f36572a.f36467m6.get(), (C38277b) this.f36572a.f36491p6.get(), this.f36572a.m46275j8());
                    case BogInputLayout.INPUT_TYPE_NUMBER_SIGNED /*306*/:
                        return new C28449d((C28460m) this.f36572a.f36443j6.get(), (C28458k) this.f36572a.f36451k6.get());
                    case BogInputLayout.INPUT_TYPE_EMAIL /*307*/:
                        return new C28460m((Client) this.f36572a.f36389d0.get());
                    case 308:
                        return new C28458k((Client) this.f36572a.f36389d0.get());
                    case 309:
                        return new C38105e((C32080b) this.f36572a.f36403e6.get());
                    case 310:
                        return new C38277b((C38100a) this.f36572a.f36483o6.get(), this.f36572a.m46185a8());
                    case 311:
                        return new C38100a((C38102b) this.f36572a.f36475n6.get());
                    case 312:
                        return new C38102b((PreferencesApiManager) this.f36572a.f36224I.get());
                    case 313:
                        return new C28047a(C17957b.m61875a(this.f36572a.f36388d));
                    case 314:
                        return new IdentityVerificationRepositoryImpl((IRetrofitService) this.f36572a.f36350Y.get(), (C26095a) this.f36572a.f36515s6.get());
                    case 315:
                        return new C26095a();
                    case 316:
                        return new C27869a();
                    case 317:
                        return new C28521a((IRetrofitService) this.f36572a.f36350Y.get());
                    case 318:
                        return new C20577a((IRetrofitService) this.f36572a.f36350Y.get());
                    case 319:
                        return new C38419b(this.f36572a.m45975F7(), (C37894a) this.f36572a.f36167A6.get(), this.f36572a.m45965E7(), (Client) this.f36572a.f36389d0.get());
                    case 320:
                        return new C37894a(this.f36572a.m46015J7());
                    case 321:
                        return new C28114a((IRetrofitService) this.f36572a.f36350Y.get());
                    case 322:
                        return new C25333a();
                    case 323:
                        return new C27908h();
                    case 324:
                        return new C25484a((IRetrofitService) this.f36572a.f36350Y.get());
                    case 325:
                        return new C25843b((IRetrofitService) this.f36572a.f36350Y.get(), (C26147a) this.f36572a.f36231I6.get());
                    case 326:
                        return new C26147a();
                    case 327:
                        return new C27945a();
                    case 328:
                        return new C19339b((IRetrofitService) this.f36572a.f36350Y.get(), (C19520a) this.f36572a.f36263M6.get());
                    case 329:
                        return new C19520a();
                    case 330:
                        return new C24889a();
                    case 331:
                        return new C27079b((IRetrofitService) this.f36572a.f36350Y.get(), (C27620a) this.f36572a.f36287P6.get());
                    case 332:
                        return new C27620a();
                    case 333:
                        return new C38113l((Client) this.f36572a.f36389d0.get(), C17958c.m61876a(this.f36572a.f36388d));
                    case 334:
                        return new C30405b((IRetrofitService) this.f36572a.f36350Y.get(), (C30113a) this.f36572a.f36319T6.get());
                    case 335:
                        return new C30113a();
                    default:
                        throw new AssertionError(this.f36573b);
                }
            }

            public Object get() {
                int i = this.f36573b / 100;
                if (i == 0) {
                    return m46456b();
                }
                if (i == 1) {
                    return m46457c();
                }
                if (i == 2) {
                    return m46458d();
                }
                if (i == 3) {
                    return m46459e();
                }
                throw new AssertionError(this.f36573b);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: A7 */
        public C25490f m45925A7() {
            return new C25490f(new C36743o());
        }

        /* access modifiers changed from: private */
        /* renamed from: A8 */
        public C30413a m45926A8() {
            return C19810b.m65582a((C43511w) this.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: B7 */
        public C25491g m45935B7() {
            return new C25491g((PreferencesApiManager) this.f36224I.get(), (TargetEnvironment) this.f36216H.get());
        }

        /* renamed from: B8 */
        private C31616d m45936B8() {
            return new C31616d((C31617e) this.f36541w0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: C7 */
        public C25492h m45945C7() {
            return new C25492h((SessionManager) this.f36256M.get());
        }

        /* renamed from: C8 */
        private C20295e m45946C8() {
            return new C20295e((C24779a) this.f36373b0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: D7 */
        public C28036c m45955D7() {
            return new C28036c(new C28035b());
        }

        /* access modifiers changed from: private */
        /* renamed from: D8 */
        public C39489h m45956D8() {
            return new C39489h(C17958c.m61876a(this.f36388d), m46076P8(), (Gson) this.f36288Q.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: E7 */
        public C38279a m45965E7() {
            return new C38279a((SharedPreferences) this.f36176C.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: E8 */
        public C36741m m45966E8() {
            return new C36741m((C36356a) this.f36517t0.get(), (C27775b) this.f36392d3.get(), (SessionManager) this.f36256M.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: F7 */
        public C38115a m45975F7() {
            return C38636b.m113228a((C43511w) this.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: F8 */
        public C36742n m45976F8() {
            return new C36742n((C36356a) this.f36517t0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: G7 */
        public C19806a m45985G7() {
            return new C19806a((C19414a) this.f36430i1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: G8 */
        public C38795a m45986G8() {
            return C39676b.m115269a(this.f36564z, (C43511w) this.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: H7 */
        public C25541a m45995H7() {
            return C25798b.m81095a((C43511w) this.f36320U.get());
        }

        /* renamed from: H8 */
        private Map m45996H8() {
            return C18328c.m62671b(2).mo46101c("ge.bog.mobilebank.services.datagathering.InstalledAppsDataReportWorker", this.f36525u0).mo46101c("ge.bog.mobilebank.services.datagathering.LocationWifiDataReportWorker", this.f36533v0).mo46100a();
        }

        /* access modifiers changed from: private */
        /* renamed from: I7 */
        public C28336d m46005I7() {
            return new C28336d((C37295i) this.f36326U5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: I8 */
        public C36877b m46006I8() {
            return new C36877b(m46317n9(), m46195b8());
        }

        /* access modifiers changed from: private */
        /* renamed from: J7 */
        public C30481a m46015J7() {
            return new C30481a((Gson) this.f36288Q.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: J8 */
        public C37804a m46016J8() {
            return C38250b.m112462a((C43511w) this.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: K7 */
        public C39483d m46025K7() {
            return new C39483d(C17958c.m61876a(this.f36388d), (Gson) this.f36288Q.get(), m46086Q8());
        }

        /* access modifiers changed from: private */
        /* renamed from: K8 */
        public C37155a m46026K8() {
            return new C37155a((Gson) this.f36288Q.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: L7 */
        public C29675k m46035L7() {
            return new C29675k((C25374i) this.f36309S4.get(), (C25367d) this.f36333V4.get(), (C27697c) this.f36341W4.get(), (C27695a) this.f36348X4.get(), (TargetEnvironment) this.f36216H.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: L8 */
        public C40262b m46036L8() {
            return new C40262b(m46106S8(), m46086Q8());
        }

        /* access modifiers changed from: private */
        /* renamed from: M7 */
        public C29967k m46045M7() {
            return new C29967k((C25369e) this.f36425h4.get(), (C25375j) this.f36433i4.get(), m46115T7(), refreshProductTypeListUseCase(), refreshAssetLiabilityUseCase(), (PreferencesApiManager) this.f36224I.get(), (Client) this.f36389d0.get(), (C25370f) this.f36441j4.get(), (C27696b) this.f36449k4.get(), (C27494a) this.f36414g1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: M8 */
        public C41944z.C41945a m46046M8() {
            return C37631c.m110650a((C38128a) this.f36240K.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: N7 */
        public C28187a m46055N7() {
            return C29989b.m90952a((C43511w) this.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: N8 */
        public C26196b m46056N8() {
            return new C26196b(m46095R7());
        }

        /* access modifiers changed from: private */
        /* renamed from: O7 */
        public C28190a m46065O7() {
            return C29320b.m89396a((C43511w) this.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: O8 */
        public C31450i m46066O8() {
            return C32016b.m94461a(this.f36500r, (C43511w) this.f36320U.get());
        }

        /* renamed from: P7 */
        private C20291a m46075P7() {
            return new C20291a((C24779a) this.f36373b0.get());
        }

        /* renamed from: P8 */
        private C39706c m46076P8() {
            return new C39706c(m46165Y7());
        }

        /* access modifiers changed from: private */
        /* renamed from: Q7 */
        public C28003a m46085Q7() {
            return new C28003a((SharedPreferences) this.f36176C.get());
        }

        /* renamed from: Q8 */
        private C31097c m46086Q8() {
            return new C31097c(m46165Y7());
        }

        /* access modifiers changed from: private */
        /* renamed from: R7 */
        public C25429w0 m46095R7() {
            return C29040b.m88866a((C43511w) this.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: R8 */
        public C39110b m46096R8() {
            return new C39110b((SharedPreferences) this.f36176C.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: S7 */
        public C20007a m46105S7() {
            return new C20007a((SharedPreferences) this.f36176C.get(), m46195b8(), (Client) this.f36389d0.get());
        }

        /* renamed from: S8 */
        private C40264c m46106S8() {
            return C31216b.m92790a((C43511w) this.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: T7 */
        public C20292b m46115T7() {
            return new C20292b((C24779a) this.f36373b0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: T8 */
        public ProductsService m46116T8() {
            return C38394f.m112758a(this.f36468n, (C43511w) this.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: U7 */
        public C20293c m46125U7() {
            return new C20293c((C24779a) this.f36373b0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: U8 */
        public C32039a m46126U8() {
            return C36692b.m108815a((C43511w) this.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: V7 */
        public C38881o m46135V7() {
            return new C38881o((C38606b) this.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: V8 */
        public C38426a m46136V8() {
            return new C38426a((Gson) this.f36288Q.get(), (C39780a) this.f36304S.get());
        }

        /* renamed from: W7 */
        private C19724a m46145W7() {
            return new C19724a((C19370a) this.f36485p0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: W8 */
        public C41866b m46146W8() {
            return C37633e.m110652a(new C36740l(), new C36743o(), (SessionManager) this.f36256M.get(), m46186a9());
        }

        /* renamed from: X7 */
        private C29990a m46155X7() {
            return new C29990a((C19370a) this.f36485p0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: X8 */
        public C43511w.C43513b m46156X8() {
            return C37643m.m110667a((Gson) this.f36288Q.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Y7 */
        public C30288a m46165Y7() {
            return new C30288a(m46155X7());
        }

        /* access modifiers changed from: private */
        /* renamed from: Y8 */
        public C30268c m46166Y8() {
            return new C30268c((C29956b) this.f36343X.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Z7 */
        public C19725b m46175Z7() {
            return new C19725b(m46115T7());
        }

        /* access modifiers changed from: private */
        /* renamed from: Z8 */
        public C19811a m46176Z8() {
            return C20307b.m66356a((C43511w) this.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: a8 */
        public C27866a m46185a8() {
            return new C27866a((C28108a) this.f36237J4.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: a9 */
        public C38639a m46186a9() {
            return new C38639a((C36869a) this.f36248L.get(), (C37350a) this.f36192E.get(), new C36736h(), new C36740l(), m46421x8());
        }

        /* access modifiers changed from: private */
        /* renamed from: b8 */
        public C36735g m46195b8() {
            return new C36735g((C36356a) this.f36517t0.get());
        }

        /* renamed from: b9 */
        private C36744p m46196b9() {
            return new C36744p((C36356a) this.f36517t0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: c8 */
        public C39908c m46205c8() {
            return new C39908c((C39474a) this.f36415g2.get());
        }

        /* renamed from: c9 */
        private C40021b m46206c9() {
            return new C40021b((C40147a) this.f36296R.get(), (C36869a) this.f36248L.get(), (C37350a) this.f36192E.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: d8 */
        public C31615c m46215d8() {
            return new C31615c((C31617e) this.f36541w0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: d9 */
        public C36142a m46216d9() {
            return C36863b.m109220a((C43511w) this.f36320U.get());
        }

        /* renamed from: e8 */
        private C19727c m46225e8() {
            return new C19727c((C19370a) this.f36485p0.get());
        }

        /* renamed from: e9 */
        private C12291f0 m46226e9() {
            return new C12291f0(m45936B8(), m46215d8());
        }

        /* access modifiers changed from: private */
        /* renamed from: f8 */
        public C38878m0 m46235f8() {
            return new C38878m0((C38606b) this.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: f9 */
        public C36878c m46236f9() {
            return new C36878c(m46115T7());
        }

        /* access modifiers changed from: private */
        /* renamed from: g8 */
        public C31133a m46245g8() {
            return new C31133a(m46206c9());
        }

        /* access modifiers changed from: private */
        /* renamed from: g9 */
        public C36880d m46246g9() {
            return new C36880d(m46115T7());
        }

        /* renamed from: h8 */
        private C36737i m46255h8() {
            return new C36737i((C36356a) this.f36517t0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: h9 */
        public C26016e m46256h9() {
            return new C26016e(m46115T7(), m46075P7());
        }

        /* access modifiers changed from: private */
        /* renamed from: i8 */
        public C28800a m46265i8() {
            return C30317b.m91426a((C43511w) this.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: i9 */
        public C26023i m46266i9() {
            return new C26023i(m46115T7(), m46411w8(), (Client) this.f36389d0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: j8 */
        public C28456j m46275j8() {
            return new C28456j((Client) this.f36389d0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: j9 */
        public C29351n0 m46276j9() {
            return new C29351n0(m46195b8(), m46085Q7());
        }

        /* renamed from: k8 */
        private C6502a m46285k8() {
            return C6505d.m25689a(m45996H8());
        }

        /* access modifiers changed from: private */
        /* renamed from: k9 */
        public C36884g m46286k9() {
            return new C36884g(m46115T7(), m46411w8());
        }

        /* access modifiers changed from: private */
        /* renamed from: l8 */
        public C19728d m46295l8() {
            return new C19728d((C19370a) this.f36485p0.get(), C39777b.m115545a());
        }

        /* access modifiers changed from: private */
        /* renamed from: l9 */
        public C19807b m46296l9() {
            return new C19807b((C19414a) this.f36430i1.get());
        }

        /* renamed from: m8 */
        private C36739k m46305m8() {
            return new C36739k((C36356a) this.f36517t0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: m9 */
        public C40023a m46306m9() {
            return new C40023a(m46015J7());
        }

        /* renamed from: n8 */
        private void m46316n8(AppModule appModule, C31666c cVar, C17956a aVar, BankApiManagerModule bankApiManagerModule, C20286a aVar2, C12922a aVar3, C19795a aVar4, C25133a aVar5, C29245a aVar6, C12479b bVar, C16480a aVar7, C25137a aVar8, C36871b bVar2, C34672a aVar9, EventBusModule eventBusModule, C18977a aVar10, C39675a aVar11, C25059b bVar3, C28795a aVar12, C36263b bVar4, C32015a aVar13, PreferencesApiManagerModule preferencesApiManagerModule, C38393e eVar, RetrofitApiModule retrofitApiModule, RetrofitGoogleApiModule retrofitGoogleApiModule, SharedPreferencesModule sharedPreferencesModule) {
            this.f36168B = C18327b.m62669a(new C12273a(this.f36160A, 3));
            this.f36176C = C18327b.m62669a(new C12273a(this.f36160A, 2));
            this.f36184D = C18327b.m62669a(new C12273a(this.f36160A, 4));
            this.f36192E = C18327b.m62669a(new C12273a(this.f36160A, 5));
            this.f36200F = C18327b.m62669a(new C12273a(this.f36160A, 7));
            this.f36208G = C18327b.m62669a(new C12273a(this.f36160A, 8));
            this.f36216H = C18327b.m62669a(new C12273a(this.f36160A, 6));
            this.f36224I = C18327b.m62669a(new C12273a(this.f36160A, 1));
            this.f36232J = C18327b.m62669a(new C12273a(this.f36160A, 14));
            this.f36240K = C18327b.m62669a(new C12273a(this.f36160A, 13));
            this.f36248L = C18327b.m62669a(new C12273a(this.f36160A, 15));
            this.f36256M = C18327b.m62669a(new C12273a(this.f36160A, 16));
            C12273a aVar14 = new C12273a(this.f36160A, 18);
            this.f36264N = aVar14;
            this.f36272O = C18331f.m62681a(aVar14);
            this.f36280P = C18327b.m62669a(new C12273a(this.f36160A, 17));
            this.f36288Q = C18327b.m62669a(new C12273a(this.f36160A, 19));
            this.f36296R = C18327b.m62669a(new C12273a(this.f36160A, 21));
            this.f36304S = C18327b.m62669a(new C12273a(this.f36160A, 20));
            this.f36312T = C18327b.m62669a(new C12273a(this.f36160A, 12));
            this.f36320U = C18327b.m62669a(new C12273a(this.f36160A, 11));
            this.f36328V = C18327b.m62669a(new C12273a(this.f36160A, 10));
            this.f36336W = C18331f.m62681a(new C12273a(this.f36160A, 22));
            this.f36343X = C18327b.m62669a(new C12273a(this.f36160A, 9));
            this.f36350Y = C18327b.m62669a(new C12273a(this.f36160A, 24));
            this.f36357Z = C18327b.m62669a(new C12273a(this.f36160A, 25));
            this.f36365a0 = C18327b.m62669a(new C12273a(this.f36160A, 26));
            this.f36373b0 = C18327b.m62669a(new C12273a(this.f36160A, 23));
            this.f36381c0 = C18331f.m62681a(new C12273a(this.f36160A, 27));
            this.f36389d0 = C18327b.m62669a(new C12273a(this.f36160A, 0));
            this.f36397e0 = C18327b.m62669a(new C12273a(this.f36160A, 30));
            this.f36405f0 = C18327b.m62669a(new C12273a(this.f36160A, 29));
            this.f36413g0 = C18327b.m62669a(new C12273a(this.f36160A, 28));
            this.f36421h0 = C18327b.m62669a(new C12273a(this.f36160A, 31));
            this.f36429i0 = C18327b.m62669a(new C12273a(this.f36160A, 32));
            this.f36437j0 = C18327b.m62669a(new C12273a(this.f36160A, 33));
            this.f36445k0 = C18327b.m62669a(new C12273a(this.f36160A, 36));
            this.f36453l0 = C18327b.m62669a(new C12273a(this.f36160A, 39));
            this.f36461m0 = C18327b.m62669a(new C12273a(this.f36160A, 38));
            C12273a aVar15 = new C12273a(this.f36160A, 37);
            this.f36469n0 = aVar15;
            this.f36477o0 = C18327b.m62669a(aVar15);
            this.f36485p0 = C18327b.m62669a(new C12273a(this.f36160A, 35));
            this.f36493q0 = C18331f.m62681a(new C12273a(this.f36160A, 34));
            this.f36501r0 = C18331f.m62681a(new C12273a(this.f36160A, 40));
            this.f36509s0 = C18331f.m62681a(new C12273a(this.f36160A, 42));
            this.f36517t0 = C18327b.m62669a(new C12273a(this.f36160A, 41));
            this.f36525u0 = C18331f.m62681a(new C12273a(this.f36160A, 43));
            this.f36533v0 = C18331f.m62681a(new C12273a(this.f36160A, 44));
            this.f36541w0 = C18327b.m62669a(new C12273a(this.f36160A, 45));
            this.f36549x0 = C18327b.m62669a(new C12273a(this.f36160A, 47));
            this.f36557y0 = C18327b.m62669a(new C12273a(this.f36160A, 48));
            this.f36565z0 = C18327b.m62669a(new C12273a(this.f36160A, 49));
            C41084a a = C18331f.m62681a(new C12273a(this.f36160A, 46));
            this.f36161A0 = a;
            this.f36169B0 = C18327b.m62669a(a);
            this.f36177C0 = C18331f.m62681a(new C12273a(this.f36160A, 52));
            this.f36185D0 = C18331f.m62681a(new C12273a(this.f36160A, 53));
            this.f36193E0 = C18331f.m62681a(new C12273a(this.f36160A, 54));
            this.f36201F0 = C18331f.m62681a(new C12273a(this.f36160A, 55));
            this.f36209G0 = C18331f.m62681a(new C12273a(this.f36160A, 56));
            this.f36217H0 = C18331f.m62681a(new C12273a(this.f36160A, 57));
            this.f36225I0 = C18331f.m62681a(new C12273a(this.f36160A, 58));
            this.f36233J0 = C18331f.m62681a(new C12273a(this.f36160A, 59));
            this.f36241K0 = C18331f.m62681a(new C12273a(this.f36160A, 60));
            this.f36249L0 = C18331f.m62681a(new C12273a(this.f36160A, 61));
            this.f36257M0 = C18331f.m62681a(new C12273a(this.f36160A, 62));
            C12273a aVar16 = new C12273a(this.f36160A, 63);
            this.f36265N0 = aVar16;
            this.f36273O0 = C18327b.m62669a(aVar16);
            this.f36281P0 = C18327b.m62669a(new C12273a(this.f36160A, 51));
            C12273a aVar17 = new C12273a(this.f36160A, 50);
            this.f36289Q0 = aVar17;
            this.f36297R0 = C18331f.m62681a(aVar17);
            this.f36305S0 = C18331f.m62681a(new C12273a(this.f36160A, 64));
            C12273a aVar18 = new C12273a(this.f36160A, 65);
            this.f36313T0 = aVar18;
            this.f36321U0 = C18331f.m62681a(aVar18);
            C12273a aVar19 = new C12273a(this.f36160A, 66);
            this.f36329V0 = aVar19;
            this.f36337W0 = C18331f.m62681a(aVar19);
            this.f36344X0 = C18331f.m62681a(new C12273a(this.f36160A, 67));
            this.f36351Y0 = C18331f.m62681a(new C12273a(this.f36160A, 69));
            this.f36358Z0 = C18327b.m62669a(new C12273a(this.f36160A, 68));
            this.f36366a1 = C18327b.m62669a(new C12273a(this.f36160A, 72));
            this.f36374b1 = C18327b.m62669a(new C12273a(this.f36160A, 73));
            this.f36382c1 = C18327b.m62669a(new C12273a(this.f36160A, 74));
            this.f36390d1 = C18327b.m62669a(new C12273a(this.f36160A, 71));
            this.f36398e1 = C18331f.m62681a(new C12273a(this.f36160A, 70));
            this.f36406f1 = C18327b.m62669a(new C12273a(this.f36160A, 77));
            this.f36414g1 = C18327b.m62669a(new C12273a(this.f36160A, 78));
            C41084a a2 = C18331f.m62681a(new C12273a(this.f36160A, 76));
            this.f36422h1 = a2;
            this.f36430i1 = C18327b.m62669a(a2);
            this.f36438j1 = C18331f.m62681a(new C12273a(this.f36160A, 75));
            this.f36446k1 = C18327b.m62669a(new C12273a(this.f36160A, 80));
            this.f36454l1 = C18327b.m62669a(new C12273a(this.f36160A, 79));
            C12273a aVar20 = new C12273a(this.f36160A, 81);
            this.f36462m1 = aVar20;
            this.f36470n1 = C18331f.m62681a(aVar20);
            C12273a aVar21 = new C12273a(this.f36160A, 82);
            this.f36478o1 = aVar21;
            this.f36486p1 = C18331f.m62681a(aVar21);
            C12273a aVar22 = new C12273a(this.f36160A, 83);
            this.f36494q1 = aVar22;
            this.f36502r1 = C18331f.m62681a(aVar22);
            C12273a aVar23 = new C12273a(this.f36160A, 84);
            this.f36510s1 = aVar23;
            this.f36518t1 = C18331f.m62681a(aVar23);
            C12273a aVar24 = new C12273a(this.f36160A, 86);
            this.f36526u1 = aVar24;
            this.f36534v1 = C18327b.m62669a(aVar24);
            this.f36542w1 = C18331f.m62681a(new C12273a(this.f36160A, 87));
        }

        /* renamed from: n9 */
        private C40148a m46317n9() {
            return new C40148a((SharedPreferences) this.f36176C.get());
        }

        /* renamed from: o8 */
        private void m46327o8(AppModule appModule, C31666c cVar, C17956a aVar, BankApiManagerModule bankApiManagerModule, C20286a aVar2, C12922a aVar3, C19795a aVar4, C25133a aVar5, C29245a aVar6, C12479b bVar, C16480a aVar7, C25137a aVar8, C36871b bVar2, C34672a aVar9, EventBusModule eventBusModule, C18977a aVar10, C39675a aVar11, C25059b bVar3, C28795a aVar12, C36263b bVar4, C32015a aVar13, PreferencesApiManagerModule preferencesApiManagerModule, C38393e eVar, RetrofitApiModule retrofitApiModule, RetrofitGoogleApiModule retrofitGoogleApiModule, SharedPreferencesModule sharedPreferencesModule) {
            this.f36550x1 = C18331f.m62681a(new C12273a(this.f36160A, 88));
            this.f36558y1 = C18327b.m62669a(new C12273a(this.f36160A, 85));
            this.f36566z1 = C18331f.m62681a(new C12273a(this.f36160A, 93));
            this.f36162A1 = C18331f.m62681a(new C12273a(this.f36160A, 94));
            this.f36170B1 = C18331f.m62681a(new C12273a(this.f36160A, 95));
            this.f36178C1 = C18327b.m62669a(new C12273a(this.f36160A, 92));
            this.f36186D1 = C18327b.m62669a(new C12273a(this.f36160A, 97));
            this.f36194E1 = C18327b.m62669a(new C12273a(this.f36160A, 96));
            this.f36202F1 = C18327b.m62669a(new C12273a(this.f36160A, 99));
            this.f36210G1 = C18331f.m62681a(new C12273a(this.f36160A, 100));
            this.f36218H1 = C18327b.m62669a(new C12273a(this.f36160A, 98));
            this.f36226I1 = C18331f.m62681a(new C12273a(this.f36160A, 102));
            this.f36234J1 = C18331f.m62681a(new C12273a(this.f36160A, 103));
            this.f36242K1 = C18331f.m62681a(new C12273a(this.f36160A, 104));
            this.f36250L1 = C18331f.m62681a(new C12273a(this.f36160A, 105));
            this.f36258M1 = C18331f.m62681a(new C12273a(this.f36160A, 106));
            this.f36266N1 = C18331f.m62681a(new C12273a(this.f36160A, 107));
            this.f36274O1 = C18331f.m62681a(new C12273a(this.f36160A, 108));
            this.f36282P1 = C18331f.m62681a(new C12273a(this.f36160A, 109));
            this.f36290Q1 = C18331f.m62681a(new C12273a(this.f36160A, 110));
            this.f36298R1 = C18327b.m62669a(new C12273a(this.f36160A, 101));
            this.f36306S1 = C18331f.m62681a(new C12273a(this.f36160A, 112));
            this.f36314T1 = C18327b.m62669a(new C12273a(this.f36160A, 111));
            this.f36322U1 = C18331f.m62681a(new C12273a(this.f36160A, 114));
            this.f36330V1 = C18327b.m62669a(new C12273a(this.f36160A, 113));
            this.f36338W1 = C18331f.m62681a(new C12273a(this.f36160A, 116));
            this.f36345X1 = C18327b.m62669a(new C12273a(this.f36160A, 115));
            this.f36352Y1 = C18327b.m62669a(new C12273a(this.f36160A, 119));
            this.f36359Z1 = C18327b.m62669a(new C12273a(this.f36160A, 118));
            C12273a aVar14 = new C12273a(this.f36160A, 117);
            this.f36367a2 = aVar14;
            this.f36375b2 = C18327b.m62669a(aVar14);
            this.f36383c2 = C18327b.m62669a(new C12273a(this.f36160A, 121));
            this.f36391d2 = C18327b.m62669a(new C12273a(this.f36160A, 120));
            this.f36399e2 = C18327b.m62669a(new C12273a(this.f36160A, 123));
            this.f36407f2 = C18327b.m62669a(new C12273a(this.f36160A, 126));
            this.f36415g2 = C18327b.m62669a(new C12273a(this.f36160A, 125));
            C12273a aVar15 = new C12273a(this.f36160A, 124);
            this.f36423h2 = aVar15;
            this.f36431i2 = C18331f.m62681a(aVar15);
            C12273a aVar16 = new C12273a(this.f36160A, 122);
            this.f36439j2 = aVar16;
            this.f36447k2 = C18327b.m62669a(aVar16);
            this.f36455l2 = C18327b.m62669a(new C12273a(this.f36160A, 128));
            C12273a aVar17 = new C12273a(this.f36160A, C11051p3.f31760d);
            this.f36463m2 = aVar17;
            this.f36471n2 = C18327b.m62669a(aVar17);
            this.f36479o2 = C18331f.m62681a(new C12273a(this.f36160A, 130));
            this.f36487p2 = C18327b.m62669a(new C12273a(this.f36160A, 129));
            this.f36495q2 = C18327b.m62669a(new C12273a(this.f36160A, 131));
            this.f36503r2 = C18327b.m62669a(new C12273a(this.f36160A, 133));
            C12273a aVar18 = new C12273a(this.f36160A, 132);
            this.f36511s2 = aVar18;
            this.f36519t2 = C18327b.m62669a(aVar18);
            this.f36527u2 = C18327b.m62669a(new C12273a(this.f36160A, 135));
            this.f36535v2 = C18327b.m62669a(new C12273a(this.f36160A, 134));
            this.f36543w2 = C18327b.m62669a(new C12273a(this.f36160A, 137));
            this.f36551x2 = C18331f.m62681a(new C12273a(this.f36160A, 138));
            this.f36559y2 = C18331f.m62681a(new C12273a(this.f36160A, 139));
            this.f36567z2 = C18327b.m62669a(new C12273a(this.f36160A, 140));
            this.f36163A2 = C18331f.m62681a(new C12273a(this.f36160A, 136));
            this.f36171B2 = C18331f.m62681a(new C12273a(this.f36160A, 143));
            this.f36179C2 = C18331f.m62681a(new C12273a(this.f36160A, 142));
            this.f36187D2 = C18327b.m62669a(new C12273a(this.f36160A, 141));
            this.f36195E2 = C18327b.m62669a(new C12273a(this.f36160A, 145));
            this.f36203F2 = C18327b.m62669a(new C12273a(this.f36160A, 144));
            this.f36211G2 = C18331f.m62681a(new C12273a(this.f36160A, 147));
            this.f36219H2 = C18327b.m62669a(new C12273a(this.f36160A, 146));
            this.f36227I2 = C18327b.m62669a(new C12273a(this.f36160A, 149));
            this.f36235J2 = C18327b.m62669a(new C12273a(this.f36160A, 148));
            this.f36243K2 = C18331f.m62681a(new C12273a(this.f36160A, 151));
            this.f36251L2 = C18331f.m62681a(new C12273a(this.f36160A, 152));
            this.f36259M2 = C18327b.m62669a(new C12273a(this.f36160A, 150));
            this.f36267N2 = C18331f.m62681a(new C12273a(this.f36160A, 154));
            this.f36275O2 = C18331f.m62681a(new C12273a(this.f36160A, 155));
            this.f36283P2 = C18331f.m62681a(new C12273a(this.f36160A, 156));
            this.f36291Q2 = C18331f.m62681a(new C12273a(this.f36160A, 157));
            this.f36299R2 = C18327b.m62669a(new C12273a(this.f36160A, 153));
            this.f36307S2 = C18327b.m62669a(new C12273a(this.f36160A, 158));
            this.f36315T2 = C18331f.m62681a(new C12273a(this.f36160A, 160));
            this.f36323U2 = C18331f.m62681a(new C12273a(this.f36160A, 161));
            this.f36331V2 = C18331f.m62681a(new C12273a(this.f36160A, 162));
            this.f36339W2 = C18331f.m62681a(new C12273a(this.f36160A, 163));
            this.f36346X2 = C18327b.m62669a(new C12273a(this.f36160A, 159));
            C12273a aVar19 = new C12273a(this.f36160A, 164);
            this.f36353Y2 = aVar19;
            this.f36360Z2 = C18331f.m62681a(aVar19);
            this.f36368a3 = C18327b.m62669a(new C12273a(this.f36160A, 166));
            this.f36376b3 = C18327b.m62669a(new C12273a(this.f36160A, 165));
            this.f36384c3 = new C12273a(this.f36160A, 91);
            this.f36392d3 = C18327b.m62669a(new C12273a(this.f36160A, 90));
            this.f36400e3 = C18327b.m62669a(new C12273a(this.f36160A, 89));
            this.f36408f3 = C18327b.m62669a(new C12273a(this.f36160A, 167));
            this.f36416g3 = C18331f.m62681a(new C12273a(this.f36160A, 170));
            this.f36424h3 = C18331f.m62681a(new C12273a(this.f36160A, 171));
            this.f36432i3 = C18331f.m62681a(new C12273a(this.f36160A, 172));
            this.f36440j3 = C18331f.m62681a(new C12273a(this.f36160A, 174));
            this.f36448k3 = C18331f.m62681a(new C12273a(this.f36160A, 173));
            this.f36456l3 = C18331f.m62681a(new C12273a(this.f36160A, 169));
            this.f36464m3 = C18327b.m62669a(new C12273a(this.f36160A, 168));
            C41084a a = C18331f.m62681a(new C12273a(this.f36160A, 175));
            this.f36472n3 = a;
            this.f36480o3 = C18327b.m62669a(a);
            this.f36488p3 = C18327b.m62669a(new C12273a(this.f36160A, 176));
            this.f36496q3 = C18327b.m62669a(new C12273a(this.f36160A, 177));
            this.f36504r3 = C18327b.m62669a(new C12273a(this.f36160A, 181));
            this.f36512s3 = C18327b.m62669a(new C12273a(this.f36160A, SubsamplingScaleImageView.ORIENTATION_180));
        }

        /* access modifiers changed from: private */
        /* renamed from: o9 */
        public C8973b m46328o9() {
            return C30318c.m91427a(C17958c.m61876a(this.f36388d));
        }

        /* renamed from: p8 */
        private void m46338p8(AppModule appModule, C31666c cVar, C17956a aVar, BankApiManagerModule bankApiManagerModule, C20286a aVar2, C12922a aVar3, C19795a aVar4, C25133a aVar5, C29245a aVar6, C12479b bVar, C16480a aVar7, C25137a aVar8, C36871b bVar2, C34672a aVar9, EventBusModule eventBusModule, C18977a aVar10, C39675a aVar11, C25059b bVar3, C28795a aVar12, C36263b bVar4, C32015a aVar13, PreferencesApiManagerModule preferencesApiManagerModule, C38393e eVar, RetrofitApiModule retrofitApiModule, RetrofitGoogleApiModule retrofitGoogleApiModule, SharedPreferencesModule sharedPreferencesModule) {
            this.f36520t3 = C18327b.m62669a(new C12273a(this.f36160A, 179));
            this.f36528u3 = C18327b.m62669a(new C12273a(this.f36160A, 178));
            this.f36536v3 = C18327b.m62669a(new C12273a(this.f36160A, 182));
            this.f36544w3 = C18327b.m62669a(new C12273a(this.f36160A, 184));
            this.f36552x3 = C18327b.m62669a(new C12273a(this.f36160A, 185));
            this.f36560y3 = C18327b.m62669a(new C12273a(this.f36160A, 186));
            this.f36568z3 = C18327b.m62669a(new C12273a(this.f36160A, 187));
            this.f36164A3 = C18327b.m62669a(new C12273a(this.f36160A, 188));
            this.f36172B3 = C18327b.m62669a(new C12273a(this.f36160A, 189));
            this.f36180C3 = C18327b.m62669a(new C12273a(this.f36160A, 190));
            this.f36188D3 = C18327b.m62669a(new C12273a(this.f36160A, 191));
            this.f36196E3 = C18327b.m62669a(new C12273a(this.f36160A, 192));
            this.f36204F3 = C18327b.m62669a(new C12273a(this.f36160A, 193));
            this.f36212G3 = C18331f.m62681a(new C12273a(this.f36160A, 194));
            this.f36220H3 = C18327b.m62669a(new C12273a(this.f36160A, 195));
            this.f36228I3 = C18331f.m62681a(new C12273a(this.f36160A, 196));
            this.f36236J3 = C18331f.m62681a(new C12273a(this.f36160A, 197));
            this.f36244K3 = C18327b.m62669a(new C12273a(this.f36160A, 183));
            this.f36252L3 = C18327b.m62669a(new C12273a(this.f36160A, 198));
            this.f36260M3 = C18327b.m62669a(new C12273a(this.f36160A, 199));
            this.f36268N3 = C18327b.m62669a(new C12273a(this.f36160A, BogInputLayout.INPUT_ERROR_STATE));
            C12273a aVar14 = new C12273a(this.f36160A, BogInputLayout.INPUT_NORMAL_STATE);
            this.f36276O3 = aVar14;
            this.f36284P3 = C18327b.m62669a(aVar14);
            this.f36292Q3 = C18327b.m62669a(new C12273a(this.f36160A, 202));
            this.f36300R3 = C18327b.m62669a(new C12273a(this.f36160A, 203));
            this.f36308S3 = C18327b.m62669a(new C12273a(this.f36160A, 204));
            this.f36316T3 = C18327b.m62669a(new C12273a(this.f36160A, 206));
            this.f36324U3 = C18331f.m62681a(new C12273a(this.f36160A, 207));
            this.f36332V3 = C18327b.m62669a(new C12273a(this.f36160A, 205));
            this.f36340W3 = C18327b.m62669a(new C12273a(this.f36160A, 208));
            this.f36347X3 = C18327b.m62669a(new C12273a(this.f36160A, 209));
            this.f36354Y3 = C18327b.m62669a(new C12273a(this.f36160A, 210));
            this.f36361Z3 = C18327b.m62669a(new C12273a(this.f36160A, 211));
            this.f36369a4 = C18327b.m62669a(new C12273a(this.f36160A, 213));
            this.f36377b4 = C18331f.m62681a(new C12273a(this.f36160A, 214));
            this.f36385c4 = C18327b.m62669a(new C12273a(this.f36160A, 212));
            this.f36393d4 = C18327b.m62669a(new C12273a(this.f36160A, 217));
            this.f36401e4 = C18331f.m62681a(new C12273a(this.f36160A, 218));
            C41084a a = C18331f.m62681a(new C12273a(this.f36160A, 216));
            this.f36409f4 = a;
            this.f36417g4 = C18327b.m62669a(a);
            this.f36425h4 = C18331f.m62681a(new C12273a(this.f36160A, 215));
            this.f36433i4 = C18331f.m62681a(new C12273a(this.f36160A, 219));
            this.f36441j4 = C18331f.m62681a(new C12273a(this.f36160A, 220));
            this.f36449k4 = C18331f.m62681a(new C12273a(this.f36160A, 221));
            this.f36457l4 = C18327b.m62669a(new C12273a(this.f36160A, 225));
            this.f36465m4 = C18327b.m62669a(new C12273a(this.f36160A, 224));
            this.f36473n4 = C18327b.m62669a(new C12273a(this.f36160A, 223));
            C41084a a2 = C18331f.m62681a(new C12273a(this.f36160A, 222));
            this.f36481o4 = a2;
            this.f36489p4 = C18327b.m62669a(a2);
            this.f36497q4 = C18327b.m62669a(new C12273a(this.f36160A, 226));
            C12273a aVar15 = new C12273a(this.f36160A, 227);
            this.f36505r4 = aVar15;
            this.f36513s4 = C18327b.m62669a(aVar15);
            this.f36521t4 = C18327b.m62669a(new C12273a(this.f36160A, 228));
            this.f36529u4 = C18331f.m62681a(new C12273a(this.f36160A, 230));
            this.f36537v4 = C18327b.m62669a(new C12273a(this.f36160A, 229));
            this.f36545w4 = C18327b.m62669a(new C12273a(this.f36160A, 231));
            this.f36553x4 = C18331f.m62681a(new C12273a(this.f36160A, 233));
            this.f36561y4 = C18331f.m62681a(new C12273a(this.f36160A, 234));
            C41084a a3 = C18331f.m62681a(new C12273a(this.f36160A, 232));
            this.f36569z4 = a3;
            this.f36165A4 = C18327b.m62669a(a3);
            this.f36173B4 = C18331f.m62681a(new C12273a(this.f36160A, 236));
            this.f36181C4 = C18327b.m62669a(new C12273a(this.f36160A, 235));
            this.f36189D4 = C18327b.m62669a(new C12273a(this.f36160A, 237));
            this.f36197E4 = C18327b.m62669a(new C12273a(this.f36160A, 238));
            this.f36205F4 = C18327b.m62669a(new C12273a(this.f36160A, 239));
            this.f36213G4 = C18327b.m62669a(new C12273a(this.f36160A, 241));
            this.f36221H4 = C18327b.m62669a(new C12273a(this.f36160A, 240));
            this.f36229I4 = C18331f.m62681a(new C12273a(this.f36160A, 243));
            this.f36237J4 = C18327b.m62669a(new C12273a(this.f36160A, 242));
            this.f36245K4 = C18327b.m62669a(new C12273a(this.f36160A, 244));
            this.f36253L4 = C18331f.m62681a(new C12273a(this.f36160A, 246));
            this.f36261M4 = C18327b.m62669a(new C12273a(this.f36160A, 247));
            this.f36269N4 = C18327b.m62669a(new C12273a(this.f36160A, 245));
            this.f36277O4 = C18327b.m62669a(new C12273a(this.f36160A, 248));
            this.f36285P4 = C18327b.m62669a(new C12273a(this.f36160A, 250));
            C41084a a4 = C18331f.m62681a(new C12273a(this.f36160A, 249));
            this.f36293Q4 = a4;
            this.f36301R4 = C18327b.m62669a(a4);
            this.f36309S4 = C18331f.m62681a(new C12273a(this.f36160A, 251));
            this.f36317T4 = C18331f.m62681a(new C12273a(this.f36160A, 253));
            this.f36325U4 = C18331f.m62681a(new C12273a(this.f36160A, 254));
            this.f36333V4 = C18331f.m62681a(new C12273a(this.f36160A, 252));
            this.f36341W4 = C18327b.m62669a(new C12273a(this.f36160A, C11051p3.f31759c));
            this.f36348X4 = C18331f.m62681a(new C12273a(this.f36160A, C11398b.f33139r));
            C41084a a5 = C18331f.m62681a(new C12273a(this.f36160A, 257));
            this.f36355Y4 = a5;
            this.f36362Z4 = C18327b.m62669a(a5);
            this.f36370a5 = C18327b.m62669a(new C12273a(this.f36160A, 259));
            C41084a a6 = C18331f.m62681a(new C12273a(this.f36160A, 258));
            this.f36378b5 = a6;
            this.f36386c5 = C18327b.m62669a(a6);
            this.f36394d5 = C18327b.m62669a(new C12273a(this.f36160A, 260));
            this.f36402e5 = C18327b.m62669a(new C12273a(this.f36160A, 261));
            C41084a a7 = C18331f.m62681a(new C12273a(this.f36160A, 262));
            this.f36410f5 = a7;
            this.f36418g5 = C18327b.m62669a(a7);
            this.f36426h5 = C18327b.m62669a(new C12273a(this.f36160A, 263));
            C41084a a8 = C18331f.m62681a(new C12273a(this.f36160A, 264));
            this.f36434i5 = a8;
            this.f36442j5 = C18327b.m62669a(a8);
            this.f36450k5 = C18327b.m62669a(new C12273a(this.f36160A, 265));
            this.f36458l5 = C18327b.m62669a(new C12273a(this.f36160A, 267));
            C41084a a9 = C18331f.m62681a(new C12273a(this.f36160A, 266));
            this.f36466m5 = a9;
            this.f36474n5 = C18327b.m62669a(a9);
            this.f36482o5 = C18327b.m62669a(new C12273a(this.f36160A, 268));
        }

        /* access modifiers changed from: private */
        /* renamed from: p9 */
        public C20550a m46339p9() {
            return new C20550a(m46255h8());
        }

        /* renamed from: q8 */
        private void m46349q8(AppModule appModule, C31666c cVar, C17956a aVar, BankApiManagerModule bankApiManagerModule, C20286a aVar2, C12922a aVar3, C19795a aVar4, C25133a aVar5, C29245a aVar6, C12479b bVar, C16480a aVar7, C25137a aVar8, C36871b bVar2, C34672a aVar9, EventBusModule eventBusModule, C18977a aVar10, C39675a aVar11, C25059b bVar3, C28795a aVar12, C36263b bVar4, C32015a aVar13, PreferencesApiManagerModule preferencesApiManagerModule, C38393e eVar, RetrofitApiModule retrofitApiModule, RetrofitGoogleApiModule retrofitGoogleApiModule, SharedPreferencesModule sharedPreferencesModule) {
            this.f36490p5 = C18327b.m62669a(new C12273a(this.f36160A, 271));
            this.f36498q5 = C18327b.m62669a(new C12273a(this.f36160A, SubsamplingScaleImageView.ORIENTATION_270));
            C41084a a = C18331f.m62681a(new C12273a(this.f36160A, 269));
            this.f36506r5 = a;
            this.f36514s5 = C18327b.m62669a(a);
            C41084a a2 = C18331f.m62681a(new C12273a(this.f36160A, 272));
            this.f36522t5 = a2;
            this.f36530u5 = C18327b.m62669a(a2);
            this.f36538v5 = C18327b.m62669a(new C12273a(this.f36160A, 274));
            C41084a a3 = C18331f.m62681a(new C12273a(this.f36160A, 273));
            this.f36546w5 = a3;
            this.f36554x5 = C18327b.m62669a(a3);
            this.f36562y5 = C18331f.m62681a(new C12273a(this.f36160A, 276));
            this.f36570z5 = C18327b.m62669a(new C12273a(this.f36160A, 275));
            this.f36166A5 = C18327b.m62669a(new C12273a(this.f36160A, 277));
            this.f36174B5 = C18327b.m62669a(new C12273a(this.f36160A, 279));
            this.f36182C5 = C18331f.m62681a(new C12273a(this.f36160A, 281));
            this.f36190D5 = C18327b.m62669a(new C12273a(this.f36160A, 280));
            C41084a a4 = C18331f.m62681a(new C12273a(this.f36160A, 278));
            this.f36198E5 = a4;
            this.f36206F5 = C18327b.m62669a(a4);
            this.f36214G5 = C18327b.m62669a(new C12273a(this.f36160A, 282));
            this.f36222H5 = C18327b.m62669a(new C12273a(this.f36160A, 284));
            C41084a a5 = C18331f.m62681a(new C12273a(this.f36160A, 283));
            this.f36230I5 = a5;
            this.f36238J5 = C18327b.m62669a(a5);
            C41084a a6 = C18331f.m62681a(new C12273a(this.f36160A, 285));
            this.f36246K5 = a6;
            this.f36254L5 = C18327b.m62669a(a6);
            this.f36262M5 = C18327b.m62669a(new C12273a(this.f36160A, 286));
            this.f36270N5 = C18327b.m62669a(new C12273a(this.f36160A, 287));
            this.f36278O5 = C18327b.m62669a(new C12273a(this.f36160A, 289));
            C41084a a7 = C18331f.m62681a(new C12273a(this.f36160A, 288));
            this.f36286P5 = a7;
            this.f36294Q5 = C18327b.m62669a(a7);
            this.f36302R5 = C18327b.m62669a(new C12273a(this.f36160A, 290));
            this.f36310S5 = C18327b.m62669a(new C12273a(this.f36160A, 291));
            this.f36318T5 = C18327b.m62669a(new C12273a(this.f36160A, 293));
            this.f36326U5 = C18331f.m62681a(new C12273a(this.f36160A, 294));
            this.f36334V5 = C18327b.m62669a(new C12273a(this.f36160A, 292));
            C12273a aVar14 = new C12273a(this.f36160A, 295);
            this.f36342W5 = aVar14;
            this.f36349X5 = C18327b.m62669a(aVar14);
            this.f36356Y5 = C18327b.m62669a(new C12273a(this.f36160A, 296));
            this.f36363Z5 = C18331f.m62681a(new C12273a(this.f36160A, 298));
            C41084a a8 = C18331f.m62681a(new C12273a(this.f36160A, 297));
            this.f36371a6 = a8;
            this.f36379b6 = C18327b.m62669a(a8);
            C12273a aVar15 = new C12273a(this.f36160A, 299);
            this.f36387c6 = aVar15;
            this.f36395d6 = C18327b.m62669a(aVar15);
            this.f36403e6 = C18327b.m62669a(new C12273a(this.f36160A, BogInputLayout.INPUT_TYPE_TEXT_PASSWORD));
            this.f36411f6 = C18327b.m62669a(new C12273a(this.f36160A, BogInputLayout.INPUT_TYPE_NUM_PASSWORD));
            this.f36419g6 = C18327b.m62669a(new C12273a(this.f36160A, BogInputLayout.INPUT_TYPE_NUM_REAL));
            this.f36427h6 = C18327b.m62669a(new C12273a(this.f36160A, BogInputLayout.INPUT_TYPE_NUM_DIGIT));
            this.f36435i6 = C18327b.m62669a(new C12273a(this.f36160A, BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS));
            this.f36443j6 = C18331f.m62681a(new C12273a(this.f36160A, BogInputLayout.INPUT_TYPE_EMAIL));
            this.f36451k6 = C18331f.m62681a(new C12273a(this.f36160A, 308));
            this.f36459l6 = C18331f.m62681a(new C12273a(this.f36160A, BogInputLayout.INPUT_TYPE_NUMBER_SIGNED));
            this.f36467m6 = C18331f.m62681a(new C12273a(this.f36160A, 309));
            this.f36475n6 = C18331f.m62681a(new C12273a(this.f36160A, 312));
            this.f36483o6 = C18331f.m62681a(new C12273a(this.f36160A, 311));
            this.f36491p6 = C18327b.m62669a(new C12273a(this.f36160A, 310));
            this.f36499q6 = C18327b.m62669a(new C12273a(this.f36160A, BogInputLayout.INPUT_TYPE_NUM_PHONE));
            this.f36507r6 = C18327b.m62669a(new C12273a(this.f36160A, 313));
            this.f36515s6 = C18327b.m62669a(new C12273a(this.f36160A, 315));
            C41084a a9 = C18331f.m62681a(new C12273a(this.f36160A, 314));
            this.f36523t6 = a9;
            this.f36531u6 = C18327b.m62669a(a9);
            this.f36539v6 = C18327b.m62669a(new C12273a(this.f36160A, 316));
            C41084a a12 = C18331f.m62681a(new C12273a(this.f36160A, 317));
            this.f36547w6 = a12;
            this.f36555x6 = C18327b.m62669a(a12);
            C41084a a13 = C18331f.m62681a(new C12273a(this.f36160A, 318));
            this.f36563y6 = a13;
            this.f36571z6 = C18327b.m62669a(a13);
            this.f36167A6 = C18331f.m62681a(new C12273a(this.f36160A, 320));
            this.f36175B6 = C18327b.m62669a(new C12273a(this.f36160A, 319));
            C41084a a14 = C18331f.m62681a(new C12273a(this.f36160A, 321));
            this.f36183C6 = a14;
            this.f36191D6 = C18327b.m62669a(a14);
            this.f36199E6 = C18327b.m62669a(new C12273a(this.f36160A, 322));
            this.f36207F6 = C18327b.m62669a(new C12273a(this.f36160A, 323));
            C41084a a15 = C18331f.m62681a(new C12273a(this.f36160A, 324));
            this.f36215G6 = a15;
            this.f36223H6 = C18327b.m62669a(a15);
            this.f36231I6 = C18327b.m62669a(new C12273a(this.f36160A, 326));
            C41084a a16 = C18331f.m62681a(new C12273a(this.f36160A, 325));
            this.f36239J6 = a16;
            this.f36247K6 = C18327b.m62669a(a16);
            this.f36255L6 = C18327b.m62669a(new C12273a(this.f36160A, 327));
            this.f36263M6 = C18327b.m62669a(new C12273a(this.f36160A, 329));
            this.f36271N6 = C18327b.m62669a(new C12273a(this.f36160A, 328));
            this.f36279O6 = C18327b.m62669a(new C12273a(this.f36160A, 330));
            this.f36287P6 = C18327b.m62669a(new C12273a(this.f36160A, 332));
            C41084a a17 = C18331f.m62681a(new C12273a(this.f36160A, 331));
            this.f36295Q6 = a17;
            this.f36303R6 = C18327b.m62669a(a17);
            this.f36311S6 = C18327b.m62669a(new C12273a(this.f36160A, 333));
            this.f36319T6 = C18331f.m62681a(new C12273a(this.f36160A, 335));
            C41084a a18 = C18331f.m62681a(new C12273a(this.f36160A, 334));
            this.f36327U6 = a18;
            this.f36335V6 = C18327b.m62669a(a18);
        }

        /* access modifiers changed from: private */
        /* renamed from: q9 */
        public C27533b m46350q9() {
            return C28797c.m88262a(this.f36484p, (C43511w) this.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: r7 */
        public C41866b m46359r7() {
            return C37630b.m110649a(new C36740l(), new C36743o(), (SessionManager) this.f36256M.get(), m46186a9());
        }

        /* access modifiers changed from: private */
        /* renamed from: r8 */
        public Client m46360r8(Client client) {
            Client_MembersInjector.injectRefreshSto(client, m46166Y8());
            Client_MembersInjector.injectGetAppSettingByNameUseCase(client, m46115T7());
            Client_MembersInjector.injectCardsUIModelDataMapper(client, (C26146d) this.f36381c0.get());
            return client;
        }

        /* access modifiers changed from: private */
        /* renamed from: r9 */
        public C19730e m46361r9() {
            return new C19730e((C19370a) this.f36485p0.get(), C39777b.m115545a());
        }

        /* access modifiers changed from: private */
        /* renamed from: s7 */
        public C20048a m46370s7() {
            return C20287b.m66325a(this.f36556y, m46380t7());
        }

        /* renamed from: s8 */
        private CurrencyRatesWidgetProvider m46371s8(CurrencyRatesWidgetProvider currencyRatesWidgetProvider) {
            C35831b.m106297a(currencyRatesWidgetProvider, (RootBankApiManager) this.f36413g0.get());
            C35831b.m106298b(currencyRatesWidgetProvider, (PreferencesApiManager) this.f36224I.get());
            return currencyRatesWidgetProvider;
        }

        /* renamed from: t7 */
        private C19399a m46380t7() {
            return new C19399a((IRetrofitService) this.f36350Y.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: t8 */
        public InstalledAppsDataReportWorker m46381t8(InstalledAppsDataReportWorker installedAppsDataReportWorker) {
            C34569a.m101403a(installedAppsDataReportWorker, (BankApi) this.f36405f0.get());
            C34569a.m101404b(installedAppsDataReportWorker, (PreferencesApiManager) this.f36224I.get());
            return installedAppsDataReportWorker;
        }

        /* access modifiers changed from: private */
        /* renamed from: u7 */
        public C38284a m46390u7() {
            return new C38284a((Gson) this.f36288Q.get(), (C39780a) this.f36304S.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: u8 */
        public LocationWifiDataReportWorker m46391u8(LocationWifiDataReportWorker locationWifiDataReportWorker) {
            C34569a.m101403a(locationWifiDataReportWorker, (BankApi) this.f36405f0.get());
            C34569a.m101404b(locationWifiDataReportWorker, (PreferencesApiManager) this.f36224I.get());
            return locationWifiDataReportWorker;
        }

        /* access modifiers changed from: private */
        /* renamed from: v7 */
        public C43511w.C43513b m46400v7() {
            return C37640j.m110664a((Gson) this.f36288Q.get());
        }

        /* renamed from: v8 */
        private MbankApp m46401v8(MbankApp mbankApp) {
            C36548z.m108361n(mbankApp, (Client) this.f36389d0.get());
            C36548z.m108362o(mbankApp, (C41438c) this.f36184D.get());
            C36548z.m108360m(mbankApp, (RootBankApiManager) this.f36413g0.get());
            C36548z.m108363p(mbankApp, (PreferencesApiManager) this.f36224I.get());
            C36548z.m108365r(mbankApp, (RetrofitClient) this.f36421h0.get());
            C36548z.m108351d(mbankApp, (C19792a) this.f36429i0.get());
            C36548z.m108349b(mbankApp, m46125U7());
            C36548z.m108348a(mbankApp, m46075P7());
            C36548z.m108353f(mbankApp, m46115T7());
            C36548z.m108350c(mbankApp, (C18569a) this.f36437j0.get());
            C36548z.m108356i(mbankApp, (C27082a) this.f36493q0.get());
            C36548z.m108367t(mbankApp, (C27084b) this.f36501r0.get());
            C36548z.m108359l(mbankApp, m45976F8());
            C36548z.m108357j(mbankApp, m46305m8());
            C36548z.m108355h(mbankApp, new C36736h());
            C36548z.m108354g(mbankApp, m46195b8());
            C36548z.m108364q(mbankApp, new C36743o());
            C36548z.m108366s(mbankApp, m46196b9());
            C36548z.m108368u(mbankApp, m46285k8());
            C36548z.m108352e(mbankApp, (TargetEnvironment) this.f36216H.get());
            C36548z.m108358k(mbankApp, m45946C8());
            C12283b0.m47225f(mbankApp, m46226e9());
            C12283b0.m47220a(mbankApp, new C38117b());
            C12283b0.m47223d(mbankApp, (C39780a) this.f36304S.get());
            C12283b0.m47226g(mbankApp, new C31923a());
            C12283b0.m47224e(mbankApp, new C38126i());
            C12283b0.m47227h(mbankApp, new C38127j());
            C12283b0.m47221b(mbankApp, new C38119c());
            C12283b0.m47222c(mbankApp, new C38121e());
            return mbankApp;
        }

        /* access modifiers changed from: private */
        /* renamed from: w7 */
        public C16585a m46410w7() {
            return C17264b.m60583a((C43511w) this.f36320U.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: w8 */
        public C20294d m46411w8() {
            return new C20294d((C24779a) this.f36373b0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: x7 */
        public C25486b m46420x7() {
            return new C25486b((PreferencesApiManager) this.f36224I.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: x8 */
        public C36355c m46421x8() {
            return new C36355c((C31663a) this.f36200F.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: y7 */
        public C25487c m46430y7() {
            return new C25487c(m46115T7());
        }

        /* access modifiers changed from: private */
        /* renamed from: y8 */
        public C36876a m46431y8() {
            return new C36876a(m46317n9(), m46195b8());
        }

        /* access modifiers changed from: private */
        /* renamed from: z7 */
        public C25489e m46440z7() {
            return new C25489e(new C36736h());
        }

        /* access modifiers changed from: private */
        /* renamed from: z8 */
        public C26255a m46441z8() {
            return C27602b.m85441a((C43511w) this.f36320U.get());
        }

        /* renamed from: a */
        public PreferencesApiManager mo32851a() {
            return (PreferencesApiManager) this.f36224I.get();
        }

        /* renamed from: b */
        public C41438c mo32852b() {
            return (C41438c) this.f36184D.get();
        }

        /* renamed from: c */
        public Client mo32853c() {
            return (Client) this.f36389d0.get();
        }

        public C26633o cardsAndDetailsUseCase() {
            return new C26633o((C25341c) this.f36297R0.get(), (C27092a) this.f36305S0.get());
        }

        /* renamed from: d */
        public C17608d mo32193d() {
            return new C12270h(this.f36160A);
        }

        /* renamed from: e */
        public C30108b mo32855e() {
            return m46225e8();
        }

        /* renamed from: f */
        public void mo32856f(MbankApp mbankApp) {
            m46401v8(mbankApp);
        }

        /* renamed from: g */
        public RootBankApiManager mo32857g() {
            return (RootBankApiManager) this.f36413g0.get();
        }

        public C26625h getAccountsAndDetailsUseCase() {
            return new C26625h((C25339b) this.f36321U0.get(), (C27092a) this.f36305S0.get());
        }

        public C36731c getClientFinancialMail() {
            return new C36731c((C36356a) this.f36517t0.get());
        }

        public C36733e getClientFinancialPhone() {
            return new C36733e((C36356a) this.f36517t0.get());
        }

        public C37019f getDepositsAndBondsUseCase() {
            return new C37019f((C38267a) this.f36558y1.get());
        }

        public C25343d getLegacyCreditCardsAndDetails() {
            return (C25343d) this.f36502r1.get();
        }

        public C25345e getLegacyDepositsAndBondsWithDetails() {
            return (C25345e) this.f36470n1.get();
        }

        public C25346f getLegacyLoanWithDetails() {
            return (C25346f) this.f36486p1.get();
        }

        public C25347g getLegacyPensionAmount() {
            return (C25347g) this.f36518t1.get();
        }

        public C27872c getLoyaltyListRepository() {
            return (C27872c) this.f36454l1.get();
        }

        public C19799c getProductTypeListUseCase() {
            return new C19799c((C25349i) this.f36337W0.get(), (C27092a) this.f36305S0.get());
        }

        public C20300c getTransactionCategoriesUseCase() {
            return new C20300c((C24835a) this.f36169B0.get());
        }

        /* renamed from: h */
        public C30107a mo32869h() {
            return m46145W7();
        }

        /* renamed from: i */
        public void mo32870i(CurrencyRatesWidgetProvider currencyRatesWidgetProvider) {
            m46371s8(currencyRatesWidgetProvider);
        }

        /* renamed from: j */
        public BankApi mo32871j() {
            return (BankApi) this.f36405f0.get();
        }

        /* renamed from: k */
        public Set mo32872k() {
            return Collections.emptySet();
        }

        /* renamed from: l */
        public BankApi mo32873l() {
            return (BankApi) this.f36405f0.get();
        }

        /* renamed from: m */
        public C17606b mo32187m() {
            return new C12191c(this.f36160A);
        }

        public C19803e refreshAssetLiabilityUseCase() {
            return new C19803e((C20296a) this.f36358Z0.get());
        }

        public C29882e refreshClientInfoPermission() {
            return (C29882e) this.f36398e1.get();
        }

        public C19804f refreshProductTypeListUseCase() {
            return new C19804f((C25684h) this.f36344X0.get());
        }

        public C19509h smsToPushManager() {
            return (C19509h) this.f36438j1.get();
        }

        public C20100q transactionPropertyUpdateEventPoster() {
            return (C20100q) this.f36565z0.get();
        }

        private C12272j(AppModule appModule, C31666c cVar, C17956a aVar, BankApiManagerModule bankApiManagerModule, C20286a aVar2, C12922a aVar3, C19795a aVar4, C25133a aVar5, C29245a aVar6, C12479b bVar, C16480a aVar7, C25137a aVar8, C36871b bVar2, C34672a aVar9, EventBusModule eventBusModule, C18977a aVar10, C39675a aVar11, C25059b bVar3, C28795a aVar12, C36263b bVar4, C32015a aVar13, PreferencesApiManagerModule preferencesApiManagerModule, C38393e eVar, RetrofitApiModule retrofitApiModule, RetrofitGoogleApiModule retrofitGoogleApiModule, SharedPreferencesModule sharedPreferencesModule) {
            this.f36160A = this;
            this.f36364a = preferencesApiManagerModule;
            this.f36372b = sharedPreferencesModule;
            this.f36380c = appModule;
            this.f36388d = aVar;
            this.f36396e = eventBusModule;
            this.f36404f = aVar9;
            this.f36412g = cVar;
            this.f36420h = bVar2;
            this.f36428i = retrofitApiModule;
            this.f36436j = bankApiManagerModule;
            this.f36444k = aVar4;
            this.f36452l = bVar;
            this.f36460m = aVar3;
            this.f36468n = eVar;
            this.f36476o = aVar5;
            this.f36484p = aVar12;
            this.f36492q = aVar10;
            this.f36500r = aVar13;
            this.f36508s = aVar7;
            this.f36516t = bVar4;
            this.f36524u = aVar8;
            this.f36532v = bVar3;
            this.f36540w = retrofitGoogleApiModule;
            this.f36548x = aVar6;
            this.f36556y = aVar2;
            this.f36564z = aVar11;
            m46316n8(appModule, cVar, aVar, bankApiManagerModule, aVar2, aVar3, aVar4, aVar5, aVar6, bVar, aVar7, aVar8, bVar2, aVar9, eventBusModule, aVar10, aVar11, bVar3, aVar12, bVar4, aVar13, preferencesApiManagerModule, eVar, retrofitApiModule, retrofitGoogleApiModule, sharedPreferencesModule);
            m46327o8(appModule, cVar, aVar, bankApiManagerModule, aVar2, aVar3, aVar4, aVar5, aVar6, bVar, aVar7, aVar8, bVar2, aVar9, eventBusModule, aVar10, aVar11, bVar3, aVar12, bVar4, aVar13, preferencesApiManagerModule, eVar, retrofitApiModule, retrofitGoogleApiModule, sharedPreferencesModule);
            m46338p8(appModule, cVar, aVar, bankApiManagerModule, aVar2, aVar3, aVar4, aVar5, aVar6, bVar, aVar7, aVar8, bVar2, aVar9, eventBusModule, aVar10, aVar11, bVar3, aVar12, bVar4, aVar13, preferencesApiManagerModule, eVar, retrofitApiModule, retrofitGoogleApiModule, sharedPreferencesModule);
            m46349q8(appModule, cVar, aVar, bankApiManagerModule, aVar2, aVar3, aVar4, aVar5, aVar6, bVar, aVar7, aVar8, bVar2, aVar9, eventBusModule, aVar10, aVar11, bVar3, aVar12, bVar4, aVar13, preferencesApiManagerModule, eVar, retrofitApiModule, retrofitGoogleApiModule, sharedPreferencesModule);
        }
    }

    /* renamed from: dk.b$k */
    private static final class C12276k implements C17609e {

        /* renamed from: a */
        private final C12272j f36576a;

        /* renamed from: b */
        private final C12192d f36577b;

        /* renamed from: c */
        private final C12144b f36578c;

        /* renamed from: d */
        private View f36579d;

        /* renamed from: c */
        public C12313y mo32881a() {
            C18329d.m62674a(this.f36579d, View.class);
            return new C12277l(this.f36576a, this.f36577b, this.f36578c, this.f36579d);
        }

        /* renamed from: d */
        public C12276k mo32882b(View view) {
            this.f36579d = (View) C18329d.m62675b(view);
            return this;
        }

        private C12276k(C12272j jVar, C12192d dVar, C12144b bVar) {
            this.f36576a = jVar;
            this.f36577b = dVar;
            this.f36578c = bVar;
        }
    }

    /* renamed from: dk.b$l */
    private static final class C12277l extends C12313y {

        /* renamed from: a */
        private final C12272j f36580a;

        /* renamed from: b */
        private final C12192d f36581b;

        /* renamed from: c */
        private final C12144b f36582c;

        /* renamed from: d */
        private final C12277l f36583d;

        /* renamed from: b */
        private AccountItemView m46468b(AccountItemView accountItemView) {
            AccountItemView_MembersInjector.injectMEventBus(accountItemView, (C41438c) this.f36580a.f36184D.get());
            return accountItemView;
        }

        /* renamed from: c */
        private C35700a m46469c(C35700a aVar) {
            C35702c.m106024d(aVar, (RootBankApiManager) this.f36580a.f36413g0.get());
            C35702c.m106021a(aVar, (BankApi) this.f36580a.f36405f0.get());
            C35702c.m106025e(aVar, (C41438c) this.f36580a.f36184D.get());
            C35702c.m106026f(aVar, (PreferencesApiManager) this.f36580a.f36224I.get());
            C35702c.m106022b(aVar, (Client) this.f36580a.f36389d0.get());
            C35702c.m106023c(aVar, (BankApi) this.f36580a.f36405f0.get());
            return aVar;
        }

        /* renamed from: a */
        public void mo32885a(C35700a aVar) {
            m46469c(aVar);
        }

        public void injectAccountItemView(AccountItemView accountItemView) {
            m46468b(accountItemView);
        }

        private C12277l(C12272j jVar, C12192d dVar, C12144b bVar, View view) {
            this.f36583d = this;
            this.f36580a = jVar;
            this.f36581b = dVar;
            this.f36582c = bVar;
        }
    }

    /* renamed from: dk.b$m */
    private static final class C12278m implements C17610f {

        /* renamed from: a */
        private final C12272j f36584a;

        /* renamed from: b */
        private final C12192d f36585b;

        /* renamed from: c */
        private C1580f0 f36586c;

        /* renamed from: d */
        private C16920c f36587d;

        /* renamed from: d */
        public C12314z mo32887a() {
            C18329d.m62674a(this.f36586c, C1580f0.class);
            C18329d.m62674a(this.f36587d, C16920c.class);
            return new C12279n(this.f36584a, this.f36585b, this.f36586c, this.f36587d);
        }

        /* renamed from: e */
        public C12278m mo32888b(C1580f0 f0Var) {
            this.f36586c = (C1580f0) C18329d.m62675b(f0Var);
            return this;
        }

        /* renamed from: f */
        public C12278m mo32889c(C16920c cVar) {
            this.f36587d = (C16920c) C18329d.m62675b(cVar);
            return this;
        }

        private C12278m(C12272j jVar, C12192d dVar) {
            this.f36584a = jVar;
            this.f36585b = dVar;
        }
    }

    /* renamed from: dk.b$n */
    private static final class C12279n extends C12314z {
        /* access modifiers changed from: private */

        /* renamed from: A */
        public C41084a f36588A;
        /* access modifiers changed from: private */

        /* renamed from: A0 */
        public C41084a f36589A0;

        /* renamed from: A1 */
        private C41084a f36590A1;
        /* access modifiers changed from: private */

        /* renamed from: A2 */
        public C41084a f36591A2;

        /* renamed from: A3 */
        private C41084a f36592A3;
        /* access modifiers changed from: private */

        /* renamed from: A4 */
        public C41084a f36593A4;

        /* renamed from: A5 */
        private C41084a f36594A5;

        /* renamed from: B */
        private C41084a f36595B;
        /* access modifiers changed from: private */

        /* renamed from: B0 */
        public C41084a f36596B0;

        /* renamed from: B1 */
        private C41084a f36597B1;
        /* access modifiers changed from: private */

        /* renamed from: B2 */
        public C41084a f36598B2;

        /* renamed from: B3 */
        private C41084a f36599B3;

        /* renamed from: B4 */
        private C41084a f36600B4;

        /* renamed from: B5 */
        private C41084a f36601B5;

        /* renamed from: C */
        private C41084a f36602C;

        /* renamed from: C0 */
        private C41084a f36603C0;

        /* renamed from: C1 */
        private C41084a f36604C1;
        /* access modifiers changed from: private */

        /* renamed from: C2 */
        public C41084a f36605C2;
        /* access modifiers changed from: private */

        /* renamed from: C3 */
        public C41084a f36606C3;
        /* access modifiers changed from: private */

        /* renamed from: C4 */
        public C41084a f36607C4;

        /* renamed from: C5 */
        private C41084a f36608C5;
        /* access modifiers changed from: private */

        /* renamed from: D */
        public C41084a f36609D;
        /* access modifiers changed from: private */

        /* renamed from: D0 */
        public C41084a f36610D0;

        /* renamed from: D1 */
        private C41084a f36611D1;
        /* access modifiers changed from: private */

        /* renamed from: D2 */
        public C41084a f36612D2;
        /* access modifiers changed from: private */

        /* renamed from: D3 */
        public C41084a f36613D3;
        /* access modifiers changed from: private */

        /* renamed from: D4 */
        public C41084a f36614D4;

        /* renamed from: D5 */
        private C41084a f36615D5;

        /* renamed from: E */
        private C41084a f36616E;

        /* renamed from: E0 */
        private C41084a f36617E0;

        /* renamed from: E1 */
        private C41084a f36618E1;
        /* access modifiers changed from: private */

        /* renamed from: E2 */
        public C41084a f36619E2;
        /* access modifiers changed from: private */

        /* renamed from: E3 */
        public C41084a f36620E3;
        /* access modifiers changed from: private */

        /* renamed from: E4 */
        public C41084a f36621E4;

        /* renamed from: E5 */
        private C41084a f36622E5;
        /* access modifiers changed from: private */

        /* renamed from: F */
        public C41084a f36623F;
        /* access modifiers changed from: private */

        /* renamed from: F0 */
        public C41084a f36624F0;

        /* renamed from: F1 */
        private C41084a f36625F1;
        /* access modifiers changed from: private */

        /* renamed from: F2 */
        public C41084a f36626F2;

        /* renamed from: F3 */
        private C41084a f36627F3;

        /* renamed from: F4 */
        private C41084a f36628F4;
        /* access modifiers changed from: private */

        /* renamed from: F5 */
        public C41084a f36629F5;

        /* renamed from: G */
        private C41084a f36630G;

        /* renamed from: G0 */
        private C41084a f36631G0;

        /* renamed from: G1 */
        private C41084a f36632G1;
        /* access modifiers changed from: private */

        /* renamed from: G2 */
        public C41084a f36633G2;

        /* renamed from: G3 */
        private C41084a f36634G3;

        /* renamed from: G4 */
        private C41084a f36635G4;

        /* renamed from: G5 */
        private C41084a f36636G5;

        /* renamed from: H */
        private C41084a f36637H;
        /* access modifiers changed from: private */

        /* renamed from: H0 */
        public C41084a f36638H0;

        /* renamed from: H1 */
        private C41084a f36639H1;
        /* access modifiers changed from: private */

        /* renamed from: H2 */
        public C41084a f36640H2;
        /* access modifiers changed from: private */

        /* renamed from: H3 */
        public C41084a f36641H3;

        /* renamed from: H4 */
        private C41084a f36642H4;
        /* access modifiers changed from: private */

        /* renamed from: H5 */
        public C41084a f36643H5;

        /* renamed from: I */
        private C41084a f36644I;

        /* renamed from: I0 */
        private C41084a f36645I0;

        /* renamed from: I1 */
        private C41084a f36646I1;

        /* renamed from: I2 */
        private C41084a f36647I2;

        /* renamed from: I3 */
        private C41084a f36648I3;

        /* renamed from: I4 */
        private C41084a f36649I4;
        /* access modifiers changed from: private */

        /* renamed from: I5 */
        public C41084a f36650I5;
        /* access modifiers changed from: private */

        /* renamed from: J */
        public C41084a f36651J;
        /* access modifiers changed from: private */

        /* renamed from: J0 */
        public C41084a f36652J0;

        /* renamed from: J1 */
        private C41084a f36653J1;

        /* renamed from: J2 */
        private C41084a f36654J2;
        /* access modifiers changed from: private */

        /* renamed from: J3 */
        public C41084a f36655J3;
        /* access modifiers changed from: private */

        /* renamed from: J4 */
        public C41084a f36656J4;

        /* renamed from: J5 */
        private C41084a f36657J5;

        /* renamed from: K */
        private C41084a f36658K;
        /* access modifiers changed from: private */

        /* renamed from: K0 */
        public C41084a f36659K0;

        /* renamed from: K1 */
        private C41084a f36660K1;

        /* renamed from: K2 */
        private C41084a f36661K2;

        /* renamed from: K3 */
        private C41084a f36662K3;

        /* renamed from: K4 */
        private C41084a f36663K4;

        /* renamed from: K5 */
        private C41084a f36664K5;
        /* access modifiers changed from: private */

        /* renamed from: L */
        public C41084a f36665L;

        /* renamed from: L0 */
        private C41084a f36666L0;

        /* renamed from: L1 */
        private C41084a f36667L1;

        /* renamed from: L2 */
        private C41084a f36668L2;
        /* access modifiers changed from: private */

        /* renamed from: L3 */
        public C41084a f36669L3;

        /* renamed from: L4 */
        private C41084a f36670L4;

        /* renamed from: L5 */
        private C41084a f36671L5;
        /* access modifiers changed from: private */

        /* renamed from: M */
        public C41084a f36672M;
        /* access modifiers changed from: private */

        /* renamed from: M0 */
        public C41084a f36673M0;
        /* access modifiers changed from: private */

        /* renamed from: M1 */
        public C41084a f36674M1;

        /* renamed from: M2 */
        private C41084a f36675M2;

        /* renamed from: M3 */
        private C41084a f36676M3;
        /* access modifiers changed from: private */

        /* renamed from: M4 */
        public C41084a f36677M4;
        /* access modifiers changed from: private */

        /* renamed from: M5 */
        public C41084a f36678M5;
        /* access modifiers changed from: private */

        /* renamed from: N */
        public C41084a f36679N;

        /* renamed from: N0 */
        private C41084a f36680N0;

        /* renamed from: N1 */
        private C41084a f36681N1;
        /* access modifiers changed from: private */

        /* renamed from: N2 */
        public C41084a f36682N2;

        /* renamed from: N3 */
        private C41084a f36683N3;
        /* access modifiers changed from: private */

        /* renamed from: N4 */
        public C41084a f36684N4;

        /* renamed from: N5 */
        private C41084a f36685N5;

        /* renamed from: O */
        private C41084a f36686O;
        /* access modifiers changed from: private */

        /* renamed from: O0 */
        public C41084a f36687O0;

        /* renamed from: O1 */
        private C41084a f36688O1;

        /* renamed from: O2 */
        private C41084a f36689O2;
        /* access modifiers changed from: private */

        /* renamed from: O3 */
        public C41084a f36690O3;

        /* renamed from: O4 */
        private C41084a f36691O4;

        /* renamed from: P */
        private C41084a f36692P;

        /* renamed from: P0 */
        private C41084a f36693P0;

        /* renamed from: P1 */
        private C41084a f36694P1;

        /* renamed from: P2 */
        private C41084a f36695P2;

        /* renamed from: P3 */
        private C41084a f36696P3;

        /* renamed from: P4 */
        private C41084a f36697P4;

        /* renamed from: Q */
        private C41084a f36698Q;
        /* access modifiers changed from: private */

        /* renamed from: Q0 */
        public C41084a f36699Q0;

        /* renamed from: Q1 */
        private C41084a f36700Q1;
        /* access modifiers changed from: private */

        /* renamed from: Q2 */
        public C41084a f36701Q2;

        /* renamed from: Q3 */
        private C41084a f36702Q3;
        /* access modifiers changed from: private */

        /* renamed from: Q4 */
        public C41084a f36703Q4;

        /* renamed from: R */
        private C41084a f36704R;
        /* access modifiers changed from: private */

        /* renamed from: R0 */
        public C41084a f36705R0;

        /* renamed from: R1 */
        private C41084a f36706R1;

        /* renamed from: R2 */
        private C41084a f36707R2;

        /* renamed from: R3 */
        private C41084a f36708R3;

        /* renamed from: R4 */
        private C41084a f36709R4;
        /* access modifiers changed from: private */

        /* renamed from: S */
        public C41084a f36710S;
        /* access modifiers changed from: private */

        /* renamed from: S0 */
        public C41084a f36711S0;

        /* renamed from: S1 */
        private C41084a f36712S1;

        /* renamed from: S2 */
        private C41084a f36713S2;

        /* renamed from: S3 */
        private C41084a f36714S3;
        /* access modifiers changed from: private */

        /* renamed from: S4 */
        public C41084a f36715S4;
        /* access modifiers changed from: private */

        /* renamed from: T */
        public C41084a f36716T;
        /* access modifiers changed from: private */

        /* renamed from: T0 */
        public C41084a f36717T0;

        /* renamed from: T1 */
        private C41084a f36718T1;

        /* renamed from: T2 */
        private C41084a f36719T2;
        /* access modifiers changed from: private */

        /* renamed from: T3 */
        public C41084a f36720T3;

        /* renamed from: T4 */
        private C41084a f36721T4;

        /* renamed from: U */
        private C41084a f36722U;
        /* access modifiers changed from: private */

        /* renamed from: U0 */
        public C41084a f36723U0;

        /* renamed from: U1 */
        private C41084a f36724U1;

        /* renamed from: U2 */
        private C41084a f36725U2;
        /* access modifiers changed from: private */

        /* renamed from: U3 */
        public C41084a f36726U3;
        /* access modifiers changed from: private */

        /* renamed from: U4 */
        public C41084a f36727U4;
        /* access modifiers changed from: private */

        /* renamed from: V */
        public C41084a f36728V;
        /* access modifiers changed from: private */

        /* renamed from: V0 */
        public C41084a f36729V0;

        /* renamed from: V1 */
        private C41084a f36730V1;

        /* renamed from: V2 */
        private C41084a f36731V2;

        /* renamed from: V3 */
        private C41084a f36732V3;
        /* access modifiers changed from: private */

        /* renamed from: V4 */
        public C41084a f36733V4;

        /* renamed from: W */
        private C41084a f36734W;
        /* access modifiers changed from: private */

        /* renamed from: W0 */
        public C41084a f36735W0;

        /* renamed from: W1 */
        private C41084a f36736W1;
        /* access modifiers changed from: private */

        /* renamed from: W2 */
        public C41084a f36737W2;

        /* renamed from: W3 */
        private C41084a f36738W3;

        /* renamed from: W4 */
        private C41084a f36739W4;

        /* renamed from: X */
        private C41084a f36740X;
        /* access modifiers changed from: private */

        /* renamed from: X0 */
        public C41084a f36741X0;

        /* renamed from: X1 */
        private C41084a f36742X1;

        /* renamed from: X2 */
        private C41084a f36743X2;
        /* access modifiers changed from: private */

        /* renamed from: X3 */
        public C41084a f36744X3;

        /* renamed from: X4 */
        private C41084a f36745X4;

        /* renamed from: Y */
        private C41084a f36746Y;
        /* access modifiers changed from: private */

        /* renamed from: Y0 */
        public C41084a f36747Y0;

        /* renamed from: Y1 */
        private C41084a f36748Y1;

        /* renamed from: Y2 */
        private C41084a f36749Y2;
        /* access modifiers changed from: private */

        /* renamed from: Y3 */
        public C41084a f36750Y3;

        /* renamed from: Y4 */
        private C41084a f36751Y4;

        /* renamed from: Z */
        private C41084a f36752Z;
        /* access modifiers changed from: private */

        /* renamed from: Z0 */
        public C41084a f36753Z0;

        /* renamed from: Z1 */
        private C41084a f36754Z1;

        /* renamed from: Z2 */
        private C41084a f36755Z2;
        /* access modifiers changed from: private */

        /* renamed from: Z3 */
        public C41084a f36756Z3;

        /* renamed from: Z4 */
        private C41084a f36757Z4;

        /* renamed from: a */
        private final C12272j f36758a;

        /* renamed from: a0 */
        private C41084a f36759a0;

        /* renamed from: a1 */
        private C41084a f36760a1;

        /* renamed from: a2 */
        private C41084a f36761a2;

        /* renamed from: a3 */
        private C41084a f36762a3;

        /* renamed from: a4 */
        private C41084a f36763a4;
        /* access modifiers changed from: private */

        /* renamed from: a5 */
        public C41084a f36764a5;

        /* renamed from: b */
        private final C12192d f36765b;

        /* renamed from: b0 */
        private C41084a f36766b0;

        /* renamed from: b1 */
        private C41084a f36767b1;

        /* renamed from: b2 */
        private C41084a f36768b2;
        /* access modifiers changed from: private */

        /* renamed from: b3 */
        public C41084a f36769b3;
        /* access modifiers changed from: private */

        /* renamed from: b4 */
        public C41084a f36770b4;

        /* renamed from: b5 */
        private C41084a f36771b5;

        /* renamed from: c */
        private final C12279n f36772c;

        /* renamed from: c0 */
        private C41084a f36773c0;
        /* access modifiers changed from: private */

        /* renamed from: c1 */
        public C41084a f36774c1;

        /* renamed from: c2 */
        private C41084a f36775c2;

        /* renamed from: c3 */
        private C41084a f36776c3;

        /* renamed from: c4 */
        private C41084a f36777c4;

        /* renamed from: c5 */
        private C41084a f36778c5;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C41084a f36779d;

        /* renamed from: d0 */
        private C41084a f36780d0;

        /* renamed from: d1 */
        private C41084a f36781d1;

        /* renamed from: d2 */
        private C41084a f36782d2;
        /* access modifiers changed from: private */

        /* renamed from: d3 */
        public C41084a f36783d3;

        /* renamed from: d4 */
        private C41084a f36784d4;

        /* renamed from: d5 */
        private C41084a f36785d5;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C41084a f36786e;
        /* access modifiers changed from: private */

        /* renamed from: e0 */
        public C41084a f36787e0;

        /* renamed from: e1 */
        private C41084a f36788e1;

        /* renamed from: e2 */
        private C41084a f36789e2;
        /* access modifiers changed from: private */

        /* renamed from: e3 */
        public C41084a f36790e3;

        /* renamed from: e4 */
        private C41084a f36791e4;
        /* access modifiers changed from: private */

        /* renamed from: e5 */
        public C41084a f36792e5;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C41084a f36793f;

        /* renamed from: f0 */
        private C41084a f36794f0;

        /* renamed from: f1 */
        private C41084a f36795f1;

        /* renamed from: f2 */
        private C41084a f36796f2;
        /* access modifiers changed from: private */

        /* renamed from: f3 */
        public C41084a f36797f3;
        /* access modifiers changed from: private */

        /* renamed from: f4 */
        public C41084a f36798f4;

        /* renamed from: f5 */
        private C41084a f36799f5;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C41084a f36800g;

        /* renamed from: g0 */
        private C41084a f36801g0;
        /* access modifiers changed from: private */

        /* renamed from: g1 */
        public C41084a f36802g1;

        /* renamed from: g2 */
        private C41084a f36803g2;
        /* access modifiers changed from: private */

        /* renamed from: g3 */
        public C41084a f36804g3;

        /* renamed from: g4 */
        private C41084a f36805g4;
        /* access modifiers changed from: private */

        /* renamed from: g5 */
        public C41084a f36806g5;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C41084a f36807h;

        /* renamed from: h0 */
        private C41084a f36808h0;

        /* renamed from: h1 */
        private C41084a f36809h1;

        /* renamed from: h2 */
        private C41084a f36810h2;

        /* renamed from: h3 */
        private C41084a f36811h3;

        /* renamed from: h4 */
        private C41084a f36812h4;

        /* renamed from: h5 */
        private C41084a f36813h5;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C41084a f36814i;
        /* access modifiers changed from: private */

        /* renamed from: i0 */
        public C41084a f36815i0;

        /* renamed from: i1 */
        private C41084a f36816i1;

        /* renamed from: i2 */
        private C41084a f36817i2;

        /* renamed from: i3 */
        private C41084a f36818i3;
        /* access modifiers changed from: private */

        /* renamed from: i4 */
        public C41084a f36819i4;
        /* access modifiers changed from: private */

        /* renamed from: i5 */
        public C41084a f36820i5;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C41084a f36821j;
        /* access modifiers changed from: private */

        /* renamed from: j0 */
        public C41084a f36822j0;
        /* access modifiers changed from: private */

        /* renamed from: j1 */
        public C41084a f36823j1;
        /* access modifiers changed from: private */

        /* renamed from: j2 */
        public C41084a f36824j2;
        /* access modifiers changed from: private */

        /* renamed from: j3 */
        public C41084a f36825j3;

        /* renamed from: j4 */
        private C41084a f36826j4;

        /* renamed from: j5 */
        private C41084a f36827j5;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C41084a f36828k;
        /* access modifiers changed from: private */

        /* renamed from: k0 */
        public C41084a f36829k0;

        /* renamed from: k1 */
        private C41084a f36830k1;
        /* access modifiers changed from: private */

        /* renamed from: k2 */
        public C41084a f36831k2;

        /* renamed from: k3 */
        private C41084a f36832k3;

        /* renamed from: k4 */
        private C41084a f36833k4;

        /* renamed from: k5 */
        private C41084a f36834k5;

        /* renamed from: l */
        private C41084a f36835l;

        /* renamed from: l0 */
        private C41084a f36836l0;
        /* access modifiers changed from: private */

        /* renamed from: l1 */
        public C41084a f36837l1;
        /* access modifiers changed from: private */

        /* renamed from: l2 */
        public C41084a f36838l2;
        /* access modifiers changed from: private */

        /* renamed from: l3 */
        public C41084a f36839l3;

        /* renamed from: l4 */
        private C41084a f36840l4;
        /* access modifiers changed from: private */

        /* renamed from: l5 */
        public C41084a f36841l5;

        /* renamed from: m */
        private C41084a f36842m;

        /* renamed from: m0 */
        private C41084a f36843m0;

        /* renamed from: m1 */
        private C41084a f36844m1;
        /* access modifiers changed from: private */

        /* renamed from: m2 */
        public C41084a f36845m2;
        /* access modifiers changed from: private */

        /* renamed from: m3 */
        public C41084a f36846m3;
        /* access modifiers changed from: private */

        /* renamed from: m4 */
        public C41084a f36847m4;

        /* renamed from: m5 */
        private C41084a f36848m5;

        /* renamed from: n */
        private C41084a f36849n;

        /* renamed from: n0 */
        private C41084a f36850n0;

        /* renamed from: n1 */
        private C41084a f36851n1;
        /* access modifiers changed from: private */

        /* renamed from: n2 */
        public C41084a f36852n2;

        /* renamed from: n3 */
        private C41084a f36853n3;

        /* renamed from: n4 */
        private C41084a f36854n4;

        /* renamed from: n5 */
        private C41084a f36855n5;

        /* renamed from: o */
        private C41084a f36856o;
        /* access modifiers changed from: private */

        /* renamed from: o0 */
        public C41084a f36857o0;

        /* renamed from: o1 */
        private C41084a f36858o1;
        /* access modifiers changed from: private */

        /* renamed from: o2 */
        public C41084a f36859o2;
        /* access modifiers changed from: private */

        /* renamed from: o3 */
        public C41084a f36860o3;
        /* access modifiers changed from: private */

        /* renamed from: o4 */
        public C41084a f36861o4;
        /* access modifiers changed from: private */

        /* renamed from: o5 */
        public C41084a f36862o5;

        /* renamed from: p */
        private C41084a f36863p;

        /* renamed from: p0 */
        private C41084a f36864p0;

        /* renamed from: p1 */
        private C41084a f36865p1;

        /* renamed from: p2 */
        private C41084a f36866p2;

        /* renamed from: p3 */
        private C41084a f36867p3;
        /* access modifiers changed from: private */

        /* renamed from: p4 */
        public C41084a f36868p4;

        /* renamed from: p5 */
        private C41084a f36869p5;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public C41084a f36870q;
        /* access modifiers changed from: private */

        /* renamed from: q0 */
        public C41084a f36871q0;
        /* access modifiers changed from: private */

        /* renamed from: q1 */
        public C41084a f36872q1;
        /* access modifiers changed from: private */

        /* renamed from: q2 */
        public C41084a f36873q2;
        /* access modifiers changed from: private */

        /* renamed from: q3 */
        public C41084a f36874q3;

        /* renamed from: q4 */
        private C41084a f36875q4;
        /* access modifiers changed from: private */

        /* renamed from: q5 */
        public C41084a f36876q5;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public C41084a f36877r;
        /* access modifiers changed from: private */

        /* renamed from: r0 */
        public C41084a f36878r0;

        /* renamed from: r1 */
        private C41084a f36879r1;

        /* renamed from: r2 */
        private C41084a f36880r2;

        /* renamed from: r3 */
        private C41084a f36881r3;

        /* renamed from: r4 */
        private C41084a f36882r4;

        /* renamed from: r5 */
        private C41084a f36883r5;

        /* renamed from: s */
        private C41084a f36884s;
        /* access modifiers changed from: private */

        /* renamed from: s0 */
        public C41084a f36885s0;

        /* renamed from: s1 */
        private C41084a f36886s1;
        /* access modifiers changed from: private */

        /* renamed from: s2 */
        public C41084a f36887s2;
        /* access modifiers changed from: private */

        /* renamed from: s3 */
        public C41084a f36888s3;
        /* access modifiers changed from: private */

        /* renamed from: s4 */
        public C41084a f36889s4;
        /* access modifiers changed from: private */

        /* renamed from: s5 */
        public C41084a f36890s5;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public C41084a f36891t;
        /* access modifiers changed from: private */

        /* renamed from: t0 */
        public C41084a f36892t0;
        /* access modifiers changed from: private */

        /* renamed from: t1 */
        public C41084a f36893t1;

        /* renamed from: t2 */
        private C41084a f36894t2;

        /* renamed from: t3 */
        private C41084a f36895t3;

        /* renamed from: t4 */
        private C41084a f36896t4;

        /* renamed from: t5 */
        private C41084a f36897t5;

        /* renamed from: u */
        private C41084a f36898u;
        /* access modifiers changed from: private */

        /* renamed from: u0 */
        public C41084a f36899u0;

        /* renamed from: u1 */
        private C41084a f36900u1;
        /* access modifiers changed from: private */

        /* renamed from: u2 */
        public C41084a f36901u2;
        /* access modifiers changed from: private */

        /* renamed from: u3 */
        public C41084a f36902u3;
        /* access modifiers changed from: private */

        /* renamed from: u4 */
        public C41084a f36903u4;

        /* renamed from: u5 */
        private C41084a f36904u5;

        /* renamed from: v */
        private C41084a f36905v;
        /* access modifiers changed from: private */

        /* renamed from: v0 */
        public C41084a f36906v0;
        /* access modifiers changed from: private */

        /* renamed from: v1 */
        public C41084a f36907v1;

        /* renamed from: v2 */
        private C41084a f36908v2;
        /* access modifiers changed from: private */

        /* renamed from: v3 */
        public C41084a f36909v3;

        /* renamed from: v4 */
        private C41084a f36910v4;
        /* access modifiers changed from: private */

        /* renamed from: v5 */
        public C41084a f36911v5;
        /* access modifiers changed from: private */

        /* renamed from: w */
        public C41084a f36912w;
        /* access modifiers changed from: private */

        /* renamed from: w0 */
        public C41084a f36913w0;

        /* renamed from: w1 */
        private C41084a f36914w1;
        /* access modifiers changed from: private */

        /* renamed from: w2 */
        public C41084a f36915w2;

        /* renamed from: w3 */
        private C41084a f36916w3;
        /* access modifiers changed from: private */

        /* renamed from: w4 */
        public C41084a f36917w4;

        /* renamed from: w5 */
        private C41084a f36918w5;
        /* access modifiers changed from: private */

        /* renamed from: x */
        public C41084a f36919x;
        /* access modifiers changed from: private */

        /* renamed from: x0 */
        public C41084a f36920x0;
        /* access modifiers changed from: private */

        /* renamed from: x1 */
        public C41084a f36921x1;

        /* renamed from: x2 */
        private C41084a f36922x2;
        /* access modifiers changed from: private */

        /* renamed from: x3 */
        public C41084a f36923x3;

        /* renamed from: x4 */
        private C41084a f36924x4;

        /* renamed from: x5 */
        private C41084a f36925x5;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public C41084a f36926y;

        /* renamed from: y0 */
        private C41084a f36927y0;

        /* renamed from: y1 */
        private C41084a f36928y1;
        /* access modifiers changed from: private */

        /* renamed from: y2 */
        public C41084a f36929y2;

        /* renamed from: y3 */
        private C41084a f36930y3;

        /* renamed from: y4 */
        private C41084a f36931y4;

        /* renamed from: y5 */
        private C41084a f36932y5;

        /* renamed from: z */
        private C41084a f36933z;
        /* access modifiers changed from: private */

        /* renamed from: z0 */
        public C41084a f36934z0;

        /* renamed from: z1 */
        private C41084a f36935z1;
        /* access modifiers changed from: private */

        /* renamed from: z2 */
        public C41084a f36936z2;
        /* access modifiers changed from: private */

        /* renamed from: z3 */
        public C41084a f36937z3;

        /* renamed from: z4 */
        private C41084a f36938z4;

        /* renamed from: z5 */
        private C41084a f36939z5;

        /* renamed from: dk.b$n$a */
        private static final class C12280a implements C41084a {

            /* renamed from: a */
            private final C12272j f36940a;

            /* renamed from: b */
            private final C12192d f36941b;

            /* renamed from: c */
            private final C12279n f36942c;

            /* renamed from: d */
            private final int f36943d;

            C12280a(C12272j jVar, C12192d dVar, C12279n nVar, int i) {
                this.f36940a = jVar;
                this.f36941b = dVar;
                this.f36942c = nVar;
                this.f36943d = i;
            }

            /* renamed from: a */
            private Object m47212a() {
                switch (this.f36943d) {
                    case 0:
                        return new ActivateInstantCardViewModel$ViewModel((C16737d1) this.f36942c.f36786e.get(), (C16796y0) this.f36942c.f36800g.get(), (C16731c0) this.f36942c.f36807h.get(), (C16728b1) this.f36942c.f36814i.get(), this.f36940a.m46195b8(), this.f36942c.m46543E9(), (C16739e0) this.f36942c.f36821j.get(), (C10086d) this.f36942c.f36828k.get(), (C32053a) this.f36940a.f36236J3.get());
                    case 1:
                        return new C16737d1((C16586a) this.f36942c.f36779d.get());
                    case 2:
                        return new C15309d0((IRetrofitService) this.f36940a.f36350Y.get(), (C12925a) this.f36940a.f36488p3.get(), this.f36940a.m46195b8(), (C26116a) this.f36940a.f36567z2.get(), (C15700a) this.f36940a.f36496q3.get());
                    case 3:
                        return new C16796y0((C16767q) this.f36942c.f36793f.get(), this.f36940a.cardsAndDetailsUseCase());
                    case 4:
                        return new C16767q((C16586a) this.f36942c.f36779d.get());
                    case 5:
                        return new C16731c0(this.f36942c.m47054oa(), this.f36942c.m47011l9());
                    case 6:
                        return new C16728b1((C16586a) this.f36942c.f36779d.get(), (C25351j) this.f36940a.f36464m3.get(), (Client) this.f36940a.f36389d0.get());
                    case 7:
                        return new C16739e0((C16586a) this.f36942c.f36779d.get());
                    case 8:
                        return new C10086d();
                    case 9:
                        return new ActivationDateInputViewModel.ViewModel(this.f36942c.m46741Sb(), this.f36942c.m46997k9(), this.f36942c.m47011l9());
                    case 10:
                        return new AddBudgetViewModel(this.f36942c.m46583H7(), (C25326a) this.f36940a.f36402e5.get());
                    case 11:
                        return new C29174f((C29860a) this.f36940a.f36194E1.get());
                    case 12:
                        return new AddByPhoneViewModel(this.f36942c.m46513C7());
                    case 13:
                        return new AddNewProductViewModel$ViewModel((C38345b) this.f36940a.f36431i2.get(), this.f36942c.m47081q9(), (C29879c) this.f36942c.f36877r.get(), this.f36940a.m46195b8(), (PreferencesApiManager) this.f36940a.f36224I.get(), (C26096a) this.f36942c.f36891t.get());
                    case 14:
                        return new C29879c((C29881d) this.f36942c.f36870q.get());
                    case 15:
                        return new C29881d((C19147a) this.f36940a.f36390d1.get());
                    case 16:
                        return new C40257a();
                    case 17:
                        return new AnalysisTransactionViewModel(this.f36942c.m46770Uc());
                    case 18:
                        return new AnalysisViewModel((C28277b) this.f36942c.f36912w.get(), (C29167c) this.f36942c.f36919x.get(), this.f36940a.getAccountsAndDetailsUseCase(), new C19331a(), (C29644a) this.f36940a.f36426h5.get(), (C26143a) this.f36942c.f36926y.get(), (C20100q) this.f36940a.f36565z0.get());
                    case 19:
                        return new C28277b((C28945a) this.f36940a.f36418g5.get(), this.f36940a.getTransactionCategoriesUseCase());
                    case 20:
                        return new C29167c((C29860a) this.f36940a.f36194E1.get());
                    case 21:
                        return new C26143a();
                    case 22:
                        return new ApplicationDetailsViewModel((C29574a) this.f36942c.f36588A.get());
                    case 23:
                        return new C29574a((C30114a) this.f36940a.f36442j5.get());
                    case 24:
                        return new AuthorizationViewModel$ViewModel(this.f36942c.m47024m8(), this.f36940a.m46115T7(), (C36242m) this.f36940a.f36450k5.get());
                    case 25:
                        return new BannerDetailsViewModel(this.f36940a.m46115T7(), (C24774a) this.f36942c.f36609D.get(), (Gson) this.f36940a.f36288Q.get());
                    case 26:
                        return new C24774a();
                    case 27:
                        return new BecomeSoloApplicationViewModel(this.f36942c.m46794W8(), this.f36942c.m47151v9(), this.f36942c.m46574Gc(), this.f36942c.m46569G7(), (C20049a) this.f36940a.f36482o5.get());
                    case 28:
                        return new C30120b((C19280a) this.f36940a.f36376b3.get());
                    case 29:
                        return new C27604b();
                    case 30:
                        return new C20050b();
                    case 31:
                        return new BillSplitSelectOperationsViewModel(this.f36942c.m46518Cc(), this.f36942c.m46485A7(), this.f36942c.m47070pc(), this.f36942c.m46807X7(), this.f36942c.m46558Fa(), (C30140a) this.f36942c.f36651J.get(), this.f36942c.m46821Y7(), new C24794e());
                    case 32:
                        return new C30140a();
                    case 33:
                        return new BillSplitSummaryViewModel(this.f36942c.m46784Vc(), this.f36942c.m46558Fa(), this.f36942c.m46798Wc(), this.f36942c.m47070pc(), (C24830w) this.f36942c.f36665L.get(), this.f36942c.m46826Yc(), (C30140a) this.f36942c.f36651J.get(), this.f36942c.m47098rc(), (C30142c) this.f36942c.f36672M.get(), (C25795b) this.f36942c.f36679N.get(), this.f36942c.m46982j8(), this.f36942c.m46955h9(), (Client) this.f36940a.f36389d0.get(), this.f36942c.m46503Bb(), this.f36942c.m46808X8(), (PreferencesApiManager) this.f36940a.f36224I.get());
                    case 34:
                        return new C24830w((C25260a) this.f36940a.f36187D2.get());
                    case 35:
                        return new C30142c();
                    case 36:
                        return new C25795b();
                    case 37:
                        return new BnplCategoriesViewModel$ViewModel(this.f36942c.m46836Z8());
                    case 38:
                        return new BnplOffersViewModel$ViewModel(this.f36942c.m46822Y8(), this.f36942c.m46850a9());
                    case 39:
                        return new BnplWelcomeViewModel$ViewModel((PreferencesApiManager) this.f36940a.f36224I.get(), (Client) this.f36940a.f36389d0.get());
                    case 40:
                        return new BogProductsFragmentViewModel((C29877a) this.f36942c.f36710S.get(), this.f36942c.m46488Aa(), (C25803a) this.f36942c.f36716T.get(), this.f36940a.m46115T7(), (C29879c) this.f36942c.f36877r.get(), (Client) this.f36940a.f36389d0.get(), (C41438c) this.f36940a.f36184D.get());
                    case 41:
                        return new C29877a((C19147a) this.f36940a.f36390d1.get());
                    case 42:
                        return new C25803a();
                    case 43:
                        return new BudgetHistoryViewModel((C29171e) this.f36942c.f36728V.get(), (C25326a) this.f36940a.f36402e5.get(), (C36546y) this.f36940a.f36168B.get());
                    case 44:
                        return new C29171e((C29860a) this.f36940a.f36194E1.get(), this.f36942c.m46583H7());
                    case 45:
                        return new BudgetingViewModel(this.f36942c.m46583H7(), (C25326a) this.f36940a.f36402e5.get());
                    case 46:
                        return new CalendarDayTransactionsViewModel(this.f36942c.m46584H8(), this.f36942c.m46770Uc(), (C20100q) this.f36940a.f36565z0.get());
                    case 47:
                        return new CarNumberInputViewModel$ViewModel(this.f36942c.m46755Tb());
                    case 48:
                        return new CarOwnerInputViewModel$ViewModel(this.f36942c.m46783Vb());
                    case 49:
                        return new CardActivationViewModel(this.f36942c.m47149v7(), this.f36942c.m46884cd(), this.f36940a.cardsAndDetailsUseCase(), (C27494a) this.f36940a.f36414g1.get());
                    case 50:
                        return new CardBenefitsViewModel$ViewModel();
                    case 51:
                        return new CardDetailsViewModel();
                    case 52:
                        return new CardInsuranceStatusesViewModel$ViewModel(this.f36940a.cardsAndDetailsUseCase(), (C32038a) this.f36942c.f36787e0.get());
                    case 53:
                        return new C32038a();
                    case 54:
                        return new CashFlowViewModel(this.f36942c.m46653M7(), (C36546y) this.f36940a.f36168B.get(), new C26369a());
                    case 55:
                        return new CashOperationViewModel(this.f36942c.m47177x7());
                    case 56:
                        return new CategoriesDdViewModel((C31876e) this.f36940a.f36570z5.get(), (C37497e) this.f36941b.f35905P.get(), (C10463g) this.f36940a.f36497q4.get(), (C39241f) this.f36942c.f36815i0.get(), (C38029d) this.f36942c.f36822j0.get(), this.f36940a.m46115T7(), (C39239d) this.f36942c.f36829k0.get());
                    case 57:
                        return new C39241f((C39235a) this.f36941b.f35919m.get());
                    case 58:
                        return new C38029d(this.f36940a.m46115T7());
                    case 59:
                        return new C39239d((C39235a) this.f36941b.f35919m.get());
                    case 60:
                        return new CategoriesPaymentsViewModel((C31876e) this.f36940a.f36537v4.get(), (C37497e) this.f36941b.f35927u.get(), (C10463g) this.f36940a.f36497q4.get(), (C39241f) this.f36942c.f36815i0.get(), (C38029d) this.f36942c.f36822j0.get(), this.f36940a.m46115T7(), (C39239d) this.f36942c.f36829k0.get());
                    case 61:
                        return new ChangeLanguageViewModel$ViewModel((Client) this.f36940a.f36389d0.get(), (PreferencesApiManager) this.f36940a.f36224I.get(), C17958c.m61876a(this.f36940a.f36388d));
                    case 62:
                        return new ChooseAccountViewModel$ViewModel(this.f36942c.m46853ac(), (C15733a) this.f36942c.f36857o0.get());
                    case 63:
                        return new C15733a(this.f36940a.m46421x8());
                    case 64:
                        return new ClaFirstStageViewModel(this.f36942c.m46488Aa(), (C29243b) this.f36942c.f36885s0.get(), (C28328e) this.f36942c.f36892t0.get(), (C27689c) this.f36942c.f36913w0.get(), (C27687a) this.f36942c.f36920x0.get(), this.f36942c.m47028mc(), (C24922c) this.f36940a.f36347X3.get(), new C27094a(), (C28474a) this.f36940a.f36252L3.get());
                    case 65:
                        return new C29243b((C29954a) this.f36942c.f36878r0.get());
                    case 66:
                        return new C20450d((C29000a) this.f36940a.f36202F1.get(), (C20778a) this.f36942c.f36871q0.get(), (Gson) this.f36940a.f36288Q.get());
                    case 67:
                        return new C20778a();
                    case 68:
                        return new C28328e((C29002a) this.f36940a.f36218H1.get());
                    case 69:
                        return new C27689c((C28162a) this.f36942c.f36899u0.get(), (C27691d) this.f36942c.f36906v0.get());
                    case 70:
                        return new C19195d((C29000a) this.f36940a.f36202F1.get(), (C19342a) this.f36940a.f36340W3.get());
                    case 71:
                        return new C27691d((C28162a) this.f36942c.f36899u0.get());
                    case 72:
                        return new C27687a((C28162a) this.f36942c.f36899u0.get());
                    case 73:
                        return new CloseCardViewModel$ViewModel((C16588b) this.f36942c.f36589A0.get(), (C16587a) this.f36942c.f36596B0.get(), this.f36940a.m46195b8());
                    case 74:
                        return new C16588b((C17110a) this.f36942c.f36934z0.get());
                    case 75:
                        return new C15704c((C15535a) this.f36940a.f36292Q3.get(), (C15362a) this.f36940a.f36300R3.get(), (C15700a) this.f36940a.f36496q3.get());
                    case 76:
                        return new C16587a((C17110a) this.f36942c.f36934z0.get());
                    case 77:
                        return new CombinedOfferViewModel$ViewModel((C25372h) this.f36942c.f36610D0.get(), (C27493a) this.f36940a.f36166A5.get());
                    case 78:
                        return new C25372h((C25865a) this.f36940a.f36417g4.get());
                    case 79:
                        return new CommissionsSummariesViewModel(this.f36942c.m46882cb(), (C28295c) this.f36942c.f36624F0.get());
                    case 80:
                        return new C28295c();
                    case 81:
                        return new CommissionsViewModel((PreferencesApiManager) this.f36940a.f36224I.get(), this.f36942c.m47039n9(), this.f36942c.m46898dc(), this.f36942c.m47067p9(), this.f36942c.m47000kc(), (C28293a) this.f36942c.f36638H0.get());
                    case 82:
                        return new C28293a();
                    case 83:
                        return new ConsumerLoanDetailsViewModel(this.f36942c.m46864b8(), this.f36942c.m46909e8(), this.f36942c.m46894d8(), this.f36942c.m46924f8(), this.f36942c.m46879c8(), (C30410c) this.f36942c.f36652J0.get(), (C30408a) this.f36942c.f36659K0.get(), this.f36942c.m47028mc(), (C28064b) this.f36940a.f36262M5.get(), (C28063a) this.f36940a.f36270N5.get(), (C28474a) this.f36940a.f36252L3.get(), this.f36942c.m46728Rc(), (C27494a) this.f36940a.f36414g1.get());
                    case 84:
                        return new C30410c((C19412a) this.f36940a.f36254L5.get());
                    case 85:
                        return new C30408a((C19412a) this.f36940a.f36254L5.get());
                    case 86:
                        return new ContactDetailsViewModel(this.f36942c.m47095r9(), this.f36942c.m47163w7(), this.f36942c.m47122t8(), this.f36942c.m47123t9(), new C28122a(), this.f36942c.m47109s9(), this.f36942c.m46770Uc(), (C29644a) this.f36940a.f36426h5.get(), this.f36942c.m46681O7(), this.f36942c.m47136u8(), this.f36942c.m47205z7(), this.f36942c.m46499B7(), (C29861a) this.f36942c.f36673M0.get(), (C27494a) this.f36940a.f36414g1.get(), this.f36942c.m47137u9());
                    case 87:
                        return new C29861a((C28094c) this.f36940a.f36235J2.get());
                    case 88:
                        return new ContactsActivityViewModel((Client) this.f36940a.f36389d0.get(), (C27677a) this.f36942c.f36687O0.get(), this.f36942c.m46490Ac(), this.f36942c.m46629Kb(), this.f36942c.m47136u8(), this.f36942c.m47123t9(), this.f36940a.m46115T7(), (C29861a) this.f36942c.f36673M0.get(), this.f36942c.m47126tc(), (C27494a) this.f36940a.f36414g1.get());
                    case 89:
                        return new C27677a();
                    case 90:
                        return new CreatePiggyBankViewModel$ViewModel((C39852e0) this.f36942c.f36711S0.get(), (C39877p) this.f36942c.f36717T0.get(), this.f36942c.m46839Zb(), this.f36940a.m46195b8(), (C39863i0) this.f36942c.f36729V0.get(), (C25351j) this.f36940a.f36464m3.get(), (C37264h) this.f36942c.f36753Z0.get());
                    case 91:
                        return new C39852e0((C39860h) this.f36942c.f36699Q0.get(), (C39889y) this.f36942c.f36705R0.get(), this.f36940a.cardsAndDetailsUseCase(), (C38793a) this.f36940a.f36559y2.get());
                    case 92:
                        return new C39860h((C31186b) this.f36940a.f36163A2.get());
                    case 93:
                        return new C39889y((C31186b) this.f36940a.f36163A2.get());
                    case 94:
                        return new C39877p((C31186b) this.f36940a.f36163A2.get());
                    case 95:
                        return new C37020g((C38267a) this.f36940a.f36558y1.get());
                    case 96:
                        return new C39863i0((C31186b) this.f36940a.f36163A2.get());
                    case 97:
                        return new C37264h((C37154c) this.f36942c.f36747Y0.get(), (C36990a) this.f36942c.f36741X0.get());
                    case 98:
                        return new C37154c((C30123a) this.f36942c.f36735W0.get(), (C36990a) this.f36942c.f36741X0.get());
                    case 99:
                        return new C30123a();
                    default:
                        throw new AssertionError(this.f36943d);
                }
            }

            /* renamed from: b */
            private Object m47213b() {
                switch (this.f36943d) {
                    case 100:
                        return new C36990a();
                    case 101:
                        return new CreditApplicationViewModel(this.f36942c.m47179x9(), this.f36942c.m46723R7(), this.f36942c.m46489Ab(), this.f36942c.m47193y9(), this.f36942c.m47054oa(), (C30120b) this.f36942c.f36623F.get(), this.f36942c.m47042nc(), (C19150a) this.f36940a.f36302R5.get(), (C19337a) this.f36940a.f36212G3.get(), this.f36940a.refreshProductTypeListUseCase(), this.f36942c.m47028mc(), (C28474a) this.f36940a.f36252L3.get(), this.f36942c.m46728Rc(), (C41438c) this.f36940a.f36184D.get(), (C27494a) this.f36940a.f36414g1.get());
                    case 102:
                        return new DarkModeSwitchViewModel$ViewModel((C38108h) this.f36940a.f36310S5.get(), (C38102b) this.f36942c.f36774c1.get());
                    case 103:
                        return new C38102b((PreferencesApiManager) this.f36940a.f36224I.get());
                    case 104:
                        return new DdStoIntroViewModel$ViewModel(this.f36942c.m46824Ya(), this.f36942c.m46515C9());
                    case 105:
                        return new DepositAdvisorRecommendationViewModel$ViewModel(C17958c.m61876a(this.f36940a.f36388d));
                    case 106:
                        return new DepositAdvisorViewModel$ViewModel(this.f36942c.m47054oa(), (C25370f) this.f36940a.f36441j4.get(), (Client) this.f36940a.f36389d0.get(), (C30269a) this.f36942c.f36802g1.get());
                    case 107:
                        return new C30269a();
                    case 108:
                        return new DepositApplicationResultViewModel$ViewModel((C29742a) this.f36942c.f36823j1.get(), (C37020g) this.f36942c.f36723U0.get());
                    case 109:
                        return new C19231d((C30289a) this.f36940a.f36536v3.get());
                    case 110:
                        return new DepositApplicationViewModel$ViewModel((C25364a) this.f36942c.f36837l1.get(), this.f36940a.m46035L7());
                    case 111:
                        return new C25364a((C25865a) this.f36940a.f36417g4.get());
                    case 112:
                        return new DepositTypesViewModel$ViewModel((C25372h) this.f36942c.f36610D0.get(), (C27493a) this.f36940a.f36166A5.get());
                    case 113:
                        return new DiscoveryFragmentContainerViewModel$ViewModel((C29418y) this.f36940a.f36349X5.get());
                    case 114:
                        return new DomesticAccountSelectorActionSheetViewModel$ViewModel(this.f36942c.m46784Vc());
                    case 115:
                        return new EditBudgetViewModel((C29179j) this.f36942c.f36872q1.get(), this.f36942c.m47094r8(), (C25326a) this.f36940a.f36402e5.get(), this.f36942c.m46583H7());
                    case 116:
                        return new C29179j((C29860a) this.f36940a.f36194E1.get(), this.f36940a.getTransactionCategoriesUseCase());
                    case 117:
                        return new EditContactViewModel(this.f36942c.m47109s9(), this.f36942c.m47095r9(), new C28122a(), this.f36942c.m47163w7(), this.f36942c.m47122t8(), this.f36942c.m46486A8(), this.f36942c.m46500B8(), this.f36942c.m46514C8(), this.f36942c.m47123t9(), this.f36942c.m46616Jc(), this.f36942c.m47164w8());
                    case 118:
                        return new EditPackageViewModel$ViewModel((C15386k) this.f36942c.f36893t1.get());
                    case 119:
                        return new C15386k((C16301a) this.f36940a.f36269N4.get());
                    case 120:
                        return new EditProfileViewModel$ViewModel((C20108a) this.f36942c.f36907v1.get());
                    case 121:
                        return new C20108a((C20304a) this.f36940a.f36277O4.get());
                    case 122:
                        return new ExchangeMrPointsToPlusViewModel$ViewModel(this.f36942c.m47152va(), this.f36942c.m46968i8());
                    case 123:
                        return new C39070a((C38526a) this.f36940a.f36543w2.get());
                    case 124:
                        return new FAQViewModel();
                    case 125:
                        return new FillInsuranceInfoViewModel$ViewModel(this.f36942c.m46837Z9(), this.f36942c.m46997k9(), this.f36942c.m47011l9(), this.f36942c.m46670Na());
                    case 126:
                        return new FinancialCalendarViewModel(this.f36942c.m46584H8(), (C29167c) this.f36942c.f36919x.get());
                    case C11051p3.f31760d:
                        return new ForcedDictionaryUpdateViewModel$ViewModel((C27084b) this.f36940a.f36501r0.get(), (PreferencesApiManager) this.f36940a.f36224I.get());
                    case 128:
                        return new GTBalanceViewModel$ViewModel(this.f36942c.m46940g9());
                    case 129:
                        return new GTChangeWatchListNameViewModel$ViewModel(this.f36942c.m46709Q7());
                    case 130:
                        return new GTCreateWatchListViewModel$ViewModel(this.f36942c.m47052o8());
                    case 131:
                        return new GTEditWatchListViewModel$ViewModel(this.f36942c.m47192y8());
                    case 132:
                        return new GTIntroductionViewModel$ViewModel();
                    case 133:
                        return new GTLandingViewModel$ViewModel(this.f36942c.m46642La(), this.f36940a.getProductTypeListUseCase(), this.f36942c.m46683O9(), this.f36942c.m46502Ba(), this.f36942c.m46765U7(), this.f36940a.m46276j9(), this.f36942c.m46657Mb());
                    case 134:
                        return new GTMoneyExchangeResultViewModel$ViewModel();
                    case 135:
                        return new GTMoneyExchangeViewModel$ViewModel(this.f36942c.m46940g9(), this.f36942c.m46711Q9(), this.f36942c.m46655M9(), this.f36942c.m46556F8(), this.f36942c.m47013lb(), (C27494a) this.f36940a.f36414g1.get());
                    case 136:
                        return new GTMyInvestmentsViewModel$ViewModel(this.f36942c.m47025m9(), this.f36942c.m46897db(), this.f36942c.m46969i9());
                    case 137:
                        return new GTOnboardingEmploymentInfoViewModel$ViewModel(this.f36942c.m47055ob(), this.f36942c.m47196yc(), (C29370a) this.f36942c.f36674M1.get(), (Client) this.f36940a.f36389d0.get());
                    case 138:
                        return new C29370a();
                    case 139:
                        return new GTOnboardingIntroViewModel$ViewModel(this.f36940a.m46115T7());
                    case 140:
                        return new GTOnboardingMailInputViewModel$ViewModel(this.f36942c.m46599I9(), this.f36942c.m46557F9(), this.f36942c.m46997k9());
                    case 141:
                        return new GTOnboardingMailValidateViewModel$ViewModel(this.f36942c.m46599I9(), this.f36942c.m46899dd(), this.f36942c.m46928fc(), this.f36942c.m47013lb());
                    case 142:
                        return new GTOnboardingReviewDataViewModel$ViewModel(this.f36942c.m46656Ma(), this.f36942c.m46742Sc(), this.f36942c.m46683O9(), this.f36942c.m46642La(), (C25352k) this.f36940a.f36464m3.get(), (Client) this.f36940a.f36389d0.get());
                    case 143:
                        return new GTParametersViewModel$ViewModel(this.f36942c.m46642La(), this.f36942c.m46737S7(), this.f36942c.m46626K8(), this.f36940a.getProductTypeListUseCase(), (Client) this.f36940a.f36389d0.get());
                    case 144:
                        return new GTPortfolioViewModel$ViewModel(this.f36942c.m46642La(), this.f36942c.m46628Ka(), this.f36942c.m46641L9());
                    case 145:
                        return new GTSearchSymbolViewModel$ViewModel(this.f36942c.m46669N9(), this.f36942c.m46897db(), this.f36942c.m46695P7());
                    case 146:
                        return new GTShareTradeDetailsViewModel$ViewModel(this.f36942c.m46927fb(), this.f36942c.m46642La(), this.f36942c.m46597I7(), this.f36942c.m46912eb(), this.f36942c.m46880c9(), this.f36942c.m46641L9(), this.f36942c.m46851aa(), (Client) this.f36940a.f36389d0.get());
                    case 147:
                        return new GTShareTradeResultViewModel$ViewModel();
                    case 148:
                        return new GTShareTradeViewModel$ViewModel(this.f36942c.m46597I7(), this.f36942c.m46756Tc(), this.f36942c.m46641L9(), this.f36942c.m47013lb());
                    case 149:
                        return new GTShareViewModel.ViewModel(this.f36942c.m46942gb(), this.f36942c.m46912eb(), this.f36942c.m46897db(), this.f36942c.m46642La(), this.f36942c.m47097rb(), this.f36942c.m46695P7(), this.f36942c.m46627K9());
                    case 150:
                        return new GTTransactionDetailViewModel$ViewModel(this.f36942c.m46985jb(), this.f36942c.m46971ib(), this.f36942c.m46625K7());
                    case 151:
                        return new GTTransferAccountsViewModel$ViewModel(this.f36942c.m46711Q9());
                    case 152:
                        return new GTWatchListDetailsViewModel$ViewModel(this.f36942c.m47083qb(), this.f36942c.m46695P7());
                    case 153:
                        return new GTWatchListViewModel$ViewModel(this.f36942c.m47097rb());
                    case 154:
                        return new GiftCardsChooseAmountViewModel$ViewModel(new C19248a(), this.f36942c.m46571G9(), this.f36942c.m47154vc(), new C25459a());
                    case 155:
                        return new GiftCardsNominationViewModel$ViewModel(this.f36942c.m47068pa(), this.f36942c.m46751T7(), this.f36942c.m47168wc(), this.f36942c.m46571G9(), new C30072f());
                    case 156:
                        return new GiftCardsPurchaseViewModel$ViewModel(this.f36942c.m46571G9(), this.f36942c.m46753T9(), this.f36942c.m47182xc(), this.f36942c.m46958hc(), this.f36942c.m47181xb(), this.f36940a.m46195b8(), new C20260n(), new C25459a(), new C28038e(), this.f36942c.m47167wb());
                    case 157:
                        return new GiftCardsSuccessViewModel$ViewModel(this.f36942c.m46571G9(), this.f36942c.m46983j9(), (Client) this.f36940a.f36389d0.get());
                    case 158:
                        return new GiftCardsViewModel$ViewModel(this.f36942c.m46767U9(), this.f36942c.m47139ub(), this.f36942c.m47125tb(), new C25462c());
                    case 159:
                        return new GooglePayDialogViewModel$ViewModel(this.f36940a.m46195b8(), (PreferencesApiManager) this.f36940a.f36224I.get());
                    case 160:
                        C30122a aVar = r2;
                        C30122a aVar2 = new C30122a();
                        C37360b bVar = r2;
                        C37360b bVar2 = new C37360b();
                        return new HomeFragmentViewModel(this.f36942c.m46682O8(), this.f36942c.m47027mb(), this.f36942c.m46770Uc(), this.f36942c.m46738S8(), this.f36940a.getProductTypeListUseCase(), this.f36942c.m46867bb(), this.f36942c.m47208za(), (C29167c) this.f36942c.f36919x.get(), (C29877a) this.f36942c.f36710S.get(), (C29878b) this.f36942c.f36824j2.get(), this.f36940a.m46125U7(), (C26144b) this.f36942c.f36831k2.get(), (C25307a) this.f36942c.f36838l2.get(), (C28294b) this.f36942c.f36845m2.get(), (C25803a) this.f36942c.f36716T.get(), (C25309b) this.f36942c.f36852n2.get(), this.f36940a.m46115T7(), (C25310c) this.f36942c.f36859o2.get(), this.f36942c.m46541E7(), this.f36942c.m46555F7(), (C29879c) this.f36942c.f36877r.get(), this.f36942c.m46881ca(), this.f36940a.m46195b8(), (C25784a) this.f36942c.f36901u2.get(), (C25346f) this.f36940a.f36486p1.get(), (C38345b) this.f36940a.f36431i2.get(), (C38348d) this.f36942c.f36915w2.get(), (Gson) this.f36940a.f36288Q.get(), (PreferencesApiManager) this.f36940a.f36224I.get(), aVar, (C26096a) this.f36942c.f36891t.get(), (C20100q) this.f36940a.f36565z0.get(), bVar, this.f36942c.m46852ab(), this.f36940a.m46246g9(), this.f36940a.m46236f9(), this.f36942c.m46658Mc(), this.f36942c.m47209zb());
                    case 161:
                        return new C29878b((C19147a) this.f36940a.f36390d1.get());
                    case 162:
                        return new C26144b((C26146d) this.f36940a.f36381c0.get());
                    case 163:
                        return new C25307a();
                    case 164:
                        return new C28294b(new C25317d(), (C28295c) this.f36942c.f36624F0.get());
                    case 165:
                        return new C25309b();
                    case 166:
                        return new C25310c();
                    case 167:
                        return new C29104k((C25341c) this.f36940a.f36297R0.get(), (C19393b) this.f36942c.f36887s2.get());
                    case 168:
                        return new C29096g(this.f36940a.m46328o9(), new C26050a(), (C19394c) this.f36942c.f36873q2.get());
                    case 169:
                        return new C20534p(this.f36940a.m46328o9());
                    case 170:
                        return new C39913f((C39474a) this.f36940a.f36415g2.get());
                    case 171:
                        return new HubViewModel$ViewModel((C29879c) this.f36942c.f36877r.get(), (C28448c) this.f36942c.f36929y2.get(), (C32080b) this.f36940a.f36403e6.get(), (C28449d) this.f36942c.f36598B2.get(), (C28455i) this.f36940a.f36411f6.get(), (C28450e) this.f36940a.f36419g6.get(), (C28451f) this.f36940a.f36427h6.get(), (C28453g) this.f36940a.f36435i6.get(), (C28459l) this.f36942c.f36619E2.get(), (C27843a) this.f36940a.f36499q6.get(), (C28454h) this.f36942c.f36626F2.get(), (C28446a) this.f36942c.f36633G2.get(), (C20108a) this.f36942c.f36907v1.get(), this.f36942c.m47041nb(), (Client) this.f36940a.f36389d0.get(), (C16740f) this.f36942c.f36640H2.get(), this.f36940a.m46275j8(), this.f36940a.m46266i9(), (C29418y) this.f36940a.f36349X5.get());
                    case 172:
                        return new C28448c((Client) this.f36940a.f36389d0.get());
                    case 173:
                        return new C28449d((C28460m) this.f36942c.f36936z2.get(), (C28458k) this.f36942c.f36591A2.get());
                    case 174:
                        return new C28460m((Client) this.f36940a.f36389d0.get());
                    case 175:
                        return new C28458k((Client) this.f36940a.f36389d0.get());
                    case 176:
                        return new C28459l((C28447b) this.f36942c.f36605C2.get(), (C28049b) this.f36942c.f36612D2.get());
                    case 177:
                        return new C28447b((C27843a) this.f36940a.f36499q6.get(), (C28047a) this.f36940a.f36507r6.get());
                    case 178:
                        return new C28049b((C28047a) this.f36940a.f36507r6.get());
                    case 179:
                        return new C28454h((Client) this.f36940a.f36389d0.get());
                    case SubsamplingScaleImageView.ORIENTATION_180 /*180*/:
                        return new C28446a((C32080b) this.f36940a.f36403e6.get());
                    case 181:
                        return new C16740f((C16586a) this.f36942c.f36779d.get());
                    case 182:
                        return new IdentityInputViewModel$ViewModel(this.f36942c.m46781V9(), (C16280f) this.f36941b.f35890A.get());
                    case 183:
                        return new IdentityVerificationViewModel(this.f36942c.m46929fd(), this.f36942c.m47069pb(), this.f36942c.m46728Rc(), this.f36942c.m47054oa(), new C27094a(), (C27869a) this.f36940a.f36539v6.get(), (C27494a) this.f36940a.f36414g1.get());
                    case 184:
                        return new IdentomatResultViewModel$ViewModel(this.f36942c.m46557F9());
                    case 185:
                        return new IdentomatTypeSelectorViewModel$ViewModel(this.f36942c.m46686Oc(), this.f36942c.m46700Pc(), this.f36942c.m46714Qc());
                    case 186:
                        return new IncomeTypeViewModel$ViewModel((C28326c) this.f36942c.f36682N2.get(), new C27094a());
                    case 187:
                        return new C28326c((C29002a) this.f36940a.f36218H1.get());
                    case 188:
                        return new InstallmentReversalViewModel(this.f36942c.m47054oa(), this.f36942c.m47112sc(), new C27094a(), (Client) this.f36940a.f36389d0.get());
                    case 189:
                        return new InsuranceProviderListViewModel$ViewModel(this.f36942c.m46780V8(), this.f36942c.m47026ma(), (C10332a) this.f36942c.f36701Q2.get(), this.f36942c.m46825Yb());
                    case 190:
                        return new C10332a();
                    case 191:
                        return new JobPositionSelectorViewModel$ViewModel(this.f36942c.m46866ba(), (C16283i) this.f36941b.f35890A.get());
                    case 192:
                        return new KycRequiredViewModel$ViewModel(this.f36942c.m46869bd());
                    case 193:
                        return new LeadApplicationActionSheetViewModel(this.f36942c.m46532Dc(), (C29881d) this.f36942c.f36870q.get());
                    case 194:
                        return new LifestyleChooserViewModel$ViewModel(this.f36942c.m46970ia(), this.f36942c.m46984ja(), this.f36942c.m47191y7(), this.f36942c.m47150v8());
                    case 195:
                        return new LifestyleOffersAllCategoriesViewModel$ViewModel(this.f36942c.m46998ka(), (C18490b) this.f36942c.f36737W2.get());
                    case 196:
                        return new C18490b();
                    case 197:
                        return new LifestyleOffersHomeViewModel.ViewModel(this.f36942c.m47012la(), this.f36942c.m46956ha(), this.f36942c.m46615Jb(), this.f36942c.m47054oa(), (C18490b) this.f36942c.f36737W2.get(), this.f36942c.m46727Rb(), (PreferencesApiManager) this.f36940a.f36224I.get());
                    case 198:
                        return new LoanInstallmentStatusViewModel$ViewModel();
                    case 199:
                        return new LoginViewModel(this.f36942c.m46752T8());
                    default:
                        throw new AssertionError(this.f36943d);
                }
            }

            /* renamed from: c */
            private Object m47214c() {
                switch (this.f36943d) {
                    case BogInputLayout.INPUT_NORMAL_STATE /*200*/:
                        return new LoyaltyListViewModel(this.f36940a.getProductTypeListUseCase(), (C28290a) this.f36942c.f36769b3.get(), (C30123a) this.f36942c.f36735W0.get(), (Client) this.f36940a.f36389d0.get());
                    case BogInputLayout.INPUT_ERROR_STATE /*201*/:
                        return new C28290a((C28113a) this.f36940a.f36454l1.get());
                    case 202:
                        return new LoyaltyProgressViewModel$ViewModel(this.f36942c.m46796Wa(), this.f36942c.m46810Xa(), new C32014c(), this.f36942c.m46782Va(), new C31814b(), new C36079a(), this.f36942c.m47166wa(), new C31607b());
                    case 203:
                        return new C38531e(this.f36940a.m45986G8(), (C39100b) this.f36942c.f36783d3.get(), (C39101c) this.f36942c.f36790e3.get(), (C39102d) this.f36942c.f36797f3.get(), (C39099a) this.f36942c.f36804g3.get());
                    case 204:
                        return new C39100b();
                    case 205:
                        return new C39101c();
                    case 206:
                        return new C39102d();
                    case 207:
                        return new C39099a();
                    case 208:
                        C36735g u6 = this.f36940a.m46195b8();
                        C30122a aVar = r2;
                        C30122a aVar2 = new C30122a();
                        return new MainActivityViewModel$ViewModel(C17958c.m61876a(this.f36940a.f36388d), this.f36940a.m45976F8(), (C20109b) this.f36942c.f36825j3.get(), this.f36942c.m46881ca(), (C25784a) this.f36942c.f36901u2.get(), this.f36942c.m46983j9(), (C25349i) this.f36940a.f36337W0.get(), (PreferencesApiManager) this.f36940a.f36224I.get(), this.f36940a.m46115T7(), (C25341c) this.f36940a.f36297R0.get(), (C38345b) this.f36940a.f36431i2.get(), (C25348h) this.f36942c.f36839l3.get(), u6, aVar, (C26123a) this.f36942c.f36846m3.get(), (C19394c) this.f36942c.f36873q2.get(), (Client) this.f36940a.f36389d0.get(), (C37059a) this.f36942c.f36874q3.get(), (C37063e) this.f36942c.f36902u3.get(), (C20546a) this.f36942c.f36909v3.get(), (C36867a) this.f36942c.f36923x3.get(), (C36868b) this.f36942c.f36937z3.get(), this.f36940a.m46266i9(), this.f36942c.m46739S9(), this.f36942c.m46840Zc(), this.f36940a.getDepositsAndBondsUseCase(), this.f36942c.m46672Nc(), this.f36942c.m47206z8(), (TargetEnvironment) this.f36940a.f36216H.get());
                    case 209:
                        return new C20109b((C20304a) this.f36940a.f36277O4.get());
                    case 210:
                        return new C38858e0((C38606b) this.f36940a.f36281P0.get());
                    case 211:
                        return new C26123a();
                    case 212:
                        return new C38104d((C37343a) this.f36942c.f36860o3.get());
                    case 213:
                        return new C37892a((SharedPreferences) this.f36940a.f36176C.get());
                    case 214:
                        return new C38111k(this.f36940a.m46195b8(), (C37060b) this.f36942c.f36888s3.get(), (C37585a) this.f36940a.f36360Z2.get());
                    case 215:
                        return new C38107g((C37343a) this.f36942c.f36860o3.get(), this.f36940a.m46195b8());
                    case 216:
                        return new C20546a();
                    case 217:
                        return new C39007a((C39197a) this.f36940a.f36175B6.get());
                    case 218:
                        return new C39008b(this.f36940a.m45965E7(), this.f36940a.m46195b8());
                    case 219:
                        return new ManageCardsViewModel$ViewModel(this.f36940a.cardsAndDetailsUseCase());
                    case 220:
                        return new ManageMccViewModel((C28999b) this.f36942c.f36613D3.get(), (C28998a) this.f36942c.f36620E3.get(), (C27494a) this.f36940a.f36414g1.get());
                    case 221:
                        return new C28999b((C29655a) this.f36942c.f36606C3.get());
                    case 222:
                        return new C28602b((IRetrofitService) this.f36940a.f36350Y.get());
                    case 223:
                        return new C28998a((C29655a) this.f36942c.f36606C3.get());
                    case 224:
                        return new MoneyRequestBottomSheetViewModel(this.f36942c.m47110sa(), this.f36942c.m47080q8());
                    case 225:
                        return new MoneyRequestDetailsViewModel(this.f36942c.m47110sa(), (C28983a) this.f36942c.f36641H3.get(), this.f36942c.m46611J7(), this.f36942c.m46835Z7(), this.f36942c.m46849a8());
                    case 226:
                        return new C28983a();
                    case 227:
                        return new MoneyRequestSelectContactViewModel(this.f36942c.m46504Bc(), this.f36942c.m47205z7(), (C24830w) this.f36942c.f36665L.get(), this.f36942c.m46821Y7(), (C30142c) this.f36942c.f36672M.get(), (C30141b) this.f36942c.f36655J3.get(), (C36546y) this.f36940a.f36168B.get(), this.f36942c.m46807X7(), this.f36942c.m47124ta(), this.f36942c.m47109s9(), this.f36942c.m46573Gb(), this.f36942c.m46499B7());
                    case 228:
                        return new C30141b();
                    case 229:
                        return new MoneyRequestSummaryViewModel(this.f36942c.m46784Vc(), (C25795b) this.f36942c.f36679N.get(), (C24830w) this.f36942c.f36665L.get(), this.f36942c.m47124ta(), (C30142c) this.f36942c.f36672M.get(), (C19896d) this.f36942c.f36669L3.get(), this.f36942c.m47010l8(), this.f36942c.m46821Y7());
                    case 230:
                        return new C19896d();
                    case 231:
                        return new MoneyTransferDetailsViewModel(this.f36942c.m46986jc(), this.f36942c.m46954h8(), this.f36942c.m46726Ra(), (C27494a) this.f36940a.f36414g1.get());
                    case 232:
                        return new MoneyTransferListViewModel$ViewModel(this.f36942c.m46685Ob(), this.f36942c.m46612J8(), this.f36942c.m46671Nb(), this.f36940a.m46115T7(), (Gson) this.f36940a.f36288Q.get(), (C25794a) this.f36942c.f36690O3.get(), (C25795b) this.f36942c.f36679N.get(), (C25310c) this.f36942c.f36859o2.get());
                    case 233:
                        return new C25794a();
                    case 234:
                        return new MoneyTransferWizardViewModel(this.f36942c.m46598I8(), this.f36942c.m46954h8(), (C25795b) this.f36942c.f36679N.get(), (C25794a) this.f36942c.f36690O3.get(), this.f36942c.m46671Nb(), this.f36942c.m46911ea());
                    case 235:
                        return new MoreViewModel.ViewModel((C20108a) this.f36942c.f36907v1.get(), this.f36940a.m46115T7(), (C16740f) this.f36942c.f36640H2.get(), this.f36942c.m47041nb(), this.f36940a.m46165Y7(), (Client) this.f36940a.f36389d0.get());
                    case 236:
                        return new MyCreditInfoDescriptionViewModel(this.f36942c.m47151v9(), this.f36942c.m47066p8(), (C20049a) this.f36940a.f36482o5.get(), this.f36942c.m47011l9());
                    case 237:
                        return new NewProductViewModel$ViewModel((C29557b) this.f36942c.f36726U3.get(), (C29879c) this.f36942c.f36877r.get());
                    case 238:
                        return new C29557b((C30105a) this.f36942c.f36720T3.get(), this.f36940a.getProductTypeListUseCase());
                    case 239:
                        return new C28482f((IRetrofitService) this.f36940a.f36350Y.get());
                    case 240:
                        return new OccupationInputViewModel$ViewModel(this.f36942c.m47180xa(), (C16275b0) this.f36941b.f35890A.get());
                    case 241:
                        return new OfferNavigatorViewModel(this.f36942c.m47179x9(), (C30409b) this.f36942c.f36744X3.get(), (C30408a) this.f36942c.f36659K0.get(), (C26608a) this.f36942c.f36750Y3.get(), (C26609b) this.f36942c.f36756Z3.get(), (C25803a) this.f36942c.f36716T.get(), (C27494a) this.f36940a.f36414g1.get(), this.f36940a.m46115T7());
                    case 242:
                        return new C30409b((C19412a) this.f36940a.f36254L5.get());
                    case 243:
                        return new C26608a((C27622a) this.f36940a.f36495q2.get());
                    case 244:
                        return new C26609b((C27622a) this.f36940a.f36495q2.get());
                    case 245:
                        return new OffersAndApplicationsViewModel((C19411a) this.f36940a.f36205F4.get(), this.f36942c.m46488Aa(), (C29560c) this.f36942c.f36770b4.get(), (C29877a) this.f36942c.f36710S.get(), (C29557b) this.f36942c.f36726U3.get(), (C29878b) this.f36942c.f36824j2.get(), (C30409b) this.f36942c.f36744X3.get(), (C30408a) this.f36942c.f36659K0.get(), (C25333a) this.f36940a.f36199E6.get(), (C27494a) this.f36940a.f36414g1.get(), (C28474a) this.f36940a.f36252L3.get());
                    case 246:
                        return new C29560c((C30106b) this.f36940a.f36219H2.get());
                    case 247:
                        return new OpenBankAccountsViewModel$ViewModel(this.f36942c.m46570G8());
                    case 248:
                        return new OpenBanksProductsViewModel$ViewModel(this.f36942c.m47108s8(), this.f36942c.m46544Ea(), new C38562a(), (C36242m) this.f36940a.f36450k5.get());
                    case 249:
                        return new OrderInstantCardViewModel$ViewModel((C16740f) this.f36942c.f36640H2.get(), this.f36942c.m46996k8(), this.f36940a.m46195b8(), this.f36942c.m46728Rc(), this.f36942c.m46795W9(), this.f36942c.m46809X9(), (C10099q) this.f36942c.f36798f4.get());
                    case 250:
                        return new C10099q();
                    case 251:
                        return new OutOfServiceViewModel((C39780a) this.f36940a.f36304S.get());
                    case 252:
                        return new P2PLinkGenerationViewModel$ViewModel(this.f36942c.m46853ac(), this.f36942c.m46914ed(), (C12022a) this.f36942c.f36819i4.get(), new C16889a(), new C16907s.C16908a());
                    case 253:
                        return new C12022a((C12832a) this.f36941b.f35906Q.get());
                    case 254:
                        return new P2PLinkRouterViewModel$ViewModel(this.f36942c.m46868bc(), this.f36942c.m46853ac(), this.f36941b.m45242d0());
                    case C11051p3.f31759c:
                        return new P2PLinkSharingViewModel$ViewModel(this.f36942c.m46853ac(), this.f36942c.m46868bc(), this.f36942c.m46812Xc(), new C16889a());
                    case C11398b.f33139r:
                        return new P2PLinkViewModel$ViewModel((C12026e) this.f36942c.f36847m4.get(), this.f36942c.m46883cc());
                    case 257:
                        return new C12026e((C12832a) this.f36941b.f35906Q.get());
                    case 258:
                        return new P2PSendViewModel$ViewModel((C39778a) this.f36942c.f36861o4.get(), (C36560a) this.f36942c.f36868p4.get(), this.f36942c.m46793W7(), this.f36942c.m46910e9(), this.f36942c.m46699Pb(), this.f36942c.m46939g8(), this.f36942c.m46895d9(), this.f36942c.m46728Rc(), (C27494a) this.f36940a.f36414g1.get(), this.f36942c.m46724R8(), this.f36942c.m47053o9());
                    case 259:
                        return new C39778a();
                    case 260:
                        return new C36560a();
                    case 261:
                        return new PackageCancelFeedbackViewModel$ViewModel(this.f36942c.m46572Ga(), (C15386k) this.f36942c.f36893t1.get(), this.f36942c.m46546Ec());
                    case 262:
                        return new PackageCancelViewModel$ViewModel((C15386k) this.f36942c.f36893t1.get(), (C15374b) this.f36942c.f36889s4.get(), this.f36942c.m46854ad(), (Client) this.f36940a.f36389d0.get());
                    case 263:
                        return new C15374b((C16301a) this.f36940a.f36269N4.get());
                    case 264:
                        return new PassMigrateViewModel$ViewModel(this.f36942c.m47096ra(), (C37664c) this.f36942c.f36903u4.get(), this.f36942c.m46639L7(), this.f36942c.m46710Q8(), (C37095e) this.f36941b.f35903N.get());
                    case 265:
                        return new C37664c();
                    case 266:
                        return new PaymentsFragmentViewModel((C41438c) this.f36940a.f36184D.get(), (Client) this.f36940a.f36389d0.get(), this.f36940a.m46115T7(), this.f36942c.m46629Kb(), this.f36942c.m47140uc(), this.f36942c.m47123t9(), (C27677a) this.f36942c.f36687O0.get(), this.f36942c.m47136u8(), (C27908h) this.f36940a.f36207F6.get(), this.f36942c.m47138ua(), (C27678b) this.f36942c.f36917w4.get(), this.f36942c.m47014lc(), this.f36940a.m46411w8());
                    case 267:
                        return new C27678b();
                    case 268:
                        return new PensionDetailsViewModel$ViewModel(this.f36942c.m46586Ha(), this.f36942c.m46560Fc());
                    case 269:
                        return new PiggyBankSuccessViewModel$ViewModel((C29742a) this.f36942c.f36823j1.get(), (C39863i0) this.f36942c.f36729V0.get());
                    case SubsamplingScaleImageView.ORIENTATION_270 /*270*/:
                        return new PinResetViewModel$ViewModel((C16601k) this.f36942c.f36593A4.get(), this.f36940a.m46195b8(), (C27494a) this.f36940a.f36414g1.get());
                    case 271:
                        return new C16601k((C17110a) this.f36942c.f36934z0.get());
                    case 272:
                        return new PlusPointsTransferViewModel$ViewModel((C28290a) this.f36942c.f36769b3.get(), (C39873m0) this.f36942c.f36607C4.get(), (C28291b) this.f36942c.f36614D4.get(), (C39881t) this.f36942c.f36621E4.get(), (C30123a) this.f36942c.f36735W0.get(), (C27494a) this.f36940a.f36414g1.get());
                    case 273:
                        return new C39873m0((C31185a) this.f36942c.f36921x1.get());
                    case 274:
                        return new C28291b((C28113a) this.f36940a.f36454l1.get());
                    case 275:
                        return new C39881t((C31185a) this.f36942c.f36921x1.get());
                    case 276:
                        return new PlusPointsTransferWizardViewModel$ViewModel((C39881t) this.f36942c.f36621E4.get());
                    case 277:
                        return new PointsExchangeSuccessViewModel$ViewModel(this.f36942c.m46738S8(), (C28290a) this.f36942c.f36769b3.get());
                    case 278:
                        return new PolicyDetailViewModel$ViewModel(this.f36942c.m46754Ta());
                    case 279:
                        return new PolicyDetailsViewModel$ViewModel(this.f36942c.m46501B9(), this.f36942c.m46926fa(), (C18777a) this.f36942c.f36656J4.get());
                    case 280:
                        return new C18777a();
                    case 281:
                        return new PolicyDownloadViewModel$ViewModel(this.f36942c.m46754Ta(), (C29742a) this.f36942c.f36823j1.get(), this.f36942c.m46614Ja());
                    case 282:
                        return new ProductConfirmationViewModel((C25509a) this.f36942c.f36677M4.get(), (C25510b) this.f36942c.f36684N4.get(), this.f36940a.refreshProductTypeListUseCase(), this.f36942c.m46682O8(), this.f36940a.refreshAssetLiabilityUseCase(), this.f36942c.m47028mc(), (C28474a) this.f36940a.f36252L3.get(), (C27494a) this.f36940a.f36414g1.get());
                    case 283:
                        return new C25509a((C26309a) this.f36940a.f36223H6.get());
                    case 284:
                        return new C25510b((C26309a) this.f36940a.f36223H6.get());
                    case 285:
                        return new ProductDescriptionViewModel(this.f36942c.m46943gc(), (C27945a) this.f36940a.f36255L6.get());
                    case 286:
                        return new ProductDetailsViewModel$ViewModel(this.f36942c.m46684Oa(), this.f36942c.m46698Pa(), (C38251a) this.f36942c.f36703Q4.get());
                    case 287:
                        return new C38251a();
                    case 288:
                        return new ProductListViewModel$ViewModel(this.f36942c.m46530Da(), (C38024a) this.f36942c.f36715S4.get());
                    case 289:
                        return new C38024a();
                    case 290:
                        return new ProductsViewModel$ViewModel((C25352k) this.f36940a.f36464m3.get(), (C31104a) this.f36942c.f36727U4.get(), this.f36942c.m46668N8(), this.f36942c.m46487A9(), this.f36942c.m47207z9(), this.f36940a.getDepositsAndBondsUseCase(), this.f36942c.m46613J9(), this.f36942c.m47040na(), this.f36942c.m46725R9(), this.f36940a.m46235f8(), this.f36942c.m46600Ia(), this.f36942c.m46586Ha(), this.f36942c.m46560Fc(), this.f36942c.m47165w9(), this.f36940a.m46115T7(), (C39879r) this.f36942c.f36733V4.get(), this.f36942c.m46865b9(), this.f36942c.m46983j9(), this.f36942c.m47195yb(), (Client) this.f36940a.f36389d0.get());
                    case 291:
                        return new C31104a(C17957b.m61875a(this.f36940a.f36388d));
                    case 292:
                        return new C39879r((C31186b) this.f36940a.f36163A2.get());
                    case 293:
                        return new QrScannerViewModel(this.f36942c.m47082qa(), (C24889a) this.f36940a.f36279O6.get(), (PreferencesApiManager) this.f36940a.f36224I.get());
                    case 294:
                        return new RatesActionSheetViewModel(this.f36942c.m46740Sa());
                    case 295:
                        return new ReferalsViewModel(this.f36942c.m46712Qa(), this.f36942c.m46630Kc());
                    case 296:
                        return new RegisterMtplPolicyViewModel$ViewModel(this.f36942c.m46823Y9(), this.f36942c.m46501B9(), this.f36942c.m46926fa(), this.f36942c.m46896da(), (C10494k) this.f36942c.f36764a5.get(), this.f36942c.m46811Xb(), this.f36942c.m47056oc(), (C27494a) this.f36940a.f36414g1.get());
                    case 297:
                        return new C10494k();
                    case 298:
                        return new ReleaseNotesViewModel$ViewModel(this.f36942c.m46644Lc(), this.f36942c.m46713Qb(), this.f36940a.m46165Y7());
                    case 299:
                        return new RootActivityViewModel$ViewModel((C18569a) this.f36940a.f36437j0.get(), (C19792a) this.f36940a.f36429i0.get(), this.f36942c.m46779V7(), (C38344a) this.f36942c.f36792e5.get(), (C38347c) this.f36942c.f36806g5.get(), (C38349e) this.f36942c.f36820i5.get(), (Client) this.f36940a.f36389d0.get(), (C39780a) this.f36940a.f36304S.get());
                    default:
                        throw new AssertionError(this.f36943d);
                }
            }

            /* renamed from: d */
            private Object m47215d() {
                switch (this.f36943d) {
                    case BogInputLayout.INPUT_TYPE_TEXT_PASSWORD /*300*/:
                        return new C39906a((C39474a) this.f36940a.f36415g2.get());
                    case BogInputLayout.INPUT_TYPE_NUM_PASSWORD /*301*/:
                        return new C39911d((C39474a) this.f36940a.f36415g2.get());
                    case BogInputLayout.INPUT_TYPE_NUM_REAL /*302*/:
                        return new C39915g((C39474a) this.f36940a.f36415g2.get());
                    case BogInputLayout.INPUT_TYPE_NUM_DIGIT /*303*/:
                        return new SavingGoalViewModel((C41438c) this.f36940a.f36184D.get(), (Client) this.f36940a.f36389d0.get(), this.f36940a.m46115T7(), this.f36942c.m47038n8(), this.f36942c.m46528D8(), this.f36942c.m47178x8(), this.f36942c.m46529D9());
                    case BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS /*304*/:
                        return new SelectBankViewModel$ViewModel(this.f36942c.m46516Ca(), (C37267a) this.f36942c.f36841l5.get());
                    case BogInputLayout.INPUT_TYPE_NUM_PHONE /*305*/:
                        return new C37267a();
                    case BogInputLayout.INPUT_TYPE_NUMBER_SIGNED /*306*/:
                        return new SelectContactAccountViewModel(this.f36942c.m47109s9(), new C28122a());
                    case BogInputLayout.INPUT_TYPE_EMAIL /*307*/:
                        return new SelectInsuranceCardViewModel$ViewModel(this.f36942c.m46769Ub(), this.f36942c.m46896da(), (C12924a) this.f36942c.f36862o5.get());
                    case 308:
                        return new C12924a();
                    case 309:
                        return new SelectInsurancePackageViewModel$ViewModel(this.f36942c.m46768Ua(), (C15699a) this.f36942c.f36876q5.get(), this.f36942c.m46797Wb());
                    case 310:
                        return new C15699a();
                    case 311:
                        return new SelectTransportCardDetailsViewModel$ViewModel(this.f36942c.m46696P8(), this.f36942c.m46925f9(), (C35073c) this.f36942c.f36890s5.get(), (C37099i) this.f36941b.f35903N.get(), (C27494a) this.f36940a.f36414g1.get(), this.f36942c.m46972ic());
                    case 312:
                        return new C35073c();
                    case 313:
                        return new SelectTransportCardPassDevicesViewModel$ViewModel((C37094d) this.f36941b.f35903N.get());
                    case 314:
                        return new SettingsViewModel$ViewModel((C38277b) this.f36940a.f36491p6.get(), (C38105e) this.f36940a.f36467m6.get(), (C38113l) this.f36940a.f36311S6.get(), (C38103c) this.f36942c.f36911v5.get(), (C38108h) this.f36940a.f36310S5.get(), (C32080b) this.f36940a.f36403e6.get());
                    case 315:
                        return new C38103c((PreferencesApiManager) this.f36940a.f36224I.get());
                    case 316:
                        return new StatementsFilterViewModel$ViewModel(this.f36942c.m47135u7(), this.f36940a.getTransactionCategoriesUseCase(), this.f36942c.m46667N7());
                    case 317:
                        return new StatementsViewModel$ViewModel(this.f36942c.m46770Uc());
                    case 318:
                        return new SuccessTransportCardViewModel$ViewModel((C37097g) this.f36941b.f35903N.get());
                    case 319:
                        return new TemplatesProvidersViewModel((C41438c) this.f36940a.f36184D.get(), (Client) this.f36940a.f36389d0.get());
                    case 320:
                        return new TermsAndConditionsViewModel$ViewModel(this.f36942c.m46557F9(), this.f36942c.m46588Hc(), this.f36942c.m46913ec());
                    case 321:
                        return new TransactionCategoriesViewModel(this.f36940a.getTransactionCategoriesUseCase(), this.f36942c.m46527D7(), this.f36942c.m47084qc(), this.f36942c.m46542E8(), this.f36942c.m47210zc());
                    case 322:
                        return new TransactionHistoryDownloadViewModel$ViewModel(this.f36942c.m46654M8(), this.f36942c.m46640L8(), (Client) this.f36940a.f36389d0.get());
                    case 323:
                        return new TransactionHistoryViewModel$ViewModel(this.f36942c.m46697P9(), this.f36942c.m46957hb(), this.f36942c.m46999kb(), (Client) this.f36940a.f36389d0.get());
                    case 324:
                        return new TransfersActionSheetViewModel$ViewModel((C30083a) this.f36942c.f36629F5.get());
                    case 325:
                        return new C30083a();
                    case 326:
                        return new VisaConciergeViewModel$ViewModel((C15379e) this.f36942c.f36643H5.get(), (C15394q) this.f36942c.f36650I5.get());
                    case 327:
                        return new C15379e((C16301a) this.f36940a.f36269N4.get());
                    case 328:
                        return new C15394q((C16301a) this.f36940a.f36269N4.get());
                    case 329:
                        return new WishCampaignViewModel$ViewModel(this.f36942c.m46602Ic(), this.f36942c.m47111sb(), this.f36942c.m46944gd());
                    case 330:
                        return new ZkIFrameViewModel(this.f36940a.m46115T7(), (Client) this.f36940a.f36389d0.get());
                    case 331:
                        return new ZkUmtsCardsListViewModel((C25078b) this.f36942c.f36678M5.get());
                    case 332:
                        return new C25078b((C25077a) this.f36940a.f36335V6.get());
                    default:
                        throw new AssertionError(this.f36943d);
                }
            }

            public Object get() {
                int i = this.f36943d / 100;
                if (i == 0) {
                    return m47212a();
                }
                if (i == 1) {
                    return m47213b();
                }
                if (i == 2) {
                    return m47214c();
                }
                if (i == 3) {
                    return m47215d();
                }
                throw new AssertionError(this.f36943d);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: A7 */
        public C24803h m46485A7() {
            return new C24803h((C25260a) this.f36758a.f36187D2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: A8 */
        public C28098g m46486A8() {
            return new C28098g((C28094c) this.f36758a.f36235J2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: A9 */
        public C38894u m46487A9() {
            return new C38894u((C38606b) this.f36758a.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Aa */
        public C26615g m46488Aa() {
            return new C26615g((C27622a) this.f36758a.f36495q2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Ab */
        public C28515e m46489Ab() {
            return new C28515e((C29164a) this.f36758a.f36294Q5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Ac */
        public C24833z m46490Ac() {
            return new C24833z(m46629Kb());
        }

        /* access modifiers changed from: private */
        /* renamed from: B7 */
        public C24807j m46499B7() {
            return new C24807j((C25260a) this.f36758a.f36187D2.get(), m47109s9());
        }

        /* access modifiers changed from: private */
        /* renamed from: B8 */
        public C28099h m46500B8() {
            return new C28099h((C28094c) this.f36758a.f36235J2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: B9 */
        public C17020c m46501B9() {
            return new C17020c((C16719b) this.f36765b.f35904O.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Ba */
        public C29322a0 m46502Ba() {
            return new C29322a0((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Bb */
        public C24826s m46503Bb() {
            return new C24826s((C25260a) this.f36758a.f36187D2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Bc */
        public C24789d0 m46504Bc() {
            return new C24789d0(m46629Kb(), m46573Gb());
        }

        /* access modifiers changed from: private */
        /* renamed from: C7 */
        public C24815k m46513C7() {
            return new C24815k((C25260a) this.f36758a.f36187D2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: C8 */
        public C28100i m46514C8() {
            return new C28100i((C28094c) this.f36758a.f36235J2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: C9 */
        public C30266a m46515C9() {
            return new C30266a((C29955a) this.f36758a.f36334V5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Ca */
        public C36233f m46516Ca() {
            return new C36233f((C36084a) this.f36758a.f36346X2.get());
        }

        /* renamed from: Cb */
        private void m46517Cb(C1580f0 f0Var, C16920c cVar) {
            this.f36779d = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 2));
            this.f36786e = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 1));
            this.f36793f = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 4));
            this.f36800g = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 3));
            this.f36807h = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 5));
            this.f36814i = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 6));
            this.f36821j = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 7));
            this.f36828k = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 8));
            this.f36835l = new C12280a(this.f36758a, this.f36765b, this.f36772c, 0);
            this.f36842m = new C12280a(this.f36758a, this.f36765b, this.f36772c, 9);
            this.f36849n = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 11));
            this.f36856o = new C12280a(this.f36758a, this.f36765b, this.f36772c, 10);
            this.f36863p = new C12280a(this.f36758a, this.f36765b, this.f36772c, 12);
            this.f36870q = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 15));
            this.f36877r = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 14));
            C12280a aVar = new C12280a(this.f36758a, this.f36765b, this.f36772c, 16);
            this.f36884s = aVar;
            this.f36891t = C18331f.m62681a(aVar);
            this.f36898u = new C12280a(this.f36758a, this.f36765b, this.f36772c, 13);
            this.f36905v = new C12280a(this.f36758a, this.f36765b, this.f36772c, 17);
            this.f36912w = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 19));
            this.f36919x = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 20));
            this.f36926y = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 21));
            this.f36933z = new C12280a(this.f36758a, this.f36765b, this.f36772c, 18);
            this.f36588A = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 23));
            this.f36595B = new C12280a(this.f36758a, this.f36765b, this.f36772c, 22);
            this.f36602C = new C12280a(this.f36758a, this.f36765b, this.f36772c, 24);
            this.f36609D = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 26));
            this.f36616E = new C12280a(this.f36758a, this.f36765b, this.f36772c, 25);
            this.f36623F = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 28));
            this.f36630G = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 29));
            this.f36637H = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 30));
            this.f36644I = new C12280a(this.f36758a, this.f36765b, this.f36772c, 27);
            this.f36651J = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 32));
            this.f36658K = new C12280a(this.f36758a, this.f36765b, this.f36772c, 31);
            this.f36665L = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 34));
            this.f36672M = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 35));
            this.f36679N = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 36));
            this.f36686O = new C12280a(this.f36758a, this.f36765b, this.f36772c, 33);
            this.f36692P = new C12280a(this.f36758a, this.f36765b, this.f36772c, 37);
            this.f36698Q = new C12280a(this.f36758a, this.f36765b, this.f36772c, 38);
            this.f36704R = new C12280a(this.f36758a, this.f36765b, this.f36772c, 39);
            this.f36710S = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 41));
            this.f36716T = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 42));
            this.f36722U = new C12280a(this.f36758a, this.f36765b, this.f36772c, 40);
            this.f36728V = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 44));
            this.f36734W = new C12280a(this.f36758a, this.f36765b, this.f36772c, 43);
            this.f36740X = new C12280a(this.f36758a, this.f36765b, this.f36772c, 45);
            this.f36746Y = new C12280a(this.f36758a, this.f36765b, this.f36772c, 46);
            this.f36752Z = new C12280a(this.f36758a, this.f36765b, this.f36772c, 47);
            this.f36759a0 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 48);
            this.f36766b0 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 49);
            this.f36773c0 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 50);
            this.f36780d0 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 51);
            this.f36787e0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 53));
            this.f36794f0 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 52);
            this.f36801g0 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 54);
            this.f36808h0 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 55);
            this.f36815i0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 57));
            this.f36822j0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 58));
            this.f36829k0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 59));
            this.f36836l0 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 56);
            this.f36843m0 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 60);
            this.f36850n0 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 61);
            this.f36857o0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 63));
            this.f36864p0 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 62);
            this.f36871q0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 67));
            this.f36878r0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 66));
            this.f36885s0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 65));
            this.f36892t0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 68));
            this.f36899u0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 70));
            this.f36906v0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 71));
            this.f36913w0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 69));
            this.f36920x0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 72));
            this.f36927y0 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 64);
            this.f36934z0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 75));
            this.f36589A0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 74));
            this.f36596B0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 76));
            this.f36603C0 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 73);
            this.f36610D0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 78));
            this.f36617E0 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 77);
            this.f36624F0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 80));
            this.f36631G0 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 79);
            this.f36638H0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 82));
            this.f36645I0 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 81);
            this.f36652J0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 84));
            this.f36659K0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 85));
            this.f36666L0 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 83);
            this.f36673M0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 87));
            this.f36680N0 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 86);
            this.f36687O0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 89));
            this.f36693P0 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 88);
            this.f36699Q0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 92));
            this.f36705R0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 93));
            this.f36711S0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 91));
            this.f36717T0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 94));
            this.f36723U0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 95));
            this.f36729V0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 96));
            this.f36735W0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 99));
            this.f36741X0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 100));
            this.f36747Y0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 98));
        }

        /* access modifiers changed from: private */
        /* renamed from: Cc */
        public C24809j0 m46518Cc() {
            return new C24809j0(m46770Uc(), m46601Ib());
        }

        /* access modifiers changed from: private */
        /* renamed from: D7 */
        public C20298a m46527D7() {
            return new C20298a((C24835a) this.f36758a.f36169B0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: D8 */
        public C28948c m46528D8() {
            return new C28948c((C29583a) this.f36758a.f36303R6.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: D9 */
        public C28949d m46529D9() {
            return new C28949d((C29583a) this.f36758a.f36303R6.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Da */
        public C36235h m46530Da() {
            return new C36235h(m46544Ea());
        }

        /* renamed from: Db */
        private void m46531Db(C1580f0 f0Var, C16920c cVar) {
            this.f36753Z0 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 97));
            this.f36760a1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 90);
            this.f36767b1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 101);
            this.f36774c1 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 103));
            this.f36781d1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 102);
            this.f36788e1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 104);
            this.f36795f1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 105);
            this.f36802g1 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 107));
            this.f36809h1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 106);
            C12280a aVar = new C12280a(this.f36758a, this.f36765b, this.f36772c, 109);
            this.f36816i1 = aVar;
            this.f36823j1 = C18331f.m62681a(aVar);
            this.f36830k1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 108);
            this.f36837l1 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 111));
            this.f36844m1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 110);
            this.f36851n1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 112);
            this.f36858o1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 113);
            this.f36865p1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 114);
            this.f36872q1 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 116));
            this.f36879r1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 115);
            this.f36886s1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 117);
            this.f36893t1 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 119));
            this.f36900u1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 118);
            this.f36907v1 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 121));
            this.f36914w1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 120);
            this.f36921x1 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 123));
            this.f36928y1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 122);
            this.f36935z1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 124);
            this.f36590A1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 125);
            this.f36597B1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 126);
            this.f36604C1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, C11051p3.f31760d);
            this.f36611D1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 128);
            this.f36618E1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 129);
            this.f36625F1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 130);
            this.f36632G1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 131);
            this.f36639H1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 132);
            this.f36646I1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 133);
            this.f36653J1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 134);
            this.f36660K1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 135);
            this.f36667L1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 136);
            this.f36674M1 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 138));
            this.f36681N1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 137);
            this.f36688O1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 139);
            this.f36694P1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 140);
            this.f36700Q1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 141);
            this.f36706R1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 142);
            this.f36712S1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 143);
            this.f36718T1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 144);
            this.f36724U1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 145);
            this.f36730V1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 146);
            this.f36736W1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 147);
            this.f36742X1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 148);
            this.f36748Y1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 149);
            this.f36754Z1 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 150);
            this.f36761a2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 151);
            this.f36768b2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 152);
            this.f36775c2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 153);
            this.f36782d2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 154);
            this.f36789e2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 155);
            this.f36796f2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 156);
            this.f36803g2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 157);
            this.f36810h2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 158);
            this.f36817i2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 159);
            this.f36824j2 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 161));
            this.f36831k2 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 162));
            this.f36838l2 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 163));
            this.f36845m2 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 164));
            this.f36852n2 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 165));
            this.f36859o2 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 166));
            C12280a aVar2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 169);
            this.f36866p2 = aVar2;
            this.f36873q2 = C18331f.m62681a(aVar2);
            C12280a aVar3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 168);
            this.f36880r2 = aVar3;
            this.f36887s2 = C18331f.m62681a(aVar3);
            C12280a aVar4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 167);
            this.f36894t2 = aVar4;
            this.f36901u2 = C18331f.m62681a(aVar4);
            C12280a aVar5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 170);
            this.f36908v2 = aVar5;
            this.f36915w2 = C18331f.m62681a(aVar5);
            this.f36922x2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 160);
            this.f36929y2 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 172));
            this.f36936z2 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 174));
            this.f36591A2 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 175));
            this.f36598B2 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 173));
            this.f36605C2 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 177));
            this.f36612D2 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 178));
            this.f36619E2 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 176));
            this.f36626F2 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 179));
            this.f36633G2 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, SubsamplingScaleImageView.ORIENTATION_180));
            this.f36640H2 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 181));
            this.f36647I2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 171);
            this.f36654J2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 182);
            this.f36661K2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 183);
            this.f36668L2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 184);
            this.f36675M2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 185);
            this.f36682N2 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 187));
            this.f36689O2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 186);
            this.f36695P2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 188);
            this.f36701Q2 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 190));
            this.f36707R2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 189);
            this.f36713S2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 191);
            this.f36719T2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 192);
            this.f36725U2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 193);
        }

        /* access modifiers changed from: private */
        /* renamed from: Dc */
        public C24837a m46532Dc() {
            return new C24837a((C25079a) this.f36758a.f36571z6.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: E7 */
        public C19786a m46541E7() {
            return new C19786a(this.f36758a.m46370s7());
        }

        /* access modifiers changed from: private */
        /* renamed from: E8 */
        public C20299b m46542E8() {
            return new C20299b((C24835a) this.f36758a.f36169B0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: E9 */
        public C16798z m46543E9() {
            return new C16798z((C16586a) this.f36779d.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Ea */
        public C36237i m46544Ea() {
            return new C36237i((C36084a) this.f36758a.f36346X2.get());
        }

        /* renamed from: Eb */
        private void m46545Eb(C1580f0 f0Var, C16920c cVar) {
            this.f36731V2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 194);
            this.f36737W2 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 196));
            this.f36743X2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 195);
            this.f36749Y2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 197);
            this.f36755Z2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 198);
            this.f36762a3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 199);
            this.f36769b3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, BogInputLayout.INPUT_ERROR_STATE));
            this.f36776c3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, BogInputLayout.INPUT_NORMAL_STATE);
            this.f36783d3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 204));
            this.f36790e3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 205));
            this.f36797f3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 206));
            this.f36804g3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 207));
            this.f36811h3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 203));
            this.f36818i3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 202);
            this.f36825j3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 209));
            C12280a aVar = new C12280a(this.f36758a, this.f36765b, this.f36772c, 210);
            this.f36832k3 = aVar;
            this.f36839l3 = C18331f.m62681a(aVar);
            this.f36846m3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 211));
            C12280a aVar2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 213);
            this.f36853n3 = aVar2;
            this.f36860o3 = C18331f.m62681a(aVar2);
            C12280a aVar3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 212);
            this.f36867p3 = aVar3;
            this.f36874q3 = C18331f.m62681a(aVar3);
            C12280a aVar4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 215);
            this.f36881r3 = aVar4;
            this.f36888s3 = C18331f.m62681a(aVar4);
            C12280a aVar5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 214);
            this.f36895t3 = aVar5;
            this.f36902u3 = C18331f.m62681a(aVar5);
            this.f36909v3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 216));
            C12280a aVar6 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 217);
            this.f36916w3 = aVar6;
            this.f36923x3 = C18331f.m62681a(aVar6);
            C12280a aVar7 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 218);
            this.f36930y3 = aVar7;
            this.f36937z3 = C18331f.m62681a(aVar7);
            this.f36592A3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 208);
            this.f36599B3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 219);
            this.f36606C3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 222));
            this.f36613D3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 221));
            this.f36620E3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 223));
            this.f36627F3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 220);
            this.f36634G3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 224);
            this.f36641H3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 226));
            this.f36648I3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 225);
            this.f36655J3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 228));
            this.f36662K3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 227);
            this.f36669L3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 230));
            this.f36676M3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 229);
            this.f36683N3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 231);
            this.f36690O3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 233));
            this.f36696P3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 232);
            this.f36702Q3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 234);
            this.f36708R3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 235);
            this.f36714S3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 236);
            this.f36720T3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 239));
            this.f36726U3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 238));
            this.f36732V3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 237);
            this.f36738W3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 240);
            this.f36744X3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 242));
            this.f36750Y3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 243));
            this.f36756Z3 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 244));
            this.f36763a4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 241);
            this.f36770b4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 246));
            this.f36777c4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 245);
            this.f36784d4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 247);
            this.f36791e4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 248);
            this.f36798f4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 250));
            this.f36805g4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 249);
            this.f36812h4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 251);
            this.f36819i4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 253));
            this.f36826j4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 252);
            this.f36833k4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 254);
            this.f36840l4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, C11051p3.f31759c);
            this.f36847m4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 257));
            this.f36854n4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, C11398b.f33139r);
            this.f36861o4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 259));
            this.f36868p4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 260));
            this.f36875q4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 258);
            this.f36882r4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 261);
            this.f36889s4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 263));
            this.f36896t4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 262);
            this.f36903u4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 265));
            this.f36910v4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 264);
            this.f36917w4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 267));
            this.f36924x4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 266);
            this.f36931y4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 268);
            this.f36938z4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 269);
            this.f36593A4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 271));
            this.f36600B4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, SubsamplingScaleImageView.ORIENTATION_270);
            this.f36607C4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 273));
            this.f36614D4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 274));
            this.f36621E4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 275));
            this.f36628F4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 272);
            this.f36635G4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 276);
            this.f36642H4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 277);
            this.f36649I4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 278);
            this.f36656J4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 280));
            this.f36663K4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 279);
            this.f36670L4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 281);
            this.f36677M4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 283));
            this.f36684N4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 284));
            this.f36691O4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 282);
            this.f36697P4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 285);
            this.f36703Q4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 287));
        }

        /* access modifiers changed from: private */
        /* renamed from: Ec */
        public C15393p m46546Ec() {
            return new C15393p((C16301a) this.f36758a.f36269N4.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: F7 */
        public C19787b m46555F7() {
            return new C19787b(this.f36758a.m46370s7());
        }

        /* access modifiers changed from: private */
        /* renamed from: F8 */
        public C29337i m46556F8() {
            return new C29337i((C24982a) this.f36758a.f36298R1.get(), (C25723a) this.f36758a.f36345X1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: F9 */
        public C19234a m46557F9() {
            return new C19234a((C19736a) this.f36758a.f36314T1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Fa */
        public C24825r m46558Fa() {
            return new C24825r((C25260a) this.f36758a.f36187D2.get());
        }

        /* renamed from: Fb */
        private void m46559Fb(C1580f0 f0Var, C16920c cVar) {
            this.f36709R4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 286);
            this.f36715S4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 289));
            this.f36721T4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 288);
            this.f36727U4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 291));
            this.f36733V4 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 292));
            this.f36739W4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 290);
            this.f36745X4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 293);
            this.f36751Y4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 294);
            this.f36757Z4 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 295);
            this.f36764a5 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 297));
            this.f36771b5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 296);
            this.f36778c5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 298);
            C12280a aVar = new C12280a(this.f36758a, this.f36765b, this.f36772c, BogInputLayout.INPUT_TYPE_TEXT_PASSWORD);
            this.f36785d5 = aVar;
            this.f36792e5 = C18331f.m62681a(aVar);
            C12280a aVar2 = new C12280a(this.f36758a, this.f36765b, this.f36772c, BogInputLayout.INPUT_TYPE_NUM_PASSWORD);
            this.f36799f5 = aVar2;
            this.f36806g5 = C18331f.m62681a(aVar2);
            C12280a aVar3 = new C12280a(this.f36758a, this.f36765b, this.f36772c, BogInputLayout.INPUT_TYPE_NUM_REAL);
            this.f36813h5 = aVar3;
            this.f36820i5 = C18331f.m62681a(aVar3);
            this.f36827j5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 299);
            this.f36834k5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, BogInputLayout.INPUT_TYPE_NUM_DIGIT);
            this.f36841l5 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, BogInputLayout.INPUT_TYPE_NUM_PHONE));
            this.f36848m5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS);
            this.f36855n5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, BogInputLayout.INPUT_TYPE_NUMBER_SIGNED);
            this.f36862o5 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 308));
            this.f36869p5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, BogInputLayout.INPUT_TYPE_EMAIL);
            this.f36876q5 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 310));
            this.f36883r5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 309);
            this.f36890s5 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 312));
            this.f36897t5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 311);
            this.f36904u5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 313);
            this.f36911v5 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 315));
            this.f36918w5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 314);
            this.f36925x5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 316);
            this.f36932y5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 317);
            this.f36939z5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 318);
            this.f36594A5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 319);
            this.f36601B5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 320);
            this.f36608C5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 321);
            this.f36615D5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 322);
            this.f36622E5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 323);
            this.f36629F5 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 325));
            this.f36636G5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 324);
            this.f36643H5 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 327));
            this.f36650I5 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 328));
            this.f36657J5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 326);
            this.f36664K5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 329);
            this.f36671L5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 330);
            this.f36678M5 = C18331f.m62681a(new C12280a(this.f36758a, this.f36765b, this.f36772c, 332));
            this.f36685N5 = new C12280a(this.f36758a, this.f36765b, this.f36772c, 331);
        }

        /* access modifiers changed from: private */
        /* renamed from: Fc */
        public C38893t0 m46560Fc() {
            return new C38893t0((C38606b) this.f36758a.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: G7 */
        public C27603a m46569G7() {
            return new C27603a((C27604b) this.f36630G.get(), (C20050b) this.f36637H.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: G8 */
        public C36231e m46570G8() {
            return new C36231e(m46544Ea(), (C36242m) this.f36758a.f36450k5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: G9 */
        public C29398f m46571G9() {
            return new C29398f((C29079e) this.f36765b.f35928v.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Ga */
        public C15383h m46572Ga() {
            return new C15383h((C16301a) this.f36758a.f36269N4.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Gb */
        public C24827t m46573Gb() {
            return new C24827t((C25260a) this.f36758a.f36187D2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Gc */
        public C25751d m46574Gc() {
            return new C25751d((C26256a) this.f36758a.f36474n5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: H7 */
        public C29176h m46583H7() {
            return new C29176h((C29174f) this.f36849n.get(), this.f36758a.getTransactionCategoriesUseCase());
        }

        /* access modifiers changed from: private */
        /* renamed from: H8 */
        public C19413a m46584H8() {
            return new C19413a((C20106a) this.f36758a.f36514s5.get());
        }

        /* renamed from: H9 */
        private C25750c m46585H9() {
            return new C25750c((C26256a) this.f36758a.f36474n5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Ha */
        public C38874k0 m46586Ha() {
            return new C38874k0((C38606b) this.f36758a.f36281P0.get());
        }

        /* renamed from: Hb */
        private C25013g m46587Hb() {
            return new C25013g(this.f36758a.m46105S7());
        }

        /* access modifiers changed from: private */
        /* renamed from: Hc */
        public C19235b m46588Hc() {
            return new C19235b((C20472a) this.f36758a.f36330V1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: I7 */
        public C29321a m46597I7() {
            return new C29321a((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: I8 */
        public C20580b m46598I8() {
            return new C20580b((C25080a) this.f36758a.f36332V3.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: I9 */
        public C30005a m46599I9() {
            return new C30005a(this.f36758a.m46056N8());
        }

        /* access modifiers changed from: private */
        /* renamed from: Ia */
        public C38876l0 m46600Ia() {
            return new C38876l0((C38606b) this.f36758a.f36281P0.get());
        }

        /* renamed from: Ib */
        private C24828u m46601Ib() {
            return new C24828u((C25260a) this.f36758a.f36187D2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Ic */
        public C37062d m46602Ic() {
            return new C37062d((C37585a) this.f36758a.f36360Z2.get(), (C37060b) this.f36888s3.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: J7 */
        public C25493a m46611J7() {
            return new C25493a((C26093a) this.f36758a.f36203F2.get(), m47014lc());
        }

        /* access modifiers changed from: private */
        /* renamed from: J8 */
        public C20581c m46612J8() {
            return new C20581c((C25080a) this.f36758a.f36332V3.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: J9 */
        public C38901y m46613J9() {
            return new C38901y((C38606b) this.f36758a.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Ja */
        public C17031k m46614Ja() {
            return new C17031k((C16718a) this.f36765b.f35914h.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Jb */
        public C19105q m46615Jb() {
            return new C19105q((C10344a) this.f36758a.f36535v2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Jc */
        public C28107o m46616Jc() {
            return new C28107o((C28094c) this.f36758a.f36235J2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: K7 */
        public C25433a m46625K7() {
            return new C25433a((C25723a) this.f36758a.f36345X1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: K8 */
        public C29340j m46626K8() {
            return new C29340j((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: K9 */
        public C29360s m46627K9() {
            return new C29360s((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Ka */
        public C29324b0 m46628Ka() {
            return new C29324b0((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Kb */
        public C28106n m46629Kb() {
            return new C28106n((C28094c) this.f36758a.f36235J2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Kc */
        public C28111c m46630Kc() {
            return new C28111c((C28520a) this.f36758a.f36307S2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: L7 */
        public C36358a m46639L7() {
            return new C36358a((C36888a) this.f36765b.f35902M.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: L8 */
        public C29344l m46640L8() {
            return new C29344l((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: L9 */
        public C29362u m46641L9() {
            return new C29362u((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: La */
        public C29326c0 m46642La() {
            return new C29326c0((C24982a) this.f36758a.f36298R1.get());
        }

        /* renamed from: Lb */
        private C31677g m46643Lb() {
            return new C31677g(this.f36758a.m46431y8());
        }

        /* access modifiers changed from: private */
        /* renamed from: Lc */
        public C40137b m46644Lc() {
            return new C40137b((C39988a) this.f36758a.f36189D4.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: M7 */
        public C30116b m46653M7() {
            return new C30116b((C19279a) this.f36758a.f36554x5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: M8 */
        public C29349n m46654M8() {
            return new C29349n((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: M9 */
        public C29364v m46655M9() {
            return new C29364v((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Ma */
        public C19991a m46656Ma() {
            return new C19991a((C20472a) this.f36758a.f36330V1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Mb */
        public C29346l0 m46657Mb() {
            return new C29346l0(this.f36758a.m46195b8(), this.f36758a.m46085Q7());
        }

        /* access modifiers changed from: private */
        /* renamed from: Mc */
        public C25015i m46658Mc() {
            return new C25015i(this.f36758a.m46266i9(), this.f36758a.m46105S7());
        }

        /* access modifiers changed from: private */
        /* renamed from: N7 */
        public C37902c m46667N7() {
            return new C37902c((C24835a) this.f36758a.f36169B0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: N8 */
        public C38864h m46668N8() {
            return new C38864h((C38606b) this.f36758a.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: N9 */
        public C29365w m46669N9() {
            return new C29365w((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Na */
        public C28462b m46670Na() {
            return new C28462b((C28248a) this.f36765b.f35931y.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Nb */
        public C20585g m46671Nb() {
            return new C20585g((C25080a) this.f36758a.f36332V3.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Nc */
        public C25020m m46672Nc() {
            return new C25020m(this.f36758a.m46266i9(), m46587Hb(), this.f36758a.m46105S7());
        }

        /* access modifiers changed from: private */
        /* renamed from: O7 */
        public C28093b m46681O7() {
            return new C28093b((C28094c) this.f36758a.f36235J2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: O8 */
        public C26628j m46682O8() {
            return new C26628j(this.f36758a.cardsAndDetailsUseCase(), this.f36758a.getAccountsAndDetailsUseCase());
        }

        /* access modifiers changed from: private */
        /* renamed from: O9 */
        public C29366x m46683O9() {
            return new C29366x((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Oa */
        public C36239k m46684Oa() {
            return new C36239k(m46530Da());
        }

        /* access modifiers changed from: private */
        /* renamed from: Ob */
        public C20586h m46685Ob() {
            return new C20586h((C25080a) this.f36758a.f36332V3.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Oc */
        public C19995e m46686Oc() {
            return new C19995e((C20472a) this.f36758a.f36330V1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: P7 */
        public C29323b m46695P7() {
            return new C29323b((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: P8 */
        public C36360b m46696P8() {
            return new C36360b((C36888a) this.f36765b.f35902M.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: P9 */
        public C25434b m46697P9() {
            return new C25434b((C25723a) this.f36758a.f36345X1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Pa */
        public C36241l m46698Pa() {
            return new C36241l((C36084a) this.f36758a.f36346X2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Pb */
        public C31094i m46699Pb() {
            return new C31094i((C31452b) this.f36765b.f35897H.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Pc */
        public C19996f m46700Pc() {
            return new C19996f((C20472a) this.f36758a.f36330V1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Q7 */
        public C29325c m46709Q7() {
            return new C29325c((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Q8 */
        public C36361c m46710Q8() {
            return new C36361c((C36888a) this.f36765b.f35902M.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Q9 */
        public C29367y m46711Q9() {
            return new C29367y((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Qa */
        public C28110b m46712Qa() {
            return new C28110b((C28520a) this.f36758a.f36307S2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Qb */
        public C30469c m46713Qb() {
            return new C30469c(C17957b.m61875a(this.f36758a.f36388d));
        }

        /* access modifiers changed from: private */
        /* renamed from: Qc */
        public C19997g m46714Qc() {
            return new C19997g((C20472a) this.f36758a.f36330V1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: R7 */
        public C28510a m46723R7() {
            return new C28510a((C29164a) this.f36758a.f36294Q5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: R8 */
        public C31089d m46724R8() {
            return new C31089d((C31452b) this.f36765b.f35897H.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: R9 */
        public C38902z m46725R9() {
            return new C38902z((C38606b) this.f36758a.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Ra */
        public C20583e m46726Ra() {
            return new C20583e((C25080a) this.f36758a.f36332V3.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Rb */
        public C18071a m46727Rb() {
            return new C18071a((PreferencesApiManager) this.f36758a.f36224I.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Rc */
        public C31658b m46728Rc() {
            return new C31658b(this.f36758a.m46115T7());
        }

        /* access modifiers changed from: private */
        /* renamed from: S7 */
        public C29327d m46737S7() {
            return new C29327d((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: S8 */
        public C19797a m46738S8() {
            return new C19797a((C20296a) this.f36758a.f36358Z0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: S9 */
        public C25009d m46739S9() {
            return new C25009d(this.f36758a.m46256h9(), m46838Za());
        }

        /* access modifiers changed from: private */
        /* renamed from: Sa */
        public C20584f m46740Sa() {
            return new C20584f((C25080a) this.f36758a.f36332V3.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Sb */
        public C17038p m46741Sb() {
            return new C17038p((C16719b) this.f36765b.f35904O.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Sc */
        public C19999i m46742Sc() {
            return new C19999i((C20472a) this.f36758a.f36330V1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: T7 */
        public C29393c m46751T7() {
            return new C29393c((C29077c) this.f36758a.f36375b2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: T8 */
        public C36729a m46752T8() {
            return new C36729a((C36356a) this.f36758a.f36517t0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: T9 */
        public C29402i m46753T9() {
            return new C29402i((C29077c) this.f36758a.f36375b2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Ta */
        public C17032l m46754Ta() {
            return new C17032l((C16718a) this.f36765b.f35914h.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Tb */
        public C17039q m46755Tb() {
            return new C17039q((C16719b) this.f36765b.f35904O.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Tc */
        public C29356p0 m46756Tc() {
            return new C29356p0((C24982a) this.f36758a.f36298R1.get(), (C25723a) this.f36758a.f36345X1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: U7 */
        public C29329e m46765U7() {
            return new C29329e((C24982a) this.f36758a.f36298R1.get());
        }

        /* renamed from: U8 */
        private C17018a m46766U8() {
            return new C17018a((C16718a) this.f36765b.f35914h.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: U9 */
        public C29403j m46767U9() {
            return new C29403j((C29077c) this.f36758a.f36375b2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Ua */
        public C17035o m46768Ua() {
            return new C17035o((C16718a) this.f36765b.f35914h.get(), (C16719b) this.f36765b.f35904O.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Ub */
        public C17040r m46769Ub() {
            return new C17040r((C16719b) this.f36765b.f35904O.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Uc */
        public C25074c m46770Uc() {
            return new C25074c((C25072a) this.f36758a.f36489p4.get(), this.f36758a.getTransactionCategoriesUseCase(), (Client) this.f36758a.f36389d0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: V7 */
        public C28160c m46779V7() {
            return new C28160c(this.f36758a.getAccountsAndDetailsUseCase(), this.f36758a.getDepositsAndBondsUseCase(), (Client) this.f36758a.f36389d0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: V8 */
        public C17019b m46780V8() {
            return new C17019b((C16718a) this.f36765b.f35914h.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: V9 */
        public C15365c m46781V9() {
            return new C15365c((C15707a) this.f36765b.f35932z.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Va */
        public C39896d m46782Va() {
            return new C39896d((C40256a) this.f36811h3.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Vb */
        public C17041s m46783Vb() {
            return new C17041s((C16719b) this.f36765b.f35904O.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Vc */
        public C24836a m46784Vc() {
            return new C24836a((C20576a) this.f36758a.f36362Z4.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: W7 */
        public C31086a m46793W7() {
            return new C31086a((C31452b) this.f36765b.f35897H.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: W8 */
        public C25748b m46794W8() {
            return new C25748b(m46585H9(), (C30120b) this.f36623F.get(), m46997k9(), m47011l9());
        }

        /* access modifiers changed from: private */
        /* renamed from: W9 */
        public C16752j0 m46795W9() {
            return new C16752j0((C16586a) this.f36779d.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Wa */
        public C39901f m46796Wa() {
            return new C39901f((C40256a) this.f36811h3.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Wb */
        public C17042t m46797Wb() {
            return new C17042t((C16719b) this.f36765b.f35904O.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Wc */
        public C24818l0 m46798Wc() {
            return new C24818l0((C25260a) this.f36758a.f36187D2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: X7 */
        public C24817l m46807X7() {
            return new C24817l((C25260a) this.f36758a.f36187D2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: X8 */
        public C24823p m46808X8() {
            return new C24823p((C25260a) this.f36758a.f36187D2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: X9 */
        public C16755k0 m46809X9() {
            return new C16755k0((C16586a) this.f36779d.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Xa */
        public C39905g m46810Xa() {
            return new C39905g((C40256a) this.f36811h3.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Xb */
        public C17043u m46811Xb() {
            return new C17043u((C16719b) this.f36765b.f35904O.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Xc */
        public C12027f m46812Xc() {
            return new C12027f((C12832a) this.f36765b.f35906Q.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Y7 */
        public C24819m m46821Y7() {
            return new C24819m((C25260a) this.f36758a.f36187D2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Y8 */
        public C25258b m46822Y8() {
            return new C25258b((C27622a) this.f36758a.f36495q2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Y9 */
        public C17022e m46823Y9() {
            return new C17022e((C16718a) this.f36765b.f35914h.get(), m46769Ub());
        }

        /* access modifiers changed from: private */
        /* renamed from: Ya */
        public C30267b m46824Ya() {
            return new C30267b((C29956b) this.f36758a.f36343X.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Yb */
        public C17045w m46825Yb() {
            return new C17045w((C16719b) this.f36765b.f35904O.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Yc */
        public C24820m0 m46826Yc() {
            return new C24820m0((C25260a) this.f36758a.f36187D2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Z7 */
        public C25494b m46835Z7() {
            return new C25494b((C26093a) this.f36758a.f36203F2.get(), m47014lc());
        }

        /* access modifiers changed from: private */
        /* renamed from: Z8 */
        public C17531e m46836Z8() {
            return new C17531e((C17385a) this.f36758a.f36178C1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Z9 */
        public C28461a m46837Z9() {
            return new C28461a((C28248a) this.f36765b.f35931y.get());
        }

        /* renamed from: Za */
        private C25011e m46838Za() {
            return new C25011e(this.f36758a.m46105S7());
        }

        /* access modifiers changed from: private */
        /* renamed from: Zb */
        public C39858g0 m46839Zb() {
            return new C39858g0((C31186b) this.f36758a.f36163A2.get(), (C37020g) this.f36723U0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: Zc */
        public C25027r m46840Zc() {
            return new C25027r(new C37349a(), this.f36758a.m46105S7());
        }

        /* access modifiers changed from: private */
        /* renamed from: a8 */
        public C25496d m46849a8() {
            return new C25496d((C26093a) this.f36758a.f36203F2.get(), m47014lc());
        }

        /* access modifiers changed from: private */
        /* renamed from: a9 */
        public C17533f m46850a9() {
            return new C17533f((C17385a) this.f36758a.f36178C1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: aa */
        public C29368z m46851aa() {
            return new C29368z(this.f36758a.m46115T7());
        }

        /* access modifiers changed from: private */
        /* renamed from: ab */
        public C31671d m46852ab() {
            return new C31671d((C36357a) this.f36758a.f36447k2.get(), m46643Lb(), this.f36758a.m46286k9());
        }

        /* access modifiers changed from: private */
        /* renamed from: ac */
        public C12023b m46853ac() {
            return new C12023b((C12832a) this.f36765b.f35906Q.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: ad */
        public C36746r m46854ad() {
            return new C36746r((C36356a) this.f36758a.f36517t0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: b8 */
        public C25752a m46864b8() {
            return new C25752a((C26573a) this.f36758a.f36238J5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: b9 */
        public C38875l m46865b9() {
            return new C38875l((C17385a) this.f36758a.f36178C1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: ba */
        public C15367e m46866ba() {
            return new C15367e((C15707a) this.f36765b.f35932z.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: bb */
        public C20107a m46867bb() {
            return new C20107a((C20303a) this.f36758a.f36395d6.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: bc */
        public C12024c m46868bc() {
            return new C12024c((C12832a) this.f36765b.f35906Q.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: bd */
        public C20000j m46869bd() {
            return new C20000j((C20472a) this.f36758a.f36330V1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: c8 */
        public C25756e m46879c8() {
            return new C25756e((C26573a) this.f36758a.f36238J5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: c9 */
        public C29353o m46880c9() {
            return new C29353o((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: ca */
        public C28055c m46881ca() {
            return new C28055c((C27851a) this.f36758a.f36519t2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: cb */
        public C25775e m46882cb() {
            return new C25775e((C26607a) this.f36758a.f36206F5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: cc */
        public C12025d m46883cc() {
            return new C12025d((C12832a) this.f36765b.f35906Q.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: cd */
        public C28485b m46884cd() {
            return new C28485b((C28925a) this.f36758a.f36530u5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: d8 */
        public C25760f m46894d8() {
            return new C25760f((C26573a) this.f36758a.f36238J5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: d9 */
        public C31090e m46895d9() {
            return new C31090e((C31452b) this.f36765b.f35897H.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: da */
        public C17024f m46896da() {
            return new C17024f((C16718a) this.f36765b.f35914h.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: db */
        public C29328d0 m46897db() {
            return new C29328d0((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: dc */
        public C25776f m46898dc() {
            return new C25776f((C26607a) this.f36758a.f36206F5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: dd */
        public C30007c m46899dd() {
            return new C30007c(this.f36758a.m46056N8());
        }

        /* access modifiers changed from: private */
        /* renamed from: e8 */
        public C25761g m46909e8() {
            return new C25761g((C26573a) this.f36758a.f36238J5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: e9 */
        public C31091f m46910e9() {
            return new C31091f((C31452b) this.f36765b.f35897H.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: ea */
        public C20582d m46911ea() {
            return new C20582d((C25080a) this.f36758a.f36332V3.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: eb */
        public C29330e0 m46912eb() {
            return new C29330e0((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: ec */
        public C19993c m46913ec() {
            return new C19993c((C20472a) this.f36758a.f36330V1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: ed */
        public C12028g m46914ed() {
            return new C12028g((C12832a) this.f36765b.f35906Q.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: f8 */
        public C25762h m46924f8() {
            return new C25762h((C26573a) this.f36758a.f36238J5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: f9 */
        public C36362d m46925f9() {
            return new C36362d((C36888a) this.f36765b.f35902M.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: fa */
        public C17025g m46926fa() {
            return new C17025g((C16718a) this.f36765b.f35914h.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: fb */
        public C29332f0 m46927fb() {
            return new C29332f0((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: fc */
        public C30006b m46928fc() {
            return new C30006b((C20472a) this.f36758a.f36330V1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: fd */
        public C26638b m46929fd() {
            return new C26638b((C27639a) this.f36758a.f36531u6.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: g8 */
        public C31087b m46939g8() {
            return new C31087b(this.f36765b.m45254j0());
        }

        /* access modifiers changed from: private */
        /* renamed from: g9 */
        public C29355p m46940g9() {
            return new C29355p((C24982a) this.f36758a.f36298R1.get());
        }

        /* renamed from: ga */
        private C19088c m46941ga() {
            return new C19088c((C10344a) this.f36758a.f36535v2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: gb */
        public C29334g0 m46942gb() {
            return new C29334g0((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: gc */
        public C26373a m46943gc() {
            return new C26373a((C27238a) this.f36758a.f36247K6.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: gd */
        public C39831a m46944gd() {
            return new C39831a((C37059a) this.f36874q3.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: h8 */
        public C20579a m46954h8() {
            return new C20579a((C25080a) this.f36758a.f36332V3.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: h9 */
        public C36730b m46955h9() {
            return new C36730b((C36356a) this.f36758a.f36517t0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: ha */
        public C19091f m46956ha() {
            return new C19091f(new C18489a(), m47194ya(), m46941ga(), this.f36758a.m46115T7());
        }

        /* access modifiers changed from: private */
        /* renamed from: hb */
        public C25435c m46957hb() {
            return new C25435c((C25723a) this.f36758a.f36345X1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: hc */
        public C29409p m46958hc() {
            return new C29409p((C29077c) this.f36758a.f36375b2.get(), m46571G9());
        }

        /* access modifiers changed from: private */
        /* renamed from: i8 */
        public C39851e m46968i8() {
            return new C39851e((C31185a) this.f36921x1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: i9 */
        public C29358q m46969i9() {
            return new C29358q((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: ia */
        public C19098j m46970ia() {
            return new C19098j((C10344a) this.f36758a.f36535v2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: ib */
        public C25436d m46971ib() {
            return new C25436d((C25723a) this.f36758a.f36345X1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: ic */
        public PurchasePassUseCase m46972ic() {
            return new PurchasePassUseCase((C36888a) this.f36765b.f35902M.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: j8 */
        public C24821n m46982j8() {
            return new C24821n((C25260a) this.f36758a.f36187D2.get(), m47014lc());
        }

        /* access modifiers changed from: private */
        /* renamed from: j9 */
        public C29397e m46983j9() {
            return new C29397e((C29077c) this.f36758a.f36375b2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: ja */
        public C19099k m46984ja() {
            return new C19099k((C10344a) this.f36758a.f36535v2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: jb */
        public C25437e m46985jb() {
            return new C25437e((C25723a) this.f36758a.f36345X1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: jc */
        public C20587i m46986jc() {
            return new C20587i((C25080a) this.f36758a.f36332V3.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: k8 */
        public C16730c m46996k8() {
            return new C16730c((C16586a) this.f36779d.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: k9 */
        public C36732d m46997k9() {
            return new C36732d((C36356a) this.f36758a.f36517t0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: ka */
        public C19102n m46998ka() {
            return new C19102n((C10344a) this.f36758a.f36535v2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: kb */
        public C29336h0 m46999kb() {
            return new C29336h0((C25723a) this.f36758a.f36345X1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: kc */
        public C25777g m47000kc() {
            return new C25777g(this.f36758a.refreshAssetLiabilityUseCase(), this.f36758a.refreshProductTypeListUseCase(), (C29882e) this.f36758a.f36398e1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: l8 */
        public C24822o m47010l8() {
            return new C24822o((C25260a) this.f36758a.f36187D2.get(), m47014lc());
        }

        /* access modifiers changed from: private */
        /* renamed from: l9 */
        public C36734f m47011l9() {
            return new C36734f((C36356a) this.f36758a.f36517t0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: la */
        public C19103o m47012la() {
            return new C19103o((C10344a) this.f36758a.f36535v2.get(), this.f36758a.m46115T7());
        }

        /* access modifiers changed from: private */
        /* renamed from: lb */
        public C29338i0 m47013lb() {
            return new C29338i0(this.f36758a.m46115T7(), (PreferencesApiManager) this.f36758a.f36224I.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: lc */
        public C25508l m47014lc() {
            return new C25508l((C26093a) this.f36758a.f36203F2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: m8 */
        public C36227a m47024m8() {
            return new C36227a((C36084a) this.f36758a.f36346X2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: m9 */
        public C29359r m47025m9() {
            return new C29359r((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: ma */
        public C17028j m47026ma() {
            return new C17028j(m46766U8(), m46780V8());
        }

        /* access modifiers changed from: private */
        /* renamed from: mb */
        public C19801d m47027mb() {
            return new C19801d((C20297b) this.f36758a.f36379b6.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: mc */
        public C26617h m47028mc() {
            return new C26617h((C27622a) this.f36758a.f36495q2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: n8 */
        public C28946a m47038n8() {
            return new C28946a((C29583a) this.f36758a.f36303R6.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: n9 */
        public C25771c m47039n9() {
            return new C25771c((C26607a) this.f36758a.f36206F5.get(), (C25339b) this.f36758a.f36321U0.get(), (C26089b) this.f36758a.f36214G5.get(), (C27092a) this.f36758a.f36305S0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: na */
        public C38872j0 m47040na() {
            return new C38872j0((C38606b) this.f36758a.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: nb */
        public C36738j m47041nb() {
            return new C36738j((C36356a) this.f36758a.f36517t0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: nc */
        public C28516f m47042nc() {
            return new C28516f((C29164a) this.f36758a.f36294Q5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: o8 */
        public C29331f m47052o8() {
            return new C29331f((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: o9 */
        public C31092g m47053o9() {
            return new C31092g((C31452b) this.f36765b.f35897H.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: oa */
        public C20217b m47054oa() {
            return new C20217b((C20800a) this.f36758a.f36480o3.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: ob */
        public C19992b m47055ob() {
            return new C19992b((C20472a) this.f36758a.f36330V1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: oc */
        public C17046x m47056oc() {
            return new C17046x((C16718a) this.f36765b.f35914h.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: p8 */
        public C28292a m47066p8() {
            return new C28292a((C28532a) this.f36758a.f36191D6.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: p9 */
        public C25774d m47067p9() {
            return new C25774d((C26607a) this.f36758a.f36206F5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: pa */
        public C29404k m47068pa() {
            return new C29404k((C29077c) this.f36758a.f36375b2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: pb */
        public C26637a m47069pb() {
            return new C26637a((C27639a) this.f36758a.f36531u6.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: pc */
        public C24829v m47070pc() {
            return new C24829v((C25260a) this.f36758a.f36187D2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: q8 */
        public C25498e m47080q8() {
            return new C25498e((C26093a) this.f36758a.f36203F2.get(), m47014lc());
        }

        /* access modifiers changed from: private */
        /* renamed from: q9 */
        public C38885q m47081q9() {
            return new C38885q((C38606b) this.f36758a.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: qa */
        public C19926a m47082qa() {
            return new C19926a((C20446a) this.f36758a.f36271N6.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: qb */
        public C29341j0 m47083qb() {
            return new C29341j0((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: qc */
        public C20301d m47084qc() {
            return new C20301d((C24835a) this.f36758a.f36169B0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: r8 */
        public C29180k m47094r8() {
            return new C29180k((C29860a) this.f36758a.f36194E1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: r9 */
        public C28101j m47095r9() {
            return new C28101j((C28094c) this.f36758a.f36235J2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: ra */
        public C36363e m47096ra() {
            return new C36363e((C36888a) this.f36765b.f35902M.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: rb */
        public C29343k0 m47097rb() {
            return new C29343k0((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: rc */
        public C24831x m47098rc() {
            return new C24831x((C25260a) this.f36758a.f36187D2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: s8 */
        public C36228b m47108s8() {
            return new C36228b((C36084a) this.f36758a.f36346X2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: s9 */
        public C28103l m47109s9() {
            return new C28103l(m46629Kb());
        }

        /* access modifiers changed from: private */
        /* renamed from: sa */
        public C25503h m47110sa() {
            return new C25503h((C26093a) this.f36758a.f36203F2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: sb */
        public C38318a m47111sb() {
            return new C38318a((C38737a) this.f36758a.f36471n2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: sc */
        public C28950a m47112sc() {
            return new C28950a((C29182a) this.f36758a.f36555x6.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: t8 */
        public C28095d m47122t8() {
            return new C28095d((C28094c) this.f36758a.f36235J2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: t9 */
        public C28105m m47123t9() {
            return new C28105m((C28094c) this.f36758a.f36235J2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: ta */
        public C24824q m47124ta() {
            return new C24824q((C25260a) this.f36758a.f36187D2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: tb */
        public C29420a m47125tb() {
            return new C29420a(new C25217c());
        }

        /* access modifiers changed from: private */
        /* renamed from: tc */
        public C27863a m47126tc() {
            return new C27863a((C36546y) this.f36758a.f36168B.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: u7 */
        public C37900b m47135u7() {
            return new C37900b(m46682O8());
        }

        /* access modifiers changed from: private */
        /* renamed from: u8 */
        public C28096e m47136u8() {
            return new C28096e((C28094c) this.f36758a.f36235J2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: u9 */
        public C25500g m47137u9() {
            return new C25500g((C26093a) this.f36758a.f36203F2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: ua */
        public C25507k m47138ua() {
            return new C25507k((C26093a) this.f36758a.f36203F2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: ub */
        public C29439g m47139ub() {
            return new C29439g((PreferencesApiManager) this.f36758a.f36224I.get(), m47153vb());
        }

        /* access modifiers changed from: private */
        /* renamed from: uc */
        public C28932a m47140uc() {
            return new C28932a((C36546y) this.f36758a.f36168B.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: v7 */
        public C28484a m47149v7() {
            return new C28484a((C28925a) this.f36758a.f36530u5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: v8 */
        public C19087b m47150v8() {
            return new C19087b((C10344a) this.f36758a.f36535v2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: v9 */
        public C29823a m47151v9() {
            return new C29823a((C19270b) this.f36758a.f36301R4.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: va */
        public C39890z m47152va() {
            return new C39890z((C31185a) this.f36921x1.get());
        }

        /* renamed from: vb */
        private C25461b m47153vb() {
            return new C25461b((PreferencesApiManager) this.f36758a.f36224I.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: vc */
        public C29411r m47154vc() {
            return new C29411r((C29079e) this.f36765b.f35928v.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: w7 */
        public C28092a m47163w7() {
            return new C28092a((C28094c) this.f36758a.f36235J2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: w8 */
        public C28097f m47164w8() {
            return new C28097f((C28094c) this.f36758a.f36235J2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: w9 */
        public C38887r m47165w9() {
            return new C38887r((C38606b) this.f36758a.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: wa */
        public C39892b m47166wa() {
            return new C39892b((C40256a) this.f36811h3.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: wb */
        public C20253h m47167wb() {
            return new C20253h((C37637h) this.f36758a.f36356Y5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: wc */
        public C29415v m47168wc() {
            return new C29415v((C29079e) this.f36765b.f35928v.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: x7 */
        public C24788d m47177x7() {
            return new C24788d((C25260a) this.f36758a.f36187D2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: x8 */
        public C28947b m47178x8() {
            return new C28947b((C29583a) this.f36758a.f36303R6.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: x9 */
        public C28512c m47179x9() {
            return new C28512c((C29164a) this.f36758a.f36294Q5.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: xa */
        public C15368f m47180xa() {
            return new C15368f((C15707a) this.f36765b.f35932z.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: xb */
        public C29406m m47181xb() {
            return new C29406m((C29077c) this.f36758a.f36375b2.get(), m46571G9());
        }

        /* access modifiers changed from: private */
        /* renamed from: xc */
        public C29417x m47182xc() {
            return new C29417x((C29079e) this.f36765b.f35928v.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: y7 */
        public C19086a m47191y7() {
            return new C19086a((C10344a) this.f36758a.f36535v2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: y8 */
        public C29333g m47192y8() {
            return new C29333g((C24982a) this.f36758a.f36298R1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: y9 */
        public C28514d m47193y9() {
            return new C28514d((C29164a) this.f36758a.f36294Q5.get());
        }

        /* renamed from: ya */
        private C26611d m47194ya() {
            return new C26611d((C27622a) this.f36758a.f36495q2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: yb */
        public C29407n m47195yb() {
            return new C29407n((C29077c) this.f36758a.f36375b2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: yc */
        public C19994d m47196yc() {
            return new C19994d((C20472a) this.f36758a.f36330V1.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: z7 */
        public C24800g m47205z7() {
            return new C24800g((C25260a) this.f36758a.f36187D2.get(), m47109s9());
        }

        /* access modifiers changed from: private */
        /* renamed from: z8 */
        public C25006a m47206z8() {
            return new C25006a(this.f36758a.m46105S7());
        }

        /* access modifiers changed from: private */
        /* renamed from: z9 */
        public C38891t m47207z9() {
            return new C38891t((C38606b) this.f36758a.f36281P0.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: za */
        public C26613e m47208za() {
            return new C26613e((C27622a) this.f36758a.f36495q2.get());
        }

        /* access modifiers changed from: private */
        /* renamed from: zb */
        public C25012f m47209zb() {
            return new C25012f(this.f36758a.m46105S7());
        }

        /* access modifiers changed from: private */
        /* renamed from: zc */
        public C20302e m47210zc() {
            return new C20302e((C24835a) this.f36758a.f36169B0.get());
        }

        /* renamed from: a */
        public Map mo32893a() {
            return C18328c.m62671b(SubsamplingScaleImageView.ORIENTATION_180).mo46101c("ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel", this.f36835l).mo46101c("ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.ActivationDateInputViewModel$ViewModel", this.f36842m).mo46101c("ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.AddBudgetViewModel", this.f36856o).mo46101c("ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone.AddByPhoneViewModel", this.f36863p).mo46101c("ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductViewModel$ViewModel", this.f36898u).mo46101c("ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisTransactionViewModel", this.f36905v).mo46101c("ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisViewModel", this.f36933z).mo46101c("ge.bog.mobilebank.cleanarch.application.presentation.viewmodel.ApplicationDetailsViewModel", this.f36595B).mo46101c("ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization.AuthorizationViewModel$ViewModel", this.f36602C).mo46101c("ge.bog.mobilebank.cleanarch.banner.presentation.viewmodel.BannerDetailsViewModel", this.f36616E).mo46101c("ge.bog.mobilebank.cleanarch.becomesolo.presentation.viewmodel.BecomeSoloApplicationViewModel", this.f36644I).mo46101c("ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.BillSplitSelectOperationsViewModel", this.f36658K).mo46101c("ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel", this.f36686O).mo46101c("ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesViewModel$ViewModel", this.f36692P).mo46101c("ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersViewModel$ViewModel", this.f36698Q).mo46101c("ge.bog.mobilebank.bnpl.presentation.welcome.BnplWelcomeViewModel$ViewModel", this.f36704R).mo46101c("ge.bog.mobilebank.cleanarch.productdetails.presentation.viewmodel.BogProductsFragmentViewModel", this.f36722U).mo46101c("ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.BudgetHistoryViewModel", this.f36734W).mo46101c("ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.BudgetingViewModel", this.f36740X).mo46101c("ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.CalendarDayTransactionsViewModel", this.f36746Y).mo46101c("ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput.CarNumberInputViewModel$ViewModel", this.f36752Z).mo46101c("ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputViewModel$ViewModel", this.f36759a0).mo46101c("ge.bog.mobilebank.cleanarch.cardactivation.presentation.CardActivationViewModel", this.f36766b0).mo46101c("ge.bog.mobilebank.cardproducts.presentation.carddetail.actionsheet.CardBenefitsViewModel$ViewModel", this.f36773c0).mo46101c("ge.bog.mobilebank.cleanarch.presentation.carddetails.viewmodel.CardDetailsViewModel", this.f36780d0).mo46101c("ge.bog.mobilebank.products.presentation.cardinsurance.viwmodel.CardInsuranceStatusesViewModel$ViewModel", this.f36794f0).mo46101c("ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.viewmodel.CashFlowViewModel", this.f36801g0).mo46101c("ge.bog.mobilebank.cleanarch.presentation.moneyrequest.billsplitcashoperation.CashOperationViewModel", this.f36808h0).mo46101c("ge.bog.mobilebank.payments.presentation.categories.dd.CategoriesDdViewModel", this.f36836l0).mo46101c("ge.bog.mobilebank.payments.presentation.categories.payments.CategoriesPaymentsViewModel", this.f36843m0).mo46101c("ge.bog.mobilebank.settings.presentation.viewmodel.ChangeLanguageViewModel$ViewModel", this.f36850n0).mo46101c("ge.bog.mobilebank.linksharing.presentation.chooseaccount.ChooseAccountViewModel$ViewModel", this.f36864p0).mo46101c("ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel", this.f36927y0).mo46101c("ge.bog.mobilebank.cardproducts.presentation.closecard.viewmodel.CloseCardViewModel$ViewModel", this.f36603C0).mo46101c("ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferViewModel$ViewModel", this.f36617E0).mo46101c("ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsSummariesViewModel", this.f36631G0).mo46101c("ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsViewModel", this.f36645I0).mo46101c("ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel", this.f36666L0).mo46101c("ge.bog.mobilebank.cleanarch.presentation.contacts.details.viewmodel.ContactDetailsViewModel", this.f36680N0).mo46101c("ge.bog.mobilebank.cleanarch.presentation.securitycontacts.viewmodel.ContactsActivityViewModel", this.f36693P0).mo46101c("ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel", this.f36760a1).mo46101c("ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel", this.f36767b1).mo46101c("ge.bog.mobilebank.settings.presentation.viewmodel.DarkModeSwitchViewModel$ViewModel", this.f36781d1).mo46101c("ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroViewModel$ViewModel", this.f36788e1).mo46101c("ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorRecommendationViewModel$ViewModel", this.f36795f1).mo46101c("ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorViewModel$ViewModel", this.f36809h1).mo46101c("ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultViewModel$ViewModel", this.f36830k1).mo46101c("ge.bog.mobilebank.depositapplication.presentation.application.viewmodel.DepositApplicationViewModel$ViewModel", this.f36844m1).mo46101c("ge.bog.mobilebank.depositapplication.presentation.deposittypes.viewmodel.DepositTypesViewModel$ViewModel", this.f36851n1).mo46101c("ge.bog.mobilebank.giftcards.presentation.DiscoveryFragmentContainerViewModel$ViewModel", this.f36858o1).mo46101c("ge.bog.mobilebank.shared.accountselector.presentation.DomesticAccountSelectorActionSheetViewModel$ViewModel", this.f36865p1).mo46101c("ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.EditBudgetViewModel", this.f36879r1).mo46101c("ge.bog.mobilebank.cleanarch.presentation.contacts.edit.viewmodel.EditContactViewModel", this.f36886s1).mo46101c("ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.EditPackageViewModel$ViewModel", this.f36900u1).mo46101c("ge.bog.mobilebank.cleanarch.settings.presentation.EditProfileViewModel$ViewModel", this.f36914w1).mo46101c("ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusViewModel$ViewModel", this.f36928y1).mo46101c("ge.bog.mobilebank.cleanarch.presentation.pfm.faq.viewmodel.FAQViewModel", this.f36935z1).mo46101c("ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoViewModel$ViewModel", this.f36590A1).mo46101c("ge.bog.mobilebank.cleanarch.presentation.pfm.financialcalendar.viewmodel.FinancialCalendarViewModel", this.f36597B1).mo46101c("ge.bog.mobilebank.shared.dictionary.presentation.viewmodel.ForcedDictionaryUpdateViewModel$ViewModel", this.f36604C1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.landing.GTBalanceViewModel$ViewModel", this.f36611D1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.watchlists.changename.GTChangeWatchListNameViewModel$ViewModel", this.f36618E1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.watchlists.create.GTCreateWatchListViewModel$ViewModel", this.f36625F1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.watchlists.edit.GTEditWatchListViewModel$ViewModel", this.f36632G1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionViewModel$ViewModel", this.f36639H1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$ViewModel", this.f36646I1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeResultViewModel$ViewModel", this.f36653J1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel", this.f36660K1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsViewModel$ViewModel", this.f36667L1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoViewModel$ViewModel", this.f36681N1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.onboarding.intro.GTOnboardingIntroViewModel$ViewModel", this.f36688O1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput.GTOnboardingMailInputViewModel$ViewModel", this.f36694P1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailvalidate.GTOnboardingMailValidateViewModel$ViewModel", this.f36700Q1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.onboarding.reviewdata.GTOnboardingReviewDataViewModel$ViewModel", this.f36706R1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersViewModel$ViewModel", this.f36712S1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.shared.GTPortfolioViewModel$ViewModel", this.f36718T1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.search.GTSearchSymbolViewModel$ViewModel", this.f36724U1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeDetailsViewModel$ViewModel", this.f36730V1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeResultViewModel$ViewModel", this.f36736W1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeViewModel$ViewModel", this.f36742X1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel$ViewModel", this.f36748Y1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.GTTransactionDetailViewModel$ViewModel", this.f36754Z1).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTTransferAccountsViewModel$ViewModel", this.f36761a2).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchListDetailsViewModel$ViewModel", this.f36768b2).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.GTWatchListViewModel$ViewModel", this.f36775c2).mo46101c("ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel", this.f36782d2).mo46101c("ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationViewModel$ViewModel", this.f36789e2).mo46101c("ge.bog.mobilebank.giftcards.presentation.purchase.GiftCardsPurchaseViewModel$ViewModel", this.f36796f2).mo46101c("ge.bog.mobilebank.giftcards.presentation.success.GiftCardsSuccessViewModel$ViewModel", this.f36803g2).mo46101c("ge.bog.mobilebank.giftcards.presentation.home.GiftCardsViewModel$ViewModel", this.f36810h2).mo46101c("ge.bog.mobilebank.googlepay.presentation.viewmodel.GooglePayDialogViewModel$ViewModel", this.f36817i2).mo46101c("ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.HomeFragmentViewModel", this.f36922x2).mo46101c("ge.bog.mobilebank.hubmenu.presentation.viewmodel.HubViewModel$ViewModel", this.f36647I2).mo46101c("ge.bog.mobilebank.kyc.presentation.identity.IdentityInputViewModel$ViewModel", this.f36654J2).mo46101c("ge.bog.mobilebank.cleanarch.identityverification.presentation.viewmodel.IdentityVerificationViewModel", this.f36661K2).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.result.IdentomatResultViewModel$ViewModel", this.f36668L2).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.IdentomatTypeSelectorViewModel$ViewModel", this.f36675M2).mo46101c("ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.IncomeTypeViewModel$ViewModel", this.f36689O2).mo46101c("ge.bog.mobilebank.cleanarch.installment.presentation.viewmodel.InstallmentReversalViewModel", this.f36695P2).mo46101c("ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.InsuranceProviderListViewModel$ViewModel", this.f36707R2).mo46101c("ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorViewModel$ViewModel", this.f36713S2).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.onboarding.kyc.KycRequiredViewModel$ViewModel", this.f36719T2).mo46101c("ge.bog.mobilebank.cleanarch.leadapplication.presentation.viewmodel.LeadApplicationActionSheetViewModel", this.f36725U2).mo46101c("ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserViewModel$ViewModel", this.f36731V2).mo46101c("ge.bog.mobilebank.lifestyleoffers.presentation.allcategories.LifestyleOffersAllCategoriesViewModel$ViewModel", this.f36743X2).mo46101c("ge.bog.mobilebank.lifestyleoffers.presentation.home.LifestyleOffersHomeViewModel$ViewModel", this.f36749Y2).mo46101c("ge.bog.mobilebank.loans.presentation.installmentStatus.LoanInstallmentStatusViewModel$ViewModel", this.f36755Z2).mo46101c("ge.bog.mobilebank.sso.presentation.LoginViewModel", this.f36762a3).mo46101c("ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.viewmodel.LoyaltyListViewModel", this.f36776c3).mo46101c("ge.bog.mobilebank.loyaltyprogress.presentation.viewmodels.LoyaltyProgressViewModel$ViewModel", this.f36818i3).mo46101c("ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel", this.f36592A3).mo46101c("ge.bog.mobilebank.products.presentation.managecardsandaccounts.viewmodel.ManageCardsViewModel$ViewModel", this.f36599B3).mo46101c("ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.viewmodel.ManageMccViewModel", this.f36627F3).mo46101c("ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.MoneyRequestBottomSheetViewModel", this.f36634G3).mo46101c("ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.viewmodel.MoneyRequestDetailsViewModel", this.f36648I3).mo46101c("ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.MoneyRequestSelectContactViewModel", this.f36662K3).mo46101c("ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel", this.f36676M3).mo46101c("ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferDetailsViewModel", this.f36683N3).mo46101c("ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferListViewModel$ViewModel", this.f36696P3).mo46101c("ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel", this.f36702Q3).mo46101c("ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreViewModel$ViewModel", this.f36708R3).mo46101c("ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.viewmodel.MyCreditInfoDescriptionViewModel", this.f36714S3).mo46101c("ge.bog.mobilebank.cleanarch.offersandapplications.presentation.actionsheet.newproduct.NewProductViewModel$ViewModel", this.f36732V3).mo46101c("ge.bog.mobilebank.kyc.presentation.occupation.OccupationInputViewModel$ViewModel", this.f36738W3).mo46101c("ge.bog.mobilebank.cleanarch.presentation.offer.viewmodel.OfferNavigatorViewModel", this.f36763a4).mo46101c("ge.bog.mobilebank.cleanarch.offersandapplications.presentation.viewmodel.OffersAndApplicationsViewModel", this.f36777c4).mo46101c("ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.OpenBankAccountsViewModel$ViewModel", this.f36784d4).mo46101c("ge.bog.mobilebank.openbanking.presentation.products.OpenBanksProductsViewModel$ViewModel", this.f36791e4).mo46101c("ge.bog.mobilebank.cardapplications.presentation.viewmodel.OrderInstantCardViewModel$ViewModel", this.f36805g4).mo46101c("ge.bog.mobilebank.serverstatus.OutOfServiceViewModel", this.f36812h4).mo46101c("ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel", this.f36826j4).mo46101c("ge.bog.mobilebank.linksharing.presentation.link.router.P2PLinkRouterViewModel$ViewModel", this.f36833k4).mo46101c("ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingViewModel$ViewModel", this.f36840l4).mo46101c("ge.bog.mobilebank.linksharing.presentation.P2PLinkViewModel$ViewModel", this.f36854n4).mo46101c("ge.bog.mobilebank.p2p.presentation.send.P2PSendViewModel$ViewModel", this.f36875q4).mo46101c("ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackViewModel$ViewModel", this.f36882r4).mo46101c("ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelViewModel$ViewModel", this.f36896t4).mo46101c("ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateViewModel$ViewModel", this.f36910v4).mo46101c("ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel", this.f36924x4).mo46101c("ge.bog.mobilebank.products.presentation.details.pension.PensionDetailsViewModel$ViewModel", this.f36931y4).mo46101c("ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PiggyBankSuccessViewModel$ViewModel", this.f36938z4).mo46101c("ge.bog.mobilebank.cardproducts.presentation.pinreset.viewmodel.PinResetViewModel$ViewModel", this.f36600B4).mo46101c("ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferViewModel$ViewModel", this.f36628F4).mo46101c("ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferWizardViewModel$ViewModel", this.f36635G4).mo46101c("ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PointsExchangeSuccessViewModel$ViewModel", this.f36642H4).mo46101c("ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.PolicyDetailViewModel$ViewModel", this.f36649I4).mo46101c("ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetails.PolicyDetailsViewModel$ViewModel", this.f36663K4).mo46101c("ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.PolicyDownloadViewModel$ViewModel", this.f36670L4).mo46101c("ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel", this.f36691O4).mo46101c("ge.bog.mobilebank.cleanarch.productdescription.presentation.viewmodel.ProductDescriptionViewModel", this.f36697P4).mo46101c("ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsViewModel$ViewModel", this.f36709R4).mo46101c("ge.bog.mobilebank.openbanking.presentation.details.list.ProductListViewModel$ViewModel", this.f36721T4).mo46101c("ge.bog.mobilebank.products.presentation.products.ProductsViewModel$ViewModel", this.f36739W4).mo46101c("ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerViewModel", this.f36745X4).mo46101c("ge.bog.mobilebank.cleanarch.moneytransfers.presentation.ratesactionsheet.RatesActionSheetViewModel", this.f36751Y4).mo46101c("ge.bog.mobilebank.cleanarch.presentation.referals.viewmodel.ReferalsViewModel", this.f36757Z4).mo46101c("ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.RegisterMtplPolicyViewModel$ViewModel", this.f36771b5).mo46101c("ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesViewModel$ViewModel", this.f36778c5).mo46101c("ge.bog.mobilebank.ui.activities.viewmodel.RootActivityViewModel$ViewModel", this.f36827j5).mo46101c("ge.bog.mobilebank.cleanarch.presentation.savinggoal.viewmodel.SavingGoalViewModel", this.f36834k5).mo46101c("ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.SelectBankViewModel$ViewModel", this.f36848m5).mo46101c("ge.bog.mobilebank.transfers.SelectContactAccountViewModel", this.f36855n5).mo46101c("ge.bog.mobilebank.autoliabilityinsurance.presentation.selectinsurancecard.SelectInsuranceCardViewModel$ViewModel", this.f36869p5).mo46101c("ge.bog.mobilebank.autoliabilityinsurance.presentation.selectpackage.SelectInsurancePackageViewModel$ViewModel", this.f36883r5).mo46101c("ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsViewModel$ViewModel", this.f36897t5).mo46101c("ge.bog.mobilebank.transportcard.presentation.selecttransportcardpassdevices.SelectTransportCardPassDevicesViewModel$ViewModel", this.f36904u5).mo46101c("ge.bog.mobilebank.settings.SettingsViewModel$ViewModel", this.f36918w5).mo46101c("ge.bog.mobilebank.statements.presentation.statementsfilter.StatementsFilterViewModel$ViewModel", this.f36925x5).mo46101c("ge.bog.mobilebank.statements.presentation.landing.StatementsViewModel$ViewModel", this.f36932y5).mo46101c("ge.bog.mobilebank.transportcard.presentation.transportcardsuccess.SuccessTransportCardViewModel$ViewModel", this.f36939z5).mo46101c("ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesProvidersViewModel", this.f36594A5).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.onboarding.termsandconditions.TermsAndConditionsViewModel$ViewModel", this.f36601B5).mo46101c("ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel", this.f36608C5).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.TransactionHistoryDownloadViewModel$ViewModel", this.f36615D5).mo46101c("ge.bog.mobilebank.galtandtaggart.presentation.transactions.TransactionHistoryViewModel$ViewModel", this.f36622E5).mo46101c("ge.bog.mobilebank.hubmenu.presentation.actionsheet.TransfersActionSheetViewModel$ViewModel", this.f36636G5).mo46101c("ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.VisaConciergeViewModel$ViewModel", this.f36657J5).mo46101c("ge.bog.mobilebank.wishcampaign.presentation.viewmodel.WishCampaignViewModel$ViewModel", this.f36664K5).mo46101c("ge.bog.mobilebank.cleanarch.presentation.zk.iframe.ZkIFrameViewModel", this.f36671L5).mo46101c("ge.bog.mobilebank.cleanarch.presentation.zk.ZkUmtsCardsListViewModel", this.f36685N5).mo46100a();
        }

        private C12279n(C12272j jVar, C12192d dVar, C1580f0 f0Var, C16920c cVar) {
            this.f36772c = this;
            this.f36758a = jVar;
            this.f36765b = dVar;
            m46517Cb(f0Var, cVar);
            m46531Db(f0Var, cVar);
            m46545Eb(f0Var, cVar);
            m46559Fb(f0Var, cVar);
        }
    }

    /* renamed from: dk.b$o */
    private static final class C12281o implements C17611g {

        /* renamed from: a */
        private final C12272j f36944a;

        /* renamed from: b */
        private final C12192d f36945b;

        /* renamed from: c */
        private final C12144b f36946c;

        /* renamed from: d */
        private final C12196g f36947d;

        /* renamed from: e */
        private View f36948e;

        /* renamed from: c */
        public C12141a0 mo32894a() {
            C18329d.m62674a(this.f36948e, View.class);
            return new C12282p(this.f36944a, this.f36945b, this.f36946c, this.f36947d, this.f36948e);
        }

        /* renamed from: d */
        public C12281o mo32895b(View view) {
            this.f36948e = (View) C18329d.m62675b(view);
            return this;
        }

        private C12281o(C12272j jVar, C12192d dVar, C12144b bVar, C12196g gVar) {
            this.f36944a = jVar;
            this.f36945b = dVar;
            this.f36946c = bVar;
            this.f36947d = gVar;
        }
    }

    /* renamed from: dk.b$p */
    private static final class C12282p extends C12141a0 {

        /* renamed from: a */
        private final C12272j f36949a;

        /* renamed from: b */
        private final C12192d f36950b;

        /* renamed from: c */
        private final C12144b f36951c;

        /* renamed from: d */
        private final C12196g f36952d;

        /* renamed from: e */
        private final C12282p f36953e;

        private C12282p(C12272j jVar, C12192d dVar, C12144b bVar, C12196g gVar, View view) {
            this.f36953e = this;
            this.f36949a = jVar;
            this.f36950b = dVar;
            this.f36951c = bVar;
            this.f36952d = gVar;
        }
    }

    /* renamed from: a */
    public static C12194e m44519a() {
        return new C12194e();
    }
}
