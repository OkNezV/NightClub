package data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MusicStyle {

    RNB_MUSIC("RnB"),
    ELECTRO_HOUSE("electro house"),
    POP_MUSIC("поп-музыка"),
    UNKNOWN_MUSIC("неизвестная музыка");

    String music;
}
