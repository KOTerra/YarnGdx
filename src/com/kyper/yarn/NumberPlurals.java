package com.kyper.yarn;

public class NumberPlurals {

	public enum PluralCase {
		Zero, One, Two, Few, Many, Other
	};

	// Bambara (bm), Tibetan (bo), Dzongkha (dz), Indonesian (id), Igbo
	// (ig), Sichuan Yi (ii), <unknown> (in), Japanese (ja), Lojban
	// (jbo), Javanese (jv), <unknown> (jw), Makonde (kde),
	// Kabuverdianu (kea), Khmer (km), Korean (ko), Lakota (lkt), Lao
	// (lo), Malay (ms), Burmese (my), N’Ko (nqo), Osage (osa), Root
	// (root), Sakha (sah), Koyraboro Senni (ses), Sango (sg),
	// Sundanese (su), Thai (th), Tongan (to), Vietnamese (vi), Wolof
	// (wo), Yoruba (yo), Cantonese (yue), Chinese (zh)
	private static PluralCase GetCardinalPluralCase_0(double number) {

		return PluralCase.Other;

	}

	// Amharic (am), Assamese (as), Bangla (bn), Persian (fa), Gujarati
	// (gu), Hindi (hi), Kannada (kn), Zulu (zu)
	private static PluralCase GetCardinalPluralCase_1(double number) {
		// absolute value of number
		double n = Math.abs(number);
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);

		if (((i == 0)) || ((n == 1))) {
			return PluralCase.One;
		}

