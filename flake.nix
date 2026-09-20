{
  description = "Entorno Java para Cero_Experto_java";

  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs/nixos-unstable";
  };

  outputs = { self, nixpkgs }: 
    let
      system = "x86_64-linux";
      pkgs = nixpkgs.legacyPackages.${system};
    in {
      devShells.${system}.default = pkgs.mkShell {
        nativeBuildInputs = with pkgs; [
          jdk21
        ];
        
        shellHook = ''
          echo "☕ Entorno Java (JDK 21) cargado con éxito!"
          java -version
        '';
      };
    };
}