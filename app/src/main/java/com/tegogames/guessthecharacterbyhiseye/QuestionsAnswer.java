package com.tegogames.guessthecharacterbyhiseye;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class QuestionsAnswer extends AppCompatActivity {






    public static List<QuestionsList> questions(Context context) {
        final List<QuestionsList> questionsLists = new ArrayList<>();








        questionsLists.add(new QuestionsList(R.drawable.inosuke,context.getString(R.string.inosuke),context.getString(R.string.tokoyami),context.getString(R.string.Inoshikacho),context.getString(R.string.pig),context.getString(R.string.inosuke),""));
        questionsLists.add(new QuestionsList(R.drawable.akaza,context.getString(R.string.doma),context.getString(R.string.daki),context.getString(R.string.akaza),context.getString(R.string.itadori),context.getString(R.string.akaza),""));
        questionsLists.add(new QuestionsList(R.drawable.gojo,context.getString(R.string.king),context.getString(R.string.gojo),context.getString(R.string.goku),context.getString(R.string.rem),context.getString(R.string.gojo),""));
        questionsLists.add(new QuestionsList(R.drawable.erin,context.getString(R.string.erin),context.getString(R.string.muzan),context.getString(R.string.jack),context.getString(R.string.genos),context.getString(R.string.erin),""));
        questionsLists.add(new QuestionsList(R.drawable.goku,context.getString(R.string.vegeta),context.getString(R.string.goku),context.getString(R.string.gojo),context.getString(R.string.nanami),context.getString(R.string.goku),""));
        questionsLists.add(new QuestionsList(R.drawable.all_might,context.getString(R.string.inosuke),context.getString(R.string.kakash),context.getString(R.string.gen),context.getString(R.string.all_might),context.getString(R.string.all_might),""));
        questionsLists.add(new QuestionsList(R.drawable.asta,context.getString(R.string.luffy),context.getString(R.string.freeza),context.getString(R.string.luffy),context.getString(R.string.ishida),context.getString(R.string.luffy),""));
        questionsLists.add(new QuestionsList(R.drawable.asta,context.getString(R.string.erwin),context.getString(R.string.sakura),context.getString(R.string.asta),context.getString(R.string.senku),context.getString(R.string.asta),""));
        questionsLists.add(new QuestionsList(R.drawable.zoro,context.getString(R.string.zoro),context.getString(R.string.gon),context.getString(R.string.hanji),context.getString(R.string.tokoyami),context.getString(R.string.zoro),""));
        questionsLists.add(new QuestionsList(R.drawable.itachi,context.getString(R.string.itachi),context.getString(R.string.sasuke),context.getString(R.string.kakash),context.getString(R.string.kaneki),context.getString(R.string.itachi),""));
        questionsLists.add(new QuestionsList(R.drawable.levi,context.getString(R.string.l),context.getString(R.string.pitou),context.getString(R.string.levi),context.getString(R.string.erin),context.getString(R.string.levi),""));
        questionsLists.add(new QuestionsList(R.drawable.killua,context.getString(R.string.gojo),context.getString(R.string.killua),context.getString(R.string.gon),context.getString(R.string.muzan),context.getString(R.string.killua),""));
        questionsLists.add(new QuestionsList(R.drawable.julius,context.getString(R.string.hisoka),context.getString(R.string.kurosaki),context.getString(R.string.near),context.getString(R.string.julius),context.getString(R.string.julius),""));
        questionsLists.add(new QuestionsList(R.drawable.midoriya,context.getString(R.string.madara),context.getString(R.string.usoppu),context.getString(R.string.nobara),context.getString(R.string.midoriya),context.getString(R.string.midoriya),""));
        questionsLists.add(new QuestionsList(R.drawable.rengoku,context.getString(R.string.reiner),context.getString(R.string.rengoku),context.getString(R.string.ryuk),context.getString(R.string.sanji),context.getString(R.string.rengoku),""));
        questionsLists.add(new QuestionsList(R.drawable.shoto,context.getString(R.string.naruto),context.getString(R.string.shoto),context.getString(R.string.yami),context.getString(R.string.armin),context.getString(R.string.shoto),""));
        questionsLists.add(new QuestionsList(R.drawable.tanjiro,context.getString(R.string.taiju),context.getString(R.string.tokoyami),context.getString(R.string.tanjiro),context.getString(R.string.near),context.getString(R.string.tanjiro),""));
        questionsLists.add(new QuestionsList(R.drawable.yuno,context.getString(R.string.yuno),context.getString(R.string.yami),context.getString(R.string.luffy),context.getString(R.string.aizawa),context.getString(R.string.yuno),""));
        questionsLists.add(new QuestionsList(R.drawable.aizawa,context.getString(R.string.kakash),context.getString(R.string.kurosaki),context.getString(R.string.aizawa),context.getString(R.string.all_might),context.getString(R.string.aizawa),""));
        questionsLists.add(new QuestionsList(R.drawable.jack,context.getString(R.string.menato),context.getString(R.string.jack),context.getString(R.string.killua),context.getString(R.string.beerus),context.getString(R.string.jack),""));
        questionsLists.add(new QuestionsList(R.drawable.itadori,context.getString(R.string.sukuna),context.getString(R.string.magma),context.getString(R.string.itadori),context.getString(R.string.mikasa),context.getString(R.string.itadori),""));
        questionsLists.add(new QuestionsList(R.drawable.mikasa,context.getString(R.string.levi),context.getString(R.string.light),context.getString(R.string.daki),context.getString(R.string.mikasa),context.getString(R.string.mikasa),""));
        questionsLists.add(new QuestionsList(R.drawable.bakugo,context.getString(R.string.bakugo),context.getString(R.string.jack),context.getString(R.string.kurapika),context.getString(R.string.all_might),context.getString(R.string.bakugo),""));
        questionsLists.add(new QuestionsList(R.drawable.armin,context.getString(R.string.sukuna),context.getString(R.string.erwin),context.getString(R.string.armin),context.getString(R.string.erin),context.getString(R.string.armin),""));
        questionsLists.add(new QuestionsList(R.drawable.naruto,context.getString(R.string.menato),context.getString(R.string.zenitsu),context.getString(R.string.naruto),context.getString(R.string.nanami),context.getString(R.string.naruto),""));
        questionsLists.add(new QuestionsList(R.drawable.zenitsu,context.getString(R.string.zenitsu),context.getString(R.string.naruto),context.getString(R.string.nami),context.getString(R.string.sanji),context.getString(R.string.zenitsu),""));
        questionsLists.add(new QuestionsList(R.drawable.muzan,context.getString(R.string.nanami),context.getString(R.string.muzan),context.getString(R.string.uzui),context.getString(R.string.nanami),context.getString(R.string.muzan),""));
        questionsLists.add(new QuestionsList(R.drawable.saitama,context.getString(R.string.levi),context.getString(R.string.freeza),context.getString(R.string.saitama),context.getString(R.string.gon),context.getString(R.string.saitama),""));
        questionsLists.add(new QuestionsList(R.drawable.kakash,context.getString(R.string.kakash),context.getString(R.string.itachi),context.getString(R.string.midoriya),context.getString(R.string.ishida),context.getString(R.string.kakash),""));
        questionsLists.add(new QuestionsList(R.drawable.kohaku,context.getString(R.string.kurapika),context.getString(R.string.magma),context.getString(R.string.senku),context.getString(R.string.king),context.getString(R.string.kurapika),""));
        questionsLists.add(new QuestionsList(R.drawable.gon,context.getString(R.string.gen),context.getString(R.string.goku),context.getString(R.string.gon),context.getString(R.string.gojo),context.getString(R.string.gon),""));
        questionsLists.add(new QuestionsList(R.drawable.gyutaro,context.getString(R.string.gyutaro),context.getString(R.string.daki),context.getString(R.string.doma),context.getString(R.string.aizawa),context.getString(R.string.gyutaro),""));
        questionsLists.add(new QuestionsList(R.drawable.kaneki,context.getString(R.string.killua),context.getString(R.string.kakash),context.getString(R.string.kurosaki),context.getString(R.string.king),context.getString(R.string.kurosaki),""));
        questionsLists.add(new QuestionsList(R.drawable.genos,context.getString(R.string.bakugo),context.getString(R.string.genos),context.getString(R.string.sasuke),context.getString(R.string.tsukasa),context.getString(R.string.genos),""));
        questionsLists.add(new QuestionsList(R.drawable.taiju,context.getString(R.string.taiju),context.getString(R.string.taiju),context.getString(R.string.itachi),context.getString(R.string.gen),context.getString(R.string.taiju),""));
        questionsLists.add(new QuestionsList(R.drawable.ishida,context.getString(R.string.ishida),context.getString(R.string.menato),context.getString(R.string.pitou),context.getString(R.string.tsukasa),context.getString(R.string.ishida),""));
        questionsLists.add(new QuestionsList(R.drawable.ishida,context.getString(R.string.ishida),context.getString(R.string.menato),context.getString(R.string.pitou),context.getString(R.string.tsukasa),context.getString(R.string.ishida),""));
        questionsLists.add(new QuestionsList(R.drawable.beerus,context.getString(R.string.piccolo),context.getString(R.string.ryuk),context.getString(R.string.beerus),context.getString(R.string.dabi),context.getString(R.string.beerus),""));
        questionsLists.add(new QuestionsList(R.drawable.dabi,context.getString(R.string.daki),context.getString(R.string.doma),context.getString(R.string.dabi),context.getString(R.string.midoriya),context.getString(R.string.dabi),""));
        questionsLists.add(new QuestionsList(R.drawable.endeavor,context.getString(R.string.endeavor),context.getString(R.string.genos),context.getString(R.string.shoto),context.getString(R.string.naruto),context.getString(R.string.endeavor),""));
        questionsLists.add(new QuestionsList(R.drawable.doma,context.getString(R.string.doma),context.getString(R.string.daki),context.getString(R.string.ishida),context.getString(R.string.erwin),context.getString(R.string.doma),""));
        questionsLists.add(new QuestionsList(R.drawable.erwin,context.getString(R.string.armin),context.getString(R.string.all_might),context.getString(R.string.erwin),context.getString(R.string.levi),context.getString(R.string.erwin),""));
        questionsLists.add(new QuestionsList(R.drawable.ryuk,context.getString(R.string.rem),context.getString(R.string.piccolo),context.getString(R.string.ryuk),context.getString(R.string.suzuya),context.getString(R.string.ryuk),""));
        questionsLists.add(new QuestionsList(R.drawable.sanji,context.getString(R.string.zoro),context.getString(R.string.shanks),context.getString(R.string.sanji),context.getString(R.string.luffy),context.getString(R.string.sanji),""));
        questionsLists.add(new QuestionsList(R.drawable.sukuna,context.getString(R.string.sukuna),context.getString(R.string.itadori),context.getString(R.string.gojo),context.getString(R.string.zoro),context.getString(R.string.sukuna),""));
        questionsLists.add(new QuestionsList(R.drawable.sakura,context.getString(R.string.nami),context.getString(R.string.senku),context.getString(R.string.sakura),context.getString(R.string.saitama),context.getString(R.string.sakura),""));
        questionsLists.add(new QuestionsList(R.drawable.tsukasa,context.getString(R.string.tanjiro),context.getString(R.string.taiju),context.getString(R.string.tokoyami),context.getString(R.string.gen),context.getString(R.string.tsukasa),""));
        questionsLists.add(new QuestionsList(R.drawable.yami,context.getString(R.string.yamamoto),context.getString(R.string.gyutaro),context.getString(R.string.luffy),context.getString(R.string.yami),context.getString(R.string.yami),""));
        questionsLists.add(new QuestionsList(R.drawable.suzuya,context.getString(R.string.sanji),context.getString(R.string.sasuke),context.getString(R.string.suzuya),context.getString(R.string.senku),context.getString(R.string.suzuya),""));
        questionsLists.add(new QuestionsList(R.drawable.usoppu,context.getString(R.string.goku),context.getString(R.string.ishida),context.getString(R.string.usoppu),context.getString(R.string.uzui),context.getString(R.string.usoppu),""));
        questionsLists.add(new QuestionsList(R.drawable.rem,context.getString(R.string.rem),context.getString(R.string.ryuk),context.getString(R.string.sakura),context.getString(R.string.luffy),context.getString(R.string.rem),""));
        questionsLists.add(new QuestionsList(R.drawable.vegeta,context.getString(R.string.gen),context.getString(R.string.vegeta),context.getString(R.string.dabi),context.getString(R.string.midoriya),context.getString(R.string.vegeta),""));
        questionsLists.add(new QuestionsList(R.drawable.yamamoto,context.getString(R.string.yamamoto),context.getString(R.string.yami),context.getString(R.string.suzuya),context.getString(R.string.gyutaro),context.getString(R.string.yamamoto),""));
        questionsLists.add(new QuestionsList(R.drawable.shanks,context.getString(R.string.sanji),context.getString(R.string.usoppu),context.getString(R.string.shanks),context.getString(R.string.shoto),context.getString(R.string.shanks),""));
        questionsLists.add(new QuestionsList(R.drawable.noelle,context.getString(R.string.noelle),context.getString(R.string.naruto),context.getString(R.string.nami),context.getString(R.string.netero),context.getString(R.string.noelle),""));
        questionsLists.add(new QuestionsList(R.drawable.piccolo,context.getString(R.string.vegeta),context.getString(R.string.beerus),context.getString(R.string.jack),context.getString(R.string.piccolo),context.getString(R.string.piccolo),""));
        questionsLists.add(new QuestionsList(R.drawable.gen,context.getString(R.string.gon),context.getString(R.string.genos),context.getString(R.string.gen),context.getString(R.string.senku),context.getString(R.string.gen),""));
        questionsLists.add(new QuestionsList(R.drawable.sasuke,context.getString(R.string.sasuke),context.getString(R.string.kakash),context.getString(R.string.itachi),context.getString(R.string.netero),context.getString(R.string.sasuke),""));
        questionsLists.add(new QuestionsList(R.drawable.netero,context.getString(R.string.pitou),context.getString(R.string.netero),context.getString(R.string.senku),context.getString(R.string.taiju),context.getString(R.string.netero),""));
        questionsLists.add(new QuestionsList(R.drawable.reiner,context.getString(R.string.freeza),context.getString(R.string.reiner),context.getString(R.string.endeavor),context.getString(R.string.vegeta),context.getString(R.string.reiner),""));
        questionsLists.add(new QuestionsList(R.drawable.light,context.getString(R.string.l),context.getString(R.string.light),context.getString(R.string.near),context.getString(R.string.ryuk),context.getString(R.string.light),""));
        questionsLists.add(new QuestionsList(R.drawable.nanami,context.getString(R.string.saitama),context.getString(R.string.orihime),context.getString(R.string.nanami),context.getString(R.string.nami),context.getString(R.string.nanami),""));
        questionsLists.add(new QuestionsList(R.drawable.nobara,context.getString(R.string.uzui),context.getString(R.string.itadori),context.getString(R.string.nobara),context.getString(R.string.gon),context.getString(R.string.nobara),""));
        questionsLists.add(new QuestionsList(R.drawable.l,context.getString(R.string.near),context.getString(R.string.itadori),context.getString(R.string.l),context.getString(R.string.sukuna),context.getString(R.string.l),""));
        questionsLists.add(new QuestionsList(R.drawable.nami,context.getString(R.string.nami),context.getString(R.string.nanami),context.getString(R.string.light),context.getString(R.string.sakura),context.getString(R.string.nami),""));
        questionsLists.add(new QuestionsList(R.drawable.hanji,context.getString(R.string.hisoka),context.getString(R.string.sanji),context.getString(R.string.hanji),context.getString(R.string.shoto),context.getString(R.string.hanji),""));
        questionsLists.add(new QuestionsList(R.drawable.neferpitou,context.getString(R.string.sanji),context.getString(R.string.hanji),context.getString(R.string.saitama),context.getString(R.string.pitou),context.getString(R.string.pitou),""));
        questionsLists.add(new QuestionsList(R.drawable.meruem,context.getString(R.string.madara),context.getString(R.string.mikasa),context.getString(R.string.meruem),context.getString(R.string.muzan),context.getString(R.string.meruem),""));
        questionsLists.add(new QuestionsList(R.drawable.near,context.getString(R.string.nobara),context.getString(R.string.naruto),context.getString(R.string.nami),context.getString(R.string.near),context.getString(R.string.near),""));
        questionsLists.add(new QuestionsList(R.drawable.orihime,context.getString(R.string.orihime),context.getString(R.string.sanji),context.getString(R.string.daki),context.getString(R.string.nobara),context.getString(R.string.orihime),""));
        questionsLists.add(new QuestionsList(R.drawable.madara,context.getString(R.string.kakash),context.getString(R.string.ishida),context.getString(R.string.itachi),context.getString(R.string.madara),context.getString(R.string.madara),""));
        questionsLists.add(new QuestionsList(R.drawable.nezuko,context.getString(R.string.doma),context.getString(R.string.armin),context.getString(R.string.nezuko),context.getString(R.string.sakura),context.getString(R.string.nezuko),""));
        questionsLists.add(new QuestionsList(R.drawable.hisoka,context.getString(R.string.piccolo),context.getString(R.string.ishida),context.getString(R.string.hisoka),context.getString(R.string.shoto),context.getString(R.string.hisoka),""));
        questionsLists.add(new QuestionsList(R.drawable.freeza,context.getString(R.string.freeza),context.getString(R.string.piccolo),context.getString(R.string.meruem),context.getString(R.string.senku),context.getString(R.string.freeza),""));
        questionsLists.add(new QuestionsList(R.drawable.uzui,context.getString(R.string.itadori),context.getString(R.string.nezuko),context.getString(R.string.piccolo),context.getString(R.string.uzui),context.getString(R.string.uzui),""));
        questionsLists.add(new QuestionsList(R.drawable.kurosaki,context.getString(R.string.midoriya),context.getString(R.string.kurosaki),context.getString(R.string.sasuke),context.getString(R.string.suzuya),context.getString(R.string.kurosaki),""));
        questionsLists.add(new QuestionsList(R.drawable.menato,context.getString(R.string.naruto),context.getString(R.string.itachi),context.getString(R.string.kakash),context.getString(R.string.menato),context.getString(R.string.menato),""));
        questionsLists.add(new QuestionsList(R.drawable.king,context.getString(R.string.armin),context.getString(R.string.freeza),context.getString(R.string.hisoka),context.getString(R.string.king),context.getString(R.string.king),""));
        questionsLists.add(new QuestionsList(R.drawable.senku,context.getString(R.string.sasuke),context.getString(R.string.saitama),context.getString(R.string.senku),context.getString(R.string.sanji),context.getString(R.string.senku),""));
        questionsLists.add(new QuestionsList(R.drawable.magma,context.getString(R.string.erwin),context.getString(R.string.akaza),context.getString(R.string.magma),context.getString(R.string.doma),context.getString(R.string.magma),""));
        questionsLists.add(new QuestionsList(R.drawable.magma,context.getString(R.string.erwin),context.getString(R.string.akaza),context.getString(R.string.magma),context.getString(R.string.doma),context.getString(R.string.magma),""));




//        Collections.shuffle(questionsLists); // اخلط القائمة

        return  questionsLists;
    }








}


