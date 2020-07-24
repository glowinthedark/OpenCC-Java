package opencc;

import java.util.Arrays;
import java.util.List;


/*
* Defines the dictionaries for all the conversion flavours.
*
* */

public enum ConversionType {
    hk2s("Traditional Chinese (Hong Kong standard) to Simplified Chinese",
            Arrays.asList("ts_phrases"),
            Arrays.asList("hk_variantsrev_phrases", "hk_variantsrev"),
            Arrays.asList("ts_phrases", "ts_characters")),

    s2t("Simplified Chinese to Traditional Chinese",
            Arrays.asList("st_phrases", "st_characters")),

    s2tw("Simplified Chinese to Traditional Chinese (Taiwan standard)",
            Arrays.asList("st_phrases", "st_characters"),
            Arrays.asList("tw_variants")),

    s2twp("Simplified Chinese to Traditional Chinese (Taiwan standard, with phrases)",
            Arrays.asList("st_phrases", "st_characters"),
            Arrays.asList("tw_phrases","tw_variants")),

    s2hk("Simplified Chinese to Traditional Chinese (Hong Kong standard)",
            Arrays.asList("st_phrases", "st_characters"),
            Arrays.asList("hk_variants_phrases","hk_variants")),


    t2s("Traditional Chinese to Simplified Chinese",
            Arrays.asList("ts_phrases", "ts_characters")),

    tw2s("Traditional Chinese (Taiwan standard) to Simplified Chinese",
            Arrays.asList("ts_phrases"),
            Arrays.asList("tw_variantsrev_phrases", "tw_variantsrev"),
            Arrays.asList("ts_phrases", "ts_characters")),

    tw2sp("Traditional Chinese (Taiwan standard) to Simplified Chinese (with phrases)",
            Arrays.asList("ts_phrases"),
            Arrays.asList("tw_variantsrev_phrases", "tw_variantsrev"),
            Arrays.asList("tw_phrasesrev"),
            Arrays.asList("ts_phrases", "ts_characters")),

    t2tw("Traditional Chinese to Traditional Chinese (Taiwan standard)",
            Arrays.asList("tw_variants")),

    t2hk("Traditional Chinese to Traditional Chinese (Hong Kong standard)",
            Arrays.asList("hk_variants"))
    ;

    private final String name;
    private final List<String>[] dictGroup;

    ConversionType(String name, List<String>... dictGroup ) {
        this.name = name;
        this.dictGroup = dictGroup;
    }

    public List<String>[] getDictGroup() {
        return dictGroup;
    }
}
