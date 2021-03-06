package com.codeclan.example.fileExplorer.components;

import com.codeclan.example.fileExplorer.models.File;
import com.codeclan.example.fileExplorer.models.Folder;
import com.codeclan.example.fileExplorer.models.User;
import com.codeclan.example.fileExplorer.repositories.FileRespoitory;
import com.codeclan.example.fileExplorer.repositories.FolderRepository;
import com.codeclan.example.fileExplorer.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRespoitory fileRespoitory;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User harrison = new User("Harrison");
        userRepository.save(harrison);

        User malcolm = new User("Malcolm");
        userRepository.save(malcolm);

        User eugene = new User("Eugene");
        userRepository.save(eugene);

        User chris = new User("Chris");
        userRepository.save(chris);

        Folder got = new Folder("Game_of_Thrones", chris);
        folderRepository.save(got);

        Folder onePunch = new Folder("One_Punch_Man", harrison);
        folderRepository.save(onePunch);

        Folder lotr = new Folder("Lord_of_the_Rings", chris);
        folderRepository.save(lotr);

        Folder darkSouls = new Folder("Dark_Souls", harrison);
        folderRepository.save(darkSouls);

        Folder exercises = new Folder("Exercises", malcolm);
        folderRepository.save(exercises);

        Folder america = new Folder("America", eugene);
        folderRepository.save(america);

        File ned = new File("Ned_Stark", ".got", 128L, got);
        fileRespoitory.save(ned);

        File john = new File("John_Snow", ".got", 256L, got);
        fileRespoitory.save(john);

        File saitama = new File("Saitama", ".opm", 512L, onePunch);
        fileRespoitory.save(saitama);

        File genos = new File("Genos", ".opm", 1024L, onePunch);
        fileRespoitory.save(genos);

        File boromir = new File("Boromir", ".lotr", 2048L, lotr);
        fileRespoitory.save(boromir);

        File aragorn = new File("Aragorn", ".lotr", 4096L, lotr);
        fileRespoitory.save(aragorn);

        File seigmeyer = new File("Seigmeyer", ".ds", 8192L, darkSouls);
        fileRespoitory.save(seigmeyer);

        File solaire = new File("Solaire_of_Astora", ".ds", 16384L, darkSouls);
        fileRespoitory.save(solaire);

        File burpie = new File("Burpie", ".exe", 32768L, exercises);
        fileRespoitory.save(burpie);

        File starJump = new File("Star_Jump", ".exe", 65536L, exercises);
        fileRespoitory.save(starJump);

        File eagle = new File("Bald_Eagle", ".fdm", 131072L, america);
        fileRespoitory.save(eagle);

        File nra = new File("NRA", ".fdm", 262144L, america);
        fileRespoitory.save(nra);
    }
}
