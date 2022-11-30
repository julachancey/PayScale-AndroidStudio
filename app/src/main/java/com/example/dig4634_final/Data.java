package com.example.dig4634_final;

import java.util.HashMap;
import java.util.Map;


public class Data {
    Map<String, State> states = new HashMap<String, State>();

    public Data() {
        initStateData();
    }

    private void initStateData() {
        State alabama = new State("alabama",4.0, 87.1, 98.2, 68.2,
                100.2, 88.1, 89.5, 95.2, 53050);
        states.put("alabama", alabama);

        State alaska = new State("alaska",0.0, 125.5, 131.8, 120.0,
                138.4, 121.0, 151.7, 120.5, 70638);
        states.put("alaska", alaska);

        State arizona = new State("arizona",5.6, 108.0,101.8,	127.2,
                99.4,101.3,92.4,	98.7, 60997);
        states.put("arizona", arizona);

        State arkansas = new State("arkansas",6.5, 90.7, 92.5,	78.4,
                100.1, 89.7,	84.2,	100.6, 49747);
        states.put("arkansas", arkansas);

        State california = new State("california",7.25, 138.7,	112.3,	194.0,
                122.4, 124.4,	109.7,110.0, 78937);
        states.put("california", california);

        State colorado = new State("colorado", 2.9, 105.2,	100.8,	115.7,
                83.9,	112.2,	97.9,	104.2, 66825);
        states.put("colorado", colorado);

        State connecticut = new State("connecticut", 6.35, 115.4,	99.1,	121.5,
                127.3,	112.1,	108.1,	116.4, 75919);
        states.put("connecticut", connecticut);

        State delaware = new State("delaware", 0, 105.4,	106.4,	103.7,
                94.1,	117.5,	109.6,	106.8, 63458);
        states.put("delaware", delaware);

        State florida = new State("florida", 6.0, 104.5,	106.4,	112.2,
                99.0,	97.7,	98.0,	100.2, 53972);
        states.put("florida", florida);

        State georgia = new State("georgia", 4.0, 88.9,	96.4,	77.7,
                90.0,	89.4,	96.5,	94.8, 59917);
        states.put("georgia", georgia);

        State hawaii = new State("hawaii", 4.0, 186.0,	148.5,	307.0,
                134.6,	128.3,	120.3,	124.1, 59399);
        states.put("hawaii", hawaii);

        State idaho = new State("idaho", 6.0, 98.9,	95.6,	102.3,
                79.2,	114.8,	93.0,	100.7, 54251);
        states.put("idaho", idaho);

        State illinois = new State("illinois",6.25, 91.9,	100.5,	81.7,
                94.6,	104.3,	96.0,	92.8, 69293);
        states.put("illinois", illinois);

        State indiana = new State("indiana", 7.0, 90.2,	94.5,	76.8,
                107.6,	94.8,	97.5,	93.3, 59280);
        states.put("indiana", indiana);

        State iowa = new State("iowa", 6.0, 88.2,	98.0,	70.6,
                95.5,	95.4,	98.9,	94.9, 54747);
        states.put("iowa", iowa);

        State kansas = new State("kansas", 6.5, 87.3,	94.3,	72.0,
                98.7,	96.3,	101.1,	91.0, 58269);
        states.put("kansas", kansas);

        State kentucky = new State("kentucky", 6.0, 92.8,	92.5,	75.7,
                105.4,	105.9,	77.0,	105.4, 53318);
        states.put("kentucky", kentucky);

        State louisiana = new State("louisiana", 4.45, 93.5,	98.8,	85.2,
                88.3,	96.0,	100.4,	99.2, 54647);
        states.put("louisiana", louisiana);

        State maine = new State("maine", 5.5, 114.5,	103.2,	119.8,
                113.7,	111.5,	128.7,	127.4, 53998);
        states.put("maine", maine);

        State maryland = new State("maryland",6, 124.1,	112.2,	157.0,
                106.9,	103.0,	94.4,	112.4, 70171);
        states.put("maryland", maryland);

        State massachusetts = new State("massachusetts", 6.25, 149.9,	113.0,	217.3,
                121.2,	134.0,	113.8,	120.6, 79830);
        states.put("massachusetts", massachusetts);

        State michigan = new State("michigan", 6.0, 91.7,	92.3,	82.1,
                98.2,	98.5,	95.8,	96.8, 58961);
        states.put("michigan", michigan);

        State minnesota = new State("minnesota", 6.875, 95.1,	97.4,	83.5,
                95.6,	100.8,	109.0,	102.2, 64901);
        states.put("minnesota", minnesota);

        State mississippi = new State("mississippi", 7.0, 84.5,	91.9,	68.5,
                88.5,	92.6,	99.5,	91.2, 45674);
        states.put("mississippi", mississippi);

        State missouri = new State("missouri",4.225, 90.1,	96.8,	80.4,
                94.2,	97.8,	91.2,	92.8, 57199);
        states.put("missouri", missouri);

        State montana = new State("montana", 0, 105.3,	100.8,	115.7,
                83.9,	111.2,	97.9,	104.2, 50757);
        states.put("montana", montana);

        State nebraska = new State("nebraska", 5.5, 91.1,	96.9,	81.6,
                88.8,	102.1,	99.3,	94.2, 59932);
        states.put("nebraska", nebraska);

        State nevada = new State("nevada", 6.85, 101.9,	104.6,	112.9,
                98.3,	112.2,	93.4,	89.0, 55002);
        states.put("nevada", nevada);

        State newHampshire = new State("new hampshire", 0.0, 114.7,	104.6,	107.4,
                113.7,	111.5,	128.7,	127.4, 67046);
        states.put("new hampshire", newHampshire);

        State newJersey = new State("new jersey", 6.625, 114.0,	107.0,	133.5,
                106.4,	111.4,	96.5,	103.7, 74249);
        states.put("new jersey", newJersey);

        State newMexico = new State("new mexico", 5.0, 93.8,	96.8,	87.3,
                88.4,	101.0,	103.0,	97.4, 53305);
        states.put("new mexico", newMexico);

        State newYork = new State("new york", 4.0, 135.7,	109.2,	194.1,
                100.6,	105.6,	103.1,	114.9, 80772);
        states.put("new york", newYork);

        State northCarolina = new State("north carolina", 4.750, 96.9,	98.4,	94.0,
                93.2,	90.4,	110.9,	99.9, 58705);
        states.put("north carolina", northCarolina);

        State northDakota = new State("north dakota", 5.0, 97.4,	103.5,	88.2,
                104.7,	101.5,	110.5,	98.2, 60165);
        states.put("north dakota", northDakota);

        State ohio = new State("ohio", 5.75, 89.4,	100.8,	71.1,
                92.4,	95.6,	94.4,	98.5, 59491);
        states.put("ohio", ohio);

        State oklahoma = new State("oklahoma", 4.5, 86.7,	94.7,	72.4,
                95.0,	91.4,	91.5,	92.2, 56002);
        states.put("oklahoma", oklahoma);

        State oregon = new State("oregon", 0, 122.2,	106.4,	156.1,
                91.3,	125.1,	109.2,	108.0, 63536);
        states.put("oregon", oregon);

        State pennsylvania = new State("pennsylvania", 6.0, 98.2,	102.9,	89.4,
                104.4,	106.1,	100.1,	100.1, 65216);
        states.put("pennsylvania", pennsylvania);

        State rhodeIsland = new State("rhode island", 7.0, 111.2,	96.3,	113.8,
                123.5,	110.8,	101.6,	114.3, 61755);
        states.put("rhode island", rhodeIsland);

        State southCarolina = new State("south carolina", 6.0, 96.3,	101.4,	89.5,
                108.6,	88.0,	96.8,	98.3, 53345);
        states.put("south carolina", southCarolina);

        State southDakota = new State("south dakota", 4.5, 96.1,	100.4,	99.6,
                91.9,	89.5,	98.6,	92.6, 58870);
        states.put("south dakota", southDakota);

        State tennessee = new State("tennessee", 7.0, 90.3,	94.4,	84.0,
                94.7,	91.2,	87.8,	93.3, 59520);
        states.put("tennessee", tennessee);

        State texas = new State("texas", 6.25, 92.6,	91.0,	84.8,
                105.9,	91.9,	94.8,	96.8, 63881);
        states.put("texas", texas);

        State utah = new State("utah", 4.85, 102.0,	99.5,	105.0,
                92.1,	110.3,	93.5,	103.0, 58683);
        states.put("utah", utah);

        State vermont = new State("vermont", 6.0, 116.4,	106.8,	129.5,
                122.0,	121.3,	109.6,	106.3, 52720);
        states.put("vermont", vermont);

        State virginia = new State("virginia", 4.3, 102.1,	96.3,	108.3,
                100.1,	94.1,	102.7,	101.4, 67249);
        states.put("virginia", virginia);

        State washington = new State("washington", 6.5, 114.0,	107.0,	133.5,
                106.4,	111.4,	96.5,	103.7, 78428);
        states.put("washington", washington);

        State westVirginia = new State("west virginia", 6.0, 89.8,	96.3,	76.9,
                91.7,	104.7,	97.1,	94.0, 52066);
        states.put("west virginia", westVirginia);

        State wisconsin = new State("wisconsin", 5.0, 93.9,	97.0,	84.4,
                105.6,	95.2,	110.1,	95.3, 58961);
        states.put("wisconsin", wisconsin);

        State wyoming = new State("wyoming", 4.0, 91.66,	101.4,	80.4,
                81.7,	96.4,	98.2,	98.6, 55961);
        states.put("wyoming", wyoming);
    }
}
