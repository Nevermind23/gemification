package p341ge.bog.mobilebank.model.account;

import java.util.Iterator;
import l50.C25832l;
import l50.C25836p;
import l50.C25838r;
import n50.C26371b;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel;
import p341ge.bog.mobilebank.eventbus.events.CreditCardsEvent;
import p341ge.bog.mobilebank.model.Bond;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.DepositBond;
import p341ge.bog.mobilebank.model.credit.CreditCardAccount;
import p341ge.bog.mobilebank.model.deposits.Deposit;
import p366bk.C10318g;
import p366bk.C10320i;

/* renamed from: ge.bog.mobilebank.model.account.ProductProperties */
public class ProductProperties {
    public static C25836p cardsAndDetailsUIModel;
    public static int invertBlackColor = C10318g.f28630R0;
    public static int invertWhiteColor = C10318g.f28625J0;
    public static int staticBlackColor = C10318g.color_black_solid_400;
    public static int staticWhiteColor = C10318g.f28647k1;
    public static int transparentColorId = C10318g.f28649t2;
    private int amountColorId;
    private int backgroundColorId = invertWhiteColor;
    private int backgroundImageId = -1;
    private int currencyBorderColorId;
    private int currencyColorId;
    private boolean hasCardsBorder = true;
    private int opacityColorId;
    private int ovalBorderColorId;
    private int ovalFillColorId;
    private int ovalTextColorId;
    private int titleColorId;

    /* renamed from: ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer */
    public static final class CardBackgroundInfoContainer {
        public boolean isLightText;
        public int resId;

        public CardBackgroundInfoContainer(int i, boolean z) {
            this.resId = i;
            this.isLightText = z;
        }
    }

