package com.anbn.pinout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {

    /* алгоритм работает следующим образом. Кликаем в TextView, возвращаем номер выбранной строки.
    По номеру строки находим в массиве индексы оборудования и платы, описание которого и выводим
    в pdfViewer.
     */
    // card нужен для заполнения значения карты в массиве
    int card = 0;
    public int equipmentValue = 0; // индекс текущего значения поля equipment
    public int i = 1;
    // массив для дальнейшего заполнения найденными позициями
    public ArrayList listCardArray = new ArrayList();
    // порядковый номер индекса массива listCardArray
    public int number = 0;
    // вспомогательные переменные
    public String s = "";
    // в эти переменные запишем строки приведенные к верхнему регистру
    public String cardUpper, sSearchUpper;
    public boolean bSearch;

    // нарисуем экран
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // поиск содержимого по строке введенной в searchView
        // зададим идентификаторы полю searchView
        // создадим listner searchView1
        final SearchView searchView1 = (SearchView) findViewById(R.id.searchView1);
        searchView1.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            // обработчик нажатия кнопки поиска поля searchView1
            @Override
            public boolean onQueryTextSubmit(String query) {
                // User pressed the search button
                return false;
            }
            // обработчик ввода символа поля searchView1
            @Override
            public boolean onQueryTextChange(String sSearch) {

                // пользователь вводит текст поиска
                bSearch = false;
                equipmentValue = 0;
                listCardArray.clear();
                sSearchUpper = sSearch.toUpperCase();
                // проверим что длина введенной строки 2 или более символов, тогда поиск
                if (sSearch.length() > 1) {

                    //CADR1[]
                    // конструкцию проверим на исключения
                    card = 1;
                    try {

                        while (StaticVariables.CARD1[i] != null) {
                            // ищем соответствие поиска в массиве
                            cardUpper = StaticVariables.CARD1[i].toUpperCase();
                            if (cardUpper.indexOf(sSearchUpper) != -1) {
                                ArraySearch(StaticVariables.CARD1[i], card, i);
                            }
                            i++;
                        }
                    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    // присвоим i = 1 для дальнейшего поиска
                    i = 1;

                    //CADR2[]
                    // конструкцию проверим на исключения
                    card = 2;
                    try {

                        while (StaticVariables.CARD2[i] != null) {
                            // ищем соответствие поиска в массиве
                            cardUpper = StaticVariables.CARD2[i].toUpperCase();
                            if (cardUpper.indexOf(sSearchUpper) != -1) {
                                ArraySearch(StaticVariables.CARD2[i], card, i);
                            }
                            i++;
                        }
                    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    // присвоим i = 1 для дальнейшего поиска
                    i = 1;

                    //CADR3[]
                    // конструкцию проверим на исключения
                    card = 3;
                    try {

                        while (StaticVariables.CARD3[i] != null) {
                            // ищем соответствие поиска в массиве
                            cardUpper = StaticVariables.CARD3[i].toUpperCase();
                            if (cardUpper.indexOf(sSearchUpper) != -1) {
                                ArraySearch(StaticVariables.CARD3[i], card, i);
                            }
                            i++;
                        }
                    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    // присвоим i = 1 для дальнейшего поиска
                    i = 1;

                    //CADR4[]
                    // конструкцию проверим на исключения
                    card = 4;
                    try {

                        while (StaticVariables.CARD4[i] != null) {
                            // ищем соответствие поиска в массиве
                            cardUpper = StaticVariables.CARD4[i].toUpperCase();
                            if (cardUpper.indexOf(sSearchUpper) != -1) {
                                ArraySearch(StaticVariables.CARD4[i], card, i);
                            }
                            i++;
                        }
                    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    // присвоим i = 1 для дальнейшего поиска
                    i = 1;

                    //CADR5[]
                    // конструкцию проверим на исключения
                    card = 5;
                    try {

                        while (StaticVariables.CARD5[i] != null) {
                            // ищем соответствие поиска в массиве
                            cardUpper = StaticVariables.CARD5[i].toUpperCase();
                            if (cardUpper.indexOf(sSearchUpper) != -1) {
                                ArraySearch(StaticVariables.CARD5[i], card, i);
                            }
                            i++;
                        }
                    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    // присвоим i = 1 для дальнейшего поиска
                    i = 1;

                    //CADR6[]
                    // конструкцию проверим на исключения
                    card = 6;
                    try {

                        while (StaticVariables.CARD6[i] != null) {
                            // ищем соответствие поиска в массиве
                            cardUpper = StaticVariables.CARD6[i].toUpperCase();
                            if (cardUpper.indexOf(sSearchUpper) != -1) {
                                ArraySearch(StaticVariables.CARD6[i], card, i);
                            }
                            i++;
                        }
                    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    // присвоим i = 1 для дальнейшего поиска
                    i = 1;

                    //CADR7[]
                    // конструкцию проверим на исключения
                    card = 7;
                    try {

                        while (StaticVariables.CARD7[i] != null) {
                            // ищем соответствие поиска в массиве
                            cardUpper = StaticVariables.CARD7[i].toUpperCase();
                            if (cardUpper.indexOf(sSearchUpper) != -1) {
                                ArraySearch(StaticVariables.CARD7[i], card, i);
                            }
                            i++;
                        }
                    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    // присвоим i = 1 для дальнейшего поиска
                    i = 1;

                    //CADR8[]
                    // конструкцию проверим на исключения
                    card = 8;
                    try {

                        while (StaticVariables.CARD8[i] != null) {
                            // ищем соответствие поиска в массиве
                            cardUpper = StaticVariables.CARD8[i].toUpperCase();
                            if (cardUpper.indexOf(sSearchUpper) != -1) {
                                ArraySearch(StaticVariables.CARD8[i], card, i);
                            }
                            i++;
                        }
                    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    // присвоим i = 1 для дальнейшего поиска
                    i = 1;

                    //CADR9[]
                    // конструкцию проверим на исключения
                    card = 9;
                    try {

                        while (StaticVariables.CARD9[i] != null) {
                            // ищем соответствие поиска в массиве
                            cardUpper = StaticVariables.CARD9[i].toUpperCase();
                            if (cardUpper.indexOf(sSearchUpper) != -1) {
                                ArraySearch(StaticVariables.CARD9[i], card, i);
                            }
                            i++;
                        }
                    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    // присвоим i = 1 для дальнейшего поиска
                    i = 1;

                    // выведем результаты поиска в ListView
                    SearchResultsDisplay();
                } else {
                    // очистим ListView так как введенное значение короче 3х символов
                    ListViewClear();
                }

                // проверим успешный ли был поиск
                if (bSearch == false) {
                    // очистим ListView от информации после предыдущего поиска
                    ListViewClear();
                }

                return false;
            }
        });

        // метод прослушивания нажатий на ListView (выбор нужной позиции и отображение описания)
        // отображение происходит в классе TwoActivity.java
        ListView listView = findViewById(R.id.listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                String sSelectedPosition;
                String sSP1;    // получаем значение equip из sSelectedPosition
                String sSP2;    // получаем значение card из sSelectedPosition
                int number;     // вспомогательная переменная для выбора номера

                // текстовые данные находятся в переменной sSelectedPosition
                sSelectedPosition = ((TextView) itemClicked).getText().toString();

                /* формат записи ___1.4. СМК-30... необходимо первый разряд присвоить переменной
                *  equip, второе переменной card. Если это категория оборудования с одним числом
                *  то вывести Toast с информацией о необходимости выбора оборудования */

                //Toast.makeText(getApplicationContext(), sSelectedPosition,
                //        Toast.LENGTH_SHORT).show();

                s = sSelectedPosition.substring(0, 3);
                // проверим что первые три символа это пробелы, значит выбрано оборудование
                if (s.equals("   ")) {

                    int lengthSelectedPosition;
                    lengthSelectedPosition = sSelectedPosition.length();

                    // проверим что выбранная строка длиннее 14 символов
                    if (lengthSelectedPosition < 14) {
                        Toast.makeText(getApplicationContext(), "Возникло исключение #1 :-(",
                                Toast.LENGTH_SHORT).show();
                        return;
                    }

                    // получим значение из ___14.234._ equip = 14, card = 234
                    MainActivity.equip = 0;
                    MainActivity.card = 0;
                    sSP1 = ""; sSP2 = "";
                    number = 1;
                    for (i=3; i<=14; i++) {
                        s = sSelectedPosition.substring(i, i+1);
                        if (number == 1 && !s.equals(".")) {
                            if (s.equals("0") || s.equals("1") || s.equals("2") || s.equals("3") ||
                                    s.equals("4") || s.equals("5") || s.equals("6") ||
                                    s.equals("7") || s.equals("8") || s.equals("9")) {
                                sSP1 = sSP1 + s;
                            }
                        }

                        if (number == 2 && !s.equals(".")) {
                            if (s.equals("0") || s.equals("1") || s.equals("2") || s.equals("3") ||
                                    s.equals("4") || s.equals("5") || s.equals("6") ||
                                    s.equals("7") || s.equals("8") || s.equals("9")) {
                                sSP2 = sSP2 + s;
                            }
                        }

                        if (number == 1 && s.equals(".")) {
                            number = 2;
                            s = "";
                        }

                        if (number == 2 && s.equals(".")) {
                            number = 3;
                            s = "";
                        }
                    }

                    // переменные sSP1 и sSP2 содержат значения пунктов equip and card
                    // int i = Integer.parseInt (myString);
                    MainActivity.equip = Integer.parseInt(sSP1);
                    MainActivity.card = Integer.parseInt(sSP2);

                    // переходим к ActivityTwo
                    DisplayDescription();

                } else {
                    Toast.makeText(getApplicationContext(), "Необходимо выбрать не категорию," +
                            " а конечное оборудование...", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    // метод вывода результата поиска в ListView
    public void ArraySearch (String sCARD, int tempEquipmentValue, int i) {
        bSearch = true;
        if (equipmentValue == tempEquipmentValue) {
            // нашли соответствие. Данная категория оборудования уже
            // выводилась, поэтому выводим только само оборудование
            s = "   " + equipmentValue + "." + i + ". " + sCARD;
            listCardArray.add(s);
            number++;
        } else {
            equipmentValue = tempEquipmentValue;
            // нашли соответствие. Добавляем результат в массив
            s = equipmentValue + ". " + StaticVariables.SEQUIPMENT[equipmentValue];
            listCardArray.add(s);
            number++;
            s = "   " + equipmentValue + "." + i + ". " + sCARD;
            listCardArray.add(s);
            number++;
        }
    }

    // очистка содержимого в ListView
    public void ListViewClear () {
        // получаем экземпляр элемента ListView
        ListView listView = findViewById(R.id.listView);
        // очистим listArray для дальнейшей очистки массива
        listCardArray.clear();
        // используем адаптер данных
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, listCardArray);
        listView.setAdapter(adapter);
    }

    // вывод результатов поиска в ListView
    public void SearchResultsDisplay () {
        // получаем экземпляр элемента ListView
        ListView listView = findViewById(R.id.listView);
        // используем адаптер данных
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, listCardArray);
        listView.setAdapter(adapter);
    }

    public void DisplayDescription () {
        Intent intent = new Intent(this, TwoActivity.class);
        startActivity(intent);
    }

    // метод нажатия на кнопку возврата на предыдущий layout
    public void OnClickButtonSearchBack (View v) {
        //Intent intent = new  Intent(this, MainActivity.class);
        //startActivity(MainActivity.class);
        onBackPressed();
    }

}

