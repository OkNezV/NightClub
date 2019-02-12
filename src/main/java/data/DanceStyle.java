package data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DanceStyle {

    HIP_HOP("hip hop"),
    RNB("RnB"),
    ELECTRO_DANCE("electro dance"),
    POP_MUSIC_DANCING("танцы под поп-музыку");

    String dance;
}