    public ProductProperties() {
        int i = invertBlackColor;
        this.titleColorId = i;
        this.amountColorId = i;
        this.currencyBorderColorId = i;
        this.currencyColorId = i;
        this.ovalBorderColorId = i;
        this.ovalTextColorId = i;
        int i2 = C10318g.f28649t2;
        this.ovalFillColorId = i2;
        this.opacityColorId = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v69, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v71, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v73, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v75, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v77, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v79, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v81, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v83, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v85, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v87, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v89, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v91, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v93, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v95, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v97, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v99, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v101, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v103, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v105, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v107, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v109, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v111, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v113, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v115, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v117, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v119, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v121, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v123, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v125, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v127, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v129, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v131, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v133, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v135, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v137, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v139, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v141, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v143, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v145, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v147, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v149, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v151, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v153, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v155, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v157, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v159, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v161, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v163, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v165, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v167, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v169, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v171, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v173, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v175, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v177, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v179, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v181, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v183, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v185, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v187, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v189, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v191, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v193, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v195, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v197, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v199, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v201, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v203, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v205, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v207, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v209, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v211, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v213, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v215, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v217, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v219, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v221, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v223, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v225, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v227, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v229, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v231, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v233, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v235, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v237, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v239, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v241, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v243, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v245, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v247, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v249, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v251, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v253, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v255, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v257, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v259, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v261, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v263, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v265, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v267, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v269, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v271, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v273, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v275, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v277, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v279, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v281, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v283, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v285, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v287, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v289, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v291, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v293, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v295, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v297, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v299, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v301, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v303, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v305, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v307, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v309, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v311, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v313, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v315, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v317, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v319, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v321, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v323, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v325, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v327, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v329, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v331, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v333, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v335, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v337, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v339, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v341, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v343, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v345, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v347, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v349, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v351, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v353, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v355, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v357, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v359, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v361, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v363, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v365, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v367, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v369, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v371, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v373, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v375, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v377, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v379, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v381, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v383, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v385, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v387, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v389, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v391, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v393, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v395, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v397, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v399, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v401, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v403, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v405, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v407, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v409, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v411, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v413, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v415, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v417, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v419, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v421, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v423, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v425, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v427, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v429, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v431, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v433, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v435, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v437, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v439, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v441, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v443, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v445, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v447, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v449, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v451, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v453, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v455, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v457, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v459, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v461, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v463, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v465, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v467, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v469, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v471, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v473, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v475, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v477, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v479, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v481, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v483, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v485, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v487, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v489, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v491, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v493, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v495, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v497, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v499, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v501, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v503, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v505, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v507, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v509, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v511, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v513, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v515, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v517, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v519, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v521, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v523, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v525, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v527, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v529, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v531, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v533, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v535, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v537, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v539, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v541, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v543, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v545, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v547, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v549, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v551, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v553, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v555, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v557, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v559, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v561, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v563, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v565, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v567, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v569, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v571, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v573, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v575, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v577, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v579, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v581, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v583, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v585, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v587, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v589, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v591, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v593, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v595, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v597, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v599, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v601, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v603, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v605, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v607, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v609, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v611, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v613, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v615, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v617, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v619, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v621, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v623, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v625, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v627, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v629, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v631, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v633, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v635, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v637, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v639, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v641, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v643, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v645, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v647, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v649, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v651, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v653, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v655, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v657, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v659, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v661, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v663, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v665, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v667, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v669, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v671, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v673, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v675, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v677, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v679, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v681, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v683, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v684, resolved type: char} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p341ge.bog.mobilebank.model.account.ProductProperties.CardBackgroundInfoContainer getCardBackgroundInfo(java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x12d6
            int r1 = r4.hashCode()
            r2 = -1
            r3 = 1
            switch(r1) {
                case -2105993875: goto L_0x10c2;
                case -2082837391: goto L_0x10b6;
                case -2082826280: goto L_0x10aa;
                case -2082787419: goto L_0x109e;
                case -2082744022: goto L_0x1092;
                case -2082699420: goto L_0x1086;
                case -2082318451: goto L_0x107a;
                case -2082134900: goto L_0x106e;
                case -2071269983: goto L_0x1060;
                case -2040230936: goto L_0x1052;
                case -2026453258: goto L_0x1044;
                case -1967074984: goto L_0x1036;
                case -1944568740: goto L_0x1028;
                case -1944561789: goto L_0x101a;
                case -1935432671: goto L_0x100c;
                case -1929507980: goto L_0x0ffe;
                case -1929507973: goto L_0x0ff0;
                case -1929507959: goto L_0x0fe2;
                case -1929507777: goto L_0x0fd4;
                case -1921258662: goto L_0x0fc6;
                case -1912336700: goto L_0x0fb8;
                case -1856392744: goto L_0x0faa;
                case -1849454594: goto L_0x0f9c;
                case -1809663512: goto L_0x0f8e;
                case -1804146316: goto L_0x0f80;
                case -1789441888: goto L_0x0f72;
                case -1773206112: goto L_0x0f64;
                case -1690806294: goto L_0x0f56;
                case -1684355501: goto L_0x0f48;
                case -1640131879: goto L_0x0f3a;
                case -1640120070: goto L_0x0f2c;
                case -1635414237: goto L_0x0f1e;
                case -1611932273: goto L_0x0f10;
                case -1610999096: goto L_0x0f02;
                case -1609152054: goto L_0x0ef4;
                case -1597524141: goto L_0x0ee6;
                case -1581996577: goto L_0x0ed8;
                case -1562444102: goto L_0x0eca;
                case -1547128960: goto L_0x0ebc;
                case -1546816888: goto L_0x0eae;
                case -1533660160: goto L_0x0ea0;
                case -1519959107: goto L_0x0e92;
                case -1519683869: goto L_0x0e84;
                case -1469794721: goto L_0x0e76;
                case -1468346597: goto L_0x0e68;
                case -1467592605: goto L_0x0e5a;
                case -1466017960: goto L_0x0e4c;
                case -1455015037: goto L_0x0e3e;
                case -1452663158: goto L_0x0e30;
                case -1452661788: goto L_0x0e22;
                case -1330089508: goto L_0x0e14;
                case -1273644311: goto L_0x0e06;
                case -1273644309: goto L_0x0df8;
                case -1273635662: goto L_0x0dea;
                case -1268952064: goto L_0x0ddc;
                case -1267363944: goto L_0x0dce;
                case -1257774204: goto L_0x0dc0;
                case -1158125275: goto L_0x0db2;
                case -1158123353: goto L_0x0da4;
                case -1158109899: goto L_0x0d96;
                case -1136903612: goto L_0x0d88;
                case -1136903610: goto L_0x0d7a;
                case -1136903596: goto L_0x0d6c;
                case -1135961832: goto L_0x0d5e;
                case -1135961830: goto L_0x0d50;
                case -1135961816: goto L_0x0d42;
                case -1121585182: goto L_0x0d34;
                case -1073010031: goto L_0x0d26;
                case -1070145185: goto L_0x0d18;
                case -992425057: goto L_0x0d0a;
                case -991747501: goto L_0x0cfc;
                case -984620481: goto L_0x0cee;
                case -869693431: goto L_0x0ce0;
                case -869560999: goto L_0x0cd2;
                case -869305912: goto L_0x0cc4;
                case -857419347: goto L_0x0cb6;
                case -848263180: goto L_0x0ca8;
                case -827812628: goto L_0x0c9a;
                case -818975823: goto L_0x0c8c;
                case -818455233: goto L_0x0c7e;
                case -773203065: goto L_0x0c70;
                case -735383375: goto L_0x0c62;
                case -735383373: goto L_0x0c54;
                case -735383359: goto L_0x0c46;
                case -688850384: goto L_0x0c38;
                case -688269942: goto L_0x0c2a;
                case -682819865: goto L_0x0c1c;
                case -682819831: goto L_0x0c0e;
                case -633622528: goto L_0x0c00;
                case -633576514: goto L_0x0bf2;
                case -600769798: goto L_0x0be4;
                case -600769791: goto L_0x0bd6;
                case -600769777: goto L_0x0bc8;
                case -600769595: goto L_0x0bba;
                case -596438795: goto L_0x0bac;
                case -583401921: goto L_0x0b9e;
                case -560257749: goto L_0x0b90;
                case -560252239: goto L_0x0b82;
                case -560247579: goto L_0x0b74;
                case -560247578: goto L_0x0b66;
                case -556460714: goto L_0x0b58;
                case -551117553: goto L_0x0b4a;
                case -534315132: goto L_0x0b3c;
                case -529448843: goto L_0x0b2e;
                case -509673251: goto L_0x0b20;
                case -505204125: goto L_0x0b12;
                case -470875389: goto L_0x0b04;
                case -429603390: goto L_0x0af6;
                case -419782813: goto L_0x0ae8;
                case -413806077: goto L_0x0ada;
                case -372159425: goto L_0x0acc;
                case -372154901: goto L_0x0abe;
                case -372154899: goto L_0x0ab0;
                case -372154885: goto L_0x0aa2;
                case -372154622: goto L_0x0a94;
                case -372154620: goto L_0x0a86;
                case -372154606: goto L_0x0a78;
                case -372154436: goto L_0x0a6a;
                case -372154434: goto L_0x0a5c;
                case -372154420: goto L_0x0a4e;
                case -347555786: goto L_0x0a40;
                case -316020875: goto L_0x0a32;
                case -315527882: goto L_0x0a24;
                case -306885892: goto L_0x0a16;
                case -306885890: goto L_0x0a08;
                case -306885876: goto L_0x09fa;
                case -298824618: goto L_0x09ec;
                case -290402976: goto L_0x09de;
                case -290324074: goto L_0x09d0;
                case -287646955: goto L_0x09c2;
                case -268178255: goto L_0x09b4;
                case -268171304: goto L_0x09a6;
                case -266682095: goto L_0x0998;
                case -266681754: goto L_0x098a;
                case -245579805: goto L_0x097c;
                case -197572076: goto L_0x096e;
                case -197572069: goto L_0x0960;
                case -197572055: goto L_0x0952;
                case -197571873: goto L_0x0944;
                case -175761513: goto L_0x0936;
                case -172105656: goto L_0x0928;
                case -172105654: goto L_0x091a;
                case -172105640: goto L_0x090c;
                case -170943037: goto L_0x08fe;
                case -167853835: goto L_0x08f0;
                case -167549285: goto L_0x08e2;
                case -164920164: goto L_0x08d4;
                case -164915171: goto L_0x08c6;
                case -156758406: goto L_0x08b8;
                case -156758399: goto L_0x08aa;
                case -156758385: goto L_0x089c;
                case -156758203: goto L_0x088e;
                case -144920607: goto L_0x0880;
                case -143604037: goto L_0x0872;
                case -141901104: goto L_0x0864;
                case -141901097: goto L_0x0856;
                case -141901083: goto L_0x0848;
                case -141900901: goto L_0x083a;
                case -127362893: goto L_0x082c;
                case -124016378: goto L_0x081e;
                case -100951360: goto L_0x0810;
                case -97560735: goto L_0x0802;
                case -97217772: goto L_0x07f4;
                case -83091954: goto L_0x07e6;
                case -78072969: goto L_0x07d8;
                case -75215414: goto L_0x07ca;
                case -75215028: goto L_0x07bc;
                case -74937267: goto L_0x07ae;
                case -69723874: goto L_0x07a0;
                case -65831544: goto L_0x0792;
                case -63716619: goto L_0x0784;
                case -62242175: goto L_0x0776;
                case -52358537: goto L_0x0768;
                case -52298847: goto L_0x075a;
                case -21262728: goto L_0x074c;
                case -19379653: goto L_0x073e;
                case -11265648: goto L_0x0730;
                case -8650690: goto L_0x0722;
                case -8629588: goto L_0x0714;
                case -8602651: goto L_0x0706;
                case -5802161: goto L_0x06f8;
                case -5669729: goto L_0x06ea;
                case -5654120: goto L_0x06dc;
                case -5319847: goto L_0x06ce;
                case 259343: goto L_0x06c0;
                case 2106385: goto L_0x06b2;
                case 51990209: goto L_0x06a4;
                case 66937457: goto L_0x0696;
                case 67893384: goto L_0x0688;
                case 82499210: goto L_0x067a;
                case 82992203: goto L_0x066c;
                case 86308778: goto L_0x065e;
                case 86308834: goto L_0x0650;
                case 92106162: goto L_0x0642;
                case 97613393: goto L_0x0634;
                case 97623358: goto L_0x0626;
                case 110873130: goto L_0x0618;
                case 120474253: goto L_0x060a;
                case 120474254: goto L_0x05fc;
                case 120474499: goto L_0x05ee;
                case 120474749: goto L_0x05e0;
                case 120474750: goto L_0x05d2;
                case 120660745: goto L_0x05c4;
                case 124369544: goto L_0x05b6;
                case 129261525: goto L_0x05a8;
                case 138094507: goto L_0x059a;
                case 138173409: goto L_0x058c;
                case 145119750: goto L_0x057e;
                case 151493904: goto L_0x0570;
                case 174854245: goto L_0x0562;
                case 203741193: goto L_0x0554;
                case 215139454: goto L_0x0546;
                case 215140316: goto L_0x0538;
                case 221011194: goto L_0x052a;
                case 222758563: goto L_0x051c;
                case 223236158: goto L_0x050e;
                case 236674905: goto L_0x0500;
                case 256391827: goto L_0x04f2;
                case 256391829: goto L_0x04e4;
                case 256391843: goto L_0x04d6;
                case 276518562: goto L_0x04c8;
                case 296560786: goto L_0x04ba;
                case 320447116: goto L_0x04ac;
                case 323304671: goto L_0x049e;
                case 323305057: goto L_0x0490;
                case 357784194: goto L_0x0482;
                case 360265156: goto L_0x0474;
                case 394755391: goto L_0x0466;
                case 397044466: goto L_0x0458;
                case 400443284: goto L_0x044a;
                case 403869314: goto L_0x043c;
                case 413393407: goto L_0x042e;
                case 422816325: goto L_0x0420;
                case 422843363: goto L_0x0412;
                case 423295407: goto L_0x0404;
                case 426543262: goto L_0x03f6;
                case 440656203: goto L_0x03e8;
                case 487374165: goto L_0x03da;
                case 490735294: goto L_0x03cc;
                case 576076227: goto L_0x03be;
                case 592335202: goto L_0x03b0;
                case 670459543: goto L_0x03a2;
                case 670460963: goto L_0x0394;
                case 670474843: goto L_0x0386;
                case 684324756: goto L_0x0378;
                case 684324757: goto L_0x036a;
                case 695520812: goto L_0x035c;
                case 695520815: goto L_0x034e;
                case 695694345: goto L_0x0340;
                case 695885431: goto L_0x0332;
                case 695939129: goto L_0x0324;
                case 734828891: goto L_0x0316;
                case 847104527: goto L_0x0308;
                case 871918798: goto L_0x02fa;
                case 881636448: goto L_0x02ec;
                case 956620087: goto L_0x02de;
                case 976960723: goto L_0x02d0;
                case 999370753: goto L_0x02c2;
                case 1005512919: goto L_0x02b4;
                case 1024906963: goto L_0x02a6;
                case 1106218115: goto L_0x0298;
                case 1110073162: goto L_0x028a;
                case 1125319014: goto L_0x027c;
                case 1133348976: goto L_0x026e;
                case 1185237719: goto L_0x0260;
                case 1267384472: goto L_0x0252;
                case 1325798807: goto L_0x0244;
                case 1325798809: goto L_0x0236;
                case 1325807456: goto L_0x0228;
                case 1339235554: goto L_0x021a;
                case 1348377259: goto L_0x020c;
                case 1348377261: goto L_0x01fe;
                case 1348377275: goto L_0x01f0;
                case 1416332031: goto L_0x01e2;
                case 1461292851: goto L_0x01d4;
                case 1504189820: goto L_0x01c6;
                case 1506036862: goto L_0x01b8;
                case 1527663597: goto L_0x01aa;
                case 1601325689: goto L_0x019c;
                case 1602883414: goto L_0x018e;
                case 1604458485: goto L_0x0180;
                case 1609660504: goto L_0x0172;
                case 1615202023: goto L_0x0164;
                case 1615202214: goto L_0x0156;
                case 1615707930: goto L_0x0148;
                case 1615707982: goto L_0x013a;
                case 1615708470: goto L_0x012c;
                case 1615708661: goto L_0x011e;
                case 1619194113: goto L_0x0110;
                case 1649083368: goto L_0x0102;
                case 1734929554: goto L_0x00f4;
                case 1734929556: goto L_0x00e6;
                case 1734929570: goto L_0x00d8;
                case 1737755639: goto L_0x00ca;
                case 1745464181: goto L_0x00bc;
                case 1800210741: goto L_0x00ae;
                case 1800932927: goto L_0x00a0;
                case 1800934320: goto L_0x0092;
                case 1880243304: goto L_0x0084;
                case 1926183682: goto L_0x0077;
                case 1971900415: goto L_0x006a;
                case 2021129309: goto L_0x005d;
                case 2051834840: goto L_0x0050;
                case 2096908521: goto L_0x0043;
                case 2104694972: goto L_0x0036;
                case 2133449639: goto L_0x0029;
                case 2133449641: goto L_0x001c;
                case 2133449655: goto L_0x000f;
                default: goto L_0x000c;
            }
        L_0x000c:
            r4 = r2
            goto L_0x10cd
        L_0x000f:
            java.lang.String r1 = "MCPB_UNIVRSU"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0018
            goto L_0x000c
        L_0x0018:
            r4 = 307(0x133, float:4.3E-43)
            goto L_0x10cd
        L_0x001c:
            java.lang.String r1 = "MCPB_UNIVRSG"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0025
            goto L_0x000c
        L_0x0025:
            r4 = 306(0x132, float:4.29E-43)
            goto L_0x10cd
        L_0x0029:
            java.lang.String r1 = "MCPB_UNIVRSE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0032
            goto L_0x000c
        L_0x0032:
            r4 = 305(0x131, float:4.27E-43)
            goto L_0x10cd
        L_0x0036:
            java.lang.String r1 = "MCMCDCGELIND"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x003f
            goto L_0x000c
        L_0x003f:
            r4 = 304(0x130, float:4.26E-43)
            goto L_0x10cd
        L_0x0043:
            java.lang.String r1 = "GCMETI"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x004c
            goto L_0x000c
        L_0x004c:
            r4 = 303(0x12f, float:4.25E-43)
            goto L_0x10cd
        L_0x0050:
            java.lang.String r1 = "MCSOLO_WE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0059
            goto L_0x000c
        L_0x0059:
            r4 = 302(0x12e, float:4.23E-43)
            goto L_0x10cd
        L_0x005d:
            java.lang.String r1 = "VISAVS_GL_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0066
            goto L_0x000c
        L_0x0066:
            r4 = 301(0x12d, float:4.22E-43)
            goto L_0x10cd
        L_0x006a:
            java.lang.String r1 = "MCWHITEPLINS"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0073
            goto L_0x000c
        L_0x0073:
            r4 = 300(0x12c, float:4.2E-43)
            goto L_0x10cd
        L_0x0077:
            java.lang.String r1 = "MCPB_PLATINM"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0080
            goto L_0x000c
        L_0x0080:
            r4 = 299(0x12b, float:4.19E-43)
            goto L_0x10cd
        L_0x0084:
            java.lang.String r1 = "MCSILVER+"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x008e
            goto L_0x000c
        L_0x008e:
            r4 = 298(0x12a, float:4.18E-43)
            goto L_0x10cd
        L_0x0092:
            java.lang.String r1 = "VISASOLO_INT"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x009c
            goto L_0x000c
        L_0x009c:
            r4 = 297(0x129, float:4.16E-43)
            goto L_0x10cd
        L_0x00a0:
            java.lang.String r1 = "VISASOLO_G_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x00aa
            goto L_0x000c
        L_0x00aa:
            r4 = 296(0x128, float:4.15E-43)
            goto L_0x10cd
        L_0x00ae:
            java.lang.String r1 = "VISASOLOF_PL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x00b8
            goto L_0x000c
        L_0x00b8:
            r4 = 295(0x127, float:4.13E-43)
            goto L_0x10cd
        L_0x00bc:
            java.lang.String r1 = "MCCIR-MIKRO"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x00c6
            goto L_0x000c
        L_0x00c6:
            r4 = 294(0x126, float:4.12E-43)
            goto L_0x10cd
        L_0x00ca:
            java.lang.String r1 = "MCPB_PENSION"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x00d4
            goto L_0x000c
        L_0x00d4:
            r4 = 293(0x125, float:4.1E-43)
            goto L_0x10cd
        L_0x00d8:
            java.lang.String r1 = "VISAPB_UNIVRSU"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x00e2
            goto L_0x000c
        L_0x00e2:
            r4 = 292(0x124, float:4.09E-43)
            goto L_0x10cd
        L_0x00e6:
            java.lang.String r1 = "VISAPB_UNIVRSG"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x00f0
            goto L_0x000c
        L_0x00f0:
            r4 = 291(0x123, float:4.08E-43)
            goto L_0x10cd
        L_0x00f4:
            java.lang.String r1 = "VISAPB_UNIVRSE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x00fe
            goto L_0x000c
        L_0x00fe:
            r4 = 290(0x122, float:4.06E-43)
            goto L_0x10cd
        L_0x0102:
            java.lang.String r1 = "MCS-CIRRLOVE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x010c
            goto L_0x000c
        L_0x010c:
            r4 = 289(0x121, float:4.05E-43)
            goto L_0x10cd
        L_0x0110:
            java.lang.String r1 = "MCWM_WE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x011a
            goto L_0x000c
        L_0x011a:
            r4 = 288(0x120, float:4.04E-43)
            goto L_0x10cd
        L_0x011e:
            java.lang.String r1 = "MCST_ZG"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0128
            goto L_0x000c
        L_0x0128:
            r4 = 287(0x11f, float:4.02E-43)
            goto L_0x10cd
        L_0x012c:
            java.lang.String r1 = "MCST_TB"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0136
            goto L_0x000c
        L_0x0136:
            r4 = 286(0x11e, float:4.01E-43)
            goto L_0x10cd
        L_0x013a:
            java.lang.String r1 = "MCST_DJ"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0144
            goto L_0x000c
        L_0x0144:
            r4 = 285(0x11d, float:4.0E-43)
            goto L_0x10cd
        L_0x0148:
            java.lang.String r1 = "MCST_BT"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0152
            goto L_0x000c
        L_0x0152:
            r4 = 284(0x11c, float:3.98E-43)
            goto L_0x10cd
        L_0x0156:
            java.lang.String r1 = "MCSC_ZG"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0160
            goto L_0x000c
        L_0x0160:
            r4 = 283(0x11b, float:3.97E-43)
            goto L_0x10cd
        L_0x0164:
            java.lang.String r1 = "MCSC_TB"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x016e
            goto L_0x000c
        L_0x016e:
            r4 = 282(0x11a, float:3.95E-43)
            goto L_0x10cd
        L_0x0172:
            java.lang.String r1 = "MCMC_GL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x017c
            goto L_0x000c
        L_0x017c:
            r4 = 281(0x119, float:3.94E-43)
            goto L_0x10cd
        L_0x0180:
            java.lang.String r1 = "MCGOLD+"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x018a
            goto L_0x000c
        L_0x018a:
            r4 = 280(0x118, float:3.92E-43)
            goto L_0x10cd
        L_0x018e:
            java.lang.String r1 = "MCEXPCR"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0198
            goto L_0x000c
        L_0x0198:
            r4 = 279(0x117, float:3.91E-43)
            goto L_0x10cd
        L_0x019c:
            java.lang.String r1 = "MCDCGEL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x01a6
            goto L_0x000c
        L_0x01a6:
            r4 = 278(0x116, float:3.9E-43)
            goto L_0x10cd
        L_0x01aa:
            java.lang.String r1 = "VISAPB_PLATINM"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x01b4
            goto L_0x000c
        L_0x01b4:
            r4 = 277(0x115, float:3.88E-43)
            goto L_0x10cd
        L_0x01b8:
            java.lang.String r1 = "VISASF-ELOVE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x01c2
            goto L_0x000c
        L_0x01c2:
            r4 = 276(0x114, float:3.87E-43)
            goto L_0x10cd
        L_0x01c6:
            java.lang.String r1 = "VISASF-CLOVE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x01d0
            goto L_0x000c
        L_0x01d0:
            r4 = 275(0x113, float:3.85E-43)
            goto L_0x10cd
        L_0x01d4:
            java.lang.String r1 = "VISAGOLD-PW"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x01de
            goto L_0x000c
        L_0x01de:
            r4 = 274(0x112, float:3.84E-43)
            goto L_0x10cd
        L_0x01e2:
            java.lang.String r1 = "MCCLASSIC_PL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x01ec
            goto L_0x000c
        L_0x01ec:
            r4 = 273(0x111, float:3.83E-43)
            goto L_0x10cd
        L_0x01f0:
            java.lang.String r1 = "AMEXAMEXPLTU"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x01fa
            goto L_0x000c
        L_0x01fa:
            r4 = 272(0x110, float:3.81E-43)
            goto L_0x10cd
        L_0x01fe:
            java.lang.String r1 = "AMEXAMEXPLTG"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0208
            goto L_0x000c
        L_0x0208:
            r4 = 271(0x10f, float:3.8E-43)
            goto L_0x10cd
        L_0x020c:
            java.lang.String r1 = "AMEXAMEXPLTE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0216
            goto L_0x000c
        L_0x0216:
            r4 = 270(0x10e, float:3.78E-43)
            goto L_0x10cd
        L_0x021a:
            java.lang.String r1 = "VISAPB_PENSION"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0224
            goto L_0x000c
        L_0x0224:
            r4 = 269(0x10d, float:3.77E-43)
            goto L_0x10cd
        L_0x0228:
            java.lang.String r1 = "VISAVS_SOLX_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0232
            goto L_0x000c
        L_0x0232:
            r4 = 268(0x10c, float:3.76E-43)
            goto L_0x10cd
        L_0x0236:
            java.lang.String r1 = "VISAVS_SOLO_X"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0240
            goto L_0x000c
        L_0x0240:
            r4 = 267(0x10b, float:3.74E-43)
            goto L_0x10cd
        L_0x0244:
            java.lang.String r1 = "VISAVS_SOLO_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x024e
            goto L_0x000c
        L_0x024e:
            r4 = 266(0x10a, float:3.73E-43)
            goto L_0x10cd
        L_0x0252:
            java.lang.String r1 = "MCWM_WE_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x025c
            goto L_0x000c
        L_0x025c:
            r4 = 265(0x109, float:3.71E-43)
            goto L_0x10cd
        L_0x0260:
            java.lang.String r1 = "AMEXDPLUSV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x026a
            goto L_0x000c
        L_0x026a:
            r4 = 264(0x108, float:3.7E-43)
            goto L_0x10cd
        L_0x026e:
            java.lang.String r1 = "MCCREDIT-GEL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0278
            goto L_0x000c
        L_0x0278:
            r4 = 263(0x107, float:3.69E-43)
            goto L_0x10cd
        L_0x027c:
            java.lang.String r1 = "MCCLASIC_PLV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0286
            goto L_0x000c
        L_0x0286:
            r4 = 262(0x106, float:3.67E-43)
            goto L_0x10cd
        L_0x028a:
            java.lang.String r1 = "MCWHPLUS+"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0294
            goto L_0x000c
        L_0x0294:
            r4 = 261(0x105, float:3.66E-43)
            goto L_0x10cd
        L_0x0298:
            java.lang.String r1 = "VISACLAS-LOVE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x02a2
            goto L_0x000c
        L_0x02a2:
            r4 = 260(0x104, float:3.64E-43)
            goto L_0x10cd
        L_0x02a6:
            java.lang.String r1 = "MCCIRRLOVEIN"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x02b0
            goto L_0x000c
        L_0x02b0:
            r4 = 259(0x103, float:3.63E-43)
            goto L_0x10cd
        L_0x02b4:
            java.lang.String r1 = "VISACLAS-IPO"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x02be
            goto L_0x000c
        L_0x02be:
            r4 = 258(0x102, float:3.62E-43)
            goto L_0x10cd
        L_0x02c2:
            java.lang.String r1 = "MCWHITEPLINS "
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x02cc
            goto L_0x000c
        L_0x02cc:
            r4 = 257(0x101, float:3.6E-43)
            goto L_0x10cd
        L_0x02d0:
            java.lang.String r1 = "MCMCSTANCLV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x02da
            goto L_0x000c
        L_0x02da:
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x10cd
        L_0x02de:
            java.lang.String r1 = "MCCLASSIC_PLV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x02e8
            goto L_0x000c
        L_0x02e8:
            r4 = 255(0xff, float:3.57E-43)
            goto L_0x10cd
        L_0x02ec:
            java.lang.String r1 = "VISASOL_VGLDPW"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x02f6
            goto L_0x000c
        L_0x02f6:
            r4 = 254(0xfe, float:3.56E-43)
            goto L_0x10cd
        L_0x02fa:
            java.lang.String r1 = "MCIPO-STLOVE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0304
            goto L_0x000c
        L_0x0304:
            r4 = 253(0xfd, float:3.55E-43)
            goto L_0x10cd
        L_0x0308:
            java.lang.String r1 = "AMEXDPLUSINS"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0312
            goto L_0x000c
        L_0x0312:
            r4 = 252(0xfc, float:3.53E-43)
            goto L_0x10cd
        L_0x0316:
            java.lang.String r1 = "VISACREDIT-GEL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0320
            goto L_0x000c
        L_0x0320:
            r4 = 251(0xfb, float:3.52E-43)
            goto L_0x10cd
        L_0x0324:
            java.lang.String r1 = "MCMC_UNIV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x032e
            goto L_0x000c
        L_0x032e:
            r4 = 250(0xfa, float:3.5E-43)
            goto L_0x10cd
        L_0x0332:
            java.lang.String r1 = "MCMC_STN1"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x033c
            goto L_0x000c
        L_0x033c:
            r4 = 249(0xf9, float:3.49E-43)
            goto L_0x10cd
        L_0x0340:
            java.lang.String r1 = "MCMC_MGRN"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x034a
            goto L_0x000c
        L_0x034a:
            r4 = 248(0xf8, float:3.48E-43)
            goto L_0x10cd
        L_0x034e:
            java.lang.String r1 = "MCMC_GL_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0358
            goto L_0x000c
        L_0x0358:
            r4 = 247(0xf7, float:3.46E-43)
            goto L_0x10cd
        L_0x035c:
            java.lang.String r1 = "MCMC_GL_S"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0366
            goto L_0x000c
        L_0x0366:
            r4 = 246(0xf6, float:3.45E-43)
            goto L_0x10cd
        L_0x036a:
            java.lang.String r1 = "MCMCSCRS2"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0374
            goto L_0x000c
        L_0x0374:
            r4 = 245(0xf5, float:3.43E-43)
            goto L_0x10cd
        L_0x0378:
            java.lang.String r1 = "MCMCSCRS1"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0382
            goto L_0x000c
        L_0x0382:
            r4 = 244(0xf4, float:3.42E-43)
            goto L_0x10cd
        L_0x0386:
            java.lang.String r1 = "MCMCDCUSD"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0390
            goto L_0x000c
        L_0x0390:
            r4 = 243(0xf3, float:3.4E-43)
            goto L_0x10cd
        L_0x0394:
            java.lang.String r1 = "MCMCDCGEL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x039e
            goto L_0x000c
        L_0x039e:
            r4 = 242(0xf2, float:3.39E-43)
            goto L_0x10cd
        L_0x03a2:
            java.lang.String r1 = "MCMCDCEUR"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x03ac
            goto L_0x000c
        L_0x03ac:
            r4 = 241(0xf1, float:3.38E-43)
            goto L_0x10cd
        L_0x03b0:
            java.lang.String r1 = "MCONECARDCON"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x03ba
            goto L_0x000c
        L_0x03ba:
            r4 = 240(0xf0, float:3.36E-43)
            goto L_0x10cd
        L_0x03be:
            java.lang.String r1 = "MCARMYCARD"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x03c8
            goto L_0x000c
        L_0x03c8:
            r4 = 239(0xef, float:3.35E-43)
            goto L_0x10cd
        L_0x03cc:
            java.lang.String r1 = "AMEXDPLUSSOLO"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x03d6
            goto L_0x000c
        L_0x03d6:
            r4 = 238(0xee, float:3.34E-43)
            goto L_0x10cd
        L_0x03da:
            java.lang.String r1 = "VISAINFINITE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x03e4
            goto L_0x000c
        L_0x03e4:
            r4 = 237(0xed, float:3.32E-43)
            goto L_0x10cd
        L_0x03e8:
            java.lang.String r1 = "MCSTAND_CHIP"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x03f2
            goto L_0x000c
        L_0x03f2:
            r4 = 236(0xec, float:3.31E-43)
            goto L_0x10cd
        L_0x03f6:
            java.lang.String r1 = "VISASOLF_GLDPW"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0400
            goto L_0x000c
        L_0x0400:
            r4 = 235(0xeb, float:3.3E-43)
            goto L_0x10cd
        L_0x0404:
            java.lang.String r1 = "MCSOLO_WE_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x040e
            goto L_0x000c
        L_0x040e:
            r4 = 234(0xea, float:3.28E-43)
            goto L_0x10cd
        L_0x0412:
            java.lang.String r1 = "MCSOLO_G_ST"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x041c
            goto L_0x000c
        L_0x041c:
            r4 = 233(0xe9, float:3.27E-43)
            goto L_0x10cd
        L_0x0420:
            java.lang.String r1 = "MCSOLO_GCON"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x042a
            goto L_0x000c
        L_0x042a:
            r4 = 232(0xe8, float:3.25E-43)
            goto L_0x10cd
        L_0x042e:
            java.lang.String r1 = "MCSTANDARDCO"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0438
            goto L_0x000c
        L_0x0438:
            r4 = 231(0xe7, float:3.24E-43)
            goto L_0x10cd
        L_0x043c:
            java.lang.String r1 = "MCIPO-CIRLOV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0446
            goto L_0x000c
        L_0x0446:
            r4 = 230(0xe6, float:3.22E-43)
            goto L_0x10cd
        L_0x044a:
            java.lang.String r1 = "MCSOLOF_CON"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0454
            goto L_0x000c
        L_0x0454:
            r4 = 229(0xe5, float:3.21E-43)
            goto L_0x10cd
        L_0x0458:
            java.lang.String r1 = "MCSOLOCI_WE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0462
            goto L_0x000c
        L_0x0462:
            r4 = 228(0xe4, float:3.2E-43)
            goto L_0x10cd
        L_0x0466:
            java.lang.String r1 = "MCSTAND-LOVE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0470
            goto L_0x000c
        L_0x0470:
            r4 = 227(0xe3, float:3.18E-43)
            goto L_0x10cd
        L_0x0474:
            java.lang.String r1 = "VISAVGOLD-MCR"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x047e
            goto L_0x000c
        L_0x047e:
            r4 = 226(0xe2, float:3.17E-43)
            goto L_0x10cd
        L_0x0482:
            java.lang.String r1 = "MC_CLASSIC+"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x048c
            goto L_0x000c
        L_0x048c:
            r4 = 225(0xe1, float:3.15E-43)
            goto L_0x10cd
        L_0x0490:
            java.lang.String r1 = "MCCLAS-CREPW"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x049a
            goto L_0x000c
        L_0x049a:
            r4 = 224(0xe0, float:3.14E-43)
            goto L_0x10cd
        L_0x049e:
            java.lang.String r1 = "MCCLAS-CREDI"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x04a8
            goto L_0x000c
        L_0x04a8:
            r4 = 223(0xdf, float:3.12E-43)
            goto L_0x10cd
        L_0x04ac:
            java.lang.String r1 = "MCCRED-GELPW"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x04b6
            goto L_0x000c
        L_0x04b6:
            r4 = 222(0xde, float:3.11E-43)
            goto L_0x10cd
        L_0x04ba:
            java.lang.String r1 = "VISAELECCHIP"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x04c4
            goto L_0x000c
        L_0x04c4:
            r4 = 221(0xdd, float:3.1E-43)
            goto L_0x10cd
        L_0x04c8:
            java.lang.String r1 = "VISAELE-LOVE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x04d2
            goto L_0x000c
        L_0x04d2:
            r4 = 220(0xdc, float:3.08E-43)
            goto L_0x10cd
        L_0x04d6:
            java.lang.String r1 = "MCPB_WELITU"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x04e0
            goto L_0x000c
        L_0x04e0:
            r4 = 219(0xdb, float:3.07E-43)
            goto L_0x10cd
        L_0x04e4:
            java.lang.String r1 = "MCPB_WELITG"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x04ee
            goto L_0x000c
        L_0x04ee:
            r4 = 218(0xda, float:3.05E-43)
            goto L_0x10cd
        L_0x04f2:
            java.lang.String r1 = "MCPB_WELITE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x04fc
            goto L_0x000c
        L_0x04fc:
            r4 = 217(0xd9, float:3.04E-43)
            goto L_0x10cd
        L_0x0500:
            java.lang.String r1 = "VS_CLS_ILS"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x050a
            goto L_0x000c
        L_0x050a:
            r4 = 216(0xd8, float:3.03E-43)
            goto L_0x10cd
        L_0x050e:
            java.lang.String r1 = "MCSOLO_G_MCV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0518
            goto L_0x000c
        L_0x0518:
            r4 = 215(0xd7, float:3.01E-43)
            goto L_0x10cd
        L_0x051c:
            java.lang.String r1 = "MCSOLO_GOLDM"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0526
            goto L_0x000c
        L_0x0526:
            r4 = 214(0xd6, float:3.0E-43)
            goto L_0x10cd
        L_0x052a:
            java.lang.String r1 = "MCMCSTANCLOF"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0534
            goto L_0x000c
        L_0x0534:
            r4 = 213(0xd5, float:2.98E-43)
            goto L_0x10cd
        L_0x0538:
            java.lang.String r1 = "VISAINFINITE_F"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0542
            goto L_0x000c
        L_0x0542:
            r4 = 212(0xd4, float:2.97E-43)
            goto L_0x10cd
        L_0x0546:
            java.lang.String r1 = "VISAINFINITECL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0550
            goto L_0x000c
        L_0x0550:
            r4 = 211(0xd3, float:2.96E-43)
            goto L_0x10cd
        L_0x0554:
            java.lang.String r1 = "VISAVS_CLS"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x055e
            goto L_0x000c
        L_0x055e:
            r4 = 210(0xd2, float:2.94E-43)
            goto L_0x10cd
        L_0x0562:
            java.lang.String r1 = "VISAVELPAYWAVE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x056c
            goto L_0x000c
        L_0x056c:
            r4 = 209(0xd1, float:2.93E-43)
            goto L_0x10cd
        L_0x0570:
            java.lang.String r1 = "MCS-STANLOVE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x057a
            goto L_0x000c
        L_0x057a:
            r4 = 208(0xd0, float:2.91E-43)
            goto L_0x10cd
        L_0x057e:
            java.lang.String r1 = "VISAVS_GL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0588
            goto L_0x000c
        L_0x0588:
            r4 = 207(0xcf, float:2.9E-43)
            goto L_0x10cd
        L_0x058c:
            java.lang.String r1 = "MCPB_SALARY"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0596
            goto L_0x000c
        L_0x0596:
            r4 = 206(0xce, float:2.89E-43)
            goto L_0x10cd
        L_0x059a:
            java.lang.String r1 = "MCPB_SAILOR"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x05a4
            goto L_0x000c
        L_0x05a4:
            r4 = 205(0xcd, float:2.87E-43)
            goto L_0x10cd
        L_0x05a8:
            java.lang.String r1 = "MCPB_DEBIT"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x05b2
            goto L_0x000c
        L_0x05b2:
            r4 = 204(0xcc, float:2.86E-43)
            goto L_0x10cd
        L_0x05b6:
            java.lang.String r1 = "MCCIRR-ARTSI"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x05c0
            goto L_0x000c
        L_0x05c0:
            r4 = 203(0xcb, float:2.84E-43)
            goto L_0x10cd
        L_0x05c4:
            java.lang.String r1 = "MCMCDEBITCL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x05ce
            goto L_0x000c
        L_0x05ce:
            r4 = 202(0xca, float:2.83E-43)
            goto L_0x10cd
        L_0x05d2:
            java.lang.String r1 = "MCMCDEBCLR2"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x05dc
            goto L_0x000c
        L_0x05dc:
            r4 = 201(0xc9, float:2.82E-43)
            goto L_0x10cd
        L_0x05e0:
            java.lang.String r1 = "MCMCDEBCLR1"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x05ea
            goto L_0x000c
        L_0x05ea:
            r4 = 200(0xc8, float:2.8E-43)
            goto L_0x10cd
        L_0x05ee:
            java.lang.String r1 = "MCMCDEBCLIN"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x05f8
            goto L_0x000c
        L_0x05f8:
            r4 = 199(0xc7, float:2.79E-43)
            goto L_0x10cd
        L_0x05fc:
            java.lang.String r1 = "MCMCDEBCLB2"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0606
            goto L_0x000c
        L_0x0606:
            r4 = 198(0xc6, float:2.77E-43)
            goto L_0x10cd
        L_0x060a:
            java.lang.String r1 = "MCMCDEBCLB1"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0614
            goto L_0x000c
        L_0x0614:
            r4 = 197(0xc5, float:2.76E-43)
            goto L_0x10cd
        L_0x0618:
            java.lang.String r1 = "MCPB_SETTLMT"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0622
            goto L_0x000c
        L_0x0622:
            r4 = 196(0xc4, float:2.75E-43)
            goto L_0x10cd
        L_0x0626:
            java.lang.String r1 = "MCMC_STYLE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0630
            goto L_0x000c
        L_0x0630:
            r4 = 195(0xc3, float:2.73E-43)
            goto L_0x10cd
        L_0x0634:
            java.lang.String r1 = "MCMC_STN_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x063e
            goto L_0x000c
        L_0x063e:
            r4 = 194(0xc2, float:2.72E-43)
            goto L_0x10cd
        L_0x0642:
            java.lang.String r1 = "MCMC_MUSIC"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x064c
            goto L_0x000c
        L_0x064c:
            r4 = 193(0xc1, float:2.7E-43)
            goto L_0x10cd
        L_0x0650:
            java.lang.String r1 = "MCMC_GL_V1"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x065a
            goto L_0x000c
        L_0x065a:
            r4 = 192(0xc0, float:2.69E-43)
            goto L_0x10cd
        L_0x065e:
            java.lang.String r1 = "MCMC_GL_SV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0668
            goto L_0x000c
        L_0x0668:
            r4 = 191(0xbf, float:2.68E-43)
            goto L_0x10cd
        L_0x066c:
            java.lang.String r1 = "MCPB_INTERNT"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0676
            goto L_0x000c
        L_0x0676:
            r4 = 190(0xbe, float:2.66E-43)
            goto L_0x10cd
        L_0x067a:
            java.lang.String r1 = "MCPB_INSTANT"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0684
            goto L_0x000c
        L_0x0684:
            r4 = 189(0xbd, float:2.65E-43)
            goto L_0x10cd
        L_0x0688:
            java.lang.String r1 = "MCMCDCGELIN"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0692
            goto L_0x000c
        L_0x0692:
            r4 = 188(0xbc, float:2.63E-43)
            goto L_0x10cd
        L_0x0696:
            java.lang.String r1 = "MCEXPRESS+"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x06a0
            goto L_0x000c
        L_0x06a0:
            r4 = 187(0xbb, float:2.62E-43)
            goto L_0x10cd
        L_0x06a4:
            java.lang.String r1 = "MCSF-STANLOV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x06ae
            goto L_0x000c
        L_0x06ae:
            r4 = 186(0xba, float:2.6E-43)
            goto L_0x10cd
        L_0x06b2:
            java.lang.String r1 = "VISAIPO-ELOVE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x06bc
            goto L_0x000c
        L_0x06bc:
            r4 = 185(0xb9, float:2.59E-43)
            goto L_0x10cd
        L_0x06c0:
            java.lang.String r1 = "VISAIPO-CLOVE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x06ca
            goto L_0x000c
        L_0x06ca:
            r4 = 184(0xb8, float:2.58E-43)
            goto L_0x10cd
        L_0x06ce:
            java.lang.String r1 = "VISASOLO_SGNT"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x06d8
            goto L_0x000c
        L_0x06d8:
            r4 = 183(0xb7, float:2.56E-43)
            goto L_0x10cd
        L_0x06dc:
            java.lang.String r1 = "VISASOLO_G_ST"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x06e6
            goto L_0x000c
        L_0x06e6:
            r4 = 182(0xb6, float:2.55E-43)
            goto L_0x10cd
        L_0x06ea:
            java.lang.String r1 = "VISASOLO_GOLD"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x06f4
            goto L_0x000c
        L_0x06f4:
            r4 = 181(0xb5, float:2.54E-43)
            goto L_0x10cd
        L_0x06f8:
            java.lang.String r1 = "VISASOLO_CARD"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0702
            goto L_0x000c
        L_0x0702:
            r4 = 180(0xb4, float:2.52E-43)
            goto L_0x10cd
        L_0x0706:
            java.lang.String r1 = "MCGOLD_PL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0710
            goto L_0x000c
        L_0x0710:
            r4 = 179(0xb3, float:2.51E-43)
            goto L_0x10cd
        L_0x0714:
            java.lang.String r1 = "MCGOLDCON"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x071e
            goto L_0x000c
        L_0x071e:
            r4 = 178(0xb2, float:2.5E-43)
            goto L_0x10cd
        L_0x0722:
            java.lang.String r1 = "MCGOLD-PW"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x072c
            goto L_0x000c
        L_0x072c:
            r4 = 177(0xb1, float:2.48E-43)
            goto L_0x10cd
        L_0x0730:
            java.lang.String r1 = "VISAELE-STAFF"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x073a
            goto L_0x000c
        L_0x073a:
            r4 = 176(0xb0, float:2.47E-43)
            goto L_0x10cd
        L_0x073e:
            java.lang.String r1 = "MCST_GIRL_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0748
            goto L_0x000c
        L_0x0748:
            r4 = 175(0xaf, float:2.45E-43)
            goto L_0x10cd
        L_0x074c:
            java.lang.String r1 = "MCGOLD-IPOPW"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0756
            goto L_0x000c
        L_0x0756:
            r4 = 174(0xae, float:2.44E-43)
            goto L_0x10cd
        L_0x075a:
            java.lang.String r1 = "VISAEXPELEC"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0764
            goto L_0x000c
        L_0x0764:
            r4 = 173(0xad, float:2.42E-43)
            goto L_0x10cd
        L_0x0768:
            java.lang.String r1 = "VISAEXPCLAS"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0772
            goto L_0x000c
        L_0x0772:
            r4 = 172(0xac, float:2.41E-43)
            goto L_0x10cd
        L_0x0776:
            java.lang.String r1 = "MCST_EYES_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0780
            goto L_0x000c
        L_0x0780:
            r4 = 171(0xab, float:2.4E-43)
            goto L_0x10cd
        L_0x0784:
            java.lang.String r1 = "VISAONECARD"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x078e
            goto L_0x000c
        L_0x078e:
            r4 = 170(0xaa, float:2.38E-43)
            goto L_0x10cd
        L_0x0792:
            java.lang.String r1 = "MC_SOLX_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x079c
            goto L_0x000c
        L_0x079c:
            r4 = 169(0xa9, float:2.37E-43)
            goto L_0x10cd
        L_0x07a0:
            java.lang.String r1 = "VISACLAS-IPOPW"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x07aa
            goto L_0x000c
        L_0x07aa:
            r4 = 168(0xa8, float:2.35E-43)
            goto L_0x10cd
        L_0x07ae:
            java.lang.String r1 = "MCWHITEPLUS"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x07b8
            goto L_0x000c
        L_0x07b8:
            r4 = 167(0xa7, float:2.34E-43)
            goto L_0x10cd
        L_0x07bc:
            java.lang.String r1 = "VISACLAS-CREPW"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x07c6
            goto L_0x000c
        L_0x07c6:
            r4 = 166(0xa6, float:2.33E-43)
            goto L_0x10cd
        L_0x07ca:
            java.lang.String r1 = "VISACLAS-CREDI"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x07d4
            goto L_0x000c
        L_0x07d4:
            r4 = 165(0xa5, float:2.31E-43)
            goto L_0x10cd
        L_0x07d8:
            java.lang.String r1 = "VISACRED-GELPW"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x07e2
            goto L_0x000c
        L_0x07e2:
            r4 = 164(0xa4, float:2.3E-43)
            goto L_0x10cd
        L_0x07e6:
            java.lang.String r1 = "VISAST_TARGET"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x07f0
            goto L_0x000c
        L_0x07f0:
            r4 = 163(0xa3, float:2.28E-43)
            goto L_0x10cd
        L_0x07f4:
            java.lang.String r1 = "MCEXPRES_PLV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x07fe
            goto L_0x000c
        L_0x07fe:
            r4 = 162(0xa2, float:2.27E-43)
            goto L_0x10cd
        L_0x0802:
            java.lang.String r1 = "MCEXPRESS_PL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x080c
            goto L_0x000c
        L_0x080c:
            r4 = 161(0xa1, float:2.26E-43)
            goto L_0x10cd
        L_0x0810:
            java.lang.String r1 = "MCPB_JUNIOR"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x081a
            goto L_0x000c
        L_0x081a:
            r4 = 160(0xa0, float:2.24E-43)
            goto L_0x10cd
        L_0x081e:
            java.lang.String r1 = "MCMGOLD-MCR"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0828
            goto L_0x000c
        L_0x0828:
            r4 = 159(0x9f, float:2.23E-43)
            goto L_0x10cd
        L_0x082c:
            java.lang.String r1 = "MCST_TB_HR"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0836
            goto L_0x000c
        L_0x0836:
            r4 = 158(0x9e, float:2.21E-43)
            goto L_0x10cd
        L_0x083a:
            java.lang.String r1 = "MCST_DJ_HR"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0844
            goto L_0x000c
        L_0x0844:
            r4 = 157(0x9d, float:2.2E-43)
            goto L_0x10cd
        L_0x0848:
            java.lang.String r1 = "MCST_DJ_BV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0852
            goto L_0x000c
        L_0x0852:
            r4 = 156(0x9c, float:2.19E-43)
            goto L_0x10cd
        L_0x0856:
            java.lang.String r1 = "MCST_DJ_BH"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0860
            goto L_0x000c
        L_0x0860:
            r4 = 155(0x9b, float:2.17E-43)
            goto L_0x10cd
        L_0x0864:
            java.lang.String r1 = "MCST_DJ_BA"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x086e
            goto L_0x000c
        L_0x086e:
            r4 = 154(0x9a, float:2.16E-43)
            goto L_0x10cd
        L_0x0872:
            java.lang.String r1 = "MCST_BOY_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x087c
            goto L_0x000c
        L_0x087c:
            r4 = 153(0x99, float:2.14E-43)
            goto L_0x10cd
        L_0x0880:
            java.lang.String r1 = "MCST_ABS_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x088a
            goto L_0x000c
        L_0x088a:
            r4 = 152(0x98, float:2.13E-43)
            goto L_0x10cd
        L_0x088e:
            java.lang.String r1 = "MCST_BOY_HR"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0898
            goto L_0x000c
        L_0x0898:
            r4 = 151(0x97, float:2.12E-43)
            goto L_0x10cd
        L_0x089c:
            java.lang.String r1 = "MCST_BOY_BV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x08a6
            goto L_0x000c
        L_0x08a6:
            r4 = 150(0x96, float:2.1E-43)
            goto L_0x10cd
        L_0x08aa:
            java.lang.String r1 = "MCST_BOY_BH"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x08b4
            goto L_0x000c
        L_0x08b4:
            r4 = 149(0x95, float:2.09E-43)
            goto L_0x10cd
        L_0x08b8:
            java.lang.String r1 = "MCST_BOY_BA"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x08c2
            goto L_0x000c
        L_0x08c2:
            r4 = 148(0x94, float:2.07E-43)
            goto L_0x10cd
        L_0x08c6:
            java.lang.String r1 = "VISASOLO_SGNTV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x08d0
            goto L_0x000c
        L_0x08d0:
            r4 = 147(0x93, float:2.06E-43)
            goto L_0x10cd
        L_0x08d4:
            java.lang.String r1 = "VISASOLO_SGINT"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x08de
            goto L_0x000c
        L_0x08de:
            r4 = 146(0x92, float:2.05E-43)
            goto L_0x10cd
        L_0x08e2:
            java.lang.String r1 = "VISASOLO_PLATI"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x08ec
            goto L_0x000c
        L_0x08ec:
            r4 = 145(0x91, float:2.03E-43)
            goto L_0x10cd
        L_0x08f0:
            java.lang.String r1 = "VISASOLO_PAYWC"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x08fa
            goto L_0x000c
        L_0x08fa:
            r4 = 144(0x90, float:2.02E-43)
            goto L_0x10cd
        L_0x08fe:
            java.lang.String r1 = "AMEXGLG"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0908
            goto L_0x000c
        L_0x0908:
            r4 = 143(0x8f, float:2.0E-43)
            goto L_0x10cd
        L_0x090c:
            java.lang.String r1 = "VISAPB_WELITU"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0916
            goto L_0x000c
        L_0x0916:
            r4 = 142(0x8e, float:1.99E-43)
            goto L_0x10cd
        L_0x091a:
            java.lang.String r1 = "VISAPB_WELITG"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0924
            goto L_0x000c
        L_0x0924:
            r4 = 141(0x8d, float:1.98E-43)
            goto L_0x10cd
        L_0x0928:
            java.lang.String r1 = "VISAPB_WELITE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0932
            goto L_0x000c
        L_0x0932:
            r4 = 140(0x8c, float:1.96E-43)
            goto L_0x10cd
        L_0x0936:
            java.lang.String r1 = "VISASOLO_GOLDV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0940
            goto L_0x000c
        L_0x0940:
            r4 = 139(0x8b, float:1.95E-43)
            goto L_0x10cd
        L_0x0944:
            java.lang.String r1 = "MCST_ABS_HR"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x094e
            goto L_0x000c
        L_0x094e:
            r4 = 138(0x8a, float:1.93E-43)
            goto L_0x10cd
        L_0x0952:
            java.lang.String r1 = "MCST_ABS_BV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x095c
            goto L_0x000c
        L_0x095c:
            r4 = 137(0x89, float:1.92E-43)
            goto L_0x10cd
        L_0x0960:
            java.lang.String r1 = "MCST_ABS_BH"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x096a
            goto L_0x000c
        L_0x096a:
            r4 = 136(0x88, float:1.9E-43)
            goto L_0x10cd
        L_0x096e:
            java.lang.String r1 = "MCST_ABS_BA"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0978
            goto L_0x000c
        L_0x0978:
            r4 = 135(0x87, float:1.89E-43)
            goto L_0x10cd
        L_0x097c:
            java.lang.String r1 = "MCMCSTANCL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0986
            goto L_0x000c
        L_0x0986:
            r4 = 134(0x86, float:1.88E-43)
            goto L_0x10cd
        L_0x098a:
            java.lang.String r1 = "MCGOLD_PWV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0994
            goto L_0x000c
        L_0x0994:
            r4 = 133(0x85, float:1.86E-43)
            goto L_0x10cd
        L_0x0998:
            java.lang.String r1 = "MCGOLD_PLV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x09a2
            goto L_0x000c
        L_0x09a2:
            r4 = 132(0x84, float:1.85E-43)
            goto L_0x10cd
        L_0x09a6:
            java.lang.String r1 = "MCGOLD-PWV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x09b0
            goto L_0x000c
        L_0x09b0:
            r4 = 131(0x83, float:1.84E-43)
            goto L_0x10cd
        L_0x09b4:
            java.lang.String r1 = "MCGOLD-IPO"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x09be
            goto L_0x000c
        L_0x09be:
            r4 = 130(0x82, float:1.82E-43)
            goto L_0x10cd
        L_0x09c2:
            java.lang.String r1 = "VISAPB_SETTLMT"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x09cc
            goto L_0x000c
        L_0x09cc:
            r4 = 129(0x81, float:1.81E-43)
            goto L_0x10cd
        L_0x09d0:
            java.lang.String r1 = "VISAPB_SALARY"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x09da
            goto L_0x000c
        L_0x09da:
            r4 = 128(0x80, float:1.794E-43)
            goto L_0x10cd
        L_0x09de:
            java.lang.String r1 = "VISAPB_SAILOR"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x09e8
            goto L_0x000c
        L_0x09e8:
            r4 = 127(0x7f, float:1.78E-43)
            goto L_0x10cd
        L_0x09ec:
            java.lang.String r1 = "MCONECARDV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x09f6
            goto L_0x000c
        L_0x09f6:
            r4 = 126(0x7e, float:1.77E-43)
            goto L_0x10cd
        L_0x09fa:
            java.lang.String r1 = "MCPB_CONTRU"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0a04
            goto L_0x000c
        L_0x0a04:
            r4 = 125(0x7d, float:1.75E-43)
            goto L_0x10cd
        L_0x0a08:
            java.lang.String r1 = "MCPB_CONTRG"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0a12
            goto L_0x000c
        L_0x0a12:
            r4 = 124(0x7c, float:1.74E-43)
            goto L_0x10cd
        L_0x0a16:
            java.lang.String r1 = "MCPB_CONTRE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0a20
            goto L_0x000c
        L_0x0a20:
            r4 = 123(0x7b, float:1.72E-43)
            goto L_0x10cd
        L_0x0a24:
            java.lang.String r1 = "VISAPB_INTERNT"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0a2e
            goto L_0x000c
        L_0x0a2e:
            r4 = 122(0x7a, float:1.71E-43)
            goto L_0x10cd
        L_0x0a32:
            java.lang.String r1 = "VISAPB_INSTANT"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0a3c
            goto L_0x000c
        L_0x0a3c:
            r4 = 121(0x79, float:1.7E-43)
            goto L_0x10cd
        L_0x0a40:
            java.lang.String r1 = "VISACLASIC"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0a4a
            goto L_0x000c
        L_0x0a4a:
            r4 = 120(0x78, float:1.68E-43)
            goto L_0x10cd
        L_0x0a4e:
            java.lang.String r1 = "AMEXAMEXGRU"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0a58
            goto L_0x000c
        L_0x0a58:
            r4 = 119(0x77, float:1.67E-43)
            goto L_0x10cd
        L_0x0a5c:
            java.lang.String r1 = "AMEXAMEXGRG"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0a66
            goto L_0x000c
        L_0x0a66:
            r4 = 118(0x76, float:1.65E-43)
            goto L_0x10cd
        L_0x0a6a:
            java.lang.String r1 = "AMEXAMEXGRE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0a74
            goto L_0x000c
        L_0x0a74:
            r4 = 117(0x75, float:1.64E-43)
            goto L_0x10cd
        L_0x0a78:
            java.lang.String r1 = "AMEXAMEXGLU"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0a82
            goto L_0x000c
        L_0x0a82:
            r4 = 116(0x74, float:1.63E-43)
            goto L_0x10cd
        L_0x0a86:
            java.lang.String r1 = "AMEXAMEXGLG"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0a90
            goto L_0x000c
        L_0x0a90:
            r4 = 115(0x73, float:1.61E-43)
            goto L_0x10cd
        L_0x0a94:
            java.lang.String r1 = "AMEXAMEXGLE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0a9e
            goto L_0x000c
        L_0x0a9e:
            r4 = 114(0x72, float:1.6E-43)
            goto L_0x10cd
        L_0x0aa2:
            java.lang.String r1 = "AMEXAMEXGCU"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0aac
            goto L_0x000c
        L_0x0aac:
            r4 = 113(0x71, float:1.58E-43)
            goto L_0x10cd
        L_0x0ab0:
            java.lang.String r1 = "AMEXAMEXGCG"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0aba
            goto L_0x000c
        L_0x0aba:
            r4 = 112(0x70, float:1.57E-43)
            goto L_0x10cd
        L_0x0abe:
            java.lang.String r1 = "AMEXAMEXGCE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0ac8
            goto L_0x000c
        L_0x0ac8:
            r4 = 111(0x6f, float:1.56E-43)
            goto L_0x10cd
        L_0x0acc:
            java.lang.String r1 = "AMEXAMEXBLG"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0ad6
            goto L_0x000c
        L_0x0ad6:
            r4 = 110(0x6e, float:1.54E-43)
            goto L_0x10cd
        L_0x0ada:
            java.lang.String r1 = "MCPRS_EXPCR+"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0ae4
            goto L_0x000c
        L_0x0ae4:
            r4 = 109(0x6d, float:1.53E-43)
            goto L_0x10cd
        L_0x0ae8:
            java.lang.String r1 = "VISAGOLD-IPOPW"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0af2
            goto L_0x000c
        L_0x0af2:
            r4 = 108(0x6c, float:1.51E-43)
            goto L_0x10cd
        L_0x0af6:
            java.lang.String r1 = "MCPLATINUM"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0b00
            goto L_0x000c
        L_0x0b00:
            r4 = 107(0x6b, float:1.5E-43)
            goto L_0x10cd
        L_0x0b04:
            java.lang.String r1 = "MCSOLOF_MAST"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0b0e
            goto L_0x000c
        L_0x0b0e:
            r4 = 106(0x6a, float:1.49E-43)
            goto L_0x10cd
        L_0x0b12:
            java.lang.String r1 = "VISAVCLPAYWAVE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0b1c
            goto L_0x000c
        L_0x0b1c:
            r4 = 105(0x69, float:1.47E-43)
            goto L_0x10cd
        L_0x0b20:
            java.lang.String r1 = "VISAST_EDUCAT"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0b2a
            goto L_0x000c
        L_0x0b2a:
            r4 = 104(0x68, float:1.46E-43)
            goto L_0x10cd
        L_0x0b2e:
            java.lang.String r1 = "VISAPB_JUNIOR"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0b38
            goto L_0x000c
        L_0x0b38:
            r4 = 103(0x67, float:1.44E-43)
            goto L_0x10cd
        L_0x0b3c:
            java.lang.String r1 = "MCMCIR-MCR"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0b46
            goto L_0x000c
        L_0x0b46:
            r4 = 102(0x66, float:1.43E-43)
            goto L_0x10cd
        L_0x0b4a:
            java.lang.String r1 = "MCMCDEBMICRO"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0b54
            goto L_0x000c
        L_0x0b54:
            r4 = 101(0x65, float:1.42E-43)
            goto L_0x10cd
        L_0x0b58:
            java.lang.String r1 = "MCSOLOC_WE_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0b62
            goto L_0x000c
        L_0x0b62:
            r4 = 100
            goto L_0x10cd
        L_0x0b66:
            java.lang.String r1 = "MCMCDEBCLTB2"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0b70
            goto L_0x000c
        L_0x0b70:
            r4 = 99
            goto L_0x10cd
        L_0x0b74:
            java.lang.String r1 = "MCMCDEBCLTB1"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0b7e
            goto L_0x000c
        L_0x0b7e:
            r4 = 98
            goto L_0x10cd
        L_0x0b82:
            java.lang.String r1 = "MCMCDEBCLOFF"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0b8c
            goto L_0x000c
        L_0x0b8c:
            r4 = 97
            goto L_0x10cd
        L_0x0b90:
            java.lang.String r1 = "MCMCDEBCLINN"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0b9a
            goto L_0x000c
        L_0x0b9a:
            r4 = 96
            goto L_0x10cd
        L_0x0b9e:
            java.lang.String r1 = "VISASOLOP_CARD"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0ba8
            goto L_0x000c
        L_0x0ba8:
            r4 = 95
            goto L_0x10cd
        L_0x0bac:
            java.lang.String r1 = "MCMCGLDCIN"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0bb6
            goto L_0x000c
        L_0x0bb6:
            r4 = 94
            goto L_0x10cd
        L_0x0bba:
            java.lang.String r1 = "MCST_GIRL_HR"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0bc4
            goto L_0x000c
        L_0x0bc4:
            r4 = 93
            goto L_0x10cd
        L_0x0bc8:
            java.lang.String r1 = "MCST_GIRL_BV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0bd2
            goto L_0x000c
        L_0x0bd2:
            r4 = 92
            goto L_0x10cd
        L_0x0bd6:
            java.lang.String r1 = "MCST_GIRL_BH"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0be0
            goto L_0x000c
        L_0x0be0:
            r4 = 91
            goto L_0x10cd
        L_0x0be4:
            java.lang.String r1 = "MCST_GIRL_BA"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0bee
            goto L_0x000c
        L_0x0bee:
            r4 = 90
            goto L_0x10cd
        L_0x0bf2:
            java.lang.String r1 = "MCSILVER_PLV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0bfc
            goto L_0x000c
        L_0x0bfc:
            r4 = 89
            goto L_0x10cd
        L_0x0c00:
            java.lang.String r1 = "MCSILVER_ PL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0c0a
            goto L_0x000c
        L_0x0c0a:
            r4 = 88
            goto L_0x10cd
        L_0x0c0e:
            java.lang.String r1 = "MCMC_STN_INS"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0c18
            goto L_0x000c
        L_0x0c18:
            r4 = 87
            goto L_0x10cd
        L_0x0c1c:
            java.lang.String r1 = "MCMC_STN_IN1"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0c26
            goto L_0x000c
        L_0x0c26:
            r4 = 86
            goto L_0x10cd
        L_0x0c2a:
            java.lang.String r1 = "MCMC_STICKER"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0c34
            goto L_0x000c
        L_0x0c34:
            r4 = 85
            goto L_0x10cd
        L_0x0c38:
            java.lang.String r1 = "MCMCDEBCLN"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0c42
            goto L_0x000c
        L_0x0c42:
            r4 = 84
            goto L_0x10cd
        L_0x0c46:
            java.lang.String r1 = "VISAPB_CONTRU"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0c50
            goto L_0x000c
        L_0x0c50:
            r4 = 83
            goto L_0x10cd
        L_0x0c54:
            java.lang.String r1 = "VISAPB_CONTRG"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0c5e
            goto L_0x000c
        L_0x0c5e:
            r4 = 82
            goto L_0x10cd
        L_0x0c62:
            java.lang.String r1 = "VISAPB_CONTRE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0c6c
            goto L_0x000c
        L_0x0c6c:
            r4 = 81
            goto L_0x10cd
        L_0x0c70:
            java.lang.String r1 = "VISASOLOP_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0c7a
            goto L_0x000c
        L_0x0c7a:
            r4 = 80
            goto L_0x10cd
        L_0x0c7e:
            java.lang.String r1 = "MCSOLOC_WE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0c88
            goto L_0x000c
        L_0x0c88:
            r4 = 79
            goto L_0x10cd
        L_0x0c8c:
            java.lang.String r1 = "VISARED_CROSS"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0c96
            goto L_0x000c
        L_0x0c96:
            r4 = 78
            goto L_0x10cd
        L_0x0c9a:
            java.lang.String r1 = "MCMC_SOL_INS"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0ca4
            goto L_0x000c
        L_0x0ca4:
            r4 = 77
            goto L_0x10cd
        L_0x0ca8:
            java.lang.String r1 = "MCMSTAN-MCR"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0cb2
            goto L_0x000c
        L_0x0cb2:
            r4 = 76
            goto L_0x10cd
        L_0x0cb6:
            java.lang.String r1 = "MCJUST_CARD"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0cc0
            goto L_0x000c
        L_0x0cc0:
            r4 = 75
            goto L_0x10cd
        L_0x0cc4:
            java.lang.String r1 = "VISASOLOF_PAYW"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0cce
            goto L_0x000c
        L_0x0cce:
            r4 = 74
            goto L_0x10cd
        L_0x0cd2:
            java.lang.String r1 = "VISASOLOF_GOLD"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0cdc
            goto L_0x000c
        L_0x0cdc:
            r4 = 73
            goto L_0x10cd
        L_0x0ce0:
            java.lang.String r1 = "VISASOLOF_CARD"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0cea
            goto L_0x000c
        L_0x0cea:
            r4 = 72
            goto L_0x10cd
        L_0x0cee:
            java.lang.String r1 = "VISAVCLAS-MCR"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0cf8
            goto L_0x000c
        L_0x0cf8:
            r4 = 71
            goto L_0x10cd
        L_0x0cfc:
            java.lang.String r1 = "MCSTANDARD"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0d06
            goto L_0x000c
        L_0x0d06:
            r4 = 70
            goto L_0x10cd
        L_0x0d0a:
            java.lang.String r1 = "MCSTAN-IPO"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0d14
            goto L_0x000c
        L_0x0d14:
            r4 = 69
            goto L_0x10cd
        L_0x0d18:
            java.lang.String r1 = "AMEXDPLUS"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0d22
            goto L_0x000c
        L_0x0d22:
            r4 = 68
            goto L_0x10cd
        L_0x0d26:
            java.lang.String r1 = "AMEXAMGRG"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0d30
            goto L_0x000c
        L_0x0d30:
            r4 = 67
            goto L_0x10cd
        L_0x0d34:
            java.lang.String r1 = "MC_GOLD+"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0d3e
            goto L_0x000c
        L_0x0d3e:
            r4 = 66
            goto L_0x10cd
        L_0x0d42:
            java.lang.String r1 = "AMEXAMEX_RC_U"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0d4c
            goto L_0x000c
        L_0x0d4c:
            r4 = 65
            goto L_0x10cd
        L_0x0d50:
            java.lang.String r1 = "AMEXAMEX_RC_G"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0d5a
            goto L_0x000c
        L_0x0d5a:
            r4 = 64
            goto L_0x10cd
        L_0x0d5e:
            java.lang.String r1 = "AMEXAMEX_RC_E"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0d68
            goto L_0x000c
        L_0x0d68:
            r4 = 63
            goto L_0x10cd
        L_0x0d6c:
            java.lang.String r1 = "AMEXAMEX_30_U"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0d76
            goto L_0x000c
        L_0x0d76:
            r4 = 62
            goto L_0x10cd
        L_0x0d7a:
            java.lang.String r1 = "AMEXAMEX_30_G"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0d84
            goto L_0x000c
        L_0x0d84:
            r4 = 61
            goto L_0x10cd
        L_0x0d88:
            java.lang.String r1 = "AMEXAMEX_30_E"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0d92
            goto L_0x000c
        L_0x0d92:
            r4 = 60
            goto L_0x10cd
        L_0x0d96:
            java.lang.String r1 = "AMEXAMEXGRUCL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0da0
            goto L_0x000c
        L_0x0da0:
            r4 = 59
            goto L_0x10cd
        L_0x0da4:
            java.lang.String r1 = "AMEXAMEXGRGCL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0dae
            goto L_0x000c
        L_0x0dae:
            r4 = 58
            goto L_0x10cd
        L_0x0db2:
            java.lang.String r1 = "AMEXAMEXGRECL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0dbc
            goto L_0x000c
        L_0x0dbc:
            r4 = 57
            goto L_0x10cd
        L_0x0dc0:
            java.lang.String r1 = "MCMC_TARGET"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0dca
            goto L_0x000c
        L_0x0dca:
            r4 = 56
            goto L_0x10cd
        L_0x0dce:
            java.lang.String r1 = "MCSILVER_PL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0dd8
            goto L_0x000c
        L_0x0dd8:
            r4 = 55
            goto L_0x10cd
        L_0x0ddc:
            java.lang.String r1 = "MCMC_STN_V1"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0de6
            goto L_0x000c
        L_0x0de6:
            r4 = 54
            goto L_0x10cd
        L_0x0dea:
            java.lang.String r1 = "MCMC_SOLX_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0df4
            goto L_0x000c
        L_0x0df4:
            r4 = 53
            goto L_0x10cd
        L_0x0df8:
            java.lang.String r1 = "MCMC_SOLO_X"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0e02
            goto L_0x000c
        L_0x0e02:
            r4 = 52
            goto L_0x10cd
        L_0x0e06:
            java.lang.String r1 = "MCMC_SOLO_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0e10
            goto L_0x000c
        L_0x0e10:
            r4 = 51
            goto L_0x10cd
        L_0x0e14:
            java.lang.String r1 = "GCGCEXPRCR"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0e1e
            goto L_0x000c
        L_0x0e1e:
            r4 = 50
            goto L_0x10cd
        L_0x0e22:
            java.lang.String r1 = "MCST_BOY"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0e2c
            goto L_0x000c
        L_0x0e2c:
            r4 = 49
            goto L_0x10cd
        L_0x0e30:
            java.lang.String r1 = "MCST_ABS"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0e3a
            goto L_0x000c
        L_0x0e3a:
            r4 = 48
            goto L_0x10cd
        L_0x0e3e:
            java.lang.String r1 = "MCPERS_SLVR+"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0e48
            goto L_0x000c
        L_0x0e48:
            r4 = 47
            goto L_0x10cd
        L_0x0e4c:
            java.lang.String r1 = "MCPERS_GOLD+"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0e56
            goto L_0x000c
        L_0x0e56:
            r4 = 46
            goto L_0x10cd
        L_0x0e5a:
            java.lang.String r1 = "MCPERS_EXPR+"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0e64
            goto L_0x000c
        L_0x0e64:
            r4 = 45
            goto L_0x10cd
        L_0x0e68:
            java.lang.String r1 = "MCSC_REG"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0e72
            goto L_0x000c
        L_0x0e72:
            r4 = 44
            goto L_0x10cd
        L_0x0e76:
            java.lang.String r1 = "MCPERS_CLSC+"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0e80
            goto L_0x000c
        L_0x0e80:
            r4 = 43
            goto L_0x10cd
        L_0x0e84:
            java.lang.String r1 = "MCCIRR-LOVE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0e8e
            goto L_0x000c
        L_0x0e8e:
            r4 = 42
            goto L_0x10cd
        L_0x0e92:
            java.lang.String r1 = "MCCIRR-CHIP"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0e9c
            goto L_0x000c
        L_0x0e9c:
            r4 = 41
            goto L_0x10cd
        L_0x0ea0:
            java.lang.String r1 = "MCONECARD"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0eaa
            goto L_0x000c
        L_0x0eaa:
            r4 = 40
            goto L_0x10cd
        L_0x0eae:
            java.lang.String r1 = "VISAMAXIM_CARD"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0eb8
            goto L_0x000c
        L_0x0eb8:
            r4 = 39
            goto L_0x10cd
        L_0x0ebc:
            java.lang.String r1 = "VISAPB_DEBIT"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0ec6
            goto L_0x000c
        L_0x0ec6:
            r4 = 38
            goto L_0x10cd
        L_0x0eca:
            java.lang.String r1 = "MCSF-CIRLOVE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0ed4
            goto L_0x000c
        L_0x0ed4:
            r4 = 37
            goto L_0x10cd
        L_0x0ed8:
            java.lang.String r1 = "VISAVELE-MCRPW"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0ee2
            goto L_0x000c
        L_0x0ee2:
            r4 = 36
            goto L_0x10cd
        L_0x0ee6:
            java.lang.String r1 = "VISAEXP_CARD"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0ef0
            goto L_0x000c
        L_0x0ef0:
            r4 = 35
            goto L_0x10cd
        L_0x0ef4:
            java.lang.String r1 = "VISASOLO-ELOVE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0efe
            goto L_0x000c
        L_0x0efe:
            r4 = 34
            goto L_0x10cd
        L_0x0f02:
            java.lang.String r1 = "VISASOLO-CLOVE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0f0c
            goto L_0x000c
        L_0x0f0c:
            r4 = 33
            goto L_0x10cd
        L_0x0f10:
            java.lang.String r1 = "MCCLASSIC+"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0f1a
            goto L_0x000c
        L_0x0f1a:
            r4 = 32
            goto L_0x10cd
        L_0x0f1e:
            java.lang.String r1 = "MCMICRO1"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0f28
            goto L_0x000c
        L_0x0f28:
            r4 = 31
            goto L_0x10cd
        L_0x0f2c:
            java.lang.String r1 = "MCMC_STN"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0f36
            goto L_0x000c
        L_0x0f36:
            r4 = 30
            goto L_0x10cd
        L_0x0f3a:
            java.lang.String r1 = "MCMC_GL1"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0f44
            goto L_0x000c
        L_0x0f44:
            r4 = 29
            goto L_0x10cd
        L_0x0f48:
            java.lang.String r1 = "MCMC_EDUCAT"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0f52
            goto L_0x000c
        L_0x0f52:
            r4 = 28
            goto L_0x10cd
        L_0x0f56:
            java.lang.String r1 = "AMEXAMEXBLG CL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0f60
            goto L_0x000c
        L_0x0f60:
            r4 = 27
            goto L_0x10cd
        L_0x0f64:
            java.lang.String r1 = "VISAVS_CLS_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0f6e
            goto L_0x000c
        L_0x0f6e:
            r4 = 26
            goto L_0x10cd
        L_0x0f72:
            java.lang.String r1 = "VISAVGLD-MCRPW"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0f7c
            goto L_0x000c
        L_0x0f7c:
            r4 = 25
            goto L_0x10cd
        L_0x0f80:
            java.lang.String r1 = "VISAST_STYLE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0f8a
            goto L_0x000c
        L_0x0f8a:
            r4 = 24
            goto L_0x10cd
        L_0x0f8e:
            java.lang.String r1 = "VISAST_MUSIC"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0f98
            goto L_0x000c
        L_0x0f98:
            r4 = 23
            goto L_0x10cd
        L_0x0f9c:
            java.lang.String r1 = "VISAVS_SOL_INS"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0fa6
            goto L_0x000c
        L_0x0fa6:
            r4 = 22
            goto L_0x10cd
        L_0x0faa:
            java.lang.String r1 = "VISAVELE-MCR"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0fb4
            goto L_0x000c
        L_0x0fb4:
            r4 = 21
            goto L_0x10cd
        L_0x0fb8:
            java.lang.String r1 = "AMEXDPLUSIN"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0fc2
            goto L_0x000c
        L_0x0fc2:
            r4 = 20
            goto L_0x10cd
        L_0x0fc6:
            java.lang.String r1 = "MCCIRRUS"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0fd0
            goto L_0x000c
        L_0x0fd0:
            r4 = 19
            goto L_0x10cd
        L_0x0fd4:
            java.lang.String r1 = "MCST_EYES_HR"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0fde
            goto L_0x000c
        L_0x0fde:
            r4 = 18
            goto L_0x10cd
        L_0x0fe2:
            java.lang.String r1 = "MCST_EYES_BV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0fec
            goto L_0x000c
        L_0x0fec:
            r4 = 17
            goto L_0x10cd
        L_0x0ff0:
            java.lang.String r1 = "MCST_EYES_BH"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0ffa
            goto L_0x000c
        L_0x0ffa:
            r4 = 16
            goto L_0x10cd
        L_0x0ffe:
            java.lang.String r1 = "MCST_EYES_BA"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x1008
            goto L_0x000c
        L_0x1008:
            r4 = 15
            goto L_0x10cd
        L_0x100c:
            java.lang.String r1 = "VISAGOLD"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x1016
            goto L_0x000c
        L_0x1016:
            r4 = 14
            goto L_0x10cd
        L_0x101a:
            java.lang.String r1 = "VISAGOLD-PWV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x1024
            goto L_0x000c
        L_0x1024:
            r4 = 13
            goto L_0x10cd
        L_0x1028:
            java.lang.String r1 = "VISAGOLD-IPO"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x1032
            goto L_0x000c
        L_0x1032:
            r4 = 12
            goto L_0x10cd
        L_0x1036:
            java.lang.String r1 = "AMEXDPLUSSOLOV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x1040
            goto L_0x000c
        L_0x1040:
            r4 = 11
            goto L_0x10cd
        L_0x1044:
            java.lang.String r1 = "MCGOLD"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x104e
            goto L_0x000c
        L_0x104e:
            r4 = 10
            goto L_0x10cd
        L_0x1052:
            java.lang.String r1 = "MCCIR-BIGLIN"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x105c
            goto L_0x000c
        L_0x105c:
            r4 = 9
            goto L_0x10cd
        L_0x1060:
            java.lang.String r1 = "VISAINFINITEV"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x106a
            goto L_0x000c
        L_0x106a:
            r4 = 8
            goto L_0x10cd
        L_0x106e:
            java.lang.String r1 = "MCST_ZG_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x1078
            goto L_0x000c
        L_0x1078:
            r4 = 7
            goto L_0x10cd
        L_0x107a:
            java.lang.String r1 = "MCST_TB_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x1084
            goto L_0x000c
        L_0x1084:
            r4 = 6
            goto L_0x10cd
        L_0x1086:
            java.lang.String r1 = "MCST_GIRL"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x1090
            goto L_0x000c
        L_0x1090:
            r4 = 5
            goto L_0x10cd
        L_0x1092:
            java.lang.String r1 = "MCST_EYES"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x109c
            goto L_0x000c
        L_0x109c:
            r4 = 4
            goto L_0x10cd
        L_0x109e:
            java.lang.String r1 = "MCST_DJ_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x10a8
            goto L_0x000c
        L_0x10a8:
            r4 = 3
            goto L_0x10cd
        L_0x10aa:
            java.lang.String r1 = "MCST_CARD"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x10b4
            goto L_0x000c
        L_0x10b4:
            r4 = 2
            goto L_0x10cd
        L_0x10b6:
            java.lang.String r1 = "MCST_BT_V"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x10c0
            goto L_0x000c
        L_0x10c0:
            r4 = r3
            goto L_0x10cd
        L_0x10c2:
            java.lang.String r1 = "VISAPLATINUM"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x10cc
            goto L_0x000c
        L_0x10cc:
            r4 = r0
        L_0x10cd:
            switch(r4) {
                case 0: goto L_0x12ce;
                case 1: goto L_0x12c6;
                case 2: goto L_0x12be;
                case 3: goto L_0x12b6;
                case 4: goto L_0x12ae;
                case 5: goto L_0x12a6;
                case 6: goto L_0x12c6;
                case 7: goto L_0x12c6;
                case 8: goto L_0x129e;
                case 9: goto L_0x1298;
                case 10: goto L_0x1290;
                case 11: goto L_0x1288;
                case 12: goto L_0x1290;
                case 13: goto L_0x1290;
                case 14: goto L_0x1290;
                case 15: goto L_0x12ae;
                case 16: goto L_0x12ae;
                case 17: goto L_0x12ae;
                case 18: goto L_0x12ae;
                case 19: goto L_0x1298;
                case 20: goto L_0x1280;
                case 21: goto L_0x1278;
                case 22: goto L_0x1270;
                case 23: goto L_0x1268;
                case 24: goto L_0x1260;
                case 25: goto L_0x1290;
                case 26: goto L_0x1258;
                case 27: goto L_0x1250;
                case 28: goto L_0x1248;
                case 29: goto L_0x1240;
                case 30: goto L_0x1238;
                case 31: goto L_0x1230;
                case 32: goto L_0x1228;
                case 33: goto L_0x1220;
                case 34: goto L_0x1220;
                case 35: goto L_0x1278;
                case 36: goto L_0x1278;
                case 37: goto L_0x1220;
                case 38: goto L_0x1218;
                case 39: goto L_0x1210;
                case 40: goto L_0x1208;
                case 41: goto L_0x1298;
                case 42: goto L_0x1220;
                case 43: goto L_0x1228;
                case 44: goto L_0x1200;
                case 45: goto L_0x11f8;
                case 46: goto L_0x11f0;
                case 47: goto L_0x11e8;
                case 48: goto L_0x11e0;
                case 49: goto L_0x11d8;
                case 50: goto L_0x11d0;
                case 51: goto L_0x11c8;
                case 52: goto L_0x11c8;
                case 53: goto L_0x11c8;
                case 54: goto L_0x1238;
                case 55: goto L_0x11e8;
                case 56: goto L_0x11c0;
                case 57: goto L_0x11b8;
                case 58: goto L_0x11b8;
                case 59: goto L_0x11b8;
                case 60: goto L_0x11b0;
                case 61: goto L_0x11b0;
                case 62: goto L_0x11b0;
                case 63: goto L_0x11b0;
                case 64: goto L_0x11b0;
                case 65: goto L_0x11b0;
                case 66: goto L_0x11f0;
                case 67: goto L_0x11b8;
                case 68: goto L_0x1280;
                case 69: goto L_0x1298;
                case 70: goto L_0x1298;
                case 71: goto L_0x11a8;
                case 72: goto L_0x11a0;
                case 73: goto L_0x1290;
                case 74: goto L_0x1198;
                case 75: goto L_0x1190;
                case 76: goto L_0x1298;
                case 77: goto L_0x1238;
                case 78: goto L_0x1220;
                case 79: goto L_0x1188;
                case 80: goto L_0x1180;
                case 81: goto L_0x1218;
                case 82: goto L_0x1218;
                case 83: goto L_0x1218;
                case 84: goto L_0x11d0;
                case 85: goto L_0x1178;
                case 86: goto L_0x1238;
                case 87: goto L_0x1170;
                case 88: goto L_0x11e8;
                case 89: goto L_0x11e8;
                case 90: goto L_0x12a6;
                case 91: goto L_0x12a6;
                case 92: goto L_0x12a6;
                case 93: goto L_0x12a6;
                case 94: goto L_0x11d0;
                case 95: goto L_0x1180;
                case 96: goto L_0x11d0;
                case 97: goto L_0x1298;
                case 98: goto L_0x1168;
                case 99: goto L_0x1160;
                case 100: goto L_0x1188;
                case 101: goto L_0x11d0;
                case 102: goto L_0x1298;
                case 103: goto L_0x1218;
                case 104: goto L_0x1248;
                case 105: goto L_0x11a8;
                case 106: goto L_0x1298;
                case 107: goto L_0x1298;
                case 108: goto L_0x1290;
                case 109: goto L_0x11f8;
                case 110: goto L_0x1250;
                case 111: goto L_0x1158;
                case 112: goto L_0x1158;
                case 113: goto L_0x1158;
                case 114: goto L_0x1158;
                case 115: goto L_0x1158;
                case 116: goto L_0x1158;
                case 117: goto L_0x11b8;
                case 118: goto L_0x11b8;
                case 119: goto L_0x11b8;
                case 120: goto L_0x11a8;
                case 121: goto L_0x1218;
                case 122: goto L_0x1218;
                case 123: goto L_0x1218;
                case 124: goto L_0x1218;
                case 125: goto L_0x1218;
                case 126: goto L_0x1150;
                case 127: goto L_0x1218;
                case 128: goto L_0x1218;
                case 129: goto L_0x1218;
                case 130: goto L_0x1290;
                case 131: goto L_0x1290;
                case 132: goto L_0x11f0;
                case 133: goto L_0x1290;
                case 134: goto L_0x1148;
                case 135: goto L_0x11e0;
                case 136: goto L_0x11e0;
                case 137: goto L_0x11e0;
                case 138: goto L_0x11e0;
                case 139: goto L_0x1290;
                case 140: goto L_0x1218;
                case 141: goto L_0x1218;
                case 142: goto L_0x1218;
                case 143: goto L_0x1158;
                case 144: goto L_0x1140;
                case 145: goto L_0x1140;
                case 146: goto L_0x1138;
                case 147: goto L_0x1138;
                case 148: goto L_0x11d8;
                case 149: goto L_0x11d8;
                case 150: goto L_0x11d8;
                case 151: goto L_0x11d8;
                case 152: goto L_0x11e0;
                case 153: goto L_0x11d8;
                case 154: goto L_0x12b6;
                case 155: goto L_0x12b6;
                case 156: goto L_0x12b6;
                case 157: goto L_0x12b6;
                case 158: goto L_0x12c6;
                case 159: goto L_0x1290;
                case 160: goto L_0x1218;
                case 161: goto L_0x11f8;
                case 162: goto L_0x11f8;
                case 163: goto L_0x11c0;
                case 164: goto L_0x1130;
                case 165: goto L_0x1130;
                case 166: goto L_0x1130;
                case 167: goto L_0x11f8;
                case 168: goto L_0x11a8;
                case 169: goto L_0x11c8;
                case 170: goto L_0x1208;
                case 171: goto L_0x12ae;
                case 172: goto L_0x11a8;
                case 173: goto L_0x1278;
                case 174: goto L_0x1290;
                case 175: goto L_0x12a6;
                case 176: goto L_0x1278;
                case 177: goto L_0x1290;
                case 178: goto L_0x1290;
                case 179: goto L_0x11f0;
                case 180: goto L_0x1140;
                case 181: goto L_0x1270;
                case 182: goto L_0x1270;
                case 183: goto L_0x1138;
                case 184: goto L_0x1220;
                case 185: goto L_0x1220;
                case 186: goto L_0x1220;
                case 187: goto L_0x11f8;
                case 188: goto L_0x11d0;
                case 189: goto L_0x1218;
                case 190: goto L_0x1218;
                case 191: goto L_0x1128;
                case 192: goto L_0x1240;
                case 193: goto L_0x1268;
                case 194: goto L_0x1170;
                case 195: goto L_0x1260;
                case 196: goto L_0x1218;
                case 197: goto L_0x1168;
                case 198: goto L_0x1160;
                case 199: goto L_0x1148;
                case 200: goto L_0x1168;
                case 201: goto L_0x1160;
                case 202: goto L_0x1148;
                case 203: goto L_0x1298;
                case 204: goto L_0x1218;
                case 205: goto L_0x1218;
                case 206: goto L_0x1218;
                case 207: goto L_0x1120;
                case 208: goto L_0x1220;
                case 209: goto L_0x1278;
                case 210: goto L_0x1258;
                case 211: goto L_0x129e;
                case 212: goto L_0x1208;
                case 213: goto L_0x1298;
                case 214: goto L_0x1290;
                case 215: goto L_0x1118;
                case 216: goto L_0x1258;
                case 217: goto L_0x1218;
                case 218: goto L_0x1218;
                case 219: goto L_0x1218;
                case 220: goto L_0x1220;
                case 221: goto L_0x1278;
                case 222: goto L_0x1130;
                case 223: goto L_0x1130;
                case 224: goto L_0x1130;
                case 225: goto L_0x1228;
                case 226: goto L_0x1290;
                case 227: goto L_0x1220;
                case 228: goto L_0x1188;
                case 229: goto L_0x1298;
                case 230: goto L_0x1220;
                case 231: goto L_0x1298;
                case 232: goto L_0x1290;
                case 233: goto L_0x1118;
                case 234: goto L_0x1188;
                case 235: goto L_0x1290;
                case 236: goto L_0x1298;
                case 237: goto L_0x1208;
                case 238: goto L_0x1288;
                case 239: goto L_0x1110;
                case 240: goto L_0x1208;
                case 241: goto L_0x11d0;
                case 242: goto L_0x11d0;
                case 243: goto L_0x11d0;
                case 244: goto L_0x1168;
                case 245: goto L_0x1160;
                case 246: goto L_0x1128;
                case 247: goto L_0x1128;
                case 248: goto L_0x1170;
                case 249: goto L_0x1170;
                case 250: goto L_0x1108;
                case 251: goto L_0x1130;
                case 252: goto L_0x1280;
                case 253: goto L_0x1220;
                case 254: goto L_0x1100;
                case 255: goto L_0x1228;
                case 256: goto L_0x1148;
                case 257: goto L_0x10f8;
                case 258: goto L_0x11a8;
                case 259: goto L_0x1220;
                case 260: goto L_0x1220;
                case 261: goto L_0x10f0;
                case 262: goto L_0x1228;
                case 263: goto L_0x1130;
                case 264: goto L_0x1280;
                case 265: goto L_0x10e8;
                case 266: goto L_0x11c8;
                case 267: goto L_0x11c8;
                case 268: goto L_0x11c8;
                case 269: goto L_0x1218;
                case 270: goto L_0x10e0;
                case 271: goto L_0x10e0;
                case 272: goto L_0x10e0;
                case 273: goto L_0x1228;
                case 274: goto L_0x1290;
                case 275: goto L_0x1220;
                case 276: goto L_0x1220;
                case 277: goto L_0x1218;
                case 278: goto L_0x11d0;
                case 279: goto L_0x10f0;
                case 280: goto L_0x11f0;
                case 281: goto L_0x1128;
                case 282: goto L_0x1200;
                case 283: goto L_0x1200;
                case 284: goto L_0x12c6;
                case 285: goto L_0x12b6;
                case 286: goto L_0x12c6;
                case 287: goto L_0x12c6;
                case 288: goto L_0x10e8;
                case 289: goto L_0x1220;
                case 290: goto L_0x1218;
                case 291: goto L_0x1218;
                case 292: goto L_0x1218;
                case 293: goto L_0x1218;
                case 294: goto L_0x1298;
                case 295: goto L_0x1198;
                case 296: goto L_0x1270;
                case 297: goto L_0x1140;
                case 298: goto L_0x11e8;
                case 299: goto L_0x1218;
                case 300: goto L_0x11f8;
                case 301: goto L_0x1120;
                case 302: goto L_0x1188;
                case 303: goto L_0x10d8;
                case 304: goto L_0x11d0;
                case 305: goto L_0x1218;
                case 306: goto L_0x1218;
                case 307: goto L_0x1218;
                default: goto L_0x10d0;
            }
        L_0x10d0:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.white_drawable
            r4.<init>(r1, r0)
            return r4
        L_0x10d8:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_nikora
            r4.<init>(r1, r0)
            return r4
        L_0x10e0:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_amex_platinum
            r4.<init>(r1, r0)
            return r4
        L_0x10e8:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_wm_world_elite
            r4.<init>(r0, r3)
            return r4
        L_0x10f0:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_express
            r4.<init>(r1, r0)
            return r4
        L_0x10f8:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_plus_new_express_debit
            r4.<init>(r1, r0)
            return r4
        L_0x1100:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_solo_gold
            r4.<init>(r0, r3)
            return r4
        L_0x1108:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_express_universal_card
            r4.<init>(r0, r3)
            return r4
        L_0x1110:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_my_army
            r4.<init>(r0, r3)
            return r4
        L_0x1118:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_solo_mc_gold
            r4.<init>(r0, r3)
            return r4
        L_0x1120:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_visa_gold_ar
            r4.<init>(r0, r3)
            return r4
        L_0x1128:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_mc_gold
            r4.<init>(r0, r3)
            return r4
        L_0x1130:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_orange
            r4.<init>(r0, r3)
            return r4
        L_0x1138:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.background_solo_signature_new
            r4.<init>(r0, r3)
            return r4
        L_0x1140:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_solo
            r4.<init>(r0, r3)
            return r4
        L_0x1148:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_visa_classic
            r4.<init>(r0, r3)
            return r4
        L_0x1150:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.mastercard_bg_new
            r4.<init>(r0, r3)
            return r4
        L_0x1158:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_amex_gold
            r4.<init>(r0, r3)
            return r4
        L_0x1160:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_scoolcard_1
            r4.<init>(r0, r3)
            return r4
        L_0x1168:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_scoolcard_2
            r4.<init>(r0, r3)
            return r4
        L_0x1170:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_mc_standard_tbilisi
            r4.<init>(r0, r3)
            return r4
        L_0x1178:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.card_background_sticker_android
            r4.<init>(r1, r0)
            return r4
        L_0x1180:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_solo_premium
            r4.<init>(r0, r3)
            return r4
        L_0x1188:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_backgrouind_solo_world_elite
            r4.<init>(r0, r3)
            return r4
        L_0x1190:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_just_card
            r4.<init>(r0, r3)
            return r4
        L_0x1198:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_solo_visa_family
            r4.<init>(r1, r0)
            return r4
        L_0x11a0:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_solo_family
            r4.<init>(r1, r0)
            return r4
        L_0x11a8:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_visa_classic
            r4.<init>(r0, r3)
            return r4
        L_0x11b0:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_amex_rewards
            r4.<init>(r1, r0)
            return r4
        L_0x11b8:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_amex_green
            r4.<init>(r0, r3)
            return r4
        L_0x11c0:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_student_card_4
            r4.<init>(r1, r0)
            return r4
        L_0x11c8:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_solo_x_world_elite
            r4.<init>(r0, r3)
            return r4
        L_0x11d0:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_express_new
            r4.<init>(r1, r0)
            return r4
        L_0x11d8:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_students_3
            r4.<init>(r0, r3)
            return r4
        L_0x11e0:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_students_5
            r4.<init>(r0, r3)
            return r4
        L_0x11e8:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_plus_new_silver
            r4.<init>(r0, r3)
            return r4
        L_0x11f0:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_plus_new_gold
            r4.<init>(r0, r3)
            return r4
        L_0x11f8:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_plus_new_express_debit
            r4.<init>(r1, r0)
            return r4
        L_0x1200:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_scool_card_ochamchire
            r4.<init>(r0, r3)
            return r4
        L_0x1208:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_visa_infinite
            r4.<init>(r0, r3)
            return r4
        L_0x1210:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_maxima
            r4.<init>(r1, r0)
            return r4
        L_0x1218:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_privatbank
            r4.<init>(r1, r0)
            return r4
        L_0x1220:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_lovecard
            r4.<init>(r1, r0)
            return r4
        L_0x1228:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_plus_new_classic
            r4.<init>(r0, r3)
            return r4
        L_0x1230:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_mc_skhvilo
            r4.<init>(r0, r3)
            return r4
        L_0x1238:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_mc_standard_kutaisi
            r4.<init>(r0, r3)
            return r4
        L_0x1240:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_mc_gold_tetnuldi
            r4.<init>(r0, r3)
            return r4
        L_0x1248:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_student_card_3
            r4.<init>(r1, r0)
            return r4
        L_0x1250:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_amex_blue
            r4.<init>(r1, r0)
            return r4
        L_0x1258:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_visa_classic_ar
            r4.<init>(r0, r3)
            return r4
        L_0x1260:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_student_card_2
            r4.<init>(r1, r0)
            return r4
        L_0x1268:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_student_card_1
            r4.<init>(r1, r0)
            return r4
        L_0x1270:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_solo_visa_gold
            r4.<init>(r0, r3)
            return r4
        L_0x1278:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_visa_electron
            r4.<init>(r1, r0)
            return r4
        L_0x1280:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_amex_debit_yellow
            r4.<init>(r1, r0)
            return r4
        L_0x1288:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_amex_debit_dark
            r4.<init>(r0, r3)
            return r4
        L_0x1290:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_visa_gold
            r4.<init>(r0, r3)
            return r4
        L_0x1298:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            r4.<init>(r2, r0)
            return r4
        L_0x129e:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_visa_infinite_new
            r4.<init>(r0, r3)
            return r4
        L_0x12a6:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_students_2
            r4.<init>(r0, r3)
            return r4
        L_0x12ae:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_students_4
            r4.<init>(r0, r3)
            return r4
        L_0x12b6:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_students_1
            r4.<init>(r0, r3)
            return r4
        L_0x12be:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.account_background_student_card_new
            r4.<init>(r1, r0)
            return r4
        L_0x12c6:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_student_card_shekvetili
            r4.<init>(r0, r3)
            return r4
        L_0x12ce:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r0 = p366bk.C10320i.account_background_visa_platinum
            r4.<init>(r0, r3)
            return r4
        L_0x12d6:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = new ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer
            int r1 = p366bk.C10320i.white_drawable
            r4.<init>(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.model.account.ProductProperties.getCardBackgroundInfo(java.lang.String):ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer");
    }

    public static ProductProperties getProperties(C25832l lVar) {
        return getProperties(lVar, true);
    }

    public static ProductProperties getPropertiesForAmex(boolean z) {
        ProductProperties productProperties = new ProductProperties();
        setTheme(productProperties, !z);
        productProperties.setBackgroundImageId(C10320i.bonus_background_mr);
        return productProperties;
    }

    public static ProductProperties getPropertiesForCashback() {
        ProductProperties productProperties = new ProductProperties();
        setTheme(productProperties, true);
        productProperties.setBackgroundImageId(C10320i.bonus_background_cashback);
        return productProperties;
    }

    public static ProductProperties getPropertiesForPension() {
        ProductProperties productProperties = new ProductProperties();
        setTheme(productProperties, true);
        productProperties.setBackgroundImageId(C10320i.pensions_background);
        return productProperties;
    }

    public static ProductProperties getPropertiesForPlus(boolean z) {
        ProductProperties productProperties = new ProductProperties();
        setTheme(productProperties, !z);
        productProperties.setBackgroundImageId(C10320i.bonus_background_plus);
        return productProperties;
    }

    public static ProductProperties getPropertiesForPrlo() {
        ProductProperties productProperties = new ProductProperties();
        setTheme(productProperties, true);
        productProperties.setBackgroundImageId(C10320i.bonus_background_prlo);
        return productProperties;
    }

    public static void setTheme(ProductProperties productProperties, boolean z) {
        if (z) {
            productProperties.setHasCardsBorder(true);
            productProperties.setTitleColorId(staticBlackColor);
            productProperties.setAmountColorId(staticBlackColor);
            productProperties.setCurrencyBorderColorId(invertBlackColor);
            productProperties.setCurrencyColorId(staticBlackColor);
            productProperties.setOvalBorderColorId(invertBlackColor);
            productProperties.setOvalTextColorId(invertBlackColor);
        } else {
            productProperties.setHasCardsBorder(false);
            productProperties.setTitleColorId(staticWhiteColor);
            productProperties.setAmountColorId(staticWhiteColor);
            productProperties.setCurrencyBorderColorId(invertWhiteColor);
            productProperties.setCurrencyColorId(staticWhiteColor);
            productProperties.setOvalBorderColorId(invertWhiteColor);
            productProperties.setOvalTextColorId(invertWhiteColor);
        }
        productProperties.setOvalFillColorId(transparentColorId);
        productProperties.setOpacityColorId(transparentColorId);
    }

    private static void setUpProperties(String str, ProductProperties productProperties) {
        CardBackgroundInfoContainer cardBackgroundInfo = getCardBackgroundInfo(str);
        int i = cardBackgroundInfo.resId;
        if (i != -1) {
            productProperties.backgroundImageId = i;
        }
        setTheme(productProperties, !cardBackgroundInfo.isLightText);
    }

    public int getAmountColorId() {
        return this.amountColorId;
    }

    public int getBackgroundColorId() {
        return this.backgroundColorId;
    }

    public int getBackgroundImageId() {
        return this.backgroundImageId;
    }

    public int getCurrencyBorderColorId() {
        return this.currencyBorderColorId;
    }

    public int getCurrencyColorId() {
        return this.currencyColorId;
    }

    public int getOpacityColor() {
        return this.opacityColorId;
    }

    public int getOvalBorderColorId() {
        return this.ovalBorderColorId;
    }

    public int getOvalFillColorId() {
        return this.ovalFillColorId;
    }

    public int getOvalTextColorId() {
        return this.ovalTextColorId;
    }

    public int getTitleColorId() {
        return this.titleColorId;
    }

    public boolean hasCardsBorder() {
        return this.hasCardsBorder;
    }

    public void setAmountColorId(int i) {
        this.amountColorId = i;
    }

    public void setBackgroundColorId(int i) {
        this.backgroundColorId = i;
    }

    public void setBackgroundImageId(int i) {
        this.backgroundImageId = i;
    }

    public void setCurrencyBorderColorId(int i) {
        this.currencyBorderColorId = i;
    }

    public void setCurrencyColorId(int i) {
        this.currencyColorId = i;
    }

    public void setHasCardsBorder(boolean z) {
        this.hasCardsBorder = z;
    }

    public void setOpacityColorId(int i) {
        this.opacityColorId = i;
    }

    public void setOvalBorderColorId(int i) {
        this.ovalBorderColorId = i;
    }

    public void setOvalFillColorId(int i) {
        this.ovalFillColorId = i;
    }

    public void setOvalTextColorId(int i) {
        this.ovalTextColorId = i;
    }

    public void setTitleColorId(int i) {
        this.titleColorId = i;
    }

    public static ProductProperties getProperties(C25832l lVar, boolean z) {
        ProductProperties productProperties = new ProductProperties();
        if (lVar.mo64530h() == null || !z) {
            Iterator it = lVar.mo64522a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C25838r rVar = (C25838r) it.next();
                if (rVar.mo64602z()) {
                    setUpProperties(rVar.mo64595t(), productProperties);
                    break;
                }
            }
        } else {
            setTheme(productProperties, false);
        }
        return productProperties;
    }

