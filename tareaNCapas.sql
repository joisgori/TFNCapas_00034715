PGDMP         8                w            tareaNCapas    10.8    10.8                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false                       1262    16478    tareaNCapas    DATABASE     �   CREATE DATABASE "tareaNCapas" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Spain.1252' LC_CTYPE = 'Spanish_Spain.1252';
    DROP DATABASE "tareaNCapas";
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false                       0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12924    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false                       0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    16565    empleado    TABLE     �   CREATE TABLE public.empleado (
    codigo_empleado integer NOT NULL,
    nombre_empleado character varying(50),
    edad_empleado integer,
    genero_empleado character varying(10),
    estado_empleado boolean,
    codigo_sucursal integer
);
    DROP TABLE public.empleado;
       public         postgres    false    3            �            1259    16563    empleado_codigo_empleado_seq    SEQUENCE     �   CREATE SEQUENCE public.empleado_codigo_empleado_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 3   DROP SEQUENCE public.empleado_codigo_empleado_seq;
       public       postgres    false    3    200                       0    0    empleado_codigo_empleado_seq    SEQUENCE OWNED BY     ]   ALTER SEQUENCE public.empleado_codigo_empleado_seq OWNED BY public.empleado.codigo_empleado;
            public       postgres    false    199            �            1259    16557    sucursal    TABLE     ;  CREATE TABLE public.sucursal (
    codigo_sucursal integer NOT NULL,
    nombre_sucursal character varying(50),
    ubicacion_sucursal character varying(100),
    horario_apertura character varying(10),
    horario_cierre character varying(10),
    numero_mesas integer,
    nombre_gerente character varying(50)
);
    DROP TABLE public.sucursal;
       public         postgres    false    3            �            1259    16555    sucursal_codigo_sucursal_seq    SEQUENCE     �   CREATE SEQUENCE public.sucursal_codigo_sucursal_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 3   DROP SEQUENCE public.sucursal_codigo_sucursal_seq;
       public       postgres    false    198    3                       0    0    sucursal_codigo_sucursal_seq    SEQUENCE OWNED BY     ]   ALTER SEQUENCE public.sucursal_codigo_sucursal_seq OWNED BY public.sucursal.codigo_sucursal;
            public       postgres    false    197            �            1259    16504    usuario    TABLE     �   CREATE TABLE public.usuario (
    id_usuario integer NOT NULL,
    usuario character varying(25),
    "contraseña" character varying(25)
);
    DROP TABLE public.usuario;
       public         postgres    false    3            y
           2604    16568    empleado codigo_empleado    DEFAULT     �   ALTER TABLE ONLY public.empleado ALTER COLUMN codigo_empleado SET DEFAULT nextval('public.empleado_codigo_empleado_seq'::regclass);
 G   ALTER TABLE public.empleado ALTER COLUMN codigo_empleado DROP DEFAULT;
       public       postgres    false    200    199    200            x
           2604    16560    sucursal codigo_sucursal    DEFAULT     �   ALTER TABLE ONLY public.sucursal ALTER COLUMN codigo_sucursal SET DEFAULT nextval('public.sucursal_codigo_sucursal_seq'::regclass);
 G   ALTER TABLE public.sucursal ALTER COLUMN codigo_sucursal DROP DEFAULT;
       public       postgres    false    198    197    198            �
          0    16565    empleado 
   TABLE DATA               �   COPY public.empleado (codigo_empleado, nombre_empleado, edad_empleado, genero_empleado, estado_empleado, codigo_sucursal) FROM stdin;
    public       postgres    false    200   A       �
          0    16557    sucursal 
   TABLE DATA               �   COPY public.sucursal (codigo_sucursal, nombre_sucursal, ubicacion_sucursal, horario_apertura, horario_cierre, numero_mesas, nombre_gerente) FROM stdin;
    public       postgres    false    198          �
          0    16504    usuario 
   TABLE DATA               E   COPY public.usuario (id_usuario, usuario, "contraseña") FROM stdin;
    public       postgres    false    196   (       	           0    0    empleado_codigo_empleado_seq    SEQUENCE SET     L   SELECT pg_catalog.setval('public.empleado_codigo_empleado_seq', 10, false);
            public       postgres    false    199            
           0    0    sucursal_codigo_sucursal_seq    SEQUENCE SET     K   SELECT pg_catalog.setval('public.sucursal_codigo_sucursal_seq', 6, false);
            public       postgres    false    197            {
           2606    16508    usuario USUARIO_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT "USUARIO_pkey" PRIMARY KEY (id_usuario);
 @   ALTER TABLE ONLY public.usuario DROP CONSTRAINT "USUARIO_pkey";
       public         postgres    false    196            }
           2606    16562    sucursal codigo_sucursal 
   CONSTRAINT     c   ALTER TABLE ONLY public.sucursal
    ADD CONSTRAINT codigo_sucursal PRIMARY KEY (codigo_sucursal);
 B   ALTER TABLE ONLY public.sucursal DROP CONSTRAINT codigo_sucursal;
       public         postgres    false    198            
           2606    16570    empleado none 
   CONSTRAINT     Z   ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT "none" PRIMARY KEY (codigo_empleado);
 9   ALTER TABLE ONLY public.empleado DROP CONSTRAINT "none";
       public         postgres    false    200            �
           2606    16578    empleado codigo_sucursal    FK CONSTRAINT     �   ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT codigo_sucursal FOREIGN KEY (codigo_sucursal) REFERENCES public.sucursal(codigo_sucursal) ON DELETE CASCADE;
 B   ALTER TABLE ONLY public.empleado DROP CONSTRAINT codigo_sucursal;
       public       postgres    false    200    198    2685            �
   �   x�]�1N�0����)|��	��@�-͐�+K��l
r���#�b�4�PZ���w�����̗
�`�<��Ĥ(ȮD��x}VFQ#�ާU��p�b�y�4�?�'X��YU��8�V�팥
Ϝ��9x9q�k�/pt���b>��7�V�%=��N%�_��w�)�Nqy�V�� �/��F[Ν����sd����#� *dX      �
   �   x�e�AN�0E��)� U��Dv��Q�f35����D�x�[q.�B��#}��������8AG�������#q����}U�Ckve[�iL�8³P�nfl@�h��_a=8�����ʒ]�}a'x�݉d`��ٔ�9G��$g�=&b8S$����l}7a[^����sq2HhP���_� �wk��~ۘ�x�i���6� 	_|�gU#�D�Z�K�Yx�3OY�G���Z�d��      �
      x�3���/.M�4426����� ,D�     