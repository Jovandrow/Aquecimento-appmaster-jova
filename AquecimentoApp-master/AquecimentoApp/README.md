# Aquecimento App

Projeto Android com os 6 exercícios de aquecimento resolvidos.

## Como abrir

1. Abra o **Android Studio**.
2. `File > Open...` e selecione a pasta `AquecimentoApp` (a pasta raiz, que contém `settings.gradle.kts`).
3. Aguarde o Gradle sincronizar (primeira vez pode demorar, ele baixa dependências).
4. Rode em um emulador ou dispositivo físico (▶️ Run 'app').

## O que está implementado

- **Exercício 1**: `Button` com `android:text="Clique"` em `activity_main.xml`.
- **Exercício 2**: `android:id="@+id/btnTeste"` no botão + `findViewById<Button>(R.id.btnTeste)` em `MainActivity.kt`.
- **Exercício 3**: `btn.setOnClickListener { Toast.makeText(this, "oi", Toast.LENGTH_SHORT).show() }`.
- **Exercício 4**: `layout_width` do botão em `match_parent` (ocupa a largura toda da tela).
- **Exercício 5**: `CheckBox` e `Switch` adicionados abaixo do botão, sem lógica de código.
- **Exercício 6**: `SeekBar` com `android:max="10"`, funcional sozinha ao arrastar.

## Estrutura

```
AquecimentoApp/
├── settings.gradle.kts
├── build.gradle.kts
├── gradle.properties
└── app/
    ├── build.gradle.kts
    └── src/main/
        ├── AndroidManifest.xml
        ├── java/com/exemplo/aquecimento/MainActivity.kt
        └── res/
            ├── layout/activity_main.xml
            └── values/ (strings.xml, themes.xml)
```

Requer Android Studio Iguana (ou mais recente) e um SDK com API 34 instalado.
