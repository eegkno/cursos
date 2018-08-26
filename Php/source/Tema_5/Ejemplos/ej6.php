<?PHP
        $ciudad = array("Par" => "Paris",
                        "Lon" => "Londres",
                        "Ate" => "Atenas",
                        "Ber" => "Berlin",
                        "Lim" => "Lima");

        echo "<H2>Ciudades</H2>";
        while (list($i,$valor)=each($ciudad)) {
                echo "Identificador: " . $i . "<br>";
                echo "Ciudad: " . $valor ."<br>";
                echo "<HR><BR>";
        }
?>