		return PluralCase.Other;

	}

	// Fulah (ff), French (fr), Armenian (hy), Kabyle (kab)
	private static PluralCase GetCardinalPluralCase_2(double number) {
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);

		if (((i == 0) || (i == 1))) {
			return PluralCase.One;
		}

		return PluralCase.Other;

	}

	// Portuguese (pt)
	private static PluralCase GetCardinalPluralCase_3(double number) {
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);

		if (((i >= 0 && i <= 1))) {
			return PluralCase.One;
		}

		return PluralCase.Other;
	}

	// Asturian (ast), Catalan (ca), German (de), English (en),
	// Estonian (et), Finnish (fi), Western Frisian (fy), Galician
	// (gl), Interlingua (ia), Ido (io), Italian (it), <unknown> (ji),
	// Dutch (nl), European Portuguese (pt_PT), Sardinian (sc),
	// Sicilian (scn), Swedish (sv), Swahili (sw), Urdu (ur), Yiddish
	// (yi)
	private static PluralCase GetCardinalPluralCase_4(double number) {
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);
		// Number of visible fraction digits with trailing zeroes
		int v = NumberHelpers.VisibleFractionalDigits(number, true);

		if (((i == 1) && (v == 0))) {
			return PluralCase.One;
		}

		return PluralCase.Other;

	}

	// Sinhala (si)
	private static PluralCase GetCardinalPluralCase_5(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);
		// Fractional value, with trailing zeroes
		int f = NumberHelpers.FractionalValue(number); // TODO: trailing zeroes are not supported

		if (((n == 0) || (n == 1)) || ((i == 0) && (f == 1))) {
			return PluralCase.One;
		}

		return PluralCase.Other;

	}

	// Akan (ak), Bhojpuri (bho), <unknown> (guw), Lingala (ln),
	// Malagasy (mg), Northern Sotho (nso), Punjabi (pa), Tigrinya
	// (ti), Walloon (wa)
	private static PluralCase GetCardinalPluralCase_6(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n >= 0 && n <= 1))) {
			return PluralCase.One;
		}

		return PluralCase.Other;

	}

	// Central Atlas Tamazight (tzm)
	private static PluralCase GetCardinalPluralCase_7(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n >= 0 && n <= 1)) || ((n >= 11 && n <= 99))) {
			return PluralCase.One;
		}

		return PluralCase.Other;

	}

	// Afrikaans (af), Aragonese (an), Asu (asa), Azerbaijani (az),
	// Bemba (bem), Bena (bez), Bulgarian (bg), Bodo (brx), Chechen
	// (ce), Chiga (cgg), Cherokee (chr), Central Kurdish (ckb), Divehi
	// (dv), Ewe (ee), Greek (el), Esperanto (eo), Spanish (es), Basque
	// (eu), Faroese (fo), Friulian (fur), Swiss German (gsw), Hausa
	// (ha), Hawaiian (haw), Hungarian (hu), Ngomba (jgo), Machame
	// (jmc), Georgian (ka), Jju (kaj), Tyap (kcg), Kazakh (kk), Kako
	// (kkj), Kalaallisut (kl), Kashmiri (ks), Shambala (ksb), Kurdish
	// (ku), Kyrgyz (ky), Luxembourgish (lb), Ganda (lg), Masai (mas),
	// Metaʼ (mgo), Malayalam (ml), Mongolian (mn), Marathi (mr),
	// <unknown> (nah), Norwegian Bokmål (nb), North Ndebele (nd),
	// Nepali (ne), Norwegian Nynorsk (nn), Ngiemboon (nnh), Norwegian
	// (no), South Ndebele (nr), Nyanja (ny), Nyankole (nyn), Oromo
	// (om), Odia (or), Ossetic (os), Papiamento (pap), Pashto (ps),
	// Romansh (rm), Rombo (rof), Rwa (rwk), Samburu (saq), Sindhi
	// (sd), Southern Kurdish (sdh), Sena (seh), Shona (sn), Somali
	// (so), Albanian (sq), Swati (ss), Saho (ssy), Southern Sotho
	// (st), Syriac (syr), Tamil (ta), Telugu (te), Teso (teo), Tigre
	// (tig), Turkmen (tk), Tswana (tn), Turkish (tr), Tsonga (ts),
	// Uyghur (ug), Uzbek (uz), Venda (ve), Volapük (vo), Vunjo (vun),
	// Walser (wae), Xhosa (xh), Soga (xog)
	private static PluralCase GetCardinalPluralCase_8(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 1))) {
			return PluralCase.One;
		}

		return PluralCase.Other;

	}

	// Danish (da)
	private static PluralCase GetCardinalPluralCase_9(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);
		// Fractional value, without trailing zeroes
		int t = NumberHelpers.FractionalValue(number);

		if (((n == 1)) || (!((t == 0)) && (i == 0) || (i == 1))) {
			return PluralCase.One;
		}

		return PluralCase.Other;

	}

	// Icelandic (is)
	private static PluralCase GetCardinalPluralCase_10(double number) {
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);
		// Fractional value, without trailing zeroes
		int t = NumberHelpers.FractionalValue(number);

		if (((t == 0) && ((i % 10) == 1) && !(((i % 100) == 11))) || (!((t == 0)))) {
			return PluralCase.One;
		}

		return PluralCase.Other;

	}

	// Macedonian (mk)
	private static PluralCase GetCardinalPluralCase_11(double number) {
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);
		// Number of visible fraction digits with trailing zeroes
		int v = NumberHelpers.VisibleFractionalDigits(number, true);
		// Fractional value, with trailing zeroes
		int f = NumberHelpers.FractionalValue(number); // TODO: trailing zeroes are not supported

		if (((v == 0) && ((i % 10) == 1) && !(((i % 100) == 11))) || (((f % 10) == 1) && !(((f % 100) == 11)))) {
			return PluralCase.One;
		}

		return PluralCase.Other;

	}

	// Cebuano (ceb), Filipino (fil), Tagalog (tl)
	private static PluralCase GetCardinalPluralCase_12(double number) {
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);
		// Number of visible fraction digits with trailing zeroes
		int v = NumberHelpers.VisibleFractionalDigits(number, true);
		// Fractional value, with trailing zeroes
		int f = NumberHelpers.FractionalValue(number); // TODO: trailing zeroes are not supported

		if (((v == 0) && (i == 1) || (i == 2) || (i == 3))
				|| ((v == 0) && !(((i % 10) == 4) || ((i % 10) == 6) || ((i % 10) == 9)))
				|| (!((v == 0)) && !(((f % 10) == 4) || ((f % 10) == 6) || ((f % 10) == 9)))) {
			return PluralCase.One;
		}

		return PluralCase.Other;

	}

	// Latvian (lv), Prussian (prg)
	private static PluralCase GetCardinalPluralCase_13(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);
		// Number of visible fraction digits with trailing zeroes
		int v = NumberHelpers.VisibleFractionalDigits(number, true);
		// Fractional value, with trailing zeroes
		int f = NumberHelpers.FractionalValue(number); // TODO: trailing zeroes are not supported

		if ((((n % 10) == 0)) || (((n % 100) >= 11 && (n % 100) <= 19))
				|| ((v == 2) && ((f % 100) >= 11 && (f % 100) <= 19))) {
			return PluralCase.Zero;
		}

		if ((((n % 10) == 1) && !(((n % 100) == 11))) || ((v == 2) && ((f % 10) == 1) && !(((f % 100) == 11)))
				|| (!((v == 2)) && ((f % 10) == 1))) {
			return PluralCase.One;
		}

		return PluralCase.Other;
	}

	// Langi (lag)
	private static PluralCase GetCardinalPluralCase_14(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);

		if (((n == 0))) {
			return PluralCase.Zero;
		}

		if (((i == 0) || (i == 1) && !((n == 0)))) {
			return PluralCase.One;
		}

		return PluralCase.Other;

	}

	// Colognian (ksh)
	private static PluralCase GetCardinalPluralCase_15(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 0))) {
			return PluralCase.Zero;
		}

		if (((n == 1))) {
			return PluralCase.One;
		}

		return PluralCase.Other;

	}

	// Inuktitut (iu), Nama (naq), Northern Sami (se), Southern Sami
	// (sma), <unknown> (smi), Lule Sami (smj), Inari Sami (smn), Skolt
	// Sami (sms)
	private static PluralCase GetCardinalPluralCase_16(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 1))) {
			return PluralCase.One;
		}

		if (((n == 2))) {
			return PluralCase.Two;
		}

		return PluralCase.Other;

	}

	// Tachelhit (shi)
	private static PluralCase GetCardinalPluralCase_17(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);

		if (((i == 0)) || ((n == 1))) {
			return PluralCase.One;
		}

		if (((n >= 2 && n <= 10))) {
			return PluralCase.Few;
		}

		return PluralCase.Other;

	}

	// <unknown> (mo), Romanian (ro)
	private static PluralCase GetCardinalPluralCase_18(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);
		// Number of visible fraction digits with trailing zeroes
		int v = NumberHelpers.VisibleFractionalDigits(number, true);

		if (((i == 1) && (v == 0))) {
			return PluralCase.One;
		}

		if ((!((v == 0))) || ((n == 0)) || (((n % 100) >= 2 && (n % 100) <= 19))) {
			return PluralCase.Few;
		}

		return PluralCase.Other;

	}

	// Bosnian (bs), Croatian (hr), Serbo-Croatian (sh), Serbian (sr)
	private static PluralCase GetCardinalPluralCase_19(double number) {
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);
		// Number of visible fraction digits with trailing zeroes
		int v = NumberHelpers.VisibleFractionalDigits(number, true);
		// Fractional value, with trailing zeroes
		int f = NumberHelpers.FractionalValue(number); // TODO: trailing zeroes are not supported

		if (((v == 0) && ((i % 10) == 1) && !(((i % 100) == 11))) || (((f % 10) == 1) && !(((f % 100) == 11)))) {
			return PluralCase.One;
		}

		if (((v == 0) && ((i % 10) >= 2 && (i % 10) <= 4) && !(((i % 100) >= 12 && (i % 100) <= 14)))
				|| (((f % 10) >= 2 && (f % 10) <= 4) && !(((f % 100) >= 12 && (f % 100) <= 14)))) {
			return PluralCase.Few;
		}

		return PluralCase.Other;

	}

	// Scottish Gaelic (gd)
	private static PluralCase GetCardinalPluralCase_20(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 1) || (n == 11))) {
			return PluralCase.One;
		}

		if (((n == 2) || (n == 12))) {
			return PluralCase.Two;
		}

		if (((n >= 3 && n <= 10) || (n >= 13 && n <= 19))) {
			return PluralCase.Few;
		}

		return PluralCase.Other;

	}

	// Slovenian (sl)
	private static PluralCase GetCardinalPluralCase_21(double number) {
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);
		// Number of visible fraction digits with trailing zeroes
		int v = NumberHelpers.VisibleFractionalDigits(number, true);

		if (((v == 0) && ((i % 100) == 1))) {
			return PluralCase.One;
		}

		if (((v == 0) && ((i % 100) == 2))) {
			return PluralCase.Two;
		}

		if (((v == 0) && ((i % 100) >= 3 && (i % 100) <= 4)) || (!((v == 0)))) {
			return PluralCase.Few;
		}

		return PluralCase.Other;

	}

	// Lower Sorbian (dsb), Upper Sorbian (hsb)
	private static PluralCase GetCardinalPluralCase_22(double number) {
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);
		// Number of visible fraction digits with trailing zeroes
		int v = NumberHelpers.VisibleFractionalDigits(number, true);
		// Fractional value, with trailing zeroes
		int f = NumberHelpers.FractionalValue(number); // TODO: trailing zeroes are not supported

		if (((v == 0) && ((i % 100) == 1)) || (((f % 100) == 1))) {
			return PluralCase.One;
		}

		if (((v == 0) && ((i % 100) == 2)) || (((f % 100) == 2))) {
			return PluralCase.Two;
		}

		if (((v == 0) && ((i % 100) >= 3 && (i % 100) <= 4)) || (((f % 100) >= 3 && (f % 100) <= 4))) {
			return PluralCase.Few;
		}

		return PluralCase.Other;

	}

	// Hebrew (he), <unknown> (iw)
	private static PluralCase GetCardinalPluralCase_23(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);
		// Number of visible fraction digits with trailing zeroes
		int v = NumberHelpers.VisibleFractionalDigits(number, true);

		if (((i == 1) && (v == 0))) {
			return PluralCase.One;
		}

		if (((i == 2) && (v == 0))) {
			return PluralCase.Two;
		}

		if (((v == 0) && !((n >= 0 && n <= 10)) && ((n % 10) == 0))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Czech (cs), Slovak (sk)
	private static PluralCase GetCardinalPluralCase_24(double number) {
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);
		// Number of visible fraction digits with trailing zeroes
		int v = NumberHelpers.VisibleFractionalDigits(number, true);

		if (((i == 1) && (v == 0))) {
			return PluralCase.One;
		}

		if (((i >= 2 && i <= 4) && (v == 0))) {
			return PluralCase.Few;
		}

		if ((!((v == 0)))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Polish (pl)
	private static PluralCase GetCardinalPluralCase_25(double number) {
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);
		// Number of visible fraction digits with trailing zeroes
		int v = NumberHelpers.VisibleFractionalDigits(number, true);

		if (((i == 1) && (v == 0))) {
			return PluralCase.One;
		}

		if (((v == 0) && ((i % 10) >= 2 && (i % 10) <= 4) && !(((i % 100) >= 12 && (i % 100) <= 14)))) {
			return PluralCase.Few;
		}

		if (((v == 0) && !((i == 1)) && ((i % 10) >= 0 && (i % 10) <= 1))
				|| ((v == 0) && ((i % 10) >= 5 && (i % 10) <= 9))
				|| ((v == 0) && ((i % 100) >= 12 && (i % 100) <= 14))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Belarusian (be)
	private static PluralCase GetCardinalPluralCase_26(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if ((((n % 10) == 1) && !(((n % 100) == 11)))) {
			return PluralCase.One;
		}

		if ((((n % 10) >= 2 && (n % 10) <= 4) && !(((n % 100) >= 12 && (n % 100) <= 14)))) {
			return PluralCase.Few;
		}

		if ((((n % 10) == 0)) || (((n % 10) >= 5 && (n % 10) <= 9)) || (((n % 100) >= 11 && (n % 100) <= 14))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Lithuanian (lt)
	private static PluralCase GetCardinalPluralCase_27(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);
		// Fractional value, with trailing zeroes
		int f = NumberHelpers.FractionalValue(number); // TODO: trailing zeroes are not supported

		if ((((n % 10) == 1) && !(((n % 100) >= 11 && (n % 100) <= 19)))) {
			return PluralCase.One;
		}

		if ((((n % 10) >= 2 && (n % 10) <= 9) && !(((n % 100) >= 11 && (n % 100) <= 19)))) {
			return PluralCase.Few;
		}

		if ((!((f == 0)))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Maltese (mt)
	private static PluralCase GetCardinalPluralCase_28(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 1))) {
			return PluralCase.One;
		}

		if (((n == 0)) || (((n % 100) >= 2 && (n % 100) <= 10))) {
			return PluralCase.Few;
		}

		if ((((n % 100) >= 11 && (n % 100) <= 19))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Russian (ru), Ukrainian (uk)
	private static PluralCase GetCardinalPluralCase_29(double number) {
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);
		// Number of visible fraction digits with trailing zeroes
		int v = NumberHelpers.VisibleFractionalDigits(number, true);

		if (((v == 0) && ((i % 10) == 1) && !(((i % 100) == 11)))) {
			return PluralCase.One;
		}

		if (((v == 0) && ((i % 10) >= 2 && (i % 10) <= 4) && !(((i % 100) >= 12 && (i % 100) <= 14)))) {
			return PluralCase.Few;
		}

		if (((v == 0) && ((i % 10) == 0)) || ((v == 0) && ((i % 10) >= 5 && (i % 10) <= 9))
				|| ((v == 0) && ((i % 100) >= 11 && (i % 100) <= 14))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Breton (br)
	private static PluralCase GetCardinalPluralCase_30(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if ((((n % 10) == 1) && !(((n % 100) == 11) || ((n % 100) == 71) || ((n % 100) == 91)))) {
			return PluralCase.One;
		}

		if ((((n % 10) == 2) && !(((n % 100) == 12) || ((n % 100) == 72) || ((n % 100) == 92)))) {
			return PluralCase.Two;
		}

		if ((((n % 10) >= 3 && (n % 10) <= 4) || ((n % 10) == 9) && !(((n % 100) >= 10 && (n % 100) <= 19)
				|| ((n % 100) >= 70 && (n % 100) <= 79) || ((n % 100) >= 90 && (n % 100) <= 99)))) {
			return PluralCase.Few;
		}

		if ((!((n == 0)) && ((n % 1000000) == 0))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Irish (ga)
	private static PluralCase GetCardinalPluralCase_31(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 1))) {
			return PluralCase.One;
		}

		if (((n == 2))) {
			return PluralCase.Two;
		}

		if (((n >= 3 && n <= 6))) {
			return PluralCase.Few;
		}

		if (((n >= 7 && n <= 10))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Manx (gv)
	private static PluralCase GetCardinalPluralCase_32(double number) {
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);
		// Number of visible fraction digits with trailing zeroes
		int v = NumberHelpers.VisibleFractionalDigits(number, true);

		if (((v == 0) && ((i % 10) == 1))) {
			return PluralCase.One;
		}

		if (((v == 0) && ((i % 10) == 2))) {
			return PluralCase.Two;
		}

		if (((v == 0) && ((i % 100) == 0) || ((i % 100) == 20) || ((i % 100) == 40) || ((i % 100) == 60)
				|| ((i % 100) == 80))) {
			return PluralCase.Few;
		}

		if ((!((v == 0)))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Cornish (kw)
	private static PluralCase GetCardinalPluralCase_33(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 0))) {
			return PluralCase.Zero;
		}

		if (((n == 1))) {
			return PluralCase.One;
		}

		if ((((n % 100) == 2) || ((n % 100) == 22) || ((n % 100) == 42) || ((n % 100) == 62) || ((n % 100) == 82))
				|| (((n % 1000) == 0) && ((n % 100000) >= 1000 && (n % 100000) <= 20000) || ((n % 100000) == 40000)
						|| ((n % 100000) == 60000) || ((n % 100000) == 80000))
				|| (!((n == 0)) && ((n % 1000000) == 100000))) {
			return PluralCase.Two;
		}

		if ((((n % 100) == 3) || ((n % 100) == 23) || ((n % 100) == 43) || ((n % 100) == 63) || ((n % 100) == 83))) {
			return PluralCase.Few;
		}

		if ((!((n == 1)) && ((n % 100) == 1) || ((n % 100) == 21) || ((n % 100) == 41) || ((n % 100) == 61)
				|| ((n % 100) == 81))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Arabic (ar), Najdi Arabic (ars)
	private static PluralCase GetCardinalPluralCase_34(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 0))) {
			return PluralCase.Zero;
		}

		if (((n == 1))) {
			return PluralCase.One;
		}

		if (((n == 2))) {
			return PluralCase.Two;
		}

		if ((((n % 100) >= 3 && (n % 100) <= 10))) {
			return PluralCase.Few;
		}

		if ((((n % 100) >= 11 && (n % 100) <= 99))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Welsh (cy)
	private static PluralCase GetCardinalPluralCase_35(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 0))) {
			return PluralCase.Zero;
		}

		if (((n == 1))) {
			return PluralCase.One;
		}

		if (((n == 2))) {
			return PluralCase.Two;
		}

		if (((n == 3))) {
			return PluralCase.Few;
		}

		if (((n == 6))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Afrikaans (af), Amharic (am), Aragonese (an), Arabic (ar),
	// Bulgarian (bg), Bosnian (bs), Chechen (ce), Czech (cs), Danish
	// (da), German (de), Lower Sorbian (dsb), Greek (el), Spanish
	// (es), Estonian (et), Basque (eu), Persian (fa), Finnish (fi),
	// Western Frisian (fy), Galician (gl), Swiss German (gsw), Hebrew
	// (he), Croatian (hr), Upper Sorbian (hsb), Interlingua (ia),
	// Indonesian (id), <unknown> (in), Icelandic (is), <unknown> (iw),
	// Japanese (ja), Khmer (km), Kannada (kn), Korean (ko), Kyrgyz
	// (ky), Lithuanian (lt), Latvian (lv), Malayalam (ml), Mongolian
	// (mn), Burmese (my), Norwegian Bokmål (nb), Dutch (nl), Punjabi
	// (pa), Polish (pl), Prussian (prg), Pashto (ps), Portuguese (pt),
	// Root (root), Russian (ru), Sindhi (sd), Serbo-Croatian (sh),
	// Sinhala (si), Slovak (sk), Slovenian (sl), Serbian (sr), Swahili
	// (sw), Tamil (ta), Telugu (te), Thai (th), Turkish (tr), Urdu
	// (ur), Uzbek (uz), Cantonese (yue), Chinese (zh), Zulu (zu)
	private static PluralCase GetOrdinalPluralCase_36(double number) {

		return PluralCase.Other;

	}

	// Swedish (sv)
	private static PluralCase GetOrdinalPluralCase_37(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if ((((n % 10) == 1) || ((n % 10) == 2) && !(((n % 100) == 11) || ((n % 100) == 12)))) {
			return PluralCase.One;
		}

		return PluralCase.Other;

	}

	// Filipino (fil), French (fr), Irish (ga), Armenian (hy), Lao
	// (lo), <unknown> (mo), Malay (ms), Romanian (ro), Tagalog (tl),
	// Vietnamese (vi)
	private static PluralCase GetOrdinalPluralCase_38(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 1))) {
			return PluralCase.One;
		}

		return PluralCase.Other;

	}

	// Hungarian (hu)
	private static PluralCase GetOrdinalPluralCase_39(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 1) || (n == 5))) {
			return PluralCase.One;
		}

		return PluralCase.Other;

	}

	// Nepali (ne)
	private static PluralCase GetOrdinalPluralCase_40(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n >= 1 && n <= 4))) {
			return PluralCase.One;
		}

		return PluralCase.Other;

	}

	// Belarusian (be)
	private static PluralCase GetOrdinalPluralCase_41(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if ((((n % 10) == 2) || ((n % 10) == 3) && !(((n % 100) == 12) || ((n % 100) == 13)))) {
			return PluralCase.Few;
		}

		return PluralCase.Other;

	}

	// Ukrainian (uk)
	private static PluralCase GetOrdinalPluralCase_42(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if ((((n % 10) == 3) && !(((n % 100) == 13)))) {
			return PluralCase.Few;
		}

		return PluralCase.Other;

	}

	// Turkmen (tk)
	private static PluralCase GetOrdinalPluralCase_43(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if ((((n % 10) == 6) || ((n % 10) == 9)) || ((n == 10))) {
			return PluralCase.Few;
		}

		return PluralCase.Other;

	}

	// Kazakh (kk)
	private static PluralCase GetOrdinalPluralCase_44(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if ((((n % 10) == 6)) || (((n % 10) == 9)) || (((n % 10) == 0) && !((n == 0)))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Italian (it), Sardinian (sc), Sicilian (scn)
	private static PluralCase GetOrdinalPluralCase_45(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 11) || (n == 8) || (n == 80) || (n == 800))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Georgian (ka)
	private static PluralCase GetOrdinalPluralCase_46(double number) {
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);

		if (((i == 1))) {
			return PluralCase.One;
		}

		if (((i == 0)) || (((i % 100) >= 2 && (i % 100) <= 20) || ((i % 100) == 40) || ((i % 100) == 60)
				|| ((i % 100) == 80))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Albanian (sq)
	private static PluralCase GetOrdinalPluralCase_47(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 1))) {
			return PluralCase.One;
		}

		if ((((n % 10) == 4) && !(((n % 100) == 14)))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Cornish (kw)
	private static PluralCase GetOrdinalPluralCase_48(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n >= 1 && n <= 4)) || (((n % 100) >= 1 && (n % 100) <= 4) || ((n % 100) >= 21 && (n % 100) <= 24)
				|| ((n % 100) >= 41 && (n % 100) <= 44) || ((n % 100) >= 61 && (n % 100) <= 64)
				|| ((n % 100) >= 81 && (n % 100) <= 84))) {
			return PluralCase.One;
		}

		if (((n == 5)) || (((n % 100) == 5))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// English (en)
	private static PluralCase GetOrdinalPluralCase_49(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if ((((n % 10) == 1) && !(((n % 100) == 11)))) {
			return PluralCase.One;
		}

		if ((((n % 10) == 2) && !(((n % 100) == 12)))) {
			return PluralCase.Two;
		}

		if ((((n % 10) == 3) && !(((n % 100) == 13)))) {
			return PluralCase.Few;
		}

		return PluralCase.Other;

	}

	// Marathi (mr)
	private static PluralCase GetOrdinalPluralCase_50(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 1))) {
			return PluralCase.One;
		}

		if (((n == 2) || (n == 3))) {
			return PluralCase.Two;
		}

		if (((n == 4))) {
			return PluralCase.Few;
		}

		return PluralCase.Other;

	}

	// Scottish Gaelic (gd)
	private static PluralCase GetOrdinalPluralCase_51(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 1) || (n == 11))) {
			return PluralCase.One;
		}

		if (((n == 2) || (n == 12))) {
			return PluralCase.Two;
		}

		if (((n == 3) || (n == 13))) {
			return PluralCase.Few;
		}

		return PluralCase.Other;

	}

	// Catalan (ca)
	private static PluralCase GetOrdinalPluralCase_52(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 1) || (n == 3))) {
			return PluralCase.One;
		}

		if (((n == 2))) {
			return PluralCase.Two;
		}

		if (((n == 4))) {
			return PluralCase.Few;
		}

		return PluralCase.Other;

	}

	// Macedonian (mk)
	private static PluralCase GetOrdinalPluralCase_53(double number) {
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);

		if ((((i % 10) == 1) && !(((i % 100) == 11)))) {
			return PluralCase.One;
		}

		if ((((i % 10) == 2) && !(((i % 100) == 12)))) {
			return PluralCase.Two;
		}

		if ((((i % 10) == 7) || ((i % 10) == 8) && !(((i % 100) == 17) || ((i % 100) == 18)))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Azerbaijani (az)
	private static PluralCase GetOrdinalPluralCase_54(double number) {
		// Integer part of number
		int i = NumberHelpers.IntegerValue(number);

		if ((((i % 10) == 1) || ((i % 10) == 2) || ((i % 10) == 5) || ((i % 10) == 7) || ((i % 10) == 8))
				|| (((i % 100) == 20) || ((i % 100) == 50) || ((i % 100) == 70) || ((i % 100) == 80))) {
			return PluralCase.One;
		}

		if ((((i % 10) == 3) || ((i % 10) == 4)) || (((i % 1000) == 100) || ((i % 1000) == 200) || ((i % 1000) == 300)
				|| ((i % 1000) == 400) || ((i % 1000) == 500) || ((i % 1000) == 600) || ((i % 1000) == 700)
				|| ((i % 1000) == 800) || ((i % 1000) == 900))) {
			return PluralCase.Few;
		}

		if (((i == 0)) || (((i % 10) == 6)) || (((i % 100) == 40) || ((i % 100) == 60) || ((i % 100) == 90))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Gujarati (gu), Hindi (hi)
	private static PluralCase GetOrdinalPluralCase_55(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 1))) {
			return PluralCase.One;
		}

		if (((n == 2) || (n == 3))) {
			return PluralCase.Two;
		}

		if (((n == 4))) {
			return PluralCase.Few;
		}

		if (((n == 6))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Assamese (as), Bangla (bn)
	private static PluralCase GetOrdinalPluralCase_56(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 1) || (n == 5) || (n == 7) || (n == 8) || (n == 9) || (n == 10))) {
			return PluralCase.One;
		}

		if (((n == 2) || (n == 3))) {
			return PluralCase.Two;
		}

		if (((n == 4))) {
			return PluralCase.Few;
		}

		if (((n == 6))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Odia (or)
	private static PluralCase GetOrdinalPluralCase_57(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 1) || (n == 5) || (n >= 7 && n <= 9))) {
			return PluralCase.One;
		}

		if (((n == 2) || (n == 3))) {
			return PluralCase.Two;
		}

		if (((n == 4))) {
			return PluralCase.Few;
		}

		if (((n == 6))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	// Welsh (cy)
	private static PluralCase GetOrdinalPluralCase_58(double number) {
		// absolute value of number
		double n = NumberHelpers.absoluteValue(number);

		if (((n == 0) || (n == 7) || (n == 8) || (n == 9))) {
			return PluralCase.Zero;
		}

		if (((n == 1))) {
			return PluralCase.One;
		}

		if (((n == 2))) {
			return PluralCase.Two;
		}

		if (((n == 3) || (n == 4))) {
			return PluralCase.Few;
		}

		if (((n == 5) || (n == 6))) {
			return PluralCase.Many;
		}

		return PluralCase.Other;

	}

	public static PluralCase GetCardinalPluralCase(String localeCode, double value) {
		if (localeCode == "bm" || localeCode == "bo" || localeCode == "dz" || localeCode == "id" || localeCode == "ig"
				|| localeCode == "ii" || localeCode == "in" || localeCode == "ja" || localeCode == "jbo"
				|| localeCode == "jv" || localeCode == "jw" || localeCode == "kde" || localeCode == "kea"
				|| localeCode == "km" || localeCode == "ko" || localeCode == "lkt" || localeCode == "lo"
				|| localeCode == "ms" || localeCode == "my" || localeCode == "nqo" || localeCode == "osa"
				|| localeCode == "root" || localeCode == "sah" || localeCode == "ses" || localeCode == "sg"
				|| localeCode == "su" || localeCode == "th" || localeCode == "to" || localeCode == "vi"
				|| localeCode == "wo" || localeCode == "yo" || localeCode == "yue" || localeCode == "zh") {
			return GetCardinalPluralCase_0(value);
		}

		if (localeCode == "am" || localeCode == "as" || localeCode == "bn" || localeCode == "fa" || localeCode == "gu"
				|| localeCode == "hi" || localeCode == "kn" || localeCode == "zu") {
			return GetCardinalPluralCase_1(value);
		}

		if (localeCode == "ff" || localeCode == "fr" || localeCode == "hy" || localeCode == "kab") {
			return GetCardinalPluralCase_2(value);
		}

		if (localeCode == "pt") {
			return GetCardinalPluralCase_3(value);
		}

		if (localeCode == "ast" || localeCode == "ca" || localeCode == "de" || localeCode == "en" || localeCode == "et"
				|| localeCode == "fi" || localeCode == "fy" || localeCode == "gl" || localeCode == "ia"
				|| localeCode == "io" || localeCode == "it" || localeCode == "ji" || localeCode == "nl"
				|| localeCode == "pt_PT" || localeCode == "sc" || localeCode == "scn" || localeCode == "sv"
				|| localeCode == "sw" || localeCode == "ur" || localeCode == "yi") {
			return GetCardinalPluralCase_4(value);
		}

		if (localeCode == "si") {
			return GetCardinalPluralCase_5(value);
		}

		if (localeCode == "ak" || localeCode == "bho" || localeCode == "guw" || localeCode == "ln" || localeCode == "mg"
				|| localeCode == "nso" || localeCode == "pa" || localeCode == "ti" || localeCode == "wa") {
			return GetCardinalPluralCase_6(value);
		}

		if (localeCode == "tzm") {
			return GetCardinalPluralCase_7(value);
		}

		if (localeCode == "af" || localeCode == "an" || localeCode == "asa" || localeCode == "az" || localeCode == "bem"
				|| localeCode == "bez" || localeCode == "bg" || localeCode == "brx" || localeCode == "ce"
				|| localeCode == "cgg" || localeCode == "chr" || localeCode == "ckb" || localeCode == "dv"
				|| localeCode == "ee" || localeCode == "el" || localeCode == "eo" || localeCode == "es"
				|| localeCode == "eu" || localeCode == "fo" || localeCode == "fur" || localeCode == "gsw"
				|| localeCode == "ha" || localeCode == "haw" || localeCode == "hu" || localeCode == "jgo"
				|| localeCode == "jmc" || localeCode == "ka" || localeCode == "kaj" || localeCode == "kcg"
				|| localeCode == "kk" || localeCode == "kkj" || localeCode == "kl" || localeCode == "ks"
				|| localeCode == "ksb" || localeCode == "ku" || localeCode == "ky" || localeCode == "lb"
				|| localeCode == "lg" || localeCode == "mas" || localeCode == "mgo" || localeCode == "ml"
				|| localeCode == "mn" || localeCode == "mr" || localeCode == "nah" || localeCode == "nb"
				|| localeCode == "nd" || localeCode == "ne" || localeCode == "nn" || localeCode == "nnh"
				|| localeCode == "no" || localeCode == "nr" || localeCode == "ny" || localeCode == "nyn"
				|| localeCode == "om" || localeCode == "or" || localeCode == "os" || localeCode == "pap"
				|| localeCode == "ps" || localeCode == "rm" || localeCode == "rof" || localeCode == "rwk"
				|| localeCode == "saq" || localeCode == "sd" || localeCode == "sdh" || localeCode == "seh"
				|| localeCode == "sn" || localeCode == "so" || localeCode == "sq" || localeCode == "ss"
				|| localeCode == "ssy" || localeCode == "st" || localeCode == "syr" || localeCode == "ta"
				|| localeCode == "te" || localeCode == "teo" || localeCode == "tig" || localeCode == "tk"
				|| localeCode == "tn" || localeCode == "tr" || localeCode == "ts" || localeCode == "ug"
				|| localeCode == "uz" || localeCode == "ve" || localeCode == "vo" || localeCode == "vun"
				|| localeCode == "wae" || localeCode == "xh" || localeCode == "xog") {
			return GetCardinalPluralCase_8(value);
		}

		if (localeCode == "da") {
			return GetCardinalPluralCase_9(value);
		}

		if (localeCode == "is") {
			return GetCardinalPluralCase_10(value);
		}

		if (localeCode == "mk") {
			return GetCardinalPluralCase_11(value);
		}

		if (localeCode == "ceb" || localeCode == "fil" || localeCode == "tl") {
			return GetCardinalPluralCase_12(value);
		}

		if (localeCode == "lv" || localeCode == "prg") {
			return GetCardinalPluralCase_13(value);
		}

		if (localeCode == "lag") {
			return GetCardinalPluralCase_14(value);
		}

		if (localeCode == "ksh") {
			return GetCardinalPluralCase_15(value);
		}

		if (localeCode == "iu" || localeCode == "naq" || localeCode == "se" || localeCode == "sma"
				|| localeCode == "smi" || localeCode == "smj" || localeCode == "smn" || localeCode == "sms") {
			return GetCardinalPluralCase_16(value);
		}

		if (localeCode == "shi") {
			return GetCardinalPluralCase_17(value);
		}

		if (localeCode == "mo" || localeCode == "ro") {
			return GetCardinalPluralCase_18(value);
		}

		if (localeCode == "bs" || localeCode == "hr" || localeCode == "sh" || localeCode == "sr") {
			return GetCardinalPluralCase_19(value);
		}

		if (localeCode == "gd") {
			return GetCardinalPluralCase_20(value);
		}

		if (localeCode == "sl") {
			return GetCardinalPluralCase_21(value);
		}

		if (localeCode == "dsb" || localeCode == "hsb") {
			return GetCardinalPluralCase_22(value);
		}

		if (localeCode == "he" || localeCode == "iw") {
			return GetCardinalPluralCase_23(value);
		}

		if (localeCode == "cs" || localeCode == "sk") {
			return GetCardinalPluralCase_24(value);
		}

		if (localeCode == "pl") {
			return GetCardinalPluralCase_25(value);
		}

		if (localeCode == "be") {
			return GetCardinalPluralCase_26(value);
		}

		if (localeCode == "lt") {
			return GetCardinalPluralCase_27(value);
		}

		if (localeCode == "mt") {
			return GetCardinalPluralCase_28(value);
		}

		if (localeCode == "ru" || localeCode == "uk") {
			return GetCardinalPluralCase_29(value);
		}

		if (localeCode == "br") {
			return GetCardinalPluralCase_30(value);
		}

		if (localeCode == "ga") {
			return GetCardinalPluralCase_31(value);
		}

		if (localeCode == "gv") {
			return GetCardinalPluralCase_32(value);
		}

		if (localeCode == "kw") {
			return GetCardinalPluralCase_33(value);
		}

		if (localeCode == "ar" || localeCode == "ars") {
			return GetCardinalPluralCase_34(value);
		}

		if (localeCode == "cy") {
			return GetCardinalPluralCase_35(value);
		}

		return PluralCase.Other;
	}

	public static PluralCase GetOrdinalPluralCase(String localeCode, double value) {
		if (localeCode == "af" || localeCode == "am" || localeCode == "an" || localeCode == "ar" || localeCode == "bg"
				|| localeCode == "bs" || localeCode == "ce" || localeCode == "cs" || localeCode == "da"
				|| localeCode == "de" || localeCode == "dsb" || localeCode == "el" || localeCode == "es"
				|| localeCode == "et" || localeCode == "eu" || localeCode == "fa" || localeCode == "fi"
				|| localeCode == "fy" || localeCode == "gl" || localeCode == "gsw" || localeCode == "he"
				|| localeCode == "hr" || localeCode == "hsb" || localeCode == "ia" || localeCode == "id"
				|| localeCode == "in" || localeCode == "is" || localeCode == "iw" || localeCode == "ja"
				|| localeCode == "km" || localeCode == "kn" || localeCode == "ko" || localeCode == "ky"
				|| localeCode == "lt" || localeCode == "lv" || localeCode == "ml" || localeCode == "mn"
				|| localeCode == "my" || localeCode == "nb" || localeCode == "nl" || localeCode == "pa"
				|| localeCode == "pl" || localeCode == "prg" || localeCode == "ps" || localeCode == "pt"
				|| localeCode == "root" || localeCode == "ru" || localeCode == "sd" || localeCode == "sh"
				|| localeCode == "si" || localeCode == "sk" || localeCode == "sl" || localeCode == "sr"
				|| localeCode == "sw" || localeCode == "ta" || localeCode == "te" || localeCode == "th"
				|| localeCode == "tr" || localeCode == "ur" || localeCode == "uz" || localeCode == "yue"
				|| localeCode == "zh" || localeCode == "zu") {
			return GetOrdinalPluralCase_36(value);
		}

		if (localeCode == "sv") {
			return GetOrdinalPluralCase_37(value);
		}

		if (localeCode == "fil" || localeCode == "fr" || localeCode == "ga" || localeCode == "hy" || localeCode == "lo"
				|| localeCode == "mo" || localeCode == "ms" || localeCode == "ro" || localeCode == "tl"
				|| localeCode == "vi") {
			return GetOrdinalPluralCase_38(value);
		}

		if (localeCode == "hu") {
			return GetOrdinalPluralCase_39(value);
		}

		if (localeCode == "ne") {
			return GetOrdinalPluralCase_40(value);
		}

		if (localeCode == "be") {
			return GetOrdinalPluralCase_41(value);
		}

		if (localeCode == "uk") {
			return GetOrdinalPluralCase_42(value);
		}

		if (localeCode == "tk") {
			return GetOrdinalPluralCase_43(value);
		}

		if (localeCode == "kk") {
			return GetOrdinalPluralCase_44(value);
		}

		if (localeCode == "it" || localeCode == "sc" || localeCode == "scn") {
			return GetOrdinalPluralCase_45(value);
		}

		if (localeCode == "ka") {
			return GetOrdinalPluralCase_46(value);
		}

		if (localeCode == "sq") {
			return GetOrdinalPluralCase_47(value);
		}

		if (localeCode == "kw") {
			return GetOrdinalPluralCase_48(value);
		}

		if (localeCode == "en") {
			return GetOrdinalPluralCase_49(value);
		}

		if (localeCode == "mr") {
			return GetOrdinalPluralCase_50(value);
		}

		if (localeCode == "gd") {
			return GetOrdinalPluralCase_51(value);
		}

		if (localeCode == "ca") {
			return GetOrdinalPluralCase_52(value);
		}

		if (localeCode == "mk") {
			return GetOrdinalPluralCase_53(value);
		}

		if (localeCode == "az") {
			return GetOrdinalPluralCase_54(value);
		}

		if (localeCode == "gu" || localeCode == "hi") {
			return GetOrdinalPluralCase_55(value);
		}

		if (localeCode == "as" || localeCode == "bn") {
			return GetOrdinalPluralCase_56(value);
		}

		if (localeCode == "or") {
			return GetOrdinalPluralCase_57(value);
		}

		if (localeCode == "cy") {
			return GetOrdinalPluralCase_58(value);
		}

		return PluralCase.Other;
	}

	public static class NumberHelpers {
		public static double absoluteValue(double number) {
			return Math.abs(number);
		}

		public static int IntegerValue(double number) {
			return (int) Math.floor(number * 100) / 100;
		}

		public static int FractionalValue(double number) {
			String text = Double.toString(number);
			String text2 = (text.indexOf('.') < 0) ? "" : text.split("\\.")[1];
			if (text2 == "") {
				return 0;
			}
			return Integer.parseInt(text2);
		}

		public static int VisibleFractionalDigits(double number, boolean trailingZeroes) {
			String text = Double.toString(number);

			String text2 = text.indexOf(".") < 0 ? "" : text.split("\\.")[1];
//			if (!trailingZeroes) {
			text2 = StringUtils.trimEnd(text2, "0");
//			}
			return text2.length();
		}
	}
}
