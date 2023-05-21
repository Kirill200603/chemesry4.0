package com.msaggik.fifthlessonanimalhandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Animal("Водород", "При стандартной температуре и давлении водород — бесцветный, не имеющий запаха и вкуса, нетоксичный двухатомный газ (химическая формула — H 2), который в смеси с воздухом или кислородом горюч и крайне пожаро - и взрывоопасен.",
                R.drawable.lynx, "Валентность I"));
        animals.add( new Animal("Бобр", "Полуводное млекопитающее отряда грызунов",
                R.drawable.beaver, "1 электрон, 1 протон и 0 нейтронов."));
        animals.add( new Animal("Медведь", "Семейство млекопитающих отряда хищных. Отличаются от других представителей псообразных более коренастым телосложениемв",
                R.drawable.bear, "Численность большая"));
        animals.add( new Animal("Волк", "Вид хищных млекопитающих из семейства псовых",
                R.drawable.wolf, "Численность большая"));
        animals.add( new Animal("Сова", "Хищная птица семейства совиных с мягким рыхлым оперением, обеспечивающим бесшумность полёта, с продолговатым крючковатым клювом и круглой головой, на которой оперение вокруг больших глаз образует так называемый «лицевой» диск, ведущая сумеречный образ жизни",
                R.drawable.owl, "Численность большая"));
    }
}