    public static ProductProperties getProperties(AccountLov accountLov, Client client, boolean z) {
        CreditCardAccount creditAccountByKey;
        C25832l a;
        ProductProperties productProperties = new ProductProperties();
        if (!(accountLov == null || client == null)) {
            CreditCardsEvent creditsEvent = client.getCreditsEvent();
            C25836p pVar = cardsAndDetailsUIModel;
            if (pVar != null && (a = C26371b.m82431a(pVar, accountLov.getId())) != null) {
                accountLov.setAttachmentUrl(a.mo64530h());
                return getProperties(a, z);
            } else if (!(creditsEvent == null || creditsEvent.getState() != 20 || creditsEvent.getCreditCardsWrapper() == null || (creditAccountByKey = creditsEvent.getCreditCardsWrapper().getCreditAccountByKey(Long.valueOf(accountLov.getId()))) == null)) {
                accountLov.setAttachmentUrl(creditAccountByKey.getAttachmentUrl());
                return getProperties(creditAccountByKey, z);
            }
        }
        return productProperties;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r3.equals("Avto") != false) goto L_0x00ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p341ge.bog.mobilebank.model.account.ProductProperties getProperties(p341ge.bog.mobilebank.model.loans.Loan r3) {
        /*
            ge.bog.mobilebank.model.account.ProductProperties r0 = new ge.bog.mobilebank.model.account.ProductProperties
            r0.<init>()
            java.lang.String r1 = r3.getAttachmentUrl()
            r2 = 0
            if (r1 == 0) goto L_0x0011
            setTheme(r0, r2)
            goto L_0x012f
        L_0x0011:
            java.lang.String r1 = r3.getProdType()
            if (r1 == 0) goto L_0x012f
            java.lang.String r3 = r3.getProdType()
            int r1 = r3.hashCode()
            switch(r1) {
                case -2042417178: goto L_0x00df;
                case -1462712521: goto L_0x00d5;
                case -1116740754: goto L_0x00ca;
                case -482828967: goto L_0x00c0;
                case 66913: goto L_0x00b5;
                case 66997: goto L_0x00aa;
                case 72266: goto L_0x009f;
                case 76156: goto L_0x0094;
                case 78667: goto L_0x0089;
                case 2053520: goto L_0x0080;
                case 2263385: goto L_0x0075;
                case 86190069: goto L_0x0069;
                case 214856694: goto L_0x005e;
                case 224014804: goto L_0x0053;
                case 355673936: goto L_0x0048;
                case 977847373: goto L_0x003c;
                case 1283437110: goto L_0x0030;
                case 2077017786: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x00e9
        L_0x0024:
            java.lang.String r1 = "Insurance"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00e9
            r2 = 11
            goto L_0x00ea
        L_0x0030:
            java.lang.String r1 = "Travel Loan"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00e9
            r2 = 10
            goto L_0x00ea
        L_0x003c:
            java.lang.String r1 = "PAWN_SHOP"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00e9
            r2 = 8
            goto L_0x00ea
        L_0x0048:
            java.lang.String r1 = "Express"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00e9
            r2 = 4
            goto L_0x00ea
        L_0x0053:
            java.lang.String r1 = "Mortgage loan"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00e9
            r2 = 7
            goto L_0x00ea
        L_0x005e:
            java.lang.String r1 = "CONSUMER"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00e9
            r2 = 1
            goto L_0x00ea
        L_0x0069:
            java.lang.String r1 = "Student Loan"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00e9
            r2 = 9
            goto L_0x00ea
        L_0x0075:
            java.lang.String r1 = "INSTALLMENT"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00e9
            r2 = 6
            goto L_0x00ea
        L_0x0080:
            java.lang.String r1 = "Avto"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00e9
            goto L_0x00ea
        L_0x0089:
            java.lang.String r1 = "OVR"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00e9
            r2 = 17
            goto L_0x00ea
        L_0x0094:
            java.lang.String r1 = "MCR"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00e9
            r2 = 15
            goto L_0x00ea
        L_0x009f:
            java.lang.String r1 = "IBC"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00e9
            r2 = 14
            goto L_0x00ea
        L_0x00aa:
            java.lang.String r1 = "CRD"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00e9
            r2 = 13
            goto L_0x00ea
        L_0x00b5:
            java.lang.String r1 = "COM"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00e9
            r2 = 12
            goto L_0x00ea
        L_0x00c0:
            java.lang.String r1 = "Installment"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00e9
            r2 = 5
            goto L_0x00ea
        L_0x00ca:
            java.lang.String r1 = "Mortgage loan Insurance"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00e9
            r2 = 16
            goto L_0x00ea
        L_0x00d5:
            java.lang.String r1 = "EnergoCredit"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00e9
            r2 = 3
            goto L_0x00ea
        L_0x00df:
            java.lang.String r1 = "Commercial loan"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00e9
            r2 = 2
            goto L_0x00ea
        L_0x00e9:
            r2 = -1
        L_0x00ea:
            switch(r2) {
                case 0: goto L_0x012a;
                case 1: goto L_0x0124;
                case 2: goto L_0x011e;
                case 3: goto L_0x0118;
                case 4: goto L_0x0112;
                case 5: goto L_0x010c;
                case 6: goto L_0x010c;
                case 7: goto L_0x0106;
                case 8: goto L_0x0100;
                case 9: goto L_0x00fa;
                case 10: goto L_0x00f4;
                case 11: goto L_0x00ee;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            goto L_0x012f
        L_0x00ee:
            int r3 = p366bk.C10320i.account_background_loan_sadazgveo
            r0.setBackgroundImageId(r3)
            goto L_0x012f
        L_0x00f4:
            int r3 = p366bk.C10320i.account_background_loan_travel
            r0.setBackgroundImageId(r3)
            goto L_0x012f
        L_0x00fa:
            int r3 = p366bk.C10320i.account_background_loan_student
            r0.setBackgroundImageId(r3)
            goto L_0x012f
        L_0x0100:
            int r3 = p366bk.C10320i.account_background_loan_lombardi
            r0.setBackgroundImageId(r3)
            goto L_0x012f
        L_0x0106:
            int r3 = p366bk.C10320i.account_background_loan_ipo
            r0.setBackgroundImageId(r3)
            goto L_0x012f
        L_0x010c:
            int r3 = p366bk.C10320i.account_background_loan_ganvadeba
            r0.setBackgroundImageId(r3)
            goto L_0x012f
        L_0x0112:
            int r3 = p366bk.C10320i.account_background_loan_express
            r0.setBackgroundImageId(r3)
            goto L_0x012f
        L_0x0118:
            int r3 = p366bk.C10320i.account_background_loan_energokrediti
            r0.setBackgroundImageId(r3)
            goto L_0x012f
        L_0x011e:
            int r3 = p366bk.C10320i.account_background_loan_business
            r0.setBackgroundImageId(r3)
            goto L_0x012f
        L_0x0124:
            int r3 = p366bk.C10320i.account_background_loan_samomxmareblo
            r0.setBackgroundImageId(r3)
            goto L_0x012f
        L_0x012a:
            int r3 = p366bk.C10320i.account_background_loan_auto
            r0.setBackgroundImageId(r3)
        L_0x012f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.model.account.ProductProperties.getProperties(ge.bog.mobilebank.model.loans.Loan):ge.bog.mobilebank.model.account.ProductProperties");
    }

    public static ProductProperties getProperties(Bond bond) {
        ProductProperties productProperties = new ProductProperties();
        productProperties.setHasCardsBorder(false);
        return productProperties;
    }

    public static ProductProperties getProperties(DepositBond depositBond) {
        ProductProperties productProperties = new ProductProperties();
        productProperties.setHasCardsBorder(false);
        return productProperties;
    }

    public static ProductProperties getProperties(CreditCardAccount creditCardAccount) {
        return getProperties(creditCardAccount, true);
    }

    public static ProductProperties getProperties(CreditCardAccount creditCardAccount, boolean z) {
        ProductProperties productProperties = new ProductProperties();
        if (creditCardAccount.getAttachmentUrl() == null || !z) {
            Iterator<C25838r> it = creditCardAccount.getAccountCreditCards().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C25838r next = it.next();
                if (next.mo64602z()) {
                    setUpProperties(next.mo64595t(), productProperties);
                    break;
                }
            }
        } else {
            setTheme(productProperties, false);
        }
        return productProperties;
    }

    public static ProductProperties getProperties(Deposit deposit) {
        return getProperties(deposit, true);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        if (r5.equals("INVEST") == false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p341ge.bog.mobilebank.model.account.ProductProperties getProperties(p341ge.bog.mobilebank.model.deposits.Deposit r4, boolean r5) {
        /*
            ge.bog.mobilebank.model.account.ProductProperties r0 = new ge.bog.mobilebank.model.account.ProductProperties
            r0.<init>()
            java.lang.String r1 = r4.getAttachmentUrl()
            r2 = 0
            if (r1 == 0) goto L_0x0013
            if (r5 == 0) goto L_0x0013
            setTheme(r0, r2)
            goto L_0x0180
        L_0x0013:
            java.util.ArrayList r5 = r4.getDepositCards()
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0040
            java.util.ArrayList r4 = r4.getDepositCards()
            java.util.Iterator r4 = r4.iterator()
        L_0x0025:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0180
            java.lang.Object r5 = r4.next()
            l50.r r5 = (l50.C25838r) r5
            boolean r1 = r5.mo64602z()
            if (r1 == 0) goto L_0x0025
            java.lang.String r4 = r5.mo64595t()
            setUpProperties(r4, r0)
            goto L_0x0180
        L_0x0040:
            java.lang.String r5 = r4.getProdType()
            if (r5 == 0) goto L_0x0180
            java.lang.String r5 = r4.getProdType()
            r5.hashCode()
            int r1 = r5.hashCode()
            r3 = -1
            switch(r1) {
                case -2130373643: goto L_0x00cb;
                case -1856084230: goto L_0x00c0;
                case -590996656: goto L_0x00b5;
                case 72712: goto L_0x00aa;
                case 2060894: goto L_0x009f;
                case 2571372: goto L_0x0094;
                case 64093436: goto L_0x0089;
                case 155652229: goto L_0x007e;
                case 399530551: goto L_0x0072;
                case 2049775251: goto L_0x0065;
                case 2133533572: goto L_0x0058;
                default: goto L_0x0055;
            }
        L_0x0055:
            r2 = r3
            goto L_0x00d4
        L_0x0058:
            java.lang.String r1 = "MAXIMACARDACCOUNT"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0061
            goto L_0x0055
        L_0x0061:
            r2 = 10
            goto L_0x00d4
        L_0x0065:
            java.lang.String r1 = "ENLARG"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x006e
            goto L_0x0055
        L_0x006e:
            r2 = 9
            goto L_0x00d4
        L_0x0072:
            java.lang.String r1 = "PREMIUM"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x007b
            goto L_0x0055
        L_0x007b:
            r2 = 8
            goto L_0x00d4
        L_0x007e:
            java.lang.String r1 = "MAXIMADEPOSIT"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0087
            goto L_0x0055
        L_0x0087:
            r2 = 7
            goto L_0x00d4
        L_0x0089:
            java.lang.String r1 = "CHILD"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0092
            goto L_0x0055
        L_0x0092:
            r2 = 6
            goto L_0x00d4
        L_0x0094:
            java.lang.String r1 = "TERM"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x009d
            goto L_0x0055
        L_0x009d:
            r2 = 5
            goto L_0x00d4
        L_0x009f:
            java.lang.String r1 = "CALL"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x00a8
            goto L_0x0055
        L_0x00a8:
            r2 = 4
            goto L_0x00d4
        L_0x00aa:
            java.lang.String r1 = "IPO"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x00b3
            goto L_0x0055
        L_0x00b3:
            r2 = 3
            goto L_0x00d4
        L_0x00b5:
            java.lang.String r1 = "EXPRESS"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x00be
            goto L_0x0055
        L_0x00be:
            r2 = 2
            goto L_0x00d4
        L_0x00c0:
            java.lang.String r1 = "SAVING"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x00c9
            goto L_0x0055
        L_0x00c9:
            r2 = 1
            goto L_0x00d4
        L_0x00cb:
            java.lang.String r1 = "INVEST"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x00d4
            goto L_0x0055
        L_0x00d4:
            switch(r2) {
                case 0: goto L_0x016f;
                case 1: goto L_0x015d;
                case 2: goto L_0x014b;
                case 3: goto L_0x0139;
                case 4: goto L_0x0127;
                case 5: goto L_0x016f;
                case 6: goto L_0x0115;
                case 7: goto L_0x0101;
                case 8: goto L_0x00ed;
                case 9: goto L_0x00d9;
                case 10: goto L_0x0101;
                default: goto L_0x00d7;
            }
        L_0x00d7:
            goto L_0x0180
        L_0x00d9:
            boolean r4 = r4.hasSavingGoal()
            if (r4 == 0) goto L_0x00e6
            int r4 = p366bk.C10320i.account_background__deposit_shegrovebadi_saving
            r0.setBackgroundImageId(r4)
            goto L_0x0180
        L_0x00e6:
            int r4 = p366bk.C10320i.account_background__deposit_shegrovebadi
            r0.setBackgroundImageId(r4)
            goto L_0x0180
        L_0x00ed:
            boolean r4 = r4.hasSavingGoal()
            if (r4 == 0) goto L_0x00fa
            int r4 = p366bk.C10320i.account_background__deposit_premiumi_saving
            r0.setBackgroundImageId(r4)
            goto L_0x0180
        L_0x00fa:
            int r4 = p366bk.C10320i.account_background__deposit_premiumi
            r0.setBackgroundImageId(r4)
            goto L_0x0180
        L_0x0101:
            boolean r4 = r4.hasSavingGoal()
            if (r4 == 0) goto L_0x010e
            int r4 = p366bk.C10320i.account_background__deposit_maxima_saving
            r0.setBackgroundImageId(r4)
            goto L_0x0180
        L_0x010e:
            int r4 = p366bk.C10320i.account_background__deposit_maxima
            r0.setBackgroundImageId(r4)
            goto L_0x0180
        L_0x0115:
            boolean r4 = r4.hasSavingGoal()
            if (r4 == 0) goto L_0x0121
            int r4 = p366bk.C10320i.account_background__deposit_sabavshvo_saving
            r0.setBackgroundImageId(r4)
            goto L_0x0180
        L_0x0121:
            int r4 = p366bk.C10320i.account_background__deposit_sabavshvo
            r0.setBackgroundImageId(r4)
            goto L_0x0180
        L_0x0127:
            boolean r4 = r4.hasSavingGoal()
            if (r4 == 0) goto L_0x0133
            int r4 = p366bk.C10320i.account_background__deposit_motxovnamde_saving
            r0.setBackgroundImageId(r4)
            goto L_0x0180
        L_0x0133:
            int r4 = p366bk.C10320i.account_background__deposit_motxovnamde
            r0.setBackgroundImageId(r4)
            goto L_0x0180
        L_0x0139:
            boolean r4 = r4.hasSavingGoal()
            if (r4 == 0) goto L_0x0145
            int r4 = p366bk.C10320i.account_background__deposit_ipo_saving
            r0.setBackgroundImageId(r4)
            goto L_0x0180
        L_0x0145:
            int r4 = p366bk.C10320i.account_background__deposit_ipo
            r0.setBackgroundImageId(r4)
            goto L_0x0180
        L_0x014b:
            boolean r4 = r4.hasSavingGoal()
            if (r4 == 0) goto L_0x0157
            int r4 = p366bk.C10320i.account_background__deposit_express_saving
            r0.setBackgroundImageId(r4)
            goto L_0x0180
        L_0x0157:
            int r4 = p366bk.C10320i.account_background__deposit_express
            r0.setBackgroundImageId(r4)
            goto L_0x0180
        L_0x015d:
            boolean r4 = r4.hasSavingGoal()
            if (r4 == 0) goto L_0x0169
            int r4 = p366bk.C10320i.account_background__deposit_shemnaxveli_saving
            r0.setBackgroundImageId(r4)
            goto L_0x0180
        L_0x0169:
            int r4 = p366bk.C10320i.account_background__deposit_shemnaxveli
            r0.setBackgroundImageId(r4)
            goto L_0x0180
        L_0x016f:
            boolean r4 = r4.hasSavingGoal()
            if (r4 == 0) goto L_0x017b
            int r4 = p366bk.C10320i.account_background__deposit_vadiani_saving
            r0.setBackgroundImageId(r4)
            goto L_0x0180
        L_0x017b:
            int r4 = p366bk.C10320i.account_background__deposit_vadiani
            r0.setBackgroundImageId(r4)
        L_0x0180:
            int r4 = invertWhiteColor
            r0.setOvalFillColorId(r4)
            int r4 = invertBlackColor
            r0.setOvalTextColorId(r4)
            int r4 = invertBlackColor
            r0.setOvalBorderColorId(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.model.account.ProductProperties.getProperties(ge.bog.mobilebank.model.deposits.Deposit, boolean):ge.bog.mobilebank.model.account.ProductProperties");
    }

    public static ProductProperties getProperties(BonusScoolUiModel bonusScoolUiModel, Boolean bool) {
        ProductProperties productProperties = new ProductProperties();
        String e = bonusScoolUiModel.mo52781e();
        e.hashCode();
        char c = 65535;
        switch (e.hashCode()) {
            case -1468346597:
                if (e.equals("MCSC_REG")) {
                    c = 0;
                    break;
                }
                break;
            case -560247579:
                if (e.equals("MCMCDEBCLTB1")) {
                    c = 1;
                    break;
                }
                break;
            case -560247578:
                if (e.equals("MCMCDEBCLTB2")) {
                    c = 2;
                    break;
                }
                break;
            case 120474253:
                if (e.equals("MCMCDEBCLB1")) {
                    c = 3;
                    break;
                }
                break;
            case 120474254:
                if (e.equals("MCMCDEBCLB2")) {
                    c = 4;
                    break;
                }
                break;
            case 120474749:
                if (e.equals("MCMCDEBCLR1")) {
                    c = 5;
                    break;
                }
                break;
            case 120474750:
                if (e.equals("MCMCDEBCLR2")) {
                    c = 6;
                    break;
                }
                break;
            case 728532142:
                if (e.equals("MCSC_REG_HR")) {
                    c = 7;
                    break;
                }
                break;
            case 1615201483:
                if (e.equals("MCSC_BT")) {
                    c = 8;
                    break;
                }
                break;
            case 1615201978:
                if (e.equals("MCSC_RS")) {
                    c = 9;
                    break;
                }
                break;
            case 1615202023:
                if (e.equals("MCSC_TB")) {
                    c = 10;
                    break;
                }
                break;
            case 1615202214:
                if (e.equals("MCSC_ZG")) {
                    c = 11;
                    break;
                }
                break;
            case 1725434338:
                if (e.equals("MCSC_BT_V")) {
                    c = 12;
                    break;
                }
                break;
            case 1725910033:
                if (e.equals("MCSC_RS_V")) {
                    c = 13;
                    break;
                }
                break;
            case 1725953278:
                if (e.equals("MCSC_TB_V")) {
                    c = 14;
                    break;
                }
                break;
            case 1726136829:
                if (e.equals("MCSC_ZG_V")) {
                    c = 15;
                    break;
                }
                break;
            case 1948856574:
                if (e.equals("MCSC_BT_HR")) {
                    c = 16;
                    break;
                }
                break;
            case 1963163698:
                if (e.equals("MCSC_REG_V")) {
                    c = 17;
                    break;
                }
                break;
            case 1963603119:
                if (e.equals("MCSC_RS_HR")) {
                    c = 18;
                    break;
                }
                break;
            case 1964943714:
                if (e.equals("MCSC_TB_HR")) {
                    c = 19;
                    break;
                }
                break;
            case 1970633795:
                if (e.equals("MCSC_ZG_HR")) {
                    c = 20;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                productProperties.setBackgroundImageId(C10320i.account_background_scool_card);
                setTheme(productProperties, false);
                break;
            case 1:
            case 3:
            case 5:
                productProperties.setBackgroundImageId(C10320i.account_background_scoolcard_2);
                setTheme(productProperties, false);
                break;
            case 2:
            case 4:
            case 6:
                productProperties.setBackgroundImageId(C10320i.account_background_scoolcard_1);
                setTheme(productProperties, false);
                break;
            default:
                setTheme(productProperties, !bool.booleanValue());
                break;
        }
        return productProperties;
    }
}